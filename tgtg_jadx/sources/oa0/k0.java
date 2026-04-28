package oa0;

import androidx.lifecycle.n1;
import java.util.ArrayList;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import m0.i1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class k0 {
    public static final char[] l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Pattern f32298m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q90.v f32300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f32301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public q90.u f32302d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n1 f32303e = new n1();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ax.g0 f32304f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public q90.z f32305g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f32306h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final j30.g f32307i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final oz.m f32308j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public q90.n0 f32309k;

    public k0(String str, q90.v vVar, String str2, q90.t tVar, q90.z zVar, boolean z11, boolean z12, boolean z13) {
        this.f32299a = str;
        this.f32300b = vVar;
        this.f32301c = str2;
        this.f32305g = zVar;
        this.f32306h = z11;
        if (tVar != null) {
            this.f32304f = tVar.e();
        } else {
            this.f32304f = new ax.g0(3);
        }
        if (z12) {
            this.f32308j = new oz.m(7);
            return;
        }
        if (z13) {
            j30.g gVar = new j30.g(25, (byte) 0);
            this.f32307i = gVar;
            q90.z zVar2 = q90.b0.f36415f;
            zVar2.getClass();
            if (Intrinsics.areEqual(zVar2.f36636b, "multipart")) {
                gVar.f24503c = zVar2;
            } else {
                i4.a.j(zVar2, "multipart != ");
                throw null;
            }
        }
    }

    public final void a(String str, String str2, boolean z11) {
        oz.m mVar = this.f32308j;
        if (!z11) {
            mVar.h(str, str2);
            return;
        }
        mVar.getClass();
        str.getClass();
        ((ArrayList) mVar.f33836b).add(fa0.a.b(str, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, 83));
        ((ArrayList) mVar.f33837c).add(fa0.a.b(str2, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, 83));
    }

    public final void b(String str, String str2, boolean z11) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                Regex regex = q90.z.f36633e;
                this.f32305g = q90.y.a(str2);
                return;
            } catch (IllegalArgumentException e5) {
                throw new IllegalArgumentException(e0.f.k("Malformed content type: ", str2), e5);
            }
        }
        ax.g0 g0Var = this.f32304f;
        if (z11) {
            g0Var.e(str, str2);
        } else {
            g0Var.c(str, str2);
        }
    }

    public final void c(q90.t tVar, q90.n0 n0Var) {
        j30.g gVar = this.f32307i;
        gVar.getClass();
        n0Var.getClass();
        if (tVar.b("Content-Type") != null) {
            i4.a.f("Unexpected header: Content-Type");
        } else if (tVar.b("Content-Length") != null) {
            i4.a.f("Unexpected header: Content-Length");
        } else {
            ((ArrayList) gVar.f24504d).add(new q90.a0(tVar, n0Var));
        }
    }

    public final void d(String str, String str2, boolean z11) {
        q90.u uVar;
        String str3 = this.f32301c;
        if (str3 != null) {
            q90.v vVar = this.f32300b;
            vVar.getClass();
            try {
                uVar = new q90.u();
                uVar.e(vVar, str3);
            } catch (IllegalArgumentException unused) {
                uVar = null;
            }
            this.f32302d = uVar;
            if (uVar == null) {
                StringBuilder sb2 = new StringBuilder("Malformed URL. Base: ");
                sb2.append(vVar);
                i1.m(sb2, ", Relative: ", this.f32301c);
                return;
            }
            this.f32301c = null;
        }
        q90.u uVar2 = this.f32302d;
        if (!z11) {
            uVar2.a(str, str2);
            return;
        }
        uVar2.getClass();
        str.getClass();
        if (uVar2.f36621g == null) {
            uVar2.f36621g = new ArrayList();
        }
        ArrayList arrayList = uVar2.f36621g;
        arrayList.getClass();
        arrayList.add(fa0.a.a(str, 0, " \"'<>#&=", 0, 83));
        ArrayList arrayList2 = uVar2.f36621g;
        arrayList2.getClass();
        arrayList2.add(str2 != null ? fa0.a.a(str2, 0, " \"'<>#&=", 0, 83) : null);
    }
}
