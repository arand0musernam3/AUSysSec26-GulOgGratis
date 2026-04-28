package com.braze.support;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import com.braze.support.BrazeLogger;
import java.util.List;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import m90.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u0006J\u000f\u0010\u000f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u0006R\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/braze/support/IntentUtils;", "", "<init>", "()V", "", "getRequestCode", "()I", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "", "addComponentAndSendBroadcast", "(Landroid/content/Context;Landroid/content/Intent;)V", "getImmutablePendingIntentFlags", "getMutablePendingIntentFlags", "Ljava/util/Random;", "random$delegate", "Lu70/j;", "getRandom", "()Ljava/util/Random;", "random", "REQUEST_CODE_MAX", "I", "REQUEST_CODE_MIN", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IntentUtils {
    private static final int REQUEST_CODE_MAX = 1073741823;
    private static final int REQUEST_CODE_MIN = 100000;
    public static final IntentUtils INSTANCE = new IntentUtils();

    /* JADX INFO: renamed from: random$delegate, reason: from kotlin metadata */
    private static final u70.j random = u70.l.a(u70.m.NONE, new m60.a(17));

    private IntentUtils() {
    }

    public static final void addComponentAndSendBroadcast(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        List<ResolveInfo> listQueryBroadcastReceivers = Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().queryBroadcastReceivers(intent, PackageManager.ResolveInfoFlags.of(0L)) : context.getPackageManager().queryBroadcastReceivers(intent, 0);
        listQueryBroadcastReceivers.getClass();
        for (ResolveInfo resolveInfo : listQueryBroadcastReceivers) {
            Intent intent2 = new Intent(intent);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            ComponentName componentName = new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name);
            intent2.setComponent(componentName);
            context.sendBroadcast(intent2);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new z(7, componentName, intent2), 6, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addComponentAndSendBroadcast$lambda$2$lambda$1(ComponentName componentName, Intent intent) {
        return "Sent intent with component " + componentName + " and explicit intent " + intent;
    }

    public static final int getImmutablePendingIntentFlags() {
        return 67108864;
    }

    public static final int getMutablePendingIntentFlags() {
        return Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }

    private final Random getRandom() {
        return (Random) random.getValue();
    }

    public static final int getRequestCode() {
        return INSTANCE.getRandom().nextInt(REQUEST_CODE_MAX) + REQUEST_CODE_MIN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Random random_delegate$lambda$0() {
        return new Random();
    }
}
