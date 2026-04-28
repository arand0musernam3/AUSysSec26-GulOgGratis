package u00;

import a3.o2;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.SharedPreferences;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.camera2.compat.quirk.FlashAvailabilityBufferUnderflowQuirk;
import androidx.camera.camera2.pipe.DoNotDisturbException;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import ax.a0;
import ax.l;
import ax.o;
import b0.n;
import b4.q;
import b5.j;
import c5.x1;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.item.Picture;
import com.app.tgtg.model.remote.order.Order;
import com.app.tgtg.model.remote.profile.response.ProfileFeatureState;
import com.facebook.AuthenticationTokenManager$CurrentAuthenticationTokenChangedBroadcastReceiver;
import com.google.android.gms.common.internal.i0;
import com.tgtg.componentlibrary.component.chip.type.selectionchip.PantrySelectionChipKt;
import com.tgtg.componentlibrary.theme.PantryThemeKt;
import d2.h2;
import d2.i2;
import d2.m2;
import d2.n1;
import d2.w;
import d2.w0;
import d2.y;
import e0.v;
import f0.t0;
import g3.a2;
import g3.r9;
import g3.t9;
import h7.d1;
import i4.g0;
import j5.r;
import java.io.Closeable;
import java.nio.BufferUnderflowException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.d0;
import kotlin.collections.e0;
import kotlin.collections.s0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import m3.b1;
import m3.c3;
import m3.i;
import m3.m;
import m3.s;
import m3.w1;
import n80.p;
import o00.x0;
import o30.f0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import org.json.JSONException;
import q90.p0;
import q90.r0;
import q90.t;
import retrofit2.HttpException;
import tx.n0;
import x5.k;
import z4.c0;
import z4.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class d implements d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f40619a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f40620b = 0;

    public static boolean C(String str, kf.b bVar) {
        Class<?> cls;
        try {
            cls = Class.forName(str);
        } catch (ClassNotFoundException e5) {
            if (bVar != null) {
                bVar.b("Class not available:" + str + ": " + e5);
            }
            cls = null;
        } catch (UnsatisfiedLinkError e11) {
            if (bVar != null) {
                bVar.a("Failed to load (UnsatisfiedLinkError) " + str + ": " + e11);
            }
            cls = null;
        } catch (Throwable th2) {
            if (bVar != null) {
                bVar.a("Failed to initialize " + str + ": " + th2);
            }
            cls = null;
        }
        return cls != null;
    }

    public static boolean E(n nVar) {
        Boolean bool;
        nVar.getClass();
        try {
            v vVar = nVar.f5321b;
            CameraCharacteristics.Key key = CameraCharacteristics.FLASH_INFO_AVAILABLE;
            key.getClass();
            bool = (Boolean) ((t0) vVar).c(key);
        } catch (BufferUnderflowException e5) {
            if (y.c.a().b(FlashAvailabilityBufferUnderflowQuirk.class) != null) {
                if (wd.a.B(3, "CXCP")) {
                    Log.d("CXCP", "Device is known to throw an exception while checking flash availability. Flash is not available. [Manufacturer: " + Build.MANUFACTURER + ", Model: " + Build.MODEL + ", API Level: " + Build.VERSION.SDK_INT + "].");
                }
            } else if (wd.a.B(6, "CXCP")) {
                Log.e("CXCP", "Exception thrown while checking for flash availability on device not known to throw exceptions during this check. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: " + Build.MANUFACTURER + ", Model: " + Build.MODEL + ", API Level: " + Build.VERSION.SDK_INT + "]. Flash is not available.", e5);
            }
            bool = Boolean.FALSE;
        }
        if (bool == null && wd.a.B(5, "CXCP")) {
            Log.w("CXCP", "Characteristics did not contain key FLASH_INFO_AVAILABLE. Flash is not available.");
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean F(int i11, Throwable th2) {
        th2.getClass();
        return (th2 instanceof HttpException) && ((HttpException) th2).f37956a == i11;
    }

    public static boolean G(int i11) {
        return i11 == 6 || i11 == 1 || i11 == 2 || i11 == 4;
    }

    public static float J(float f11, float f12, float f13) {
        return (f13 * f12) + ((1.0f - f13) * f11);
    }

    public static t L(String... strArr) {
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (strArr2.length % 2 != 0) {
            i4.a.f("Expected alternating header names and values");
            return null;
        }
        String[] strArr3 = (String[]) Arrays.copyOf(strArr2, strArr2.length);
        int length = strArr3.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            if (strArr3[i12] == null) {
                i4.a.f("Headers cannot be null");
                return null;
            }
            strArr3[i12] = StringsKt.e0(strArr2[i12]).toString();
        }
        int iA = b80.c.a(0, strArr3.length - 1, 2);
        if (iA >= 0) {
            while (true) {
                String str = strArr3[i11];
                String str2 = strArr3[i11 + 1];
                zz.f.u(str);
                zz.f.v(str2, str);
                if (i11 == iA) {
                    break;
                }
                i11 += 2;
            }
        }
        return new t(strArr3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x01db, code lost:
    
        r0 = kotlin.collections.g1.a(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01df, code lost:
    
        w.b.y(r2, null);
        r10 = r0;
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static da.n M(ha.a r29, java.lang.String r30) {
        /*
            Method dump skipped, instruction units count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u00.d.M(ha.a, java.lang.String):da.n");
    }

    public static void N(l lVar) {
        r40.d dVar = o.f4973d;
        o oVar = o.f4974e;
        if (oVar == null) {
            synchronized (dVar) {
                oVar = o.f4974e;
                if (oVar == null) {
                    d9.c cVarA = d9.c.a(a0.a());
                    cVarA.getClass();
                    o oVar2 = new o(cVarA, new a50.c(6));
                    o.f4974e = oVar2;
                    oVar = oVar2;
                }
            }
        }
        l lVar2 = (l) oVar.f4979c;
        oVar.f4979c = lVar;
        a50.c cVar = (a50.c) oVar.f4978b;
        if (lVar != null) {
            try {
                ((SharedPreferences) cVar.f822b).edit().putString("com.facebook.AuthenticationManager.CachedAuthenticationToken", lVar.a().toString()).apply();
            } catch (JSONException unused) {
            }
        } else {
            ((SharedPreferences) cVar.f822b).edit().remove("com.facebook.AuthenticationManager.CachedAuthenticationToken").apply();
            n0.c(a0.a());
        }
        if (lVar2 == null ? lVar == null : Intrinsics.areEqual(lVar2, lVar)) {
            return;
        }
        Intent intent = new Intent(a0.a(), (Class<?>) AuthenticationTokenManager$CurrentAuthenticationTokenChangedBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_AUTHENTICATION_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_AUTHENTICATION_TOKEN", lVar2);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_AUTHENTICATION_TOKEN", lVar);
        oVar.f4977a.c(intent);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0008  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x000c A[PHI: r1
      0x000c: PHI (r1v6 int) = (r1v0 int), (r1v1 int), (r1v2 int) binds: [B:8:0x000a, B:11:0x0010, B:30:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static m0.e P(int r5) {
        /*
            r0 = 6
            if (r5 != 0) goto L4
            goto L40
        L4:
            r1 = 1
            r2 = 2
            if (r5 != r1) goto La
        L8:
            r0 = r2
            goto L40
        La:
            if (r5 != r2) goto Le
        Lc:
            r0 = r1
            goto L40
        Le:
            r1 = 5
            r3 = 3
            if (r5 != r3) goto L13
            goto Lc
        L13:
            r4 = 4
            if (r5 != r4) goto L18
            r0 = r3
            goto L40
        L18:
            if (r5 != r1) goto L1b
            goto L40
        L1b:
            if (r5 != r0) goto L1e
            goto L8
        L1e:
            r1 = 7
            if (r5 != r1) goto L22
            goto L40
        L22:
            r2 = 8
            if (r5 != r2) goto L27
            goto L40
        L27:
            r2 = 9
            if (r5 != r2) goto L2d
            r0 = r4
            goto L40
        L2d:
            r2 = 10
            if (r5 != r2) goto L32
            goto Lc
        L32:
            r1 = 11
            if (r5 != r1) goto L37
            goto L40
        L37:
            r1 = 12
            if (r5 != r1) goto L3c
            goto L40
        L3c:
            r1 = 13
            if (r5 != r1) goto L46
        L40:
            m0.e r5 = new m0.e
            r5.<init>(r0)
            return r5
        L46:
            java.lang.String r0 = "Unexpected CameraError: "
            java.lang.String r5 = e0.l.a(r5)
            j4.d.t(r5, r0)
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: u00.d.P(int):m0.e");
    }

    public static Parcelable S(Bundle bundle, String str) {
        ClassLoader classLoader = d.class.getClassLoader();
        i0.h(classLoader);
        bundle.setClassLoader(classLoader);
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            return null;
        }
        bundle2.setClassLoader(classLoader);
        return bundle2.getParcelable(str);
    }

    public static void T(Bundle bundle, Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return;
        }
        Parcelable parcelableS = S(bundle, "MapOptions");
        if (parcelableS != null) {
            U(bundle2, "MapOptions", parcelableS);
        }
        Parcelable parcelableS2 = S(bundle, "StreetViewPanoramaOptions");
        if (parcelableS2 != null) {
            U(bundle2, "StreetViewPanoramaOptions", parcelableS2);
        }
        Parcelable parcelableS3 = S(bundle, "camera");
        if (parcelableS3 != null) {
            U(bundle2, "camera", parcelableS3);
        }
        if (bundle.containsKey("position")) {
            bundle2.putString("position", bundle.getString("position"));
        }
        if (bundle.containsKey("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT")) {
            bundle2.putBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", bundle.getBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", false));
        }
    }

    public static void U(Bundle bundle, String str, Parcelable parcelable) {
        ClassLoader classLoader = d.class.getClassLoader();
        i0.h(classLoader);
        bundle.setClassLoader(classLoader);
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        bundle2.setClassLoader(classLoader);
        bundle2.putParcelable(str, parcelable);
        bundle.putBundle("map_state", bundle2);
    }

    public static final void d(final float f11, final b4.t tVar, long j9, long j11, m3.n nVar, final int i11) {
        final long j12;
        final long j13;
        s sVar = (s) nVar;
        sVar.c0(509219409);
        int i12 = i11 | (sVar.c(f11) ? 4 : 2) | 27648;
        if (sVar.R(i12 & 1, (i12 & 9363) != 9362)) {
            j12 = lv.s.H;
            final long j14 = lv.s.f28217b;
            Object objM = sVar.M();
            m3.f fVar = m.f29332a;
            if (objM == fVar) {
                objM = t1.c.a(0.5f);
                sVar.k0(objM);
            }
            final t1.b bVar = (t1.b) objM;
            Float fValueOf = Float.valueOf(f11);
            boolean zH = sVar.h(bVar) | ((i12 & 14) == 4);
            Object objM2 = sVar.M();
            if (zH || objM2 == fVar) {
                objM2 = new t9(bVar, f11, null, 2);
                sVar.k0(objM2);
            }
            i.h(fValueOf, (Function2) objM2, sVar);
            boolean zH2 = sVar.h(bVar);
            Object objM3 = sVar.M();
            if (zH2 || objM3 == fVar) {
                Function1 function1 = new Function1() { // from class: iq.a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        k4.d dVar = (k4.d) obj;
                        dVar.getClass();
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (dVar.d() & 4294967295L)) / 2.0f;
                        k4.d.M(dVar, j12, 0L, 0L, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), null, 246);
                        float fB = p.b(((Number) bVar.d()).floatValue(), 0.0f, 1.0f) * Float.intBitsToFloat((int) (dVar.d() >> 32));
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (dVar.d() & 4294967295L));
                        k4.d.M(dVar, j14, 0L, (((long) Float.floatToRawIntBits(fB)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), null, 242);
                        return Unit.f26487a;
                    }
                };
                sVar.k0(function1);
                objM3 = function1;
            }
            v1.n.c(tVar, (Function1) objM3, sVar, 6);
            j13 = j14;
        } else {
            sVar.U();
            j12 = j9;
            j13 = j11;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            final long j15 = j12;
            w1VarS.f29476d = new Function2(f11, tVar, j15, j13, i11) { // from class: iq.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ float f24090a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ b4.t f24091b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ long f24092c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ long f24093d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iF = i.F(433);
                    u00.d.d(this.f24090a, this.f24091b, this.f24092c, this.f24093d, (m3.n) obj, iF);
                    return Unit.f26487a;
                }
            };
        }
    }

    public static final void e(b4.t tVar, m3.n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.c0(1085810670);
        if (sVar.R(i11 & 1, (i11 & 3) != 2)) {
            b4.t tVarJ = v1.n.j(m2.c(m2.d(tVar, 1.0f), 1.0f), lv.s.I, g0.f23254b);
            u0 u0VarD = d2.p.d(b4.d.f5687e, false);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarJ, sVar);
            j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            i.C(u0VarD, b5.i.f5843f, sVar);
            i.C(iVarL, b5.i.f5842e, sVar);
            i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            i.z(sVar, b5.i.f5845h);
            i.C(tVarC, b5.i.f5841d, sVar);
            cg.j.q(0, 1, null, sVar);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bm.b(tVar, i11, 8);
        }
    }

    public static final void f(int i11, int i12, gj.a aVar, Function1 function1, Function1 function12, Function1 function13, m3.n nVar, int i13) {
        gj.a aVar2;
        Function1 function14;
        function1.getClass();
        function12.getClass();
        s sVar = (s) nVar;
        sVar.c0(82052937);
        int i14 = i13 | (sVar.d(i11) ? 4 : 2) | (sVar.d(i12) ? 32 : 16) | (sVar.d(aVar == null ? -1 : aVar.ordinal()) ? 256 : 128) | (sVar.h(function1) ? NewHope.SENDB_BYTES : 1024) | (sVar.h(function12) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192) | (sVar.h(function13) ? 131072 : 65536);
        if (sVar.R(i14 & 1, (74899 & i14) != 74898)) {
            x60.m mVar = (x60.m) sVar.j(PantryThemeKt.getLocalPantrySpacing());
            x60.h hVar = (x60.h) sVar.j(PantryThemeKt.getLocalPantryColor());
            q qVar = q.f5711a;
            b4.t tVarJ = v1.n.j(m2.d(qVar, 1.0f), hVar.G, g0.f23254b);
            y yVarA = w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarJ, sVar);
            j.R.getClass();
            b5.h hVar2 = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar2);
            } else {
                sVar.n0();
            }
            b5.g gVar = b5.i.f5843f;
            i.C(yVarA, gVar, sVar);
            b5.g gVar2 = b5.i.f5842e;
            i.C(iVarL, gVar2, sVar);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b5.g gVar3 = b5.i.f5844g;
            i.v(sVar, numValueOf, gVar3);
            b5.d dVar = b5.i.f5845h;
            i.z(sVar, dVar);
            b5.g gVar4 = b5.i.f5841d;
            i.C(tVarC, gVar4, sVar);
            i2 i2VarA = h2.a(d2.i.g(mVar.f44006b), b4.d.f5692j, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            b4.t tVarC2 = b4.a.c(qVar, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar2);
            } else {
                sVar.n0();
            }
            i.C(i2VarA, gVar, sVar);
            i.C(iVarL2, gVar2, sVar);
            w.a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
            i.C(tVarC2, gVar4, sVar);
            String strU = f0.U(sVar, R.string.generic_collection_time_label_now);
            aVar2 = aVar;
            boolean z11 = aVar2 == gj.a.NOW;
            String strU2 = f0.U(sVar, R.string.a11y_collection_time_now);
            int i15 = 458752 & i14;
            boolean z12 = i15 == 131072;
            Object objM = sVar.M();
            m3.f fVar = m.f29332a;
            if (z12 || objM == fVar) {
                objM = new defpackage.c(function13, 7);
                sVar.k0(objM);
            }
            boolean z13 = false;
            function14 = function13;
            PantrySelectionChipKt.PantrySelectionChip(strU, (Function0) objM, null, strU2, null, z11, false, false, null, null, sVar, 0, 980);
            String strU3 = f0.U(sVar, R.string.generic_collection_time_label_today);
            boolean z14 = aVar2 == gj.a.TODAY;
            String strU4 = f0.U(sVar, R.string.generic_collection_time_label_today);
            boolean z15 = i15 == 131072;
            Object objM2 = sVar.M();
            if (z15 || objM2 == fVar) {
                objM2 = new defpackage.c(function14, 8);
                sVar.k0(objM2);
            }
            PantrySelectionChipKt.PantrySelectionChip(strU3, (Function0) objM2, null, strU4, null, z14, false, false, null, null, sVar, 0, 980);
            String strU5 = f0.U(sVar, R.string.generic_collection_time_label_tomorrow);
            boolean z16 = aVar2 == gj.a.TOMORROW;
            String strU6 = f0.U(sVar, R.string.generic_collection_time_label_tomorrow);
            boolean z17 = i15 == 131072;
            Object objM3 = sVar.M();
            if (z17 || objM3 == fVar) {
                objM3 = new defpackage.c(function14, 9);
                sVar.k0(objM3);
            }
            PantrySelectionChipKt.PantrySelectionChip(strU5, (Function0) objM3, null, strU6, null, z16, false, false, null, null, sVar, 0, 980);
            sVar = sVar;
            sVar.q(true);
            d2.c.f(m2.e(qVar, mVar.f44015k), sVar);
            boolean z18 = (i14 & 896) == 256;
            if (i15 == 131072) {
                z13 = true;
            }
            boolean z19 = z18 | z13;
            Object objM4 = sVar.M();
            if (z19 || objM4 == fVar) {
                objM4 = new i2.e(17, aVar2, function14);
                sVar.k0(objM4);
            }
            int i16 = i14 & 126;
            int i17 = i14 >> 3;
            v0.n.c(i11, i12, function1, function12, 0, null, (Function0) objM4, sVar, i16 | (i17 & 896) | (i17 & 7168));
            sVar.q(true);
        } else {
            aVar2 = aVar;
            function14 = function13;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new d60.b(i11, i12, aVar2, function1, function12, function14, i13);
        }
    }

    public static final void g(Order order, co.q qVar, b4.t tVar, m3.n nVar, int i11) {
        Picture itemCoverImage;
        String itemOrStoreLogoUrl;
        order.getClass();
        qVar.getClass();
        tVar.getClass();
        s sVar = (s) nVar;
        sVar.c0(1973888349);
        int i12 = i11 | (sVar.h(order) ? 4 : 2) | (sVar.d(qVar.ordinal()) ? 32 : 16) | (sVar.f(tVar) ? 256 : 128);
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            c3 c3VarA = t1.d.a(qVar == co.q.MINIMISED ? 56 : 72, t1.c.k(200, 0, null, 6), "size", sVar, 432, 8);
            int i13 = co.s.$EnumSwitchMapping$0[order.getOrderType().ordinal()];
            if ((i13 != 1 && i13 != 2) || (itemCoverImage = order.getItemCoverImage()) == null || (itemOrStoreLogoUrl = itemCoverImage.getCurrentUrl()) == null) {
                itemOrStoreLogoUrl = order.getItemOrStoreLogoUrl();
            }
            Boolean boolIsMultiItem = order.isMultiItem();
            Boolean bool = Boolean.TRUE;
            int i14 = Intrinsics.areEqual(boolIsMultiItem, bool) ? 2131232043 : R.drawable.gfx_tgtg_logo_green;
            gd.i iVarG = gd.o.g(Intrinsics.areEqual(order.isMultiItem(), bool) ? null : itemOrStoreLogoUrl, x0.z(i14, sVar, 0), x0.z(i14, sVar, 0), x0.z(i14, sVar, 0), sVar);
            l2.f fVar = l2.g.f26790a;
            v1.n.d(iVarG, null, v1.n.j(m2.m(d2.c.z(f4.g.b(v1.n.k(f4.g.k(tVar, 10, fVar, false, 0L, 0L, 28), 2, lv.s.H, fVar), fVar), 1), ((z5.f) c3VarA.getValue()).f47277a), lv.s.J, g0.f23254b), null, z4.l.f47172g, 0.0f, null, sVar, 24624, 104);
            sVar = sVar;
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new an.d(order, qVar, tVar, i11, 6);
        }
    }

    public static final void h(b4.t tVar, ProfileFeatureState profileFeatureState, int i11, int i12, m3.n nVar, int i13) {
        ProfileFeatureState profileFeatureState2;
        b4.t tVar2 = tVar;
        profileFeatureState.getClass();
        s sVar = (s) nVar;
        sVar.c0(-9743228);
        int i14 = i13 | (sVar.f(tVar2) ? 4 : 2) | (sVar.d(profileFeatureState.ordinal()) ? 32 : 16) | (sVar.d(i11) ? 256 : 128) | (sVar.d(i12) ? NewHope.SENDB_BYTES : 1024);
        if (sVar.R(i14 & 1, (i14 & 1171) != 1170)) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(f0.U(sVar, R.string.profile_loyalty_card_card_status_voice_over), Arrays.copyOf(new Object[]{Integer.valueOf(i11), Integer.valueOf(i12)}, 2));
            float f11 = 48;
            int i15 = i12 + 1;
            int i16 = 5;
            int i17 = i15 % 6 == 0 ? 6 : 5;
            int i18 = ((i15 + i17) - 1) / i17;
            z5.c cVar = (z5.c) sVar.j(x1.f7416h);
            Object objM = sVar.M();
            m3.f fVar = m.f29332a;
            if (objM == fVar) {
                objM = i.w(new z5.f(lv.t.f28252f));
                sVar.k0(objM);
            }
            b1 b1Var = (b1) objM;
            Object objM2 = sVar.M();
            if (objM2 == fVar) {
                objM2 = new t1.w1(i16);
                sVar.k0(objM2);
            }
            b4.t tVarC = r.c(tVar2, true, (Function1) objM2);
            boolean zF = sVar.f(str);
            Object objM3 = sVar.M();
            if (zF || objM3 == fVar) {
                objM3 = new qb.s(str, 21);
                sVar.k0(objM3);
            }
            b4.t tVarB = r.b(tVarC, (Function1) objM3);
            boolean zF2 = sVar.f(cVar);
            Object objM4 = sVar.M();
            if (zF2 || objM4 == fVar) {
                objM4 = new o2(cVar, b1Var, 9);
                sVar.k0(objM4);
            }
            b4.t tVarO = c0.o(tVarB, (Function1) objM4);
            u0 u0VarD = d2.p.d(b4.d.f5683a, false);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC2 = b4.a.c(tVarO, sVar);
            j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            b5.g gVar = b5.i.f5843f;
            i.C(u0VarD, gVar, sVar);
            b5.g gVar2 = b5.i.f5842e;
            i.C(iVarL, gVar2, sVar);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b5.g gVar3 = b5.i.f5844g;
            i.v(sVar, numValueOf, gVar3);
            b5.d dVar = b5.i.f5845h;
            i.z(sVar, dVar);
            b5.g gVar4 = b5.i.f5841d;
            i.C(tVarC2, gVar4, sVar);
            b4.t tVarD = m2.d(tVar2, 1.0f);
            y yVarA = w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
            int i19 = i17;
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            b4.t tVarC3 = b4.a.c(tVarD, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            i.C(yVarA, gVar, sVar);
            i.C(iVarL2, gVar2, sVar);
            w.a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
            i.C(tVarC3, gVar4, sVar);
            sVar.a0(-427297473);
            for (int i21 = 0; i21 < i18; i21++) {
                i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5692j, sVar, 0);
                int iHashCode3 = Long.hashCode(sVar.T);
                u3.i iVarL3 = sVar.l();
                b4.t tVarC4 = b4.a.c(q.f5711a, sVar);
                j.R.getClass();
                b5.h hVar2 = b5.i.f5839b;
                sVar.e0();
                if (sVar.S) {
                    sVar.k(hVar2);
                } else {
                    sVar.n0();
                }
                i.C(i2VarA, b5.i.f5843f, sVar);
                i.C(iVarL3, b5.i.f5842e, sVar);
                i.v(sVar, Integer.valueOf(iHashCode3), b5.i.f5844g);
                i.z(sVar, b5.i.f5845h);
                i.C(tVarC4, b5.i.f5841d, sVar);
                sVar.a0(-57369517);
                for (int i22 = 0; i22 < i19; i22++) {
                    int i23 = (i21 * i19) + i22;
                    if (i23 < i15) {
                        sVar.a0(-1778316238);
                        int i24 = i23 + 1;
                        if (1.0f <= 0.0d) {
                            e2.a.a("invalid weight; must be greater than zero");
                        }
                        b4.t tVarE = m2.e(new n1(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true), 64);
                        u0 u0VarD2 = d2.p.d(b4.d.f5690h, false);
                        int iHashCode4 = Long.hashCode(sVar.T);
                        u3.i iVarL4 = sVar.l();
                        b4.t tVarC5 = b4.a.c(tVarE, sVar);
                        j.R.getClass();
                        b5.h hVar3 = b5.i.f5839b;
                        sVar.e0();
                        if (sVar.S) {
                            sVar.k(hVar3);
                        } else {
                            sVar.n0();
                        }
                        i.C(u0VarD2, b5.i.f5843f, sVar);
                        i.C(iVarL4, b5.i.f5842e, sVar);
                        i.v(sVar, Integer.valueOf(iHashCode4), b5.i.f5844g);
                        i.z(sVar, b5.i.f5845h);
                        i.C(tVarC5, b5.i.f5841d, sVar);
                        v0.n.i(null, i15, i24, i11 >= i24 || i11 + 1 == i15, f11, sVar, 24576);
                        sVar.q(true);
                        sVar.q(false);
                    } else {
                        sVar.a0(-1777556211);
                        if (1.0f <= 0.0d) {
                            e2.a.a("invalid weight; must be greater than zero");
                        }
                        d2.c.f(new n1(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true), sVar);
                        sVar.q(false);
                    }
                }
                sVar.q(false);
                sVar.q(true);
            }
            sVar.q(false);
            sVar.q(true);
            profileFeatureState2 = profileFeatureState;
            if (profileFeatureState2 == ProfileFeatureState.EXPIRED) {
                sVar.a0(1574408303);
                tVar2 = tVar;
                d2.p.a(v1.n.j(m2.e(m2.d(tVar2, 1.0f), ((z5.f) b1Var.getValue()).f47277a), lv.s.V, g0.f23254b), sVar, 0);
                sVar.q(false);
            } else {
                tVar2 = tVar;
                sVar.a0(1574612996);
                sVar.q(false);
            }
            sVar.q(true);
        } else {
            profileFeatureState2 = profileFeatureState;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new defpackage.h(tVar2, profileFeatureState2, i11, i12, i13, 4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:236:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x03bc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x04b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(b4.t r43, i2.e0 r44, final d2.z1 r45, final z1.h2 r46, final a2.j r47, final boolean r48, final v1.o1 r49, final float r50, final i2.i r51, v4.a r52, final b4.j r53, final a2.p r54, final u3.d r55, m3.n r56, final int r57, final int r58) {
        /*
            Method dump skipped, instruction units count: 1308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u00.d.i(b4.t, i2.e0, d2.z1, z1.h2, a2.j, boolean, v1.o1, float, i2.i, v4.a, b4.j, a2.p, u3.d, m3.n, int, int):void");
    }

    public static final void j(Function0 function0, m3.n nVar, int i11) {
        int i12;
        Function0 function02 = function0;
        function02.getClass();
        s sVar = (s) nVar;
        sVar.c0(-1248068716);
        if ((i11 & 6) == 0) {
            i12 = i11 | (sVar.h(function02) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            q qVar = q.f5711a;
            b4.t tVarD = m2.d(qVar, 1.0f);
            y yVarA = w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarD, sVar);
            j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            i.C(yVarA, b5.i.f5843f, sVar);
            i.C(iVarL, b5.i.f5842e, sVar);
            i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            i.z(sVar, b5.i.f5845h);
            i.C(tVarC, b5.i.f5841d, sVar);
            w0 w0Var = new w0(b4.d.f5695n);
            float f11 = lv.t.f28254h;
            float f12 = lv.t.f28255i;
            v1.n.d(x0.z(R.drawable.gfx_profile_empty_order_bag_icon, sVar, 0), null, d2.c.D(w0Var, f12, f11, f12, 0.0f, 8), null, null, 0.0f, null, sVar, 56, 120);
            float f13 = lv.t.f28253g;
            b4.t tVarD2 = m2.d(d2.c.D(qVar, f12, f13, f12, 0.0f, 8), 1.0f);
            String strU = f0.U(sVar, R.string.profile_page_empty_orders_card_header);
            m5.u0 u0Var = lv.v.f28272k;
            long j9 = lv.s.C;
            r9.d(strU, tVarD2, j9, 0L, null, 0L, null, new k(3), 0L, 0, false, 0, 0, null, u0Var, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 130040);
            r9.d(f0.U(sVar, R.string.profile_page_empty_orders_card_body), m2.d(d2.c.D(qVar, f12, lv.t.f28249c, f12, 0.0f, 8), 1.0f), j9, 0L, null, 0L, null, new k(3), 0L, 0, false, 0, 0, null, lv.v.f28274n, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 130040);
            b4.t tVarA = b4.a.a(d2.c.z(m2.d(qVar, 1.0f), f13), c5.m2.f7291a, new on.l(19, function0));
            function02 = function0;
            r9.d(f0.U(sVar, R.string.profile_page_empty_orders_card_cta), tVarA, lv.s.f28217b, 0L, null, 0L, x5.l.f43854c, new k(3), 0L, 0, false, 0, 0, null, lv.v.f28283w, sVar, 805306752, 12582912, 129528);
            sVar = sVar;
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new a2(i11, 9, function02);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final r8.j k(float[] fArr, r8.a aVar, AbstractList abstractList, float f11, float f12) {
        float f13;
        long jA;
        ArrayList arrayList;
        List listC;
        r8.b bVarF;
        r8.a aVar2;
        Float fValueOf = Float.valueOf(1.0f);
        aVar.getClass();
        r8.j jVar = null;
        if (fArr.length < 6) {
            i4.a.f("Polygons must have at least 3 vertices");
            return null;
        }
        int i11 = 2;
        int i12 = 1;
        if (fArr.length % 2 == 1) {
            i4.a.f("The vertices array should have even size");
            return null;
        }
        if (abstractList != null && abstractList.size() * 2 != fArr.length) {
            i4.a.f("perVertexRounding list should be either null or the same size as the number of vertices (vertices.size / 2)");
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        int length = fArr.length / 2;
        ArrayList arrayList3 = new ArrayList();
        int i13 = 0;
        int i14 = 0;
        while (i14 < length) {
            r8.a aVar3 = (abstractList == null || (aVar2 = (r8.a) abstractList.get(i14)) == null) ? aVar : aVar2;
            int i15 = (((i14 + length) - 1) % length) * 2;
            int i16 = i14 + 1;
            int i17 = (i16 % length) * 2;
            int i18 = i14 * 2;
            arrayList3.add(new r8.h(q1.h.a(fArr[i15], fArr[i15 + 1]), q1.h.a(fArr[i18], fArr[i18 + 1]), q1.h.a(fArr[i17], fArr[i17 + 1]), aVar3));
            i14 = i16;
        }
        IntRange intRangeJ = p.j(0, length);
        ArrayList arrayList4 = new ArrayList(e0.o(intRangeJ, 10));
        Iterator it = intRangeJ.iterator();
        while (true) {
            f13 = 0.0f;
            if (!((n80.h) it).f30715c) {
                break;
            }
            int iNextInt = ((s0) it).nextInt();
            int i19 = (iNextInt + 1) % length;
            float f14 = ((r8.h) arrayList3.get(iNextInt)).f37767h + ((r8.h) arrayList3.get(i19)).f37767h;
            float fC = ((r8.h) arrayList3.get(i19)).c() + ((r8.h) arrayList3.get(iNextInt)).c();
            int i21 = iNextInt * 2;
            float f15 = fArr[i21];
            float f16 = fArr[i21 + 1];
            int i22 = i19 * 2;
            float f17 = f15 - fArr[i22];
            float f18 = f16 - fArr[i22 + 1];
            float f19 = r8.l.f37777b;
            float fSqrt = (float) Math.sqrt((f18 * f18) + (f17 * f17));
            arrayList4.add(f14 > fSqrt ? new Pair(Float.valueOf(fSqrt / f14), Float.valueOf(0.0f)) : fC > fSqrt ? new Pair(fValueOf, Float.valueOf((fSqrt - f14) / (fC - f14))) : new Pair(fValueOf, fValueOf));
        }
        int i23 = 0;
        while (i23 < length) {
            float[] fArrCopyOf = new float[i11];
            int i24 = i13;
            int i25 = i24;
            while (i24 < i11) {
                r8.j jVar2 = jVar;
                Pair pair = (Pair) arrayList4.get((((i23 + length) - 1) + i24) % length);
                int i26 = i13;
                float f20 = f13;
                int i27 = i11;
                float fA = j4.s.a(((r8.h) arrayList3.get(i23)).c(), ((r8.h) arrayList3.get(i23)).f37767h, ((Number) pair.f26486b).floatValue(), ((r8.h) arrayList3.get(i23)).f37767h * ((Number) pair.f26485a).floatValue());
                int i28 = i25 + 1;
                if (fArrCopyOf.length < i28) {
                    fArrCopyOf = Arrays.copyOf(fArrCopyOf, Math.max(i28, (fArrCopyOf.length * 3) / 2));
                }
                fArrCopyOf[i25] = fA;
                i24++;
                f13 = f20;
                i25 = i28;
                i13 = i26;
                jVar = jVar2;
                i11 = i27;
            }
            int i29 = i11;
            r8.j jVar3 = jVar;
            int i31 = i13;
            float f21 = f13;
            r8.h hVar = (r8.h) arrayList3.get(i23);
            if (i25 <= 0) {
                org.bouncycastle.jce.provider.a.v("Index must be between 0 and size");
                return jVar3;
            }
            float f22 = fArrCopyOf[i31];
            if (i12 >= i25) {
                org.bouncycastle.jce.provider.a.v("Index must be between 0 and size");
                return jVar3;
            }
            float f23 = fArrCopyOf[i12];
            long j9 = hVar.f37764e;
            long j11 = hVar.f37763d;
            int i32 = i12;
            float f24 = hVar.f37765f;
            ArrayList arrayList5 = arrayList2;
            long j12 = hVar.f37761b;
            float fMin = Math.min(f22, f23);
            int i33 = i23;
            float f25 = hVar.f37767h;
            if (f25 < 1.0E-4f || fMin < 1.0E-4f || f24 < 1.0E-4f) {
                arrayList = arrayList4;
                hVar.f37768i = j12;
                float fY = pd.g.y(j12);
                float fZ = pd.g.z(j12);
                float fY2 = pd.g.y(j12);
                float fZ2 = pd.g.z(j12);
                listC = kotlin.collections.c0.c(p30.b.f(fY, fZ, r8.l.b(fY, fY2, 0.33333334f), r8.l.b(fZ, fZ2, 0.33333334f), r8.l.b(fY, fY2, 0.6666667f), r8.l.b(fZ, fZ2, 0.6666667f), fY2, fZ2));
            } else {
                float fMin2 = Math.min(fMin, f25);
                float fA2 = hVar.a(f22);
                float fA3 = hVar.a(f23);
                float f26 = (f24 * fMin2) / f25;
                float f27 = r8.l.f37777b;
                arrayList = arrayList4;
                hVar.f37768i = pd.g.F(j12, pd.g.J((float) Math.sqrt((fMin2 * fMin2) + (f26 * f26)), pd.g.w(pd.g.r(2.0f, pd.g.F(j11, j9)))));
                long jF = pd.g.F(j12, pd.g.J(fMin2, j11));
                long jF2 = pd.g.F(j12, pd.g.J(fMin2, j9));
                r8.b bVarB = r8.h.b(fMin2, fA2, hVar.f37761b, hVar.f37760a, jF, jF2, hVar.f37768i, f26);
                r8.b bVarB2 = r8.h.b(fMin2, fA3, hVar.f37761b, hVar.f37762c, jF2, jF, hVar.f37768i, f26);
                float fA4 = bVarB2.a();
                float fB = bVarB2.b();
                float[] fArr2 = bVarB2.f37755a;
                r8.b bVarF2 = p30.b.f(fA4, fB, fArr2[4], fArr2[5], fArr2[i29], fArr2[3], fArr2[i31], fArr2[i32]);
                float fY3 = pd.g.y(hVar.f37768i);
                float fZ3 = pd.g.z(hVar.f37768i);
                float fA5 = bVarB.a();
                float fB2 = bVarB.b();
                float[] fArr3 = bVarF2.f37755a;
                float f28 = fArr3[i31];
                float f29 = fArr3[i32];
                long jA2 = r8.l.a(fA5 - fY3, fB2 - fZ3);
                float f31 = f28 - fY3;
                float f32 = f29 - fZ3;
                long jA3 = r8.l.a(f31, f32);
                long jA4 = q1.h.a(-pd.g.z(jA2), pd.g.y(jA2));
                long jA5 = q1.h.a(-pd.g.z(jA3), pd.g.y(jA3));
                int i34 = (pd.g.z(jA4) * f32) + (pd.g.y(jA4) * f31) >= f21 ? i32 : i31;
                float fS = pd.g.s(jA2, jA3);
                if (fS > 0.999f) {
                    bVarF = p30.b.f(fA5, fB2, r8.l.b(fA5, f28, 0.33333334f), r8.l.b(fB2, f29, 0.33333334f), r8.l.b(fA5, f28, 0.6666667f), r8.l.b(fB2, f29, 0.6666667f), f28, f29);
                } else {
                    float fSqrt2 = (((((float) Math.sqrt(i29 * r11)) - ((float) Math.sqrt(r14 - (fS * fS)))) * ((((float) Math.sqrt((r13 * r13) + (r12 * r12))) * 4.0f) / 3.0f)) / (i32 - fS)) * (i34 != 0 ? 1.0f : -1.0f);
                    bVarF = p30.b.f(fA5, fB2, (pd.g.y(jA4) * fSqrt2) + fA5, (pd.g.z(jA4) * fSqrt2) + fB2, f28 - (pd.g.y(jA5) * fSqrt2), f29 - (pd.g.z(jA5) * fSqrt2), f28, f29);
                }
                listC = d0.h(bVarB, bVarF, bVarF2);
            }
            arrayList5.add(listC);
            i23 = i33 + 1;
            f13 = f21;
            arrayList2 = arrayList5;
            arrayList4 = arrayList;
            i13 = i31;
            jVar = jVar3;
            i11 = 2;
            i12 = 1;
        }
        ArrayList arrayList6 = arrayList2;
        int i35 = i13;
        float f33 = f13;
        ArrayList arrayList7 = new ArrayList();
        int i36 = i35;
        while (i36 < length) {
            int iC = r8.k.c(i36, length, 1, length);
            int i37 = i36 + 1;
            int i38 = i37 % length;
            int i39 = i36 * 2;
            long jA6 = q1.h.a(fArr[i39], fArr[i39 + 1]);
            int i41 = iC * 2;
            long jA7 = q1.h.a(fArr[i41], fArr[i41 + 1]);
            int i42 = i38 * 2;
            long jA8 = q1.h.a(fArr[i42], fArr[i42 + 1]);
            long jD = pd.g.D(jA6, jA7);
            long jD2 = pd.g.D(jA8, jA6);
            arrayList7.add(new r8.c((List) arrayList6.get(i36), jA6, ((r8.h) arrayList3.get(i36)).f37768i, (pd.g.z(jD2) * pd.g.y(jD)) - (pd.g.y(jD2) * pd.g.z(jD)) > f33 ? 1 : i35));
            float fA6 = ((r8.b) CollectionsKt.W((List) arrayList6.get(i36))).a();
            float fB3 = ((r8.b) CollectionsKt.W((List) arrayList6.get(i36))).b();
            float f34 = ((r8.b) CollectionsKt.O((List) arrayList6.get(i38))).f37755a[i35];
            float f35 = ((r8.b) CollectionsKt.O((List) arrayList6.get(i38))).f37755a[1];
            arrayList7.add(new r8.d(kotlin.collections.c0.c(p30.b.f(fA6, fB3, r8.l.b(fA6, f34, 0.33333334f), r8.l.b(fB3, f35, 0.33333334f), r8.l.b(fA6, f34, 0.6666667f), r8.l.b(fB3, f35, 0.6666667f), f34, f35))));
            i36 = i37;
        }
        if (f11 == Float.MIN_VALUE || f12 == Float.MIN_VALUE) {
            float f36 = f33;
            float f37 = f36;
            int i43 = i35;
            while (i43 < fArr.length) {
                int i44 = i43 + 1;
                f37 += fArr[i43];
                i43 += 2;
                f36 += fArr[i44];
            }
            float f38 = 2;
            jA = q1.h.a((f37 / fArr.length) / f38, (f36 / fArr.length) / f38);
        } else {
            jA = q1.h.a(f11, f12);
        }
        return new r8.j(arrayList7, Float.intBitsToFloat((int) (jA >> 32)), Float.intBitsToFloat((int) (jA & 4294967295L)));
    }

    public static final pd.r l(p0 p0Var) {
        ia0.i iVarP0;
        int i11 = p0Var.f36585d;
        long j9 = p0Var.l;
        long j11 = p0Var.f36593m;
        t<Pair> tVar = p0Var.f36587f;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Pair pair : tVar) {
            String str = (String) pair.f26485a;
            String str2 = (String) pair.f26486b;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            Object arrayList = linkedHashMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(lowerCase, arrayList);
            }
            ((List) arrayList).add(str2);
        }
        pd.p pVar = new pd.p(kotlin.collections.x0.k(linkedHashMap));
        r0 r0Var = p0Var.f36588g;
        return new pd.r(i11, j9, j11, pVar, (r0Var == null || (iVarP0 = r0Var.p0()) == null) ? null : new pd.s(iVarP0), p0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final q90.g0 m(pd.q r5, z70.c r6) {
        /*
            boolean r0 = r6 instanceof sd.c
            if (r0 == 0) goto L13
            r0 = r6
            sd.c r0 = (sd.c) r0
            int r1 = r0.f39007k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39007k = r1
            goto L18
        L13:
            sd.c r0 = new sd.c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f39006j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r0 = r0.f39007k
            r1 = 0
            if (r0 == 0) goto L44
            r5 = 1
            if (r0 != r5) goto L3e
            ba0.g.M(r6)
            ia0.j r6 = (ia0.j) r6
            if (r6 == 0) goto L39
            q90.m0 r5 = q90.n0.Companion
            r5.getClass()
            q90.j0 r5 = new q90.j0
            r5.<init>(r1, r6)
            r6 = r1
            r0 = r6
            r2 = r0
            goto L59
        L39:
            r5 = r1
            r6 = r5
            r0 = r6
            r2 = r0
            goto L55
        L3e:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            return r1
        L44:
            ba0.g.M(r6)
            androidx.lifecycle.n1 r6 = new androidx.lifecycle.n1
            r6.<init>()
            java.lang.String r0 = r5.f34707a
            r6.D(r0)
            java.lang.String r0 = r5.f34708b
            r2 = r0
            r0 = r6
        L55:
            r4 = r6
            r6 = r5
            r5 = r1
            r1 = r4
        L59:
            r1.w(r2, r5)
            pd.p r5 = r6.f34709c
            ax.g0 r6 = new ax.g0
            r1 = 3
            r6.<init>(r1)
            java.util.Map r5 = r5.f34706a
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L6e:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L9a
            java.lang.Object r1 = r5.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            java.util.List r1 = (java.util.List) r1
            java.util.Iterator r1 = r1.iterator()
        L8a:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L6e
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            r6.e(r2, r3)
            goto L8a
        L9a:
            q90.t r5 = r6.g()
            r0.getClass()
            ax.g0 r5 = r5.e()
            r0.f3501c = r5
            q90.g0 r5 = new q90.g0
            r5.<init>(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: u00.d.m(pd.q, z70.c):q90.g0");
    }

    public static final void p(Closeable closeable, Throwable th2) {
        if (closeable != null) {
            if (th2 == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th3) {
                u70.e.a(th2, th3);
            }
        }
    }

    public static String q(j0.b bVar, Integer num) {
        if (num == null) {
            return null;
        }
        try {
            if (num.intValue() == 1) {
                e0.s.a("0");
                v vVarB = j0.b.b(bVar, "0");
                CameraCharacteristics.Key key = CameraCharacteristics.LENS_FACING;
                key.getClass();
                Integer num2 = (Integer) ((t0) vVarB).c(key);
                if (num2 != null && num2.intValue() == 1) {
                    return "1";
                }
            } else if (num.intValue() == 0) {
                e0.s.a("1");
                v vVarB2 = j0.b.b(bVar, "1");
                CameraCharacteristics.Key key2 = CameraCharacteristics.LENS_FACING;
                key2.getClass();
                Integer num3 = (Integer) ((t0) vVarB2).c(key2);
                if (num3 != null && num3.intValue() == 0) {
                    return "0";
                }
            }
            return null;
        } catch (DoNotDisturbException unused) {
            if (!wd.a.B(6, "CXCP")) {
                return null;
            }
            Log.e("CXCP", "Received Do Not Disturb exception while deciding camera id to skip. Please turn off Do Not Disturb mode");
            return null;
        }
    }

    public static float r(float f11, float f12, float f13, float f14) {
        return (float) Math.hypot(f13 - f11, f14 - f12);
    }

    public static float s(float f11, float f12, float f13, float f14) {
        float fR = r(f11, f12, 0.0f, 0.0f);
        float fR2 = r(f11, f12, f13, 0.0f);
        float fR3 = r(f11, f12, f13, f14);
        float fR4 = r(f11, f12, 0.0f, f14);
        return (fR <= fR2 || fR <= fR3 || fR <= fR4) ? (fR2 <= fR3 || fR2 <= fR4) ? fR3 > fR4 ? fR3 : fR4 : fR2 : fR;
    }

    public static Application t(Context context) {
        if (context instanceof Application) {
            return (Application) context;
        }
        Context baseContext = context;
        while (baseContext instanceof ContextWrapper) {
            baseContext = ((ContextWrapper) baseContext).getBaseContext();
            if (baseContext instanceof Application) {
                return (Application) baseContext;
            }
        }
        j4.d.e(context, "Could not find an Application in the given context: ");
        return null;
    }

    public abstract int A(CoordinatorLayout coordinatorLayout);

    public abstract int B();

    public abstract boolean D(float f11);

    public abstract boolean H(View view);

    public abstract boolean I(float f11, float f12);

    public void K(int i11) {
        synchronized (this) {
        }
    }

    public abstract boolean O(View view, float f11);

    public abstract void Q(ViewGroup.MarginLayoutParams marginLayoutParams, int i11);

    public abstract void R(ViewGroup.MarginLayoutParams marginLayoutParams, int i11, int i12);

    public abstract int n(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract float o(int i11);

    public abstract int u(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract int v();

    public abstract int w();

    public abstract int x();

    public abstract int y();

    public abstract int z(View view);

    @Override // h7.d1
    public void a() {
    }

    @Override // h7.d1
    public void b() {
    }
}
