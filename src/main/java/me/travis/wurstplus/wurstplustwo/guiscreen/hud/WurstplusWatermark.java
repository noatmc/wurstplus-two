package me.travis.wurstplus.wurstplustwo.guiscreen.hud;


import me.travis.wurstplus.Wurstplus;
import me.travis.wurstplus.wurstplustwo.guiscreen.render.pinnables.WurstplusPinnable;
package me.travis.wurstplus.wurstplustwo.util.WurstplusWatermarkHudUtil;


public class WurstplusWatermark extends WurstplusPinnable {
	public WurstplusWatermark() {
		super("Watermark", "Watermark", 1, 0, 0);
	}

	@Override
	public void render() {
		int nl_r = Wurstplus.get_setting_manager().get_setting_with_tag("HUD", "HUDStringsColorR").get_value(1);
		int nl_g = Wurstplus.get_setting_manager().get_setting_with_tag("HUD", "HUDStringsColorG").get_value(1);
		int nl_b = Wurstplus.get_setting_manager().get_setting_with_tag("HUD", "HUDStringsColorB").get_value(1);
		int nl_a = Wurstplus.get_setting_manager().get_setting_with_tag("HUD", "HUDStringsColorA").get_value(1);

		if (line == null) {
			String line = "noat's Wurst+ 2" + " | " + Wurstplus.get_version();
		} else {
			String line = WurstplusWatermarkHudUtil.get_message();
		}
		create_line(line, this.docking(1, line), 2, nl_r, nl_g, nl_b, nl_a);

		this.set_width(this.get(line, "width") + 2);
		this.set_height(this.get(line, "height") + 2);
	}
}
