package com.appsflyer.internal;

import com.appsflyer.internal.platform_extension.Plugin;
import com.appsflyer.internal.platform_extension.PluginInfo;
import com.braze.models.inappmessage.InAppMessageBase;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.x0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class AFi1kSDK implements AFi1lSDK {

    @NotNull
    private PluginInfo getMonetizationNetwork = new PluginInfo(Plugin.NATIVE, "6.18.0", null, 4, null);

    @Override // com.appsflyer.internal.AFi1lSDK
    @NotNull
    public final Map<String, Object> getRevenue() {
        LinkedHashMap linkedHashMapF = x0.f(new Pair("platform", this.getMonetizationNetwork.getPlugin().getPluginName()), new Pair("version", this.getMonetizationNetwork.getVersion()));
        if (!this.getMonetizationNetwork.getAdditionalParams().isEmpty()) {
            linkedHashMapF.put(InAppMessageBase.EXTRAS, this.getMonetizationNetwork.getAdditionalParams());
        }
        return linkedHashMapF;
    }

    @Override // com.appsflyer.internal.AFi1lSDK
    public final void getRevenue(@NotNull PluginInfo pluginInfo) {
        pluginInfo.getClass();
        this.getMonetizationNetwork = pluginInfo;
    }
}
