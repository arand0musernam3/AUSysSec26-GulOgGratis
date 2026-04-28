package com.appsflyer.internal;

import android.content.Context;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u0000 \b2\u00020\u0001:\u0001\bJ#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/appsflyer/internal/AFg1uSDK;", "", "Landroid/content/Context;", "p0", "", "", "getMonetizationNetwork", "(Landroid/content/Context;)Ljava/util/Map;", "AFa1zSDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface AFg1uSDK {

    /* JADX INFO: renamed from: AFa1zSDK, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.getRevenue;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFg1uSDK$AFa1zSDK, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static final class Companion {
        static final /* synthetic */ Companion getRevenue = new Companion();

        private Companion() {
        }
    }

    @NotNull
    Map<String, String> getMonetizationNetwork(@NotNull Context p02);
}
