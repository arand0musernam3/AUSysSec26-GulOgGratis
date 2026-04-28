package androidx.core.app;

import android.app.Notification;
import android.app.Person;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.braze.models.inappmessage.InAppMessageBase;
import java.util.ArrayList;
import org.bouncycastle.i18n.TextBundle;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f2591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f2592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y0 f2593c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f2594d = new Bundle();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f2595e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Uri f2596f;

    public e0(CharSequence charSequence, long j9, y0 y0Var) {
        this.f2591a = charSequence;
        this.f2592b = j9;
        this.f2593c = y0Var;
    }

    public static Bundle[] a(ArrayList arrayList) {
        Bundle[] bundleArr = new Bundle[arrayList.size()];
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            e0 e0Var = (e0) arrayList.get(i11);
            y0 y0Var = e0Var.f2593c;
            Bundle bundle = new Bundle();
            CharSequence charSequence = e0Var.f2591a;
            if (charSequence != null) {
                bundle.putCharSequence(TextBundle.TEXT_ENTRY, charSequence);
            }
            bundle.putLong("time", e0Var.f2592b);
            if (y0Var != null) {
                bundle.putCharSequence("sender", y0Var.f2711a);
                if (Build.VERSION.SDK_INT >= 28) {
                    bundle.putParcelable("sender_person", d0.a(l.h(y0Var)));
                } else {
                    bundle.putBundle("person", y0Var.b());
                }
            }
            String str = e0Var.f2595e;
            if (str != null) {
                bundle.putString("type", str);
            }
            Uri uri = e0Var.f2596f;
            if (uri != null) {
                bundle.putParcelable("uri", uri);
            }
            Bundle bundle2 = e0Var.f2594d;
            if (bundle2 != null) {
                bundle.putBundle(InAppMessageBase.EXTRAS, bundle2);
            }
            bundleArr[i11] = bundle;
        }
        return bundleArr;
    }

    public static ArrayList b(Parcelable[] parcelableArr) {
        y0 y0VarB;
        ArrayList arrayList = new ArrayList(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable instanceof Bundle) {
                Bundle bundle = (Bundle) parcelable;
                e0 e0Var = null;
                try {
                    if (bundle.containsKey(TextBundle.TEXT_ENTRY) && bundle.containsKey("time")) {
                        if (bundle.containsKey("person")) {
                            y0VarB = y0.a(bundle.getBundle("person"));
                        } else if (bundle.containsKey("sender_person") && Build.VERSION.SDK_INT >= 28) {
                            y0VarB = l.b((Person) bundle.getParcelable("sender_person"));
                        } else if (bundle.containsKey("sender")) {
                            CharSequence charSequence = bundle.getCharSequence("sender");
                            y0 y0Var = new y0();
                            y0Var.f2711a = charSequence;
                            y0Var.f2712b = null;
                            y0Var.f2713c = null;
                            y0Var.f2714d = null;
                            y0Var.f2715e = false;
                            y0Var.f2716f = false;
                            y0VarB = y0Var;
                        } else {
                            y0VarB = null;
                        }
                        e0 e0Var2 = new e0(bundle.getCharSequence(TextBundle.TEXT_ENTRY), bundle.getLong("time"), y0VarB);
                        if (bundle.containsKey("type") && bundle.containsKey("uri")) {
                            String string = bundle.getString("type");
                            Uri uri = (Uri) bundle.getParcelable("uri");
                            e0Var2.f2595e = string;
                            e0Var2.f2596f = uri;
                        }
                        if (bundle.containsKey(InAppMessageBase.EXTRAS)) {
                            e0Var2.f2594d.putAll(bundle.getBundle(InAppMessageBase.EXTRAS));
                        }
                        e0Var = e0Var2;
                    }
                } catch (ClassCastException unused) {
                }
                if (e0Var != null) {
                    arrayList.add(e0Var);
                }
            }
        }
        return arrayList;
    }

    public final Notification.MessagingStyle.Message c() {
        Notification.MessagingStyle.Message messageA;
        int i11 = Build.VERSION.SDK_INT;
        long j9 = this.f2592b;
        y0 y0Var = this.f2593c;
        CharSequence charSequence = this.f2591a;
        if (i11 >= 28) {
            messageA = d0.b(charSequence, j9, y0Var != null ? l.h(y0Var) : null);
        } else {
            messageA = c0.a(charSequence, j9, y0Var != null ? y0Var.f2711a : null);
        }
        String str = this.f2595e;
        if (str != null) {
            c0.b(messageA, str, this.f2596f);
        }
        return messageA;
    }
}
