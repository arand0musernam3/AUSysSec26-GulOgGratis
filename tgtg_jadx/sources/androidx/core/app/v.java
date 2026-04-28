package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import com.app.tgtg.R;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public y0 f2699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PendingIntent f2700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public PendingIntent f2701d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public PendingIntent f2702e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f2703f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Integer f2704g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Integer f2705h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public IconCompat f2706i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f2707j;

    @Override // androidx.core.app.l0
    public final void addCompatExtras(Bundle bundle) {
        super.addCompatExtras(bundle);
        bundle.putInt("android.callType", this.f2698a);
        bundle.putBoolean("android.callIsVideo", this.f2703f);
        y0 y0Var = this.f2699b;
        if (y0Var != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                y0Var.getClass();
                bundle.putParcelable("android.callPerson", t.b(l.h(y0Var)));
            } else {
                bundle.putParcelable("android.callPersonCompat", y0Var.b());
            }
        }
        IconCompat iconCompat = this.f2706i;
        if (iconCompat != null) {
            bundle.putParcelable("android.verificationIcon", iconCompat.h(this.mBuilder.f2664a));
        }
        bundle.putCharSequence("android.verificationText", this.f2707j);
        bundle.putParcelable("android.answerIntent", this.f2700c);
        bundle.putParcelable("android.declineIntent", this.f2701d);
        bundle.putParcelable("android.hangUpIntent", this.f2702e);
        Integer num = this.f2704g;
        if (num != null) {
            bundle.putInt("android.answerColor", num.intValue());
        }
        Integer num2 = this.f2705h;
        if (num2 != null) {
            bundle.putInt("android.declineColor", num2.intValue());
        }
    }

    @Override // androidx.core.app.l0
    public final void apply(i iVar) {
        int i11 = Build.VERSION.SDK_INT;
        String string = null;
        callStyleA = null;
        Notification.CallStyle callStyleA = null;
        if (i11 < 31) {
            Notification.Builder builder = ((o0) iVar).f2650b;
            y0 y0Var = this.f2699b;
            builder.setContentTitle(y0Var != null ? y0Var.f2711a : null);
            Bundle bundle = this.mBuilder.f2678p;
            CharSequence charSequence = (bundle == null || !bundle.containsKey("android.text")) ? null : this.mBuilder.f2678p.getCharSequence("android.text");
            if (charSequence == null) {
                int i12 = this.f2698a;
                if (i12 == 1) {
                    string = this.mBuilder.f2664a.getResources().getString(R.string.call_notification_incoming_text);
                } else if (i12 == 2) {
                    string = this.mBuilder.f2664a.getResources().getString(R.string.call_notification_ongoing_text);
                } else if (i12 == 3) {
                    string = this.mBuilder.f2664a.getResources().getString(R.string.call_notification_screening_text);
                }
                charSequence = string;
            }
            builder.setContentText(charSequence);
            y0 y0Var2 = this.f2699b;
            if (y0Var2 != null) {
                IconCompat iconCompat = y0Var2.f2712b;
                if (iconCompat != null) {
                    builder.setLargeIcon(iconCompat.h(this.mBuilder.f2664a));
                }
                y0 y0Var3 = this.f2699b;
                if (i11 >= 28) {
                    y0Var3.getClass();
                    t.a(builder, l.h(y0Var3));
                } else {
                    builder.addPerson(y0Var3.f2713c);
                }
            }
            builder.setCategory("call");
            return;
        }
        int i13 = this.f2698a;
        if (i13 == 1) {
            y0 y0Var4 = this.f2699b;
            y0Var4.getClass();
            callStyleA = u.a(l.h(y0Var4), this.f2701d, this.f2700c);
        } else if (i13 == 2) {
            y0 y0Var5 = this.f2699b;
            y0Var5.getClass();
            callStyleA = u.b(l.h(y0Var5), this.f2702e);
        } else if (i13 == 3) {
            y0 y0Var6 = this.f2699b;
            y0Var6.getClass();
            callStyleA = u.c(l.h(y0Var6), this.f2702e, this.f2700c);
        } else if (Log.isLoggable("NotifCompat", 3)) {
            Log.d("NotifCompat", "Unrecognized call type in CallStyle: " + String.valueOf(this.f2698a));
        }
        if (callStyleA != null) {
            callStyleA.setBuilder(((o0) iVar).f2650b);
            Integer num = this.f2704g;
            if (num != null) {
                u.d(callStyleA, num.intValue());
            }
            Integer num2 = this.f2705h;
            if (num2 != null) {
                u.e(callStyleA, num2.intValue());
            }
            u.h(callStyleA, this.f2707j);
            IconCompat iconCompat2 = this.f2706i;
            if (iconCompat2 != null) {
                u.g(callStyleA, iconCompat2.h(this.mBuilder.f2664a));
            }
            u.f(callStyleA, this.f2703f);
        }
    }

    public final o c(int i11, int i12, Integer num, int i13, PendingIntent pendingIntent) {
        if (num == null) {
            num = Integer.valueOf(this.mBuilder.f2664a.getColor(i13));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.mBuilder.f2664a.getResources().getString(i12));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(num.intValue()), 0, spannableStringBuilder.length(), 18);
        Context context = this.mBuilder.f2664a;
        PorterDuff.Mode mode = IconCompat.f2718k;
        context.getClass();
        o oVarA = new n(IconCompat.d(context.getResources(), context.getPackageName(), i11), spannableStringBuilder, pendingIntent, new Bundle()).a();
        oVarA.f2641a.putBoolean("key_action_priority", true);
        return oVarA;
    }

    @Override // androidx.core.app.l0
    public final boolean displayCustomViewInline() {
        return true;
    }

    @Override // androidx.core.app.l0
    public final String getClassName() {
        return "androidx.core.app.NotificationCompat$CallStyle";
    }

    @Override // androidx.core.app.l0
    public final void restoreFromCompatExtras(Bundle bundle) {
        super.restoreFromCompatExtras(bundle);
        this.f2698a = bundle.getInt("android.callType");
        this.f2703f = bundle.getBoolean("android.callIsVideo");
        if (Build.VERSION.SDK_INT >= 28 && bundle.containsKey("android.callPerson")) {
            this.f2699b = l.b((Person) bundle.getParcelable("android.callPerson"));
        } else if (bundle.containsKey("android.callPersonCompat")) {
            this.f2699b = y0.a(bundle.getBundle("android.callPersonCompat"));
        }
        if (bundle.containsKey("android.verificationIcon")) {
            this.f2706i = IconCompat.b((Icon) bundle.getParcelable("android.verificationIcon"));
        } else if (bundle.containsKey("android.verificationIconCompat")) {
            this.f2706i = IconCompat.a(bundle.getBundle("android.verificationIconCompat"));
        }
        this.f2707j = bundle.getCharSequence("android.verificationText");
        this.f2700c = (PendingIntent) bundle.getParcelable("android.answerIntent");
        this.f2701d = (PendingIntent) bundle.getParcelable("android.declineIntent");
        this.f2702e = (PendingIntent) bundle.getParcelable("android.hangUpIntent");
        this.f2704g = bundle.containsKey("android.answerColor") ? Integer.valueOf(bundle.getInt("android.answerColor")) : null;
        this.f2705h = bundle.containsKey("android.declineColor") ? Integer.valueOf(bundle.getInt("android.declineColor")) : null;
    }
}
