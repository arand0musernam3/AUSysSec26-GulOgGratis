package xz;

import a3.m3;
import a3.u1;
import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Paint;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.TypedValue;
import b4.q;
import b4.t;
import b5.h;
import b5.j;
import c5.d2;
import com.app.tgtg.R;
import com.app.tgtg.model.local.GenericErrors;
import com.app.tgtg.model.remote.discover.response.DiscoverBucket;
import com.app.tgtg.model.remote.item.LatLngInfo;
import com.app.tgtg.model.remote.user.response.Co2eSavedResponse;
import com.google.android.gms.maps.model.LatLng;
import com.tgtg.componentlibrary.theme.PantryThemeKt;
import d10.o;
import d2.h2;
import d2.i;
import d2.i2;
import d2.m2;
import d2.n1;
import d2.p;
import d2.u;
import d2.y;
import g3.d5;
import g3.ga;
import g3.r9;
import g3.s0;
import g3.v3;
import g3.w6;
import g3.x5;
import g9.q0;
import ia0.b0;
import ia0.g;
import ib.d0;
import ib.g0;
import ib.x;
import j4.d;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import lv.v;
import m0.i1;
import m3.b1;
import m3.m;
import m3.n;
import m3.s;
import m3.w1;
import m5.u0;
import o00.x0;
import o30.f0;
import on.l;
import org.bouncycastle.iana.AEADAlgorithm;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.xmlpull.v1.XmlPullParserException;
import qb.z;
import r8.k;
import rb.f;
import rk.a0;
import uq.e;
import y9.w;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Context f44514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Boolean f44515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f44516c = 0;

    public static final ib.a A(int i11) {
        if (i11 == 0) {
            return ib.a.EXPONENTIAL;
        }
        if (i11 == 1) {
            return ib.a.LINEAR;
        }
        i4.a.f(k.h(i11, "Could not convert ", " to BackoffPolicy"));
        return null;
    }

    public static final x B(int i11) {
        if (i11 == 0) {
            return x.NOT_REQUIRED;
        }
        if (i11 == 1) {
            return x.CONNECTED;
        }
        if (i11 == 2) {
            return x.UNMETERED;
        }
        if (i11 == 3) {
            return x.NOT_ROAMING;
        }
        if (i11 == 4) {
            return x.METERED;
        }
        if (Build.VERSION.SDK_INT >= 30 && i11 == 5) {
            return x.TEMPORARILY_UNMETERED;
        }
        i4.a.f(k.h(i11, "Could not convert ", " to NetworkType"));
        return null;
    }

    public static final d0 C(int i11) {
        if (i11 == 0) {
            return d0.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        }
        if (i11 == 1) {
            return d0.DROP_WORK_REQUEST;
        }
        i4.a.f(k.h(i11, "Could not convert ", " to OutOfQuotaPolicy"));
        return null;
    }

    public static final g0 D(int i11) {
        if (i11 == 0) {
            return g0.ENQUEUED;
        }
        if (i11 == 1) {
            return g0.RUNNING;
        }
        if (i11 == 2) {
            return g0.SUCCEEDED;
        }
        if (i11 == 3) {
            return g0.FAILED;
        }
        if (i11 == 4) {
            return g0.BLOCKED;
        }
        if (i11 == 5) {
            return g0.CANCELLED;
        }
        i4.a.f(k.h(i11, "Could not convert ", " to State"));
        return null;
    }

    public static synchronized boolean E(Context context) {
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = f44514a;
        if (context2 != null && (bool = f44515b) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        f44515b = null;
        Boolean boolValueOf = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        f44515b = boolValueOf;
        f44514a = applicationContext;
        return boolValueOf.booleanValue();
    }

    public static final boolean F(g gVar) {
        gVar.getClass();
        try {
            gVar.getClass();
            ia0.d0 d0Var = new ia0.d0(new b0(gVar));
            for (long j9 = 0; j9 < 16; j9++) {
                if (d0Var.a()) {
                    return true;
                }
                d0Var.r0(1L);
                g gVar2 = d0Var.f23623b;
                byte bG = gVar2.G(0L);
                if ((bG & 224) == 192) {
                    d0Var.r0(2L);
                } else if ((bG & 240) == 224) {
                    d0Var.r0(3L);
                } else if ((bG & 248) == 240) {
                    d0Var.r0(4L);
                }
                int iI0 = gVar2.i0();
                if (Character.isISOControl(iI0) && !Character.isWhitespace(iI0)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static final int G(x xVar) {
        xVar.getClass();
        int i11 = z.$EnumSwitchMapping$2[xVar.ordinal()];
        if (i11 == 1) {
            return 0;
        }
        if (i11 == 2) {
            return 1;
        }
        if (i11 == 3) {
            return 2;
        }
        if (i11 == 4) {
            return 3;
        }
        if (i11 == 5) {
            return 4;
        }
        if (Build.VERSION.SDK_INT >= 30 && xVar == x.TEMPORARILY_UNMETERED) {
            return 5;
        }
        d.m("Could not convert ", xVar, " to int");
        return 0;
    }

    public static final void H(Bundle bundle, String str, List list) {
        list.getClass();
        bundle.putStringArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
    }

    public static final byte[] J(Set set) throws IOException {
        set.getClass();
        if (set.isEmpty()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeInt(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    ib.d dVar = (ib.d) it.next();
                    objectOutputStream.writeUTF(dVar.f23708a.toString());
                    objectOutputStream.writeBoolean(dVar.f23709b);
                }
                objectOutputStream.close();
                byteArrayOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArray.getClass();
                return byteArray;
            } finally {
            }
        } finally {
        }
    }

    public static final int K(g0 g0Var) {
        g0Var.getClass();
        switch (z.$EnumSwitchMapping$0[g0Var.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                e40.a.f();
                return 0;
        }
    }

    public static final LatLng L(LatLngInfo latLngInfo) {
        latLngInfo.getClass();
        return new LatLng(latLngInfo.getLatitude(), latLngInfo.getLongitude());
    }

    public static final f M(byte[] bArr) throws IOException {
        bArr.getClass();
        if (Build.VERSION.SDK_INT < 28 || bArr.length == 0) {
            return new f(null);
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                int i11 = objectInputStream.readInt();
                int[] iArr = new int[i11];
                for (int i12 = 0; i12 < i11; i12++) {
                    iArr[i12] = objectInputStream.readInt();
                }
                int i13 = objectInputStream.readInt();
                int[] iArr2 = new int[i13];
                for (int i14 = 0; i14 < i13; i14++) {
                    iArr2[i14] = objectInputStream.readInt();
                }
                f fVarA = rb.a.a(iArr2, iArr);
                objectInputStream.close();
                byteArrayInputStream.close();
                return fVarA;
            } finally {
            }
        } finally {
        }
    }

    public static void N(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    public static void O(int i11, int i12) {
        String strI;
        if (i11 < 0 || i11 >= i12) {
            if (i11 < 0) {
                strI = w.I("%s (%s) must not be negative", "index", Integer.valueOf(i11));
            } else {
                if (i12 < 0) {
                    i4.a.f(e0.f.h(i12, "negative size: ", new StringBuilder(String.valueOf(i12).length() + 15)));
                    return;
                }
                strI = w.I("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i11), Integer.valueOf(i12));
            }
            throw new IndexOutOfBoundsException(strI);
        }
    }

    public static void P(int i11, int i12, int i13) {
        if (i11 < 0 || i12 < i11 || i12 > i13) {
            throw new IndexOutOfBoundsException((i11 < 0 || i11 > i13) ? Q(i11, i13, "start index") : (i12 < 0 || i12 > i13) ? Q(i12, i13, "end index") : w.I("end index (%s) must not be less than start index (%s)", Integer.valueOf(i12), Integer.valueOf(i11)));
        }
    }

    public static String Q(int i11, int i12, String str) {
        if (i11 < 0) {
            return w.I("%s (%s) must not be negative", str, Integer.valueOf(i11));
        }
        if (i12 >= 0) {
            return w.I("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i11), Integer.valueOf(i12));
        }
        i4.a.f(e0.f.h(i12, "negative size: ", new StringBuilder(String.valueOf(i12).length() + 15)));
        return null;
    }

    public static final void a(int i11, t tVar, Function0 function0, n nVar) {
        int i12;
        s sVar = (s) nVar;
        sVar.c0(-972704210);
        if ((i11 & 6) == 0) {
            i12 = i11 | (sVar.f(tVar) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(function0) ? 32 : 16;
        }
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            t tVarJ = v1.n.j(tVar, lv.s.B, i4.g0.f23254b);
            y yVarA = d2.w.a(i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarJ, sVar);
            j.R.getClass();
            h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            q qVar = q.f5711a;
            float f11 = 16;
            r9.d(f0.U(sVar, R.string.charity_plan_available_message), d2.c.D(d2.c.B(m2.t(m2.d(qVar, 1.0f), 3), f11, 0.0f, 2), 0.0f, f11, 0.0f, 0.0f, 13), lv.s.C, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28276p, sVar, 432, 12582912, 131064);
            r9.d(f0.U(sVar, R.string.charity_plan_manage_collection_days), b4.a.a(d2.c.D(d2.c.B(m2.t(m2.d(qVar, 1.0f), 3), f11, 0.0f, 2), 0.0f, 8, 0.0f, f11, 5), c5.m2.f7291a, new l(1, function0)), lv.s.f28217b, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0.a(v.f28284x, 0L, 0L, null, null, 0L, x5.l.f43854c, 0, 0L, null, null, 16773119), sVar, MLKEMEngine.KyberPolyBytes, 0, 131064);
            sVar = sVar;
            s0.g(d2.j(qVar, "HorizontalDivider"), 0.0f, lv.s.H, sVar, 390, 2);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new hj.a(tVar, function0, i11, 3, (byte) 0);
        }
    }

    public static final void b(e eVar, Function0 function0, Function0 function02, n nVar, int i11) {
        s sVar;
        eVar.getClass();
        function0.getClass();
        function02.getClass();
        s sVar2 = (s) nVar;
        sVar2.c0(-1777107957);
        int i12 = i11 | (sVar2.h(eVar) ? 4 : 2) | (sVar2.h(function0) ? 32 : 16) | (sVar2.h(function02) ? 256 : 128);
        if (sVar2.R(i12 & 1, (i12 & 147) != 146)) {
            d5 d5VarC = ga.c(sVar2);
            Object objM = sVar2.M();
            if (objM == m.f29332a) {
                objM = m3.i.w(Boolean.FALSE);
                sVar2.k0(objM);
            }
            b1 b1Var = (b1) objM;
            sVar = sVar2;
            x5.a(v4.f.a(m2.f13850c, d5VarC.f18456c, null), u3.e.e(-722941753, sVar2, new a0(19, function0, b1Var)), null, null, null, 0, 0L, 0L, null, u3.e.e(-447076324, sVar2, new co.e((Co2eSavedResponse) m3.i.n(eVar.f41507h, sVar2, 0).getValue(), eVar, (GenericErrors) m3.i.n(eVar.f41505f, sVar2, 0).getValue(), b1Var, m3.i.n(eVar.f41503d, sVar2, 0), function02)), sVar, 805306416, 508);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new rs.b(eVar, function0, function02, i11, 15);
        }
    }

    public static final void c(Function0 function0, Function0 function02, boolean z11, n nVar, int i11) {
        int i12;
        function0.getClass();
        function02.getClass();
        s sVar = (s) nVar;
        sVar.c0(1098306602);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(function0) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(function02) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.g(z11) ? 256 : 128;
        }
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            x60.m mVar = (x60.m) sVar.j(PantryThemeKt.getLocalPantrySpacing());
            t tVarD = m2.d(q.f5711a, 1.0f);
            d2.b bVar = i.f13801a;
            i2 i2VarA = h2.a(i.g(mVar.f44017n), b4.d.f5693k, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarD, sVar);
            j.R.getClass();
            h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            n1 n1Var = new n1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            String strU = f0.U(sVar, R.string.browse_chip_filter_reset);
            lv.e eVar = lv.e.LARGE;
            v0.n.n(n1Var, strU, null, null, eVar, z11, false, null, null, function0, sVar, ((i12 << 9) & 458752) | 24576 | ((i12 << 27) & 1879048192), 460);
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            v0.n.l(new n1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), f0.U(sVar, R.string.browse_chip_filter_apply), null, null, eVar, false, false, null, null, function02, sVar, ((i12 << 24) & 1879048192) | 24576, 492);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new m3(function0, function02, z11, i11, 8);
        }
    }

    public static final z5.e d(Context context) {
        float f11 = context.getResources().getConfiguration().fontScale;
        float f12 = context.getResources().getDisplayMetrics().density;
        a6.a aVarA = a6.b.a(f11);
        if (aVarA == null) {
            aVarA = new z5.n(f11);
        }
        return new z5.e(f12, f11, aVarA);
    }

    public static final void e(String str, String str2, Function0 function0, Function0 function02, n nVar, int i11) {
        str.getClass();
        str2.getClass();
        function0.getClass();
        function02.getClass();
        s sVar = (s) nVar;
        sVar.c0(804760707);
        int i12 = i11 | (sVar.f(str) ? 4 : 2) | (sVar.f(str2) ? 32 : 16) | (sVar.h(function0) ? 256 : 128) | (sVar.h(function02) ? NewHope.SENDB_BYTES : 1024);
        if (sVar.R(i12 & 1, (i12 & 1171) != 1170)) {
            long j9 = lv.s.f28244y;
            l2.f fVarB = l2.g.b(12);
            q qVar = q.f5711a;
            t tVarT = m2.t(m2.d(v1.n.j(v1.n.k(qVar, 1, j9, fVarB), lv.s.A, i4.g0.f23254b), 1.0f), 3);
            float f11 = lv.t.f28254h;
            t tVarZ = d2.c.z(tVarT, f11);
            y yVarA = d2.w.a(i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarZ, sVar);
            j.R.getClass();
            h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            b5.g gVar = b5.i.f5843f;
            m3.i.C(yVarA, gVar, sVar);
            b5.g gVar2 = b5.i.f5842e;
            m3.i.C(iVarL, gVar2, sVar);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b5.g gVar3 = b5.i.f5844g;
            m3.i.v(sVar, numValueOf, gVar3);
            b5.d dVar = b5.i.f5845h;
            m3.i.z(sVar, dVar);
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar);
            r9.d(str, m2.d(qVar, 1.0f), lv.s.f28215a, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, v.f28268g, sVar, (i12 & 14) | 432, 12582912, 130040);
            r9.d(str2, d2.c.D(m2.d(qVar, 1.0f), 0.0f, lv.t.f28252f, 0.0f, 0.0f, 13), lv.s.C, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, v.f28274n, sVar, ((i12 >> 3) & 14) | 432, 12582912, 130040);
            z4.u0 u0VarD = p.d(b4.d.f5683a, false);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            t tVarC2 = b4.a.c(qVar, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(u0VarD, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            w.a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC2, gVar4, sVar);
            b4.k kVar = b4.d.f5687e;
            u uVar = u.f13938a;
            v1.n.d(x0.z(2131231623, sVar, 0), null, d2.c.D(uVar.a(qVar, kVar), 0.0f, f11, 0.0f, 44, 5), null, null, 0.0f, null, sVar, 56, 120);
            t tVarA = uVar.a(m2.d(qVar, 1.0f), b4.d.f5690h);
            String strU = f0.U(sVar, R.string.c2c_v3_invite_friends_button_text);
            lv.q qVar2 = lv.q.REGULAR;
            lv.e eVar = lv.e.MEDIUM;
            boolean z11 = (i12 & 896) == 256;
            Object objM = sVar.M();
            if (z11 || objM == m.f29332a) {
                objM = new rr.a(15, function0);
                sVar.k0(objM);
            }
            v0.n.l(tVarA, strU, null, qVar2, eVar, false, false, null, null, (Function0) objM, sVar, 27648, 484);
            sVar.q(true);
            r9.d(f0.U(sVar, R.string.c2c_v3_invite_friends_terms), b4.a.a(d2.c.D(m2.d(qVar, 1.0f), 0.0f, f11, 0.0f, 0.0f, 13), c5.m2.f7291a, new l(12, function02)), lv.s.f28217b, 0L, null, 0L, x5.l.f43854c, new x5.k(3), 0L, 0, false, 0, 0, null, v.f28283w, sVar, 805306752, 12582912, 129528);
            sVar = sVar;
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new lp.v(str, str2, function0, function02, i11, 13);
        }
    }

    public static final void f(w6 w6Var, Function0 function0, n nVar, int i11) {
        s sVar;
        w6Var.getClass();
        s sVar2 = (s) nVar;
        sVar2.c0(817119751);
        int i12 = i11 | (sVar2.f(w6Var) ? 4 : 2) | (sVar2.h(function0) ? 32 : 16);
        if (sVar2.R(i12 & 1, (i12 & 19) != 18)) {
            Object objM = sVar2.M();
            m3.f fVar = m.f29332a;
            if (objM == fVar) {
                objM = m3.i.w(dm.b.f14969a);
                sVar2.k0(objM);
            }
            b1 b1Var = (b1) objM;
            long j9 = lv.s.J;
            boolean z11 = (i12 & 112) == 32;
            Object objM2 = sVar2.M();
            if (z11 || objM2 == fVar) {
                objM2 = new ar.d(20, function0);
                sVar2.k0(objM2);
            }
            sVar = sVar2;
            v3.a((Function0) objM2, null, w6Var, 0.0f, false, null, j9, 0L, 0.0f, 0L, null, null, null, u3.e.e(-310275351, sVar2, new u1(b1Var, function0, false, 3)), sVar, ((i12 << 6) & 896) | 1572864, 3078, 7098);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bm.d(w6Var, function0, i11, 1);
        }
    }

    public static final void g(DiscoverBucket discoverBucket, t tVar, n nVar, int i11) {
        s sVar;
        t tVar2;
        boolean z11;
        s sVar2 = (s) nVar;
        sVar2.c0(-1369929896);
        int i12 = i11 | (sVar2.h(discoverBucket) ? 4 : 2) | 48;
        if (sVar2.R(i12 & 1, (i12 & 19) != 18)) {
            q qVar = q.f5711a;
            t tVarD = m2.d(qVar, 1.0f);
            float f11 = lv.t.f28253g;
            t tVarZ = d2.c.z(tVarD, f11);
            y yVarA = d2.w.a(i.f13803c, b4.d.f5695n, sVar2, 48);
            int iHashCode = Long.hashCode(sVar2.T);
            u3.i iVarL = sVar2.l();
            t tVarC = b4.a.c(tVarZ, sVar2);
            j.R.getClass();
            h hVar = b5.i.f5839b;
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(hVar);
            } else {
                sVar2.n0();
            }
            b5.g gVar = b5.i.f5843f;
            m3.i.C(yVarA, gVar, sVar2);
            b5.g gVar2 = b5.i.f5842e;
            m3.i.C(iVarL, gVar2, sVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b5.g gVar3 = b5.i.f5844g;
            m3.i.v(sVar2, numValueOf, gVar3);
            b5.d dVar = b5.i.f5845h;
            m3.i.z(sVar2, dVar);
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar2);
            v1.n.d(x0.z(R.drawable.ic_map_signs_regular, sVar2, 0), null, null, null, null, 0.0f, null, sVar2, 56, 124);
            d2.c.f(m2.e(qVar, f11), sVar2);
            String title = discoverBucket != null ? discoverBucket.getTitle() : null;
            if (title == null) {
                title = "";
            }
            u0 u0Var = v.f28270i;
            t tVarD2 = m2.d(qVar, 1.0f);
            float f12 = lv.t.f28252f;
            tVar2 = qVar;
            r9.d(title, d2.c.B(tVarD2, f12, 0.0f, 2), 0L, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, u0Var, sVar2, 48, 12582912, 130044);
            d2.c.f(m2.e(tVar2, f11), sVar2);
            String subtext = discoverBucket != null ? discoverBucket.getSubtext() : null;
            r9.d(subtext == null ? "" : subtext, d2.c.B(m2.d(tVar2, 1.0f), f12, 0.0f, 2), 0L, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, v.f28274n, sVar2, 48, 12582912, 130044);
            sVar = sVar2;
            String spacer = discoverBucket != null ? discoverBucket.getSpacer() : null;
            if (spacer == null || spacer.length() == 0) {
                z11 = true;
                sVar.a0(1173671188);
                sVar.q(false);
            } else {
                sVar.a0(1172948516);
                d2.c.f(m2.e(tVar2, lv.t.f28254h), sVar);
                t tVarD3 = m2.d(tVar2, 1.0f);
                z4.u0 u0VarD = p.d(b4.d.f5687e, false);
                int iHashCode2 = Long.hashCode(sVar.T);
                u3.i iVarL2 = sVar.l();
                t tVarC2 = b4.a.c(tVarD3, sVar);
                sVar.e0();
                if (sVar.S) {
                    sVar.k(hVar);
                } else {
                    sVar.n0();
                }
                m3.i.C(u0VarD, gVar, sVar);
                m3.i.C(iVarL2, gVar2, sVar);
                w.a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
                m3.i.C(tVarC2, gVar4, sVar);
                v0.n.e(m2.e(m2.d(tVar2, 1.0f), 6), 0L, 0.0f, 0.0f, 0.0f, sVar, 6);
                z11 = true;
                r9.d(spacer, d2.c.B(d2.c.B(v1.n.j(tVar2, lv.s.J, i4.g0.f23254b), lv.t.f28251e, 0.0f, 2), 0.0f, lv.t.f28248b, 1), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28272k, sVar, 48, 12582912, 131068);
                sVar = sVar;
                sVar.q(true);
                sVar.q(false);
            }
            sVar.q(z11);
        } else {
            sVar = sVar2;
            sVar.U();
            tVar2 = tVar;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new gn.i(discoverBucket, tVar2, i11, 19);
        }
    }

    public static final void h(jl.d dVar, Function1 function1, n nVar, int i11) {
        function1.getClass();
        s sVar = (s) nVar;
        sVar.c0(941407975);
        int i12 = (sVar.h(dVar) ? 4 : 2) | i11 | (sVar.h(function1) ? 32 : 16);
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            Object objM = sVar.M();
            if (objM == m.f29332a) {
                objM = new z3.u();
                sVar.k0(objM);
            }
            z3.u uVar = (z3.u) objM;
            d2.g0 g0Var = m2.f13850c;
            float f11 = lv.t.f28253g;
            t tVarA = d2.c.A(g0Var, f11, lv.t.f28252f);
            b4.i iVar = b4.d.f5695n;
            d2.b bVar = i.f13801a;
            y yVarA = d2.w.a(i.g(lv.t.f28254h), iVar, sVar, 54);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarA, sVar);
            j.R.getClass();
            h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            String str = dVar.f25310c;
            String str2 = str == null ? "" : str;
            if (str == null) {
                str = "";
            }
            q qVar = q.f5711a;
            r9.d(str2, d2.j(qVar, str), lv.s.f28215a, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, v.f28264c, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 130040);
            String str3 = dVar.f25311d;
            String str4 = str3;
            if (str3 == null) {
                str3 = "";
            }
            if (str4 == null) {
                str4 = "";
            }
            r9.d(str3, d2.j(qVar, str4), lv.s.C, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, v.f28274n, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 130040);
            String str5 = dVar.f25312e;
            String str6 = str5;
            if (str5 == null) {
                str5 = "";
            }
            if (str6 == null) {
                str6 = "";
            }
            r9.d(str5, d2.j(qVar, str6), lv.s.D, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, v.f28276p, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 130040);
            float f12 = lv.t.f28251e;
            t tVarC2 = d2.c.C(qVar, f12, f11, f12, f11);
            List list = dVar.f25313f;
            if (list == null) {
                list = n0.f26529a;
            }
            int i13 = (i12 & 112) | 3072;
            List list2 = list;
            sVar = sVar;
            cg.j.k(list2, function1, tVarC2, uVar, sVar, i13);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new gn.i(dVar, function1, i11, 29);
        }
    }

    public static final void i(Encoder encoder) {
        encoder.getClass();
        if ((encoder instanceof n90.s ? (n90.s) encoder : null) != null) {
            return;
        }
        i1.q(Reflection.getOrCreateKotlinClass(encoder.getClass()), "This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got ");
    }

    public static final n90.l j(Decoder decoder) {
        decoder.getClass();
        n90.l lVar = decoder instanceof n90.l ? (n90.l) decoder : null;
        if (lVar != null) {
            return lVar;
        }
        i1.q(Reflection.getOrCreateKotlinClass(decoder.getClass()), "This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got ");
        return null;
    }

    public static final Object k(o oVar, c50.z zVar) throws Exception {
        if (!oVar.m()) {
            v80.l lVar = new v80.l(1, y70.f.b(zVar));
            lVar.t();
            oVar.c(f90.a.f17527a, new f90.b(lVar));
            Object objS = lVar.s();
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            return objS;
        }
        Exception exception = oVar.getException();
        if (exception != null) {
            throw exception;
        }
        if (!oVar.f13722d) {
            return oVar.getResult();
        }
        throw new CancellationException("Task " + oVar + " was cancelled normally.");
    }

    public static final LinkedHashSet l(byte[] bArr) throws IOException {
        bArr.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bArr.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int i11 = objectInputStream.readInt();
                    for (int i12 = 0; i12 < i11; i12++) {
                        Uri uri = Uri.parse(objectInputStream.readUTF());
                        boolean z11 = objectInputStream.readBoolean();
                        uri.getClass();
                        linkedHashSet.add(new ib.d(z11, uri));
                    }
                    objectInputStream.close();
                } finally {
                }
            } catch (IOException e5) {
                e5.printStackTrace();
            }
            byteArrayInputStream.close();
            return linkedHashSet;
        } finally {
        }
    }

    public static q0 m(TypedValue typedValue, q0 q0Var, q0 q0Var2, String str, String str2) throws XmlPullParserException {
        if (q0Var == null || q0Var == q0Var2) {
            return q0Var == null ? q0Var2 : q0Var;
        }
        StringBuilder sbT = e0.f.t("Type is ", str, " but found ", str2, ": ");
        sbT.append(typedValue.data);
        throw new XmlPullParserException(sbT.toString());
    }

    public static float n(float f11, float f12, float f13) {
        return f11 < f12 ? f12 : f11 > f13 ? f13 : f11;
    }

    public static int o(int i11, int i12, int i13) {
        return i11 < i12 ? i12 : i11 > i13 ? i13 : i11;
    }

    public static void q(i0.w wVar, BlurMaskFilter blurMaskFilter, int i11) {
        long j9 = i4.v.f23309b;
        int i12 = (i11 & 8) != 0 ? 0 : 1;
        wVar.H(j9);
        wVar.G(3);
        wVar.R(i12);
        ((Paint) wVar.f22746c).setMaskFilter(blurMaskFilter);
    }

    public static final Object r(d8.f fVar, Function2 function2, x70.c cVar) {
        return fVar.a(new h8.b(function2, null, 1), cVar);
    }

    public static final byte[] s(f fVar) throws IOException {
        int[] iArrQ0;
        int[] iArrQ02;
        fVar.getClass();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 28) {
            return new byte[0];
        }
        NetworkRequest networkRequest = (NetworkRequest) fVar.f37841a;
        if (networkRequest == null) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                if (i11 >= 31) {
                    iArrQ0 = rb.e.b(networkRequest);
                } else {
                    int[] iArr = {2, 0, 3, 6, 10, 9, 8, 4, 1, 5};
                    ArrayList arrayList = new ArrayList();
                    for (int i12 = 0; i12 < 10; i12++) {
                        int i13 = iArr[i12];
                        if (rb.a.d(networkRequest, i13)) {
                            arrayList.add(Integer.valueOf(i13));
                        }
                    }
                    iArrQ0 = CollectionsKt.q0(arrayList);
                }
                if (Build.VERSION.SDK_INT >= 31) {
                    iArrQ02 = rb.e.a(networkRequest);
                } else {
                    int[] iArr2 = {17, 5, 2, 10, 29, 19, 3, 32, 7, 4, 12, 36, 23, 0, 33, 20, 11, 13, 18, 21, 15, 35, 34, 8, 1, 25, 14, 16, 6, 9};
                    ArrayList arrayList2 = new ArrayList();
                    for (int i14 = 0; i14 < 30; i14++) {
                        int i15 = iArr2[i14];
                        if (rb.a.c(networkRequest, i15)) {
                            arrayList2.add(Integer.valueOf(i15));
                        }
                    }
                    iArrQ02 = CollectionsKt.q0(arrayList2);
                }
                objectOutputStream.writeInt(iArrQ0.length);
                for (int i16 : iArrQ0) {
                    objectOutputStream.writeInt(i16);
                }
                objectOutputStream.writeInt(iArrQ02.length);
                for (int i17 : iArrQ02) {
                    objectOutputStream.writeInt(i17);
                }
                objectOutputStream.close();
                byteArrayOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArray.getClass();
                return byteArray;
            } finally {
            }
        } finally {
        }
    }

    public static b t(int i11, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i11 = 2;
        }
        if (i11 == 0) {
            return new i6.h(dArr, dArr2);
        }
        if (i11 == 2) {
            double d3 = dArr[0];
            double[] dArr3 = dArr2[0];
            i6.c cVar = new i6.c();
            cVar.f23407d = d3;
            cVar.f23408e = dArr3;
            return cVar;
        }
        i6.g gVar = new i6.g();
        int length = dArr2[0].length;
        gVar.f23424f = new double[length];
        gVar.f23422d = dArr;
        gVar.f23423e = dArr2;
        if (length > 2) {
            double d11 = 0.0d;
            int i12 = 0;
            while (true) {
                double d12 = d11;
                if (i12 >= dArr.length) {
                    break;
                }
                double d13 = dArr2[i12][0];
                if (i12 > 0) {
                    Math.hypot(d13 - d11, d13 - d12);
                }
                i12++;
                d11 = d13;
            }
        }
        return gVar;
    }

    public static String y(int i11) {
        switch (i11) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 1:
            case 9:
            case 11:
            case 12:
            default:
                return e0.f.h(i11, "unknown status code: ", new StringBuilder(String.valueOf(i11).length() + 21));
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 10:
                return "DEVELOPER_ERROR";
            case 13:
                return "ERROR";
            case 14:
                return "INTERRUPTED";
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return "TIMEOUT";
            case 16:
                return "CANCELED";
            case 17:
                return "API_NOT_CONNECTED";
            case 18:
                return "DEAD_CLIENT";
            case 19:
                return "REMOTE_EXCEPTION";
            case 20:
                return "CONNECTION_SUSPENDED_DURING_CALL";
            case 21:
                return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
            case 22:
                return "RECONNECTION_TIMED_OUT";
        }
    }

    public abstract b I(String str, Function1 function1);

    public abstract Object p();

    public abstract double u(double d3);

    public abstract void v(double d3, double[] dArr);

    public abstract void w(double d3, float[] fArr);

    public abstract void x(double d3, double[] dArr);

    public abstract double[] z();
}
