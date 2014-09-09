# BukkitWrapper #

Used to wrap out most of Bukkit Classes to let the Minecraft Server Plugins have a consistent API.

## Setup ##

1. Clone this repository into some directory *BWDIR*
2. Make a project from this repository and link it as library dependency in your project
3. Let your IDE copy BukkitWrapper classes to your compiled plugin jar. In Netbeans add following to your build.xml:
```
<target name="-post-jar">
	<jar jarfile="dist/yourpluginname-final.jar">
		<zipfileset src="${dist.jar}" excludes="META-INF/*" />
		<zipfileset src="path/to/BukkitWrapper.jar" excludes="META-INF/*" />
		<manifest>
			<attribute name="Main-Class" value="com.your.mainclasspackage" />
		</manifest>
	</jar>
</target>
```

## Usage ##

The BukkitWrapper does **not** wrap the Plugin class! Instead, you'll have to create your own entry. In Bukkit:
```Java
import com.prosicraft.bukkitwrapper.CommandSender;
public class MyPlugin extends JavaPlugin {
  private MyWrappedPlugin wrappedPlugin = null;
  
  @Override
  public void onEnable() {
    wrappedPlugin = new MyWrappedPlugin();
    wrappedPlugin.setJavaPlugin(this);
    wrappedPlugin.onEnable();
  }

  @Override
  public void onDisable() {
    wrappedPlugin.onDisable();
    wrappedPlugin = null;
  }

  @Override
  public boolean onCommand(org.bukkit.command.CommandSender sender, org.bukkit.command.Command command, String label, String[] args) {
    return wrappedPlugin.onCommand(new CommandSender(sender), command.getName(), args);
  }
}

import com.prosicraft.bukkitwrapper.WrapperPlugin;
public class MyWrappedPlugin extends WrapperPlugin {
  @Override
  public void onEnable() {
    // do your regular onEnable stuff here
  }

  @Override
  public void onDisable() {
    // do your regular onDisable stuff here
  }

  @Override
  public void onCommand(CommandSender sender, String cmdName, String[] args) {
    // do your regular onCommand stuff here 
  }
}
```