package nc;

import a3.a3;
import android.content.Context;
import android.os.Build;
import android.os.Debug;
import android.provider.Settings;
import android.util.DisplayMetrics;
import java.lang.reflect.Field;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.x0;
import zendesk.messaging.android.internal.analytics.AnalyticsProcessor;

/* JADX INFO: loaded from: classes.dex */
public final class a implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f30805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f30806c;

    public a(Context context, String str, int i11) {
        this.f30804a = i11;
        switch (i11) {
            case 1:
                context.getClass();
                str.getClass();
                this.f30805b = context;
                this.f30806c = str;
                break;
            default:
                str.getClass();
                this.f30805b = context;
                this.f30806c = str;
                break;
        }
    }

    @Override // nc.h
    public final Map a() {
        switch (this.f30804a) {
            case 0:
                return x0.e(new Pair("a_debuggable", Boolean.valueOf((this.f30805b.getApplicationInfo().flags & 2) != 0)), new Pair("a_debugger", Boolean.valueOf(Debug.isDebuggerConnected() || Debug.waitingForDebugger())), new Pair("a_debug", Boolean.FALSE), new Pair("ddv", "3.0.9"), new Pair("ddvv", this.f30806c));
            default:
                Context context = this.f30805b;
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
                string.getClass();
                Pair pair = new Pair("ddv", "3.0.9");
                Pair pair2 = new Pair("ddvc", this.f30806c);
                Pair pair3 = new Pair("os", AnalyticsProcessor.CHANNEL_NAME);
                Pair pair4 = new Pair("osr", Build.VERSION.RELEASE);
                Field[] fields = Build.VERSION_CODES.class.getFields();
                int i11 = Build.VERSION.SDK_INT;
                return x0.e(pair, pair2, pair3, pair4, new Pair("osn", fields[i11].getName()), new Pair("osv", String.valueOf(i11)), new Pair("screen_x", Integer.valueOf(displayMetrics.widthPixels)), new Pair("screen_y", Integer.valueOf(displayMetrics.heightPixels)), new Pair("screen_d", String.valueOf(displayMetrics.density)), new Pair("camera", a3.a(context)), new Pair("mdl", Build.MODEL), new Pair("prd", Build.PRODUCT), new Pair("mnf", Build.MANUFACTURER), new Pair("dev", Build.DEVICE), new Pair("hrd", Build.HARDWARE), new Pair("fgp", Build.FINGERPRINT), new Pair("tgs", Build.TAGS), new Pair("d_ifv", string));
        }
    }
}
