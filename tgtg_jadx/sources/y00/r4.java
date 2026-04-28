package y00;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.measurement.c6;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class r4 extends w1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String[] f45117j = {"firebase_", "google_", "ga_"};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String[] f45118k = {"_err"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SecureRandom f45119d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicLong f45120e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f45121f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public u9.a f45122g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Boolean f45123h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Integer f45124i;

    public r4(n1 n1Var) {
        super(n1Var);
        this.f45124i = null;
        this.f45120e = new AtomicLong(0L);
    }

    public static boolean C0(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    public static void H(q4 q4Var, String str, int i11, String str2, String str3, int i12) {
        Bundle bundle = new Bundle();
        O(i11, bundle);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i11 == 6 || i11 == 7 || i11 == 2) {
            bundle.putLong("_el", i12);
        }
        q4Var.b(str, "_err", bundle);
    }

    public static MessageDigest I() {
        MessageDigest messageDigest;
        for (int i11 = 0; i11 < 2; i11++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    public static long J(byte[] bArr) {
        com.google.android.gms.common.internal.i0.h(bArr);
        int length = bArr.length;
        if (length <= 0) {
            qc.y.e();
            return 0L;
        }
        int i11 = 0;
        long j9 = 0;
        for (int i12 = length - 1; i12 >= 0 && i12 >= bArr.length - 8; i12--) {
            j9 += (((long) bArr[i12]) & 255) << i11;
            i11 += 8;
        }
        return j9;
    }

    public static boolean K(Context context) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementJobService"), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static int M() {
        if (Build.VERSION.SDK_INT < 30 || SdkExtensions.getExtensionVersion(30) <= 3) {
            return 0;
        }
        return SdkExtensions.getExtensionVersion(1000000);
    }

    public static final boolean O(int i11, Bundle bundle) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i11);
        return true;
    }

    public static boolean R(String str, String[] strArr) {
        com.google.android.gms.common.internal.i0.h(strArr);
        for (String str2 : strArr) {
            if (Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean S(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.equals("*") || Arrays.asList(str.split(MessageLogView.COMMA_SEPARATOR)).contains(str2);
    }

    public static boolean U(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    public static byte[] Z(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    public static ArrayList k0(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", eVar.f44689a);
            bundle.putString("origin", eVar.f44690b);
            bundle.putLong("creation_timestamp", eVar.f44692d);
            bundle.putString("name", eVar.f44691c.f45052b);
            Object objD = eVar.f44691c.d();
            com.google.android.gms.common.internal.i0.h(objD);
            c2.c(bundle, objD);
            bundle.putBoolean("active", eVar.f44693e);
            String str = eVar.f44694f;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            u uVar = eVar.f44695g;
            if (uVar != null) {
                bundle.putString("timed_out_event_name", uVar.f45195a);
                t tVar = uVar.f45196b;
                if (tVar != null) {
                    bundle.putBundle("timed_out_event_params", tVar.h());
                }
            }
            bundle.putLong("trigger_timeout", eVar.f44696h);
            u uVar2 = eVar.f44697i;
            if (uVar2 != null) {
                bundle.putString("triggered_event_name", uVar2.f45195a);
                t tVar2 = uVar2.f45196b;
                if (tVar2 != null) {
                    bundle.putBundle("triggered_event_params", tVar2.h());
                }
            }
            bundle.putLong("triggered_timestamp", eVar.f44691c.f45053c);
            bundle.putLong("time_to_live", eVar.f44698j);
            u uVar3 = eVar.f44699k;
            if (uVar3 != null) {
                bundle.putString("expired_event_name", uVar3.f45195a);
                t tVar3 = uVar3.f45196b;
                if (tVar3 != null) {
                    bundle.putBundle("expired_event_params", tVar3.h());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static boolean l0(Context context) {
        ActivityInfo receiverInfo;
        com.google.android.gms.common.internal.i0.h(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static void m0(a3 a3Var, Bundle bundle, boolean z11) {
        if (bundle != null && a3Var != null) {
            if (!bundle.containsKey("_sc") || z11) {
                String str = a3Var.f44579a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = a3Var.f44580b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", a3Var.f44581c);
                return;
            }
            z11 = false;
        }
        if (bundle != null && a3Var == null && z11) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public static boolean q0(String str) {
        com.google.android.gms.common.internal.i0.e(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    public static boolean s0(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        if ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) {
            return true;
        }
        if (TextUtils.isEmpty(stringExtra)) {
            return false;
        }
        try {
            String host = new URL(stringExtra).getHost();
            if (TextUtils.isEmpty(host)) {
                return false;
            }
            return host.matches("^(www\\.)?google(\\.com?)?(\\.[a-z]{2}t?)?$");
        } catch (MalformedURLException unused) {
            return false;
        }
    }

    public static String w(String str, int i11, boolean z11) {
        if (str != null) {
            if (str.codePointCount(0, str.length()) <= i11) {
                return str;
            }
            if (z11) {
                return str.substring(0, str.offsetByCodePoints(0, i11)).concat("...");
            }
        }
        return null;
    }

    public final void A(x0 x0Var, int i11) {
        Bundle bundle = x0Var.f45298e;
        int i12 = 0;
        boolean z11 = false;
        for (String str : new TreeSet(bundle.keySet())) {
            if (q0(str) && (i12 = i12 + 1) > i11) {
                if (!z11) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 37);
                    sb2.append("Event can't contain more than ");
                    sb2.append(i11);
                    sb2.append(" params");
                    String string = sb2.toString();
                    n1 n1Var = (n1) this.f21216b;
                    w0 w0Var = n1Var.f44987f;
                    r0 r0Var = n1Var.f44991j;
                    n1.m(w0Var);
                    w0Var.f45262i.c(string, r0Var.a(x0Var.f45294a), r0Var.e(bundle));
                    O(5, bundle);
                }
                bundle.remove(str);
                z11 = true;
            }
        }
    }

    public final int A0(String str) {
        if (!t0("event param", str)) {
            return 3;
        }
        if (!v0("event param", null, null, str)) {
            return 14;
        }
        ((n1) this.f21216b).getClass();
        return !w0(40, "event param", str) ? 3 : 0;
    }

    public final void B(Parcelable[] parcelableArr, int i11) {
        com.google.android.gms.common.internal.i0.h(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            int i12 = 0;
            boolean z11 = false;
            for (String str : new TreeSet(bundle.keySet())) {
                if (q0(str) && !R(str, c2.f44657k) && (i12 = i12 + 1) > i11) {
                    if (!z11) {
                        n1 n1Var = (n1) this.f21216b;
                        w0 w0Var = n1Var.f44987f;
                        r0 r0Var = n1Var.f44991j;
                        n1.m(w0Var);
                        u0 u0Var = w0Var.f45262i;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 60);
                        sb2.append("Param can't contain more than ");
                        sb2.append(i11);
                        sb2.append(" item-scoped custom parameters");
                        u0Var.c(sb2.toString(), r0Var.b(str), r0Var.e(bundle));
                    }
                    O(28, bundle);
                    bundle.remove(str);
                    z11 = true;
                }
            }
        }
    }

    public final int B0(String str) {
        if (!u0("event param", str)) {
            return 3;
        }
        if (!v0("event param", null, null, str)) {
            return 14;
        }
        ((n1) this.f21216b).getClass();
        return !w0(40, "event param", str) ? 3 : 0;
    }

    public final void C(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                r4 r4Var = ((n1) this.f21216b).f44990i;
                n1.k(r4Var);
                r4Var.G(bundle, str, bundle2.get(str));
            }
        }
    }

    public final void D(Bundle bundle, int i11, String str, Object obj) {
        if (O(i11, bundle)) {
            ((n1) this.f21216b).getClass();
            bundle.putString("_ev", w(str, 40, true));
            if (obj != null) {
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    public final int E(Object obj, String str) {
        return "_ldl".equals(str) ? t("user property referrer", str, Q(str), obj) : t("user property", str, Q(str), obj) ? 0 : 7;
    }

    public final Object F(Object obj, String str) {
        return "_ldl".equals(str) ? P(Q(str), obj, true, false) : P(Q(str), obj, false, false);
    }

    public final void G(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
            return;
        }
        if (str != null) {
            String simpleName = obj != null ? obj.getClass().getSimpleName() : null;
            n1 n1Var = (n1) this.f21216b;
            w0 w0Var = n1Var.f44987f;
            n1.m(w0Var);
            w0Var.l.c("Not putting event parameter. Invalid value type. name, type", n1Var.f44991j.b(str), simpleName);
        }
    }

    public final u9.a L() {
        d40.t1 bVar;
        Object objInvoke;
        if (this.f45122g == null) {
            Context context = ((n1) this.f21216b).f44982a;
            context.getClass();
            StringBuilder sb2 = new StringBuilder("AdServicesInfo.version=");
            int i11 = Build.VERSION.SDK_INT;
            s9.b bVar2 = s9.b.f38906a;
            sb2.append(i11 >= 33 ? bVar2.a() : 0);
            Log.d("MeasurementManager", sb2.toString());
            if ((i11 >= 33 ? bVar2.a() : 0) >= 5) {
                bVar = new v9.b(context, 1);
            } else {
                s9.a aVar = s9.a.f38905a;
                if (((i11 == 31 || i11 == 32) ? aVar.a() : 0) >= 9) {
                    try {
                        objInvoke = new q1.h1(context, 8).invoke(context);
                    } catch (NoClassDefFoundError unused) {
                        StringBuilder sb3 = new StringBuilder("Unable to find adservices code, check manifest for uses-library tag, versionS=");
                        int i12 = Build.VERSION.SDK_INT;
                        sb3.append((i12 == 31 || i12 == 32) ? aVar.a() : 0);
                        Log.d("MeasurementManager", sb3.toString());
                        objInvoke = null;
                    }
                    bVar = (d40.t1) objInvoke;
                } else {
                    bVar = null;
                }
            }
            this.f45122g = bVar != null ? new u9.a(bVar) : null;
        }
        return this.f45122g;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long N() {
        /*
            r12 = this;
            r12.p()
            java.lang.Object r0 = r12.f21216b
            y00.n1 r0 = (y00.n1) r0
            y00.o0 r1 = r0.r()
            y00.w0 r0 = r0.f44987f
            java.lang.String r1 = r1.v()
            y00.f0 r2 = y00.g0.f44804q0
            r3 = 0
            java.lang.Object r2 = r2.a(r3)
            java.lang.String r2 = (java.lang.String) r2
            boolean r1 = S(r2, r1)
            r4 = 0
            if (r1 != 0) goto L23
            return r4
        L23:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 >= r2) goto L2c
            r1 = 4
            goto L4c
        L2c:
            int r1 = android.os.ext.SdkExtensions.getExtensionVersion(r2)
            r2 = 4
            if (r1 >= r2) goto L36
            r1 = 8
            goto L4c
        L36:
            int r1 = M()
            y00.f0 r2 = y00.g0.f44793k0
            java.lang.Object r2 = r2.a(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r1 >= r2) goto L4b
            r1 = 16
            goto L4c
        L4b:
            r1 = r4
        L4c:
            java.lang.String r6 = "android.permission.ACCESS_ADSERVICES_ATTRIBUTION"
            boolean r6 = r12.T(r6)
            if (r6 != 0) goto L57
            r6 = 2
            long r1 = r1 | r6
        L57:
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 != 0) goto Lbb
            java.lang.Boolean r6 = r12.f45123h
            if (r6 != 0) goto Lb1
            u9.a r6 = r12.L()
            r7 = 0
            if (r6 != 0) goto L67
            goto Lb7
        L67:
            com.google.common.util.concurrent.ListenableFuture r6 = r6.b()
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.util.concurrent.TimeoutException -> L8f java.lang.InterruptedException -> L91 java.util.concurrent.ExecutionException -> L93 java.util.concurrent.CancellationException -> L95
            r9 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r6 = r6.get(r9, r8)     // Catch: java.util.concurrent.TimeoutException -> L8f java.lang.InterruptedException -> L91 java.util.concurrent.ExecutionException -> L93 java.util.concurrent.CancellationException -> L95
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch: java.util.concurrent.TimeoutException -> L8f java.lang.InterruptedException -> L91 java.util.concurrent.ExecutionException -> L93 java.util.concurrent.CancellationException -> L95
            if (r6 == 0) goto L88
            int r3 = r6.intValue()     // Catch: java.util.concurrent.TimeoutException -> L80 java.lang.InterruptedException -> L82 java.util.concurrent.ExecutionException -> L84 java.util.concurrent.CancellationException -> L86
            r8 = 1
            if (r3 != r8) goto L88
            r7 = r8
            goto L88
        L80:
            r3 = move-exception
            goto L99
        L82:
            r3 = move-exception
            goto L99
        L84:
            r3 = move-exception
            goto L99
        L86:
            r3 = move-exception
            goto L99
        L88:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r7)     // Catch: java.util.concurrent.TimeoutException -> L80 java.lang.InterruptedException -> L82 java.util.concurrent.ExecutionException -> L84 java.util.concurrent.CancellationException -> L86
            r12.f45123h = r3     // Catch: java.util.concurrent.TimeoutException -> L80 java.lang.InterruptedException -> L82 java.util.concurrent.ExecutionException -> L84 java.util.concurrent.CancellationException -> L86
            goto La7
        L8f:
            r6 = move-exception
            goto L96
        L91:
            r6 = move-exception
            goto L96
        L93:
            r6 = move-exception
            goto L96
        L95:
            r6 = move-exception
        L96:
            r11 = r6
            r6 = r3
            r3 = r11
        L99:
            y00.n1.m(r0)
            y00.u0 r7 = r0.f45263j
            java.lang.String r8 = "Measurement manager api exception"
            r7.b(r3, r8)
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r12.f45123h = r3
        La7:
            y00.n1.m(r0)
            y00.u0 r0 = r0.f45267o
            java.lang.String r3 = "Measurement manager api status result"
            r0.b(r6, r3)
        Lb1:
            java.lang.Boolean r0 = r12.f45123h
            boolean r7 = r0.booleanValue()
        Lb7:
            if (r7 != 0) goto Lbb
            r1 = 64
        Lbb:
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 != 0) goto Lc2
            r0 = 1
            return r0
        Lc2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: y00.r4.N():long");
    }

    public final Object P(int i11, Object obj, boolean z11, boolean z12) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return w(obj.toString(), i11, z11);
        }
        if (!z12) {
            return null;
        }
        if (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[])) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if (parcelable instanceof Bundle) {
                Bundle bundleW = W((Bundle) parcelable);
                if (!bundleW.isEmpty()) {
                    arrayList.add(bundleW);
                }
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public final int Q(String str) {
        n1 n1Var = (n1) this.f21216b;
        if ("_ldl".equals(str)) {
            n1Var.getClass();
            return NewHope.SENDB_BYTES;
        }
        if ("_id".equals(str)) {
            n1Var.getClass();
            return 256;
        }
        if ("_lgclid".equals(str)) {
            n1Var.getClass();
            return 100;
        }
        n1Var.getClass();
        return 36;
    }

    public final boolean T(String str) {
        p();
        n1 n1Var = (n1) this.f21216b;
        if (xz.c.a(n1Var.f44982a).f26684a.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        w0 w0Var = n1Var.f44987f;
        n1.m(w0Var);
        w0Var.f45266n.b(str, "Permission not granted");
        return false;
    }

    public final boolean V(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return ((n1) this.f21216b).f44985d.t("debug.firebase.analytics.app").equals(str);
    }

    public final Bundle W(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object objY = y(bundle.get(str), str);
                if (objY == null) {
                    n1 n1Var = (n1) this.f21216b;
                    w0 w0Var = n1Var.f44987f;
                    n1.m(w0Var);
                    w0Var.l.b(n1Var.f44991j.b(str), "Param value can't be null");
                } else {
                    G(bundle2, str, objY);
                }
            }
        }
        return bundle2;
    }

    public final u X(String str, Bundle bundle, String str2, long j9, long j11, boolean z11) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (x0(str) != 0) {
            n1 n1Var = (n1) this.f21216b;
            w0 w0Var = n1Var.f44987f;
            n1.m(w0Var);
            w0Var.f45260g.b(n1Var.f44991j.c(str), "Invalid conditional property event name");
            i4.a.h();
            return null;
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str2);
        Bundle bundleZ = z(str, bundle2, Collections.singletonList("_o"), true);
        if (z11) {
            bundleZ = W(bundleZ);
        }
        com.google.android.gms.common.internal.i0.h(bundleZ);
        return new u(str, new t(bundleZ), str2, j9, j11);
    }

    public final boolean Y(Context context, String str) {
        Signature[] signatureArr;
        n1 n1Var = (n1) this.f21216b;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfoD = xz.c.a(context).d(64, str);
            if (packageInfoD == null || (signatureArr = packageInfoD.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e5) {
            w0 w0Var = n1Var.f44987f;
            n1.m(w0Var);
            w0Var.f45260g.b(e5, "Package name not found");
            return true;
        } catch (CertificateException e11) {
            w0 w0Var2 = n1Var.f44987f;
            n1.m(w0Var2);
            w0Var2.f45260g.b(e11, "Error obtaining certificate");
            return true;
        }
    }

    public final boolean a0(int i11) {
        Boolean bool = ((n1) this.f21216b).p().f44963f;
        if (b0() < i11 / 1000) {
            return (bool == null || bool.booleanValue()) ? false : true;
        }
        return true;
    }

    public final int b0() {
        if (this.f45124i == null) {
            n1 n1Var = (n1) this.f21216b;
            com.google.android.gms.common.a aVar = com.google.android.gms.common.a.f11048b;
            Context context = n1Var.f44982a;
            aVar.getClass();
            AtomicBoolean atomicBoolean = pz.e.f35655a;
            int i11 = 0;
            try {
                i11 = context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            }
            this.f45124i = Integer.valueOf(i11 / 1000);
        }
        return this.f45124i.intValue();
    }

    public final void c0(Bundle bundle, long j9) {
        long j11 = bundle.getLong("_et");
        if (j11 != 0) {
            w0 w0Var = ((n1) this.f21216b).f44987f;
            n1.m(w0Var);
            w0Var.f45263j.b(Long.valueOf(j11), "Params already contained engagement");
        } else {
            j11 = 0;
        }
        bundle.putLong("_et", j9 + j11);
    }

    public final void d0(String str, c6 c6Var) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            c6Var.A(bundle);
        } catch (RemoteException e5) {
            w0 w0Var = ((n1) this.f21216b).f44987f;
            n1.m(w0Var);
            w0Var.f45263j.b(e5, "Error returning string value to wrapper");
        }
    }

    public final void e0(c6 c6Var, long j9) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j9);
        try {
            c6Var.A(bundle);
        } catch (RemoteException e5) {
            w0 w0Var = ((n1) this.f21216b).f44987f;
            n1.m(w0Var);
            w0Var.f45263j.b(e5, "Error returning long value to wrapper");
        }
    }

    public final void f0(c6 c6Var, int i11) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i11);
        try {
            c6Var.A(bundle);
        } catch (RemoteException e5) {
            w0 w0Var = ((n1) this.f21216b).f44987f;
            n1.m(w0Var);
            w0Var.f45263j.b(e5, "Error returning int value to wrapper");
        }
    }

    public final void g0(c6 c6Var, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            c6Var.A(bundle);
        } catch (RemoteException e5) {
            w0 w0Var = ((n1) this.f21216b).f44987f;
            n1.m(w0Var);
            w0Var.f45263j.b(e5, "Error returning byte array to wrapper");
        }
    }

    public final void h0(c6 c6Var, boolean z11) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z11);
        try {
            c6Var.A(bundle);
        } catch (RemoteException e5) {
            w0 w0Var = ((n1) this.f21216b).f44987f;
            n1.m(w0Var);
            w0Var.f45263j.b(e5, "Error returning boolean value to wrapper");
        }
    }

    public final void i0(c6 c6Var, Bundle bundle) {
        try {
            c6Var.A(bundle);
        } catch (RemoteException e5) {
            w0 w0Var = ((n1) this.f21216b).f44987f;
            n1.m(w0Var);
            w0Var.f45263j.b(e5, "Error returning bundle value to wrapper");
        }
    }

    public final void j0(c6 c6Var, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            c6Var.A(bundle);
        } catch (RemoteException e5) {
            w0 w0Var = ((n1) this.f21216b).f44987f;
            n1.m(w0Var);
            w0Var.f45263j.b(e5, "Error returning bundle list to wrapper");
        }
    }

    public final String n0() {
        byte[] bArr = new byte[16];
        p0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final long o0() {
        long andIncrement;
        long j9;
        AtomicLong atomicLong = this.f45120e;
        if (atomicLong.get() != 0) {
            AtomicLong atomicLong2 = this.f45120e;
            synchronized (atomicLong2) {
                atomicLong2.compareAndSet(-1L, 1L);
                andIncrement = atomicLong2.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (atomicLong) {
            long jNanoTime = System.nanoTime();
            ((n1) this.f21216b).f44992k.getClass();
            long jNextLong = new Random(jNanoTime ^ System.currentTimeMillis()).nextLong();
            int i11 = this.f45121f + 1;
            this.f45121f = i11;
            j9 = jNextLong + ((long) i11);
        }
        return j9;
    }

    public final SecureRandom p0() {
        p();
        if (this.f45119d == null) {
            this.f45119d = new SecureRandom();
        }
        return this.f45119d;
    }

    @Override // y00.w1
    public final boolean q() {
        return true;
    }

    public final Bundle r0(Uri uri) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        String queryParameter5;
        String queryParameter6;
        String queryParameter7;
        String queryParameter8;
        String queryParameter9;
        n1 n1Var = (n1) this.f21216b;
        if (uri != null) {
            try {
                if (uri.isHierarchical()) {
                    queryParameter = uri.getQueryParameter("utm_campaign");
                    queryParameter2 = uri.getQueryParameter("utm_source");
                    queryParameter3 = uri.getQueryParameter("utm_medium");
                    queryParameter4 = uri.getQueryParameter("gclid");
                    queryParameter5 = uri.getQueryParameter("gbraid");
                    queryParameter6 = uri.getQueryParameter("utm_id");
                    queryParameter7 = uri.getQueryParameter("dclid");
                    queryParameter8 = uri.getQueryParameter("srsltid");
                    queryParameter9 = uri.getQueryParameter("sfmc_id");
                } else {
                    queryParameter = null;
                    queryParameter2 = null;
                    queryParameter3 = null;
                    queryParameter4 = null;
                    queryParameter5 = null;
                    queryParameter6 = null;
                    queryParameter7 = null;
                    queryParameter8 = null;
                    queryParameter9 = null;
                }
                if (!TextUtils.isEmpty(queryParameter) || !TextUtils.isEmpty(queryParameter2) || !TextUtils.isEmpty(queryParameter3) || !TextUtils.isEmpty(queryParameter4) || !TextUtils.isEmpty(queryParameter5) || !TextUtils.isEmpty(queryParameter6) || !TextUtils.isEmpty(queryParameter7) || !TextUtils.isEmpty(queryParameter8) || !TextUtils.isEmpty(queryParameter9)) {
                    Bundle bundle = new Bundle();
                    if (!TextUtils.isEmpty(queryParameter)) {
                        bundle.putString("campaign", queryParameter);
                    }
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        bundle.putString("source", queryParameter2);
                    }
                    if (!TextUtils.isEmpty(queryParameter3)) {
                        bundle.putString("medium", queryParameter3);
                    }
                    if (!TextUtils.isEmpty(queryParameter4)) {
                        bundle.putString("gclid", queryParameter4);
                    }
                    if (!TextUtils.isEmpty(queryParameter5)) {
                        bundle.putString("gbraid", queryParameter5);
                    }
                    String queryParameter10 = uri.getQueryParameter("gad_source");
                    if (!TextUtils.isEmpty(queryParameter10)) {
                        bundle.putString("gad_source", queryParameter10);
                    }
                    String queryParameter11 = uri.getQueryParameter("utm_term");
                    if (!TextUtils.isEmpty(queryParameter11)) {
                        bundle.putString("term", queryParameter11);
                    }
                    String queryParameter12 = uri.getQueryParameter("utm_content");
                    if (!TextUtils.isEmpty(queryParameter12)) {
                        bundle.putString("content", queryParameter12);
                    }
                    String queryParameter13 = uri.getQueryParameter("aclid");
                    if (!TextUtils.isEmpty(queryParameter13)) {
                        bundle.putString("aclid", queryParameter13);
                    }
                    String queryParameter14 = uri.getQueryParameter("cp1");
                    if (!TextUtils.isEmpty(queryParameter14)) {
                        bundle.putString("cp1", queryParameter14);
                    }
                    String queryParameter15 = uri.getQueryParameter("anid");
                    if (!TextUtils.isEmpty(queryParameter15)) {
                        bundle.putString("anid", queryParameter15);
                    }
                    if (!TextUtils.isEmpty(queryParameter6)) {
                        bundle.putString("campaign_id", queryParameter6);
                    }
                    if (!TextUtils.isEmpty(queryParameter7)) {
                        bundle.putString("dclid", queryParameter7);
                    }
                    String queryParameter16 = uri.getQueryParameter("utm_source_platform");
                    if (!TextUtils.isEmpty(queryParameter16)) {
                        bundle.putString("source_platform", queryParameter16);
                    }
                    String queryParameter17 = uri.getQueryParameter("utm_creative_format");
                    if (!TextUtils.isEmpty(queryParameter17)) {
                        bundle.putString("creative_format", queryParameter17);
                    }
                    String queryParameter18 = uri.getQueryParameter("utm_marketing_tactic");
                    if (!TextUtils.isEmpty(queryParameter18)) {
                        bundle.putString("marketing_tactic", queryParameter18);
                    }
                    if (!TextUtils.isEmpty(queryParameter8)) {
                        bundle.putString("srsltid", queryParameter8);
                    }
                    if (!TextUtils.isEmpty(queryParameter9)) {
                        bundle.putString("sfmc_id", queryParameter9);
                    }
                    for (String str : uri.getQueryParameterNames()) {
                        if (str.startsWith("gad_")) {
                            String queryParameter19 = uri.getQueryParameter(str);
                            if (!TextUtils.isEmpty(queryParameter19)) {
                                bundle.putString(str, queryParameter19);
                            }
                        }
                    }
                    if (n1Var.f44985d.A(null, g0.f44764a1)) {
                        String string = new Uri.Builder().scheme(uri.getScheme()).authority(uri.getAuthority()).path(uri.getPath()).build().toString();
                        n1Var.f44985d.getClass();
                        int iMax = Math.max(500, 256);
                        if (string.length() > iMax) {
                            string = w(string, iMax - 3, true);
                        }
                        if (!TextUtils.isEmpty(string)) {
                            bundle.putString("deep_link_url", string);
                        }
                    }
                    return bundle;
                }
            } catch (UnsupportedOperationException e5) {
                w0 w0Var = n1Var.f44987f;
                n1.m(w0Var);
                w0Var.f45263j.b(e5, "Install referrer url isn't a hierarchical URI");
                return null;
            }
        }
        return null;
    }

    public final boolean t(String str, String str2, int i11, Object obj) {
        if (obj == null || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Boolean) || (obj instanceof Double)) {
            return true;
        }
        if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
            return false;
        }
        String string = obj.toString();
        if (string.codePointCount(0, string.length()) > i11) {
            w0 w0Var = ((n1) this.f21216b).f44987f;
            n1.m(w0Var);
            w0Var.l.d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(string.length()));
            return false;
        }
        return true;
    }

    public final boolean t0(String str, String str2) {
        n1 n1Var = (n1) this.f21216b;
        if (str2 == null) {
            w0 w0Var = n1Var.f44987f;
            n1.m(w0Var);
            w0Var.f45262i.b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            w0 w0Var2 = n1Var.f44987f;
            n1.m(w0Var2);
            w0Var2.f45262i.b(str, "Name is required and can't be empty. Type");
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            w0 w0Var3 = n1Var.f44987f;
            n1.m(w0Var3);
            w0Var3.f45262i.c("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                w0 w0Var4 = n1Var.f44987f;
                n1.m(w0Var4);
                w0Var4.f45262i.c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    public final void u(String str, String str2, Bundle bundle, List list, boolean z11) {
        int iA0;
        int iX;
        List list2 = list;
        if (bundle == null) {
            return;
        }
        n1 n1Var = (n1) this.f21216b;
        g gVar = n1Var.f44985d;
        w0 w0Var = n1Var.f44987f;
        r0 r0Var = n1Var.f44991j;
        r4 r4Var = ((n1) gVar.f21216b).f44990i;
        n1.k(r4Var);
        int i11 = true != r4Var.a0(231100000) ? 0 : 35;
        int i12 = 0;
        boolean z12 = false;
        for (String str3 : new TreeSet(bundle.keySet())) {
            if (list2 == null || !list2.contains(str3)) {
                iA0 = !z11 ? A0(str3) : 0;
                if (iA0 == 0) {
                    iA0 = B0(str3);
                }
            } else {
                iA0 = 0;
            }
            if (iA0 != 0) {
                D(bundle, iA0, str3, iA0 == 3 ? str3 : null);
                bundle.remove(str3);
            } else {
                if (C0(bundle.get(str3))) {
                    n1.m(w0Var);
                    w0Var.l.d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str, str2, str3);
                    iX = 22;
                } else {
                    iX = x(str, str3, bundle.get(str3), bundle, list2, z11, false);
                }
                if (iX != 0 && !"_ev".equals(str3)) {
                    D(bundle, iX, str3, bundle.get(str3));
                    bundle.remove(str3);
                } else if (q0(str3) && !R(str3, c2.f44657k)) {
                    i12++;
                    if (!a0(231100000)) {
                        n1.m(w0Var);
                        w0Var.f45262i.c("Item array not supported on client's version of Google Play Services (Android Only)", r0Var.a(str), r0Var.e(bundle));
                        O(23, bundle);
                        bundle.remove(str3);
                    } else if (i12 > i11) {
                        if (!z12) {
                            n1.m(w0Var);
                            u0 u0Var = w0Var.f45262i;
                            StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 55);
                            sb2.append("Item can't contain more than ");
                            sb2.append(i11);
                            sb2.append(" item-scoped custom params");
                            u0Var.c(sb2.toString(), r0Var.a(str), r0Var.e(bundle));
                        }
                        O(28, bundle);
                        bundle.remove(str3);
                        list2 = list;
                        z12 = true;
                    }
                }
            }
            list2 = list;
        }
    }

    public final boolean u0(String str, String str2) {
        n1 n1Var = (n1) this.f21216b;
        if (str2 == null) {
            w0 w0Var = n1Var.f44987f;
            n1.m(w0Var);
            w0Var.f45262i.b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            w0 w0Var2 = n1Var.f44987f;
            n1.m(w0Var2);
            w0Var2.f45262i.b(str, "Name is required and can't be empty. Type");
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            if (iCodePointAt != 95) {
                w0 w0Var3 = n1Var.f44987f;
                n1.m(w0Var3);
                w0Var3.f45262i.c("Name must start with a letter or _ (underscore). Type, name", str, str2);
                return false;
            }
            iCodePointAt = 95;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                w0 w0Var4 = n1Var.f44987f;
                n1.m(w0Var4);
                w0Var4.f45262i.c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    public final boolean v(String str) {
        n1 n1Var = (n1) this.f21216b;
        if (TextUtils.isEmpty(str)) {
            w0 w0Var = n1Var.f44987f;
            n1.m(w0Var);
            w0Var.f45262i.a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            return false;
        }
        com.google.android.gms.common.internal.i0.h(str);
        if (str.matches("^1:\\d+:android:[a-f0-9]+$")) {
            return true;
        }
        w0 w0Var2 = n1Var.f44987f;
        n1.m(w0Var2);
        w0Var2.f45262i.b(w0.x(str), "Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id");
        return false;
    }

    public final boolean v0(String str, String[] strArr, String[] strArr2, String str2) {
        n1 n1Var = (n1) this.f21216b;
        if (str2 == null) {
            w0 w0Var = n1Var.f44987f;
            n1.m(w0Var);
            w0Var.f45262i.b(str, "Name is required and can't be null. Type");
            return false;
        }
        for (int i11 = 0; i11 < 3; i11++) {
            if (str2.startsWith(f45117j[i11])) {
                w0 w0Var2 = n1Var.f44987f;
                n1.m(w0Var2);
                w0Var2.f45262i.c("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !R(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && R(str2, strArr2)) {
            return true;
        }
        w0 w0Var3 = n1Var.f44987f;
        n1.m(w0Var3);
        w0Var3.f45262i.c("Name is reserved. Type, name", str, str2);
        return false;
    }

    public final boolean w0(int i11, String str, String str2) {
        n1 n1Var = (n1) this.f21216b;
        if (str2 == null) {
            w0 w0Var = n1Var.f44987f;
            n1.m(w0Var);
            w0Var.f45262i.b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i11) {
            return true;
        }
        w0 w0Var2 = n1Var.f44987f;
        n1.m(w0Var2);
        w0Var2.f45262i.d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i11), str2);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int x(java.lang.String r13, java.lang.String r14, java.lang.Object r15, android.os.Bundle r16, java.util.List r17, boolean r18, boolean r19) {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y00.r4.x(java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    public final int x0(String str) {
        if (!u0("event", str)) {
            return 2;
        }
        if (v0("event", c2.f44647a, ((n1) this.f21216b).f44985d.A(null, g0.f44779f1) ? c2.f44649c : c2.f44648b, str)) {
            return !w0(40, "event", str) ? 2 : 0;
        }
        return 13;
    }

    public final Object y(Object obj, String str) {
        n1 n1Var = (n1) this.f21216b;
        int iMax = 500;
        if ("_ev".equals(str)) {
            n1Var.f44985d.getClass();
            return P(Math.max(500, 256), obj, true, true);
        }
        if (U(str)) {
            n1Var.f44985d.getClass();
            iMax = Math.max(500, 256);
        } else {
            n1Var.f44985d.getClass();
        }
        return P(iMax, obj, false, true);
    }

    public final boolean y0(String str) {
        return ((n1) this.f21216b).f44985d.A(null, g0.f44779f1) ? R(str, c2.f44651e) : R(str, c2.f44650d);
    }

    public final Bundle z(String str, Bundle bundle, List list, boolean z11) {
        int iA0;
        List list2 = list;
        boolean zR = R(str, c2.f44653g);
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        n1 n1Var = (n1) this.f21216b;
        g gVar = n1Var.f44985d;
        r0 r0Var = n1Var.f44991j;
        r4 r4Var = ((n1) gVar.f21216b).f44990i;
        n1.k(r4Var);
        int i11 = r4Var.a0(201500000) ? 100 : 25;
        int i12 = 0;
        boolean z12 = false;
        for (String str2 : new TreeSet(bundle.keySet())) {
            if (list2 == null || !list2.contains(str2)) {
                iA0 = !z11 ? A0(str2) : 0;
                if (iA0 == 0) {
                    iA0 = B0(str2);
                }
            } else {
                iA0 = 0;
            }
            if (iA0 != 0) {
                D(bundle2, iA0, str2, iA0 == 3 ? str2 : null);
                bundle2.remove(str2);
            } else {
                int iX = x(str, str2, bundle.get(str2), bundle2, list2, z11, zR);
                if (iX == 17) {
                    D(bundle2, 17, str2, Boolean.FALSE);
                } else if (iX != 0 && !"_ev".equals(str2)) {
                    D(bundle2, iX, iX == 21 ? str : str2, bundle.get(str2));
                    bundle2.remove(str2);
                }
                if (q0(str2)) {
                    i12++;
                    if (i12 > i11) {
                        if (!z12) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 37);
                            sb2.append("Event can't contain more than ");
                            sb2.append(i11);
                            sb2.append(" params");
                            String string = sb2.toString();
                            w0 w0Var = n1Var.f44987f;
                            n1.m(w0Var);
                            w0Var.f45262i.c(string, r0Var.a(str), r0Var.e(bundle));
                        }
                        O(5, bundle2);
                        bundle2.remove(str2);
                        z12 = true;
                    }
                }
                list2 = list;
            }
            list2 = list;
        }
        return bundle2;
    }

    public final int z0(String str) {
        if (!u0("user property", str)) {
            return 6;
        }
        if (!v0("user property", c2.l, null, str)) {
            return 15;
        }
        ((n1) this.f21216b).getClass();
        return !w0(24, "user property", str) ? 6 : 0;
    }
}
