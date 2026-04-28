package m2;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.lang.reflect.Array;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f2 implements r5.s, m3.c, t1.z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f28852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f28853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f28854d;

    public f2(int i11, int i12, int i13) {
        this.f28851a = i13;
        switch (i13) {
            case 6:
                this.f28854d = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i12, i11);
                this.f28852b = i11;
                this.f28853c = i12;
                break;
            default:
                this.f28854d = null;
                this.f28852b = i11;
                int i14 = i12 & 7;
                this.f28853c = i14 == 0 ? 8 : i14;
                break;
        }
    }

    @Override // m3.c
    public void c(int i11, Object obj) {
        ((m3.c) this.f28854d).c(i11 + (this.f28853c == 0 ? this.f28852b : 0), obj);
    }

    @Override // m3.c
    public void d(Object obj) {
        this.f28853c++;
        ((m3.c) this.f28854d).d(obj);
    }

    @Override // t1.x1
    public t1.o e(long j9, t1.o oVar, t1.o oVar2, t1.o oVar3) {
        return ((com.google.firebase.messaging.a0) this.f28854d).e(j9, oVar, oVar2, oVar3);
    }

    @Override // m3.c
    public void f() {
        ((m3.c) this.f28854d).f();
    }

    @Override // m3.c
    public void g(int i11, int i12, int i13) {
        int i14 = this.f28853c == 0 ? this.f28852b : 0;
        ((m3.c) this.f28854d).g(i11 + i14, i12 + i14, i13);
    }

    @Override // m3.c
    public void h(int i11, int i12) {
        ((m3.c) this.f28854d).h(i11 + (this.f28853c == 0 ? this.f28852b : 0), i12);
    }

    @Override // r5.s
    public int i(int i11) {
        int i12 = ((r5.s) this.f28854d).i(i11);
        if (i11 >= 0 && i11 <= this.f28853c) {
            i2.c(i12, this.f28852b, i11);
        }
        return i12;
    }

    @Override // m3.c
    public void j() {
        if (this.f28853c <= 0) {
            m3.v.a("OffsetApplier up called with no corresponding down");
        }
        this.f28853c--;
        ((m3.c) this.f28854d).j();
    }

    @Override // m3.c
    public void l(Object obj, Function2 function2) {
        ((m3.c) this.f28854d).l(obj, function2);
    }

    @Override // t1.x1
    public t1.o m(long j9, t1.o oVar, t1.o oVar2, t1.o oVar3) {
        return ((com.google.firebase.messaging.a0) this.f28854d).m(j9, oVar, oVar2, oVar3);
    }

    @Override // m3.c
    public void n(int i11, Object obj) {
        ((m3.c) this.f28854d).n(i11 + (this.f28853c == 0 ? this.f28852b : 0), obj);
    }

    @Override // m3.c
    public Object p() {
        return ((m3.c) this.f28854d).p();
    }

    @Override // t1.z1
    public int q() {
        return this.f28853c;
    }

    @Override // r5.s
    public int r(int i11) {
        int iR = ((r5.s) this.f28854d).r(i11);
        if (i11 >= 0 && i11 <= this.f28852b) {
            i2.b(iR, this.f28853c, i11);
        }
        return iR;
    }

    public byte s(int i11, int i12) {
        return ((byte[][]) this.f28854d)[i12][i11];
    }

    @Override // t1.z1
    public int t() {
        return this.f28852b;
    }

    public String toString() {
        switch (this.f28851a) {
            case 6:
                int i11 = this.f28852b;
                int i12 = this.f28853c;
                StringBuilder sb2 = new StringBuilder((i11 * 2 * i12) + 2);
                for (int i13 = 0; i13 < i12; i13++) {
                    byte[] bArr = ((byte[][]) this.f28854d)[i13];
                    for (int i14 = 0; i14 < i11; i14++) {
                        byte b8 = bArr[i14];
                        if (b8 == 0) {
                            sb2.append(" 0");
                        } else if (b8 != 1) {
                            sb2.append("  ");
                        } else {
                            sb2.append(" 1");
                        }
                    }
                    sb2.append('\n');
                }
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public void u(int i11, int i12, int i13) {
        ((byte[][]) this.f28854d)[i12][i11] = (byte) i13;
    }

    public void v(int i11, int i12, boolean z11) {
        ((byte[][]) this.f28854d)[i12][i11] = z11 ? (byte) 1 : (byte) 0;
    }

    public synchronized int w() {
        PackageInfo packageInfoD;
        if (this.f28852b == 0) {
            try {
                packageInfoD = xz.c.a((Context) this.f28854d).d(0, "com.google.android.gms");
            } catch (PackageManager.NameNotFoundException e5) {
                Log.w("Metadata", "Failed to find package ".concat(e5.toString()));
                packageInfoD = null;
            }
            if (packageInfoD != null) {
                this.f28852b = packageInfoD.versionCode;
            }
        }
        return this.f28852b;
    }

    public synchronized int x() {
        int i11 = this.f28853c;
        if (i11 != 0) {
            return i11;
        }
        Context context = (Context) this.f28854d;
        PackageManager packageManager = context.getPackageManager();
        if (xz.c.a(context).f26684a.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
        intent.setPackage("com.google.android.gms");
        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
        if (listQueryBroadcastReceivers != null && !listQueryBroadcastReceivers.isEmpty()) {
            this.f28853c = 2;
            return 2;
        }
        Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
        this.f28853c = 2;
        return 2;
    }

    public f2(r5.s sVar, int i11, int i12) {
        this.f28851a = 1;
        this.f28854d = sVar;
        this.f28852b = i11;
        this.f28853c = i12;
    }

    public f2(m3.c cVar, int i11) {
        this.f28851a = 2;
        this.f28854d = cVar;
        this.f28852b = i11;
    }

    public f2(int i11, int i12, Function0 function0) {
        this.f28851a = 0;
        this.f28852b = i11;
        this.f28853c = i12;
        this.f28854d = function0;
    }

    public f2() {
        this.f28851a = 5;
        this.f28854d = new f2[256];
        this.f28852b = 0;
        this.f28853c = 0;
    }

    public f2(Context context) {
        this.f28851a = 3;
        this.f28853c = 0;
        this.f28854d = context;
    }

    public f2(int i11, int i12, t1.u uVar) {
        this.f28851a = 4;
        this.f28852b = i11;
        this.f28853c = i12;
        this.f28854d = new com.google.firebase.messaging.a0(new t1.b0(i11, i12, uVar));
    }
}
