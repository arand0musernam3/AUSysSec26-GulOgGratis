package zz;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.opengl.Matrix;
import android.os.Build;
import android.util.Log;
import android.util.Range;
import android.view.View;
import android.view.ViewAnimationUtils;
import androidx.activity.ComponentActivity;
import androidx.camera.camera2.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.internal.utils.ImageUtil$CodecFailedException;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider$Factory;
import b4.q;
import b4.t;
import c5.d2;
import c5.m2;
import c5.x1;
import cn.x;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.item.AverageItemRating;
import com.app.tgtg.model.remote.item.ItemTagInfo;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.mapService.response.SortingOption;
import com.app.tgtg.model.remote.user.response.charity.CharityPlanCollectorType;
import com.tgtg.componentlibrary.component.radiobutton.PantryRadioButtonKt;
import com.tgtg.componentlibrary.theme.PantryThemeKt;
import d2.h2;
import d2.i2;
import d2.p;
import d2.u;
import d2.w;
import d2.y;
import g3.p5;
import g3.r9;
import g3.s0;
import g9.b0;
import g9.c0;
import i4.g0;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.m0;
import kotlin.collections.o0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import lv.v;
import m0.n0;
import m3.b1;
import m3.c3;
import m3.d3;
import m3.n;
import m3.s;
import m3.w1;
import m5.d0;
import o00.x0;
import o30.f0;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.iana.AEADAlgorithm;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import v0.k;
import v0.l;
import v0.m;
import wy.o;
import z4.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static ClassLoader f48439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Thread f48440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f48441c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f48442d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f48443e = 0;

    public static void A(float f11, float[] fArr) {
        Matrix.translateM(fArr, 0, 0.5f, 0.5f, 0.0f);
        Matrix.rotateM(fArr, 0, f11, 0.0f, 0.0f, 1.0f);
        Matrix.translateM(fArr, 0, -0.5f, -0.5f, 0.0f);
    }

    public static void B(float[] fArr) {
        Matrix.translateM(fArr, 0, 0.0f, 0.5f, 0.0f);
        Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
        Matrix.translateM(fArr, 0, -0.0f, -0.5f, 0.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object C(pd.s r4, z70.c r5) {
        /*
            boolean r0 = r5 instanceof qd.c
            if (r0 == 0) goto L13
            r0 = r5
            qd.c r0 = (qd.c) r0
            int r1 = r0.f36949m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36949m = r1
            goto L18
        L13:
            qd.c r0 = new qd.c
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.l
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f36949m
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            ia0.g r4 = r0.f36948k
            pd.s r0 = r0.f36947j
            ba0.g.M(r5)     // Catch: java.lang.Throwable -> L2b
            goto L4e
        L2b:
            r4 = move-exception
            goto L58
        L2d:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r4)
            r4 = 0
            return r4
        L34:
            ba0.g.M(r5)
            ia0.g r5 = new ia0.g     // Catch: java.lang.Throwable -> L56
            r5.<init>()     // Catch: java.lang.Throwable -> L56
            r0.f36947j = r4     // Catch: java.lang.Throwable -> L56
            r0.f36948k = r5     // Catch: java.lang.Throwable -> L56
            r0.f36949m = r3     // Catch: java.lang.Throwable -> L56
            ia0.i r0 = r4.f34717a     // Catch: java.lang.Throwable -> L56
            r0.j0(r5)     // Catch: java.lang.Throwable -> L56
            kotlin.Unit r0 = kotlin.Unit.f26487a     // Catch: java.lang.Throwable -> L56
            if (r0 != r1) goto L4c
            return r1
        L4c:
            r0 = r4
            r4 = r5
        L4e:
            r5 = 0
            w.b.y(r0, r5)
            return r4
        L53:
            r0 = r4
            r4 = r5
            goto L58
        L56:
            r5 = move-exception
            goto L53
        L58:
            throw r4     // Catch: java.lang.Throwable -> L59
        L59:
            r5 = move-exception
            w.b.y(r0, r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: zz.f.C(pd.s, z70.c):java.lang.Object");
    }

    public static final void D(Thread thread, String str, jb.b bVar, Function0 function0) {
        bVar.getClass();
        function0.getClass();
        try {
            thread.start();
        } catch (IllegalThreadStateException e5) {
            bVar.r("CashAppPay", str, e5);
            function0.invoke();
        } catch (InterruptedException e11) {
            bVar.r("CashAppPay", str, e11);
            function0.invoke();
        }
    }

    public static final boolean E(String str, Function0 function0) {
        try {
            boolean zBooleanValue = ((Boolean) function0.invoke()).booleanValue();
            if (!zBooleanValue) {
                Log.e("ReflectionGuard", str);
            }
            return zBooleanValue;
        } catch (ClassNotFoundException unused) {
            Log.e("ReflectionGuard", "ClassNotFound: ".concat(str));
            return false;
        } catch (NoSuchFieldException unused2) {
            Log.e("ReflectionGuard", "NoSuchField: ".concat(str));
            return false;
        } catch (NoSuchMethodException unused3) {
            Log.e("ReflectionGuard", "NoSuchMethod: ".concat(str));
            return false;
        }
    }

    public static byte[] F(n0 n0Var, Rect rect, int i11, int i12) throws ImageUtil$CodecFailedException {
        if (n0Var.getFormat() != 35) {
            o.l(n0Var.getFormat(), "Incorrect image format of the input image proxy: ");
            return null;
        }
        jd.f fVar = n0Var.o()[0];
        jd.f fVar2 = n0Var.o()[1];
        int i13 = 2;
        jd.f fVar3 = n0Var.o()[2];
        ByteBuffer byteBufferF = fVar.f();
        ByteBuffer byteBufferF2 = fVar2.f();
        ByteBuffer byteBufferF3 = fVar3.f();
        byteBufferF.rewind();
        byteBufferF2.rewind();
        byteBufferF3.rewind();
        int iRemaining = byteBufferF.remaining();
        byte[] bArr = new byte[((n0Var.getHeight() * n0Var.b()) / 2) + iRemaining];
        int iB = 0;
        for (int i14 = 0; i14 < n0Var.getHeight(); i14++) {
            byteBufferF.get(bArr, iB, n0Var.b());
            iB += n0Var.b();
            byteBufferF.position(Math.min(iRemaining, fVar.k() + (byteBufferF.position() - n0Var.b())));
        }
        int height = n0Var.getHeight() / 2;
        int iB2 = n0Var.b() / 2;
        int iK = fVar3.k();
        int iK2 = fVar2.k();
        int i15 = fVar3.i();
        int i16 = fVar2.i();
        byte[] bArr2 = new byte[iK];
        byte[] bArr3 = new byte[iK2];
        int i17 = 0;
        while (i17 < height) {
            int i18 = i13;
            byteBufferF3.get(bArr2, 0, Math.min(iK, byteBufferF3.remaining()));
            byteBufferF2.get(bArr3, 0, Math.min(iK2, byteBufferF2.remaining()));
            int i19 = 0;
            int i21 = 0;
            for (int i22 = 0; i22 < iB2; i22++) {
                int i23 = iB + 1;
                bArr[iB] = bArr2[i19];
                iB += 2;
                bArr[i23] = bArr3[i21];
                i19 += i15;
                i21 += i16;
            }
            i17++;
            i13 = i18;
        }
        int i24 = i13;
        YuvImage yuvImage = new YuvImage(bArr, 17, n0Var.b(), n0Var.getHeight(), null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        m[] mVarArr = k.f41613c;
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        v0.i iVar = new v0.i();
        String strValueOf = String.valueOf(1);
        ArrayList arrayList = iVar.f41611a;
        iVar.c("Orientation", strValueOf, arrayList);
        iVar.c("XResolution", "72/1", arrayList);
        iVar.c("YResolution", "72/1", arrayList);
        iVar.c("ResolutionUnit", String.valueOf(i24), arrayList);
        iVar.c("YCbCrPositioning", String.valueOf(1), arrayList);
        iVar.c("Make", Build.MANUFACTURER, arrayList);
        iVar.c("Model", Build.MODEL, arrayList);
        if (n0Var.Y() != null) {
            n0Var.Y().d(iVar);
        }
        iVar.d(i12);
        iVar.c("ImageWidth", String.valueOf(n0Var.b()), arrayList);
        iVar.c("ImageLength", String.valueOf(n0Var.getHeight()), arrayList);
        ArrayList list = Collections.list(new v0.h(iVar));
        if (!((Map) list.get(1)).isEmpty()) {
            iVar.b("ExposureProgram", String.valueOf(0), list);
            iVar.b("ExifVersion", "0230", list);
            iVar.b("ComponentsConfiguration", k.f41616f, list);
            iVar.b("MeteringMode", String.valueOf(0), list);
            iVar.b("LightSource", String.valueOf(0), list);
            iVar.b("FlashpixVersion", "0100", list);
            iVar.b("FocalPlaneResolutionUnit", String.valueOf(i24), list);
            iVar.b("FileSource", String.valueOf(3), list);
            iVar.b("SceneType", String.valueOf(1), list);
            iVar.b("CustomRendered", String.valueOf(0), list);
            iVar.b("SceneCaptureType", String.valueOf(0), list);
            iVar.b("Contrast", String.valueOf(0), list);
            iVar.b("Saturation", String.valueOf(0), list);
            iVar.b("Sharpness", String.valueOf(0), list);
        }
        if (!((Map) list.get(i24)).isEmpty()) {
            iVar.b("GPSVersionID", "2300", list);
            iVar.b("GPSSpeedRef", "K", list);
            iVar.b("GPSTrackRef", "T", list);
            iVar.b("GPSImgDirectionRef", "T", list);
            iVar.b("GPSDestBearingRef", "T", list);
            iVar.b("GPSDestDistanceRef", "K", list);
        }
        if (yuvImage.compressToJpeg(rect == null ? new Rect(0, 0, n0Var.b(), n0Var.getHeight()) : rect, i11, new l(byteArrayOutputStream, new k(iVar.f41612b, list)))) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new ImageUtil$CodecFailedException("YuvImage failed to encode jpeg.");
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00b7 A[Catch: all -> 0x00b3, PHI: r2
      0x00b7: PHI (r2v1 java.lang.Thread) = (r2v0 java.lang.Thread), (r2v11 java.lang.Thread) binds: [B:7:0x000c, B:47:0x00b0] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #3 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000e, B:46:0x00ae, B:61:0x00e5, B:12:0x0023, B:52:0x00b6, B:53:0x00b7, B:64:0x00e9, B:65:0x00ea, B:13:0x0024, B:15:0x0031, B:25:0x004b, B:26:0x0052, B:28:0x005d, B:34:0x0072, B:35:0x0079, B:43:0x008a, B:44:0x00ac, B:18:0x0040, B:54:0x00b8, B:60:0x00e4, B:59:0x00c2), top: B:76:0x0003, inners: #2, #6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized java.lang.ClassLoader G() {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zz.f.G():java.lang.ClassLoader");
    }

    public static final void a(int i11, int i12, int i13, t tVar, n nVar) {
        t tVar2;
        int i14;
        s sVar;
        t tVar3;
        s sVar2 = (s) nVar;
        sVar2.c0(2066507561);
        int i15 = i13 & 1;
        if (i15 != 0) {
            i14 = i12 | 6;
            tVar2 = tVar;
        } else if ((i12 & 6) == 0) {
            tVar2 = tVar;
            i14 = i12 | (sVar2.f(tVar2) ? 4 : 2);
        } else {
            tVar2 = tVar;
            i14 = i12;
        }
        int i16 = i14 | (sVar2.d(i11) ? 32 : 16);
        if (sVar2.R(i16 & 1, (i16 & 19) != 18)) {
            tVar3 = i15 != 0 ? q.f5711a : tVar2;
            float f11 = 2;
            float f12 = 6;
            t tVarC = d2.c.C(v1.n.j(f4.g.b(tVar3, l2.g.b(14)), lv.s.f28229i, g0.f23254b), f12, f11, f12, f11);
            u0 u0VarD = p.d(b4.d.f5687e, false);
            int iHashCode = Long.hashCode(sVar2.T);
            u3.i iVarL = sVar2.l();
            t tVarC2 = b4.a.c(tVarC, sVar2);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(hVar);
            } else {
                sVar2.n0();
            }
            m3.i.C(u0VarD, b5.i.f5843f, sVar2);
            m3.i.C(iVarL, b5.i.f5842e, sVar2);
            m3.i.v(sVar2, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar2, b5.i.f5845h);
            m3.i.C(tVarC2, b5.i.f5841d, sVar2);
            r9.d(f0.G(R.plurals.charity_item_donation_inventory_items, i11, new Object[]{Integer.valueOf(i11)}, sVar2), null, lv.s.f28217b, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, v.f28273m, sVar2, MLKEMEngine.KyberPolyBytes, 12607872, 110586);
            sVar = sVar2;
            sVar.q(true);
        } else {
            sVar = sVar2;
            sVar.U();
            tVar3 = tVar2;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new ii.k(tVar3, i11, i12, i13, 1);
        }
    }

    public static final void b(t tVar, String str, String str2, String str3, String str4, String str5, CharityPlanCollectorType charityPlanCollectorType, Function0 function0, n nVar, int i11) {
        CharityPlanCollectorType charityPlanCollectorType2;
        str.getClass();
        str2.getClass();
        str4.getClass();
        str5.getClass();
        charityPlanCollectorType.getClass();
        function0.getClass();
        s sVar = (s) nVar;
        sVar.c0(265898937);
        int i12 = i11 | (sVar.f(str) ? 32 : 16) | (sVar.f(str2) ? 256 : 128) | (sVar.f(str3) ? NewHope.SENDB_BYTES : 1024) | (sVar.f(str4) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192) | (sVar.f(str5) ? 131072 : 65536) | (sVar.d(charityPlanCollectorType.ordinal()) ? 1048576 : 524288) | (sVar.h(function0) ? 8388608 : 4194304);
        if (sVar.R(i12 & 1, (4793491 & i12) != 4793490)) {
            t tVarJ = d2.j(b4.a.a(d2.c.B(tVar, 16, 0.0f, 2), m2.f7291a, new on.l(3, function0)), "PlanStoreRow");
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5693k, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarJ, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
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
            q qVar = q.f5711a;
            r9.d(r8.k.m(str, " -\n", str2), d2.j(d2.m2.t(d2.m2.q(qVar, 58), 3), "PlanStoreTime"), lv.s.C, 0L, null, 0L, null, new x5.k(5), 0L, 0, false, 0, 0, null, v.f28277q, sVar, 432, 12582912, 130040);
            sVar = sVar;
            charityPlanCollectorType2 = charityPlanCollectorType;
            s0.b(d2.m2.t(d2.m2.d(qVar, 1.0f), 3), l2.g.b(12), s0.p(lv.s.J, sVar, 6), s0.q(2, 0.0f, 0.0f, 0.0f, 62), null, u3.e.e(-1383772637, sVar, new x(str3, str4, str5, charityPlanCollectorType2)), sVar, 196614, 16);
            sVar.q(true);
        } else {
            charityPlanCollectorType2 = charityPlanCollectorType;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new gn.j(tVar, str, str2, str3, str4, str5, charityPlanCollectorType2, function0, i11);
        }
    }

    public static final void c(BasicItem basicItem, long j9, float f11, n nVar, int i11) {
        s sVar;
        s sVar2;
        u uVar;
        float f12 = f11;
        basicItem.getClass();
        s sVar3 = (s) nVar;
        sVar3.c0(-2019823324);
        int i12 = i11 | (sVar3.h(basicItem) ? 4 : 2) | (sVar3.e(j9) ? 32 : 16) | (sVar3.c(f12) ? 256 : 128);
        if (sVar3.R(i12 & 1, (i12 & 147) != 146)) {
            b4.k kVar = b4.d.f5683a;
            u0 u0VarD = p.d(kVar, false);
            int iHashCode = Long.hashCode(sVar3.T);
            u3.i iVarL = sVar3.l();
            q qVar = q.f5711a;
            t tVarC = b4.a.c(qVar, sVar3);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar3.e0();
            if (sVar3.S) {
                sVar3.k(hVar);
            } else {
                sVar3.n0();
            }
            m3.i.C(u0VarD, b5.i.f5843f, sVar3);
            m3.i.C(iVarL, b5.i.f5842e, sVar3);
            m3.i.v(sVar3, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar3, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar3);
            t tVarE = d2.m2.e(d2.m2.d(qVar, 1.0f), 160);
            float f13 = lv.t.f28249c;
            t tVarB = f4.g.b(d2.c.D(tVarE, f13, f13, f13, 0.0f, 8), l2.g.b(8));
            int i13 = i12 << 3;
            int i14 = (i12 & 896) | (i13 & 112);
            z20.b.c(tVarB, basicItem, f12, sVar3, i14);
            List<ItemTagInfo> itemTags = basicItem.getItemTags();
            u uVar2 = u.f13938a;
            if (itemTags == null || itemTags.isEmpty()) {
                sVar2 = sVar3;
                uVar = uVar2;
                sVar2.a0(-1080656988);
                sVar2.q(false);
            } else {
                sVar3.a0(-1080911653);
                float f14 = 12;
                t tVarV = d2.c.v(b4.a.d(uVar2.a(qVar, kVar), 1.0f), f14, f14);
                List<ItemTagInfo> itemTags2 = basicItem.getItemTags();
                if (itemTags2 == null) {
                    itemTags2 = kotlin.collections.n0.f26529a;
                }
                sVar2 = sVar3;
                uVar = uVar2;
                bg.m.d(tVarV, itemTags2, null, sVar2, 0, 4);
                sVar2.q(false);
            }
            AverageItemRating averageItemRating = basicItem.getInformation().getAverageItemRating();
            String displayValue = averageItemRating != null ? averageItemRating.getDisplayValue() : null;
            if (displayValue == null) {
                displayValue = "";
            }
            s sVar4 = sVar2;
            dx.f.d(d2.c.v(b4.a.d(uVar.a(qVar, b4.d.f5685c), 1.0f), -12, 12), displayValue, j9, f12, sVar4, i13 & 8064);
            f12 = f12;
            sVar = sVar4;
            h0.g.m(d2.c.D(uVar.a(qVar, b4.d.f5689g), lv.t.f28252f, 0.0f, 0.0f, lv.t.f28251e, 6), basicItem, f12, sVar, i14);
            sVar.q(true);
        } else {
            sVar = sVar3;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new fg.d(basicItem, j9, f12, i11);
        }
    }

    public static final void d(t tVar, String str, boolean z11, boolean z12, is.c cVar, n nVar, int i11) {
        String str2;
        s sVar;
        t tVar2;
        str.getClass();
        s sVar2 = (s) nVar;
        sVar2.c0(1364859739);
        int i12 = i11 | 6;
        if ((i11 & 48) == 0) {
            str2 = str;
            i12 |= sVar2.f(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar2.g(z11) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar2.g(z12) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar2.h(cVar) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        }
        if (sVar2.R(i12 & 1, (i12 & 9363) != 9362)) {
            Object objM = sVar2.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = m3.i.w(new i4.v(lv.s.J));
                sVar2.k0(objM);
            }
            b1 b1Var = (b1) objM;
            Object objM2 = sVar2.M();
            if (objM2 == fVar) {
                objM2 = m3.i.w(new i4.v(lv.s.f28217b));
                sVar2.k0(objM2);
            }
            b1 b1Var2 = (b1) objM2;
            if (z11 && z12) {
                b1Var.setValue(new i4.v(lv.s.f28217b));
                b1Var2.setValue(new i4.v(lv.s.J));
            } else {
                b1Var.setValue(new i4.v(lv.s.J));
                b1Var2.setValue(new i4.v(lv.s.f28217b));
            }
            q qVar = q.f5711a;
            t tVarN = d2.m2.n(qVar, 43, 48);
            long j9 = ((i4.v) b1Var.getValue()).f23317a;
            float f11 = 4;
            t tVarA = b4.a.a(v1.n.k(v1.n.j(tVarN, j9, l2.g.b(f11)), 1, lv.s.f28217b, l2.g.b(f11)), m2.f7291a, new is.b(z11, cVar, z12));
            u0 u0VarD = p.d(b4.d.f5687e, false);
            int iHashCode = Long.hashCode(sVar2.T);
            u3.i iVarL = sVar2.l();
            t tVarC = b4.a.c(tVarA, sVar2);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(hVar);
            } else {
                sVar2.n0();
            }
            m3.i.C(u0VarD, b5.i.f5843f, sVar2);
            m3.i.C(iVarL, b5.i.f5842e, sVar2);
            m3.i.v(sVar2, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar2, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar2);
            r9.d(str2, null, ((i4.v) b1Var2.getValue()).f23317a, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28276p, sVar2, (i12 >> 3) & 14, 12582912, 131066);
            sVar = sVar2;
            sVar.q(true);
            tVar2 = qVar;
        } else {
            sVar = sVar2;
            sVar.U();
            tVar2 = tVar;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new p5(tVar2, str, z11, z12, cVar, i11);
        }
    }

    public static final long e(float f11, float f12) {
        return (((long) Float.floatToRawIntBits(f12)) & 4294967295L) | (Float.floatToRawIntBits(f11) << 32);
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x032c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(int r29, bp.v r30, ap.n r31, m3.n r32, int r33) {
        /*
            Method dump skipped, instruction units count: 853
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zz.f.f(int, bp.v, ap.n, m3.n, int):void");
    }

    public static final void g(String str, boolean z11, Function0 function0, n nVar, int i11) {
        str.getClass();
        function0.getClass();
        s sVar = (s) nVar;
        sVar.c0(-1677338855);
        int i12 = (sVar.f(str) ? 4 : 2) | i11 | (sVar.g(z11) ? 32 : 16) | (sVar.h(function0) ? 256 : 128);
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            d3 d3Var = x1.f7416h;
            m3.i.a(b3.i.t(((z5.c) sVar.j(d3Var)).a(), 1.0f, d3Var), u3.e.e(1915427801, sVar, new kq.a(str, function0, z11)), sVar, 56);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new kq.a(str, z11, function0, i11);
        }
    }

    public static final void h(List list, String str, Function1 function1, t tVar, n nVar, int i11) {
        t tVar2;
        list.getClass();
        function1.getClass();
        s sVar = (s) nVar;
        sVar.c0(-1160304445);
        int i12 = i11 | (sVar.h(list) ? 4 : 2) | (sVar.f(str) ? 32 : 16) | (sVar.h(function1) ? 256 : 128) | 3072;
        if (sVar.R(i12 & 1, (i12 & 1171) != 1170)) {
            q qVar = q.f5711a;
            t tVarD = d2.m2.d(qVar, 1.0f);
            y yVarA = w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarD, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
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
            sVar.a0(-1573494791);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                SortingOption sortingOption = (SortingOption) it.next();
                String name = sortingOption.getName();
                boolean zAreEqual = Intrinsics.areEqual(sortingOption.getId(), str);
                boolean zF = ((i12 & 896) == 256) | sVar.f(sortingOption);
                Object objM = sVar.M();
                if (zF || objM == m3.m.f29332a) {
                    objM = new i2.e(11, function1, sortingOption);
                    sVar.k0(objM);
                }
                i(0, null, name, (Function0) objM, sVar, zAreEqual);
            }
            sVar.q(false);
            sVar.q(true);
            tVar2 = qVar;
        } else {
            sVar.U();
            tVar2 = tVar;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.p(list, str, i11, function1, tVar2, 21);
        }
    }

    public static final void i(int i11, t tVar, String str, Function0 function0, n nVar, boolean z11) {
        t tVar2;
        s sVar = (s) nVar;
        sVar.c0(1588422315);
        int i12 = i11 | (sVar.f(str) ? 4 : 2) | (sVar.g(z11) ? 32 : 16) | (sVar.h(function0) ? 256 : 128) | 3072;
        if (sVar.R(i12 & 1, (i12 & 1171) != 1170)) {
            x60.j jVar = (x60.j) sVar.j(PantryThemeKt.getLocalPantryTypography());
            x60.m mVar = (x60.m) sVar.j(PantryThemeKt.getLocalPantrySpacing());
            q qVar = q.f5711a;
            t tVarC = androidx.compose.foundation.b.c(d2.c.B(d2.m2.d(qVar, 1.0f), 0.0f, mVar.l, 1), false, null, null, function0, 15);
            i2 i2VarA = h2.a(d2.i.f13807g, b4.d.f5693k, sVar, 54);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC2 = b4.a.c(tVarC, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
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
            m3.i.C(tVarC2, b5.i.f5841d, sVar);
            r9.d(str, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar.f43966p, sVar, i12 & 14, 0, 131070);
            sVar = sVar;
            PantryRadioButtonKt.PantryRadioButton(z11, function0, null, false, sVar, (i12 >> 3) & 126, 12);
            sVar.q(true);
            tVar2 = qVar;
        } else {
            sVar.U();
            tVar2 = tVar;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new cp.h(str, z11, function0, tVar2, i11, 2);
        }
    }

    public static final int j(c3 c3Var) {
        return ((Number) c3Var.getValue()).intValue();
    }

    public static final void k(ax.g0 g0Var, String str, String str2) {
        str.getClass();
        str2.getClass();
        ArrayList arrayList = g0Var.f4909a;
        arrayList.add(str);
        arrayList.add(StringsKt.e0(str2).toString());
    }

    public static final void l(c0 c0Var, KClass kClass, o0 o0Var, List list, nv.a aVar, d0 d0Var, d0 d0Var2, nv.a aVar2, u3.d dVar) {
        g9.u0 u0Var = c0Var.f20108g;
        u0Var.getClass();
        i9.j jVar = new i9.j((i9.i) u0Var.b(t(i9.i.class)), kClass, o0Var, dVar);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            g9.v vVar = (g9.v) it.next();
            vVar.getClass();
            ((ArrayList) jVar.f20102f).add(vVar);
        }
        jVar.f23518i = aVar;
        jVar.f23519j = d0Var;
        jVar.f23520k = d0Var2;
        jVar.l = aVar2;
        c0Var.f20111j.add(jVar.a());
    }

    public static void m(c0 c0Var, String str, u3.d dVar) {
        kotlin.collections.n0 n0Var = kotlin.collections.n0.f26529a;
        g9.u0 u0Var = c0Var.f20108g;
        u0Var.getClass();
        i9.j jVar = new i9.j((i9.i) u0Var.b(t(i9.i.class)), str, dVar);
        n0Var.getClass();
        m0 m0Var = m0.f26528a;
        m0Var.getClass();
        n0Var.getClass();
        m0Var.getClass();
        jVar.f23518i = null;
        jVar.f23519j = null;
        jVar.f23520k = null;
        jVar.l = null;
        c0Var.f20111j.add(jVar.a());
    }

    public static Bitmap n(n0 n0Var) {
        int format = n0Var.getFormat();
        if (format == 1) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(n0Var.b(), n0Var.getHeight(), Bitmap.Config.ARGB_8888);
            n0Var.o()[0].f().rewind();
            ImageProcessingUtil.e(bitmapCreateBitmap, n0Var.o()[0].f(), n0Var.o()[0].k());
            return bitmapCreateBitmap;
        }
        if (format == 35) {
            return ImageProcessingUtil.b(n0Var);
        }
        if (format != 256 && format != 4101) {
            a40.d0.f(", only ImageFormat.YUV_420_888 and PixelFormat.RGBA_8888 are supported", n0Var.getFormat(), "Incorrect image format of the input image proxy: ");
            return null;
        }
        if (!w(n0Var.getFormat())) {
            o.l(n0Var.getFormat(), "Incorrect image format of the input image proxy: ");
            return null;
        }
        ByteBuffer byteBufferF = n0Var.o()[0].f();
        int iCapacity = byteBufferF.capacity();
        byte[] bArr = new byte[iCapacity];
        byteBufferF.rewind();
        byteBufferF.get(bArr);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, iCapacity, null);
        if (bitmapDecodeByteArray != null) {
            return bitmapDecodeByteArray;
        }
        com.braze.h2.a("Decode jpeg byte array failed");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static AnimatorSet o(u10.g gVar, float f11, float f12, float f13) {
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(gVar, u10.d.f40630a, u10.c.f40628b, new u10.f(f11, f12, f13));
        u10.f revealInfo = gVar.getRevealInfo();
        if (revealInfo == null) {
            com.braze.h2.b("Caller must set a non-null RevealInfo before calling this.");
            return null;
        }
        Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal((View) gVar, (int) f11, (int) f12, revealInfo.f40634c, f13);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfObject, animatorCreateCircularReveal);
        return animatorSet;
    }

    public static void p(File file) throws IOException {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (parentFile.isDirectory()) {
            return;
        }
        i4.a.l(file, "Unable to create parent directories of ");
    }

    public static o70.g q(ComponentActivity componentActivity, ViewModelProvider$Factory viewModelProvider$Factory) {
        ag.b bVar = (ag.b) ((o70.a) x0.q(o70.a.class, componentActivity));
        s70.b bVarA = bVar.a();
        a8.h hVar = new a8.h(bVar.f1288a, bVar.f1289b);
        viewModelProvider$Factory.getClass();
        return new o70.g(bVarA, viewModelProvider$Factory, hVar);
    }

    public static final int r(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (Exception unused) {
                int height = bitmap.getHeight() * bitmap.getWidth();
                Bitmap.Config config = bitmap.getConfig();
                return height * (config == Bitmap.Config.ALPHA_8 ? 1 : (config == Bitmap.Config.RGB_565 || config == Bitmap.Config.ARGB_4444) ? 2 : config == Bitmap.Config.RGBA_F16 ? 8 : 4);
            }
        }
        StringBuilder sb2 = new StringBuilder("Cannot obtain size for recycled bitmap: ");
        sb2.append(bitmap);
        int width = bitmap.getWidth();
        int height2 = bitmap.getHeight();
        Bitmap.Config config2 = bitmap.getConfig();
        sb2.append(" [");
        sb2.append(width);
        sb2.append(" x ");
        sb2.append(height2);
        sb2.append("] + ");
        sb2.append(config2);
        throw new IllegalStateException(sb2.toString().toString());
    }

    public static o70.g s(Fragment fragment, ViewModelProvider$Factory viewModelProvider$Factory) {
        ag.b bVar = ((ag.e) ((o70.b) x0.q(o70.b.class, fragment))).f1299b;
        s70.b bVarA = bVar.a();
        a8.h hVar = new a8.h(bVar.f1288a, bVar.f1289b);
        viewModelProvider$Factory.getClass();
        return new o70.g(bVarA, viewModelProvider$Factory, hVar);
    }

    public static String t(Class cls) {
        LinkedHashMap linkedHashMap = g9.u0.f20222b;
        String strValue = (String) linkedHashMap.get(cls);
        if (strValue == null) {
            g9.s0 s0Var = (g9.s0) cls.getAnnotation(g9.s0.class);
            strValue = s0Var != null ? s0Var.value() : null;
            if (strValue == null || strValue.length() <= 0) {
                i4.a.i("No @Navigator.Name annotation found for ".concat(cls.getSimpleName()));
                return null;
            }
            linkedHashMap.put(cls, strValue);
        }
        strValue.getClass();
        return strValue;
    }

    public static final void u(String str) {
        str.getClass();
        if (str.length() <= 0) {
            i4.a.f("name is empty");
            return;
        }
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str.charAt(i11);
            if ('!' > cCharAt || cCharAt >= 127) {
                StringBuilder sb2 = new StringBuilder("Unexpected char 0x");
                String string = Integer.toString(cCharAt, CharsKt.checkRadix(16));
                string.getClass();
                if (string.length() < 2) {
                    string = "0".concat(string);
                }
                sb2.append(string);
                sb2.append(" at ");
                sb2.append(i11);
                sb2.append(" in header name: ");
                sb2.append(str);
                throw new IllegalArgumentException(sb2.toString().toString());
            }
        }
    }

    public static final void v(String str, String str2) {
        str.getClass();
        str2.getClass();
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                StringBuilder sb2 = new StringBuilder("Unexpected char 0x");
                String string = Integer.toString(cCharAt, CharsKt.checkRadix(16));
                string.getClass();
                if (string.length() < 2) {
                    string = "0".concat(string);
                }
                sb2.append(string);
                sb2.append(" at ");
                sb2.append(i11);
                sb2.append(" in ");
                sb2.append(str2);
                sb2.append(" value");
                qc.y.k(sb2, r90.e.m(str2) ? "" : ": ".concat(str));
                return;
            }
        }
    }

    public static boolean w(int i11) {
        return i11 == 256 || i11 == 4101;
    }

    public static boolean x() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Samsung")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("Samsung")) {
                return false;
            }
        }
        LinkedHashMap linkedHashMap = ExtraCroppingQuirk.f2183a;
        String str3 = Build.MODEL;
        str3.getClass();
        Locale locale = Locale.ROOT;
        String upperCase = str3.toUpperCase(locale);
        upperCase.getClass();
        if (!linkedHashMap.containsKey(upperCase)) {
            return false;
        }
        String upperCase2 = str3.toUpperCase(locale);
        upperCase2.getClass();
        Range range = (Range) linkedHashMap.get(upperCase2);
        if (range != null) {
            return range.contains(Integer.valueOf(Build.VERSION.SDK_INT));
        }
        return true;
    }

    public static dv.d y(f70.i iVar) {
        iVar.getClass();
        switch (cv.j.$EnumSwitchMapping$0[iVar.ordinal()]) {
            case 1:
                return dv.d.BASKET_RECOMMENDATION;
            case 2:
                return dv.d.BROWSE;
            case 3:
                return dv.d.CELEBRATION_SCREEN;
            case 4:
                return dv.d.DEEP_LINK;
            case 5:
                return dv.d.DISCOVER;
            case 6:
                return dv.d.DISCOVER_CARD;
            case 7:
                return dv.d.FAVORITE_BUCKET;
            case 8:
                return dv.d.HERO_COMPONENT;
            case 9:
                return dv.d.INVITATION_ACCEPTED;
            case 10:
                return dv.d.MANAGE_ACCOUNT;
            case 11:
                return dv.d.MANUFACTURER;
            case 12:
                return dv.d.MANUFACTURE_DISABLE;
            case 13:
                return dv.d.MANUFACTURER_BUCKET;
            case 14:
                return dv.d.MYSTORE_MORE;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return dv.d.MYSTORE_SIGNUP;
            case 16:
                return dv.d.NAVIGATION;
            case 17:
                return dv.d.ONBOARDING;
            case 18:
                return dv.d.ORDER_BANNER;
            case 19:
                return dv.d.ORDER_BLOB;
            case 20:
                return dv.d.ORDER_CHANGED_POPUP;
            case 21:
                return dv.d.ORDER_LIST;
            case 22:
                return dv.d.ORDER_POPUP;
            case 23:
                return dv.d.POST_PURCHASE;
            case 24:
                return dv.d.PROFILE;
            case 25:
                return dv.d.SCREEN_BASKET;
            case 26:
                return dv.d.SCREEN_BROWSE_LIST;
            case 27:
                return dv.d.SCREEN_BROWSE_MAP;
            case 28:
                return dv.d.SCREEN_DISCOVER_BUCKET;
            case 29:
                return dv.d.SCREEN_DELIVERY;
            case 30:
                return dv.d.SCREEN_DISCOVER;
            case BERTags.DATE /* 31 */:
                return dv.d.SCREEN_FAVORITES;
            case 32:
                return dv.d.SCREEN_STORE;
            case 33:
                return dv.d.SOLD_OUT;
            case BERTags.DURATION /* 34 */:
                return dv.d.SPLASH;
            case BERTags.OBJECT_IDENTIFIER_IRI /* 35 */:
                return dv.d.STCB_RECOMMENDATION;
            case 36:
                return dv.d.STORE;
            case 37:
                return dv.d.STORE_CANCELLED_POPUP;
            case 38:
                return dv.d.UNKNOWN;
            case 39:
                return dv.d.WIDGET;
            case 40:
                return dv.d.WOB_RECOMMENDATION;
            default:
                e40.a.f();
                return null;
        }
    }

    public static void z(c0 c0Var, Object obj, KClass kClass, Function1 function1) {
        o0 o0Var = o0.f26530a;
        o0Var.getClass();
        kotlin.collections.n0 n0Var = kotlin.collections.n0.f26529a;
        c0 c0Var2 = new c0(c0Var.f20108g, obj, kClass, o0Var);
        function1.invoke(c0Var2);
        b0 b0VarI = c0Var2.i();
        n0Var.getClass();
        m0.f26528a.getClass();
        if (b0VarI instanceof i9.f) {
            i9.f fVar = (i9.f) b0VarI;
            fVar.f23507i = null;
            fVar.f23508j = null;
            fVar.f23509k = null;
            fVar.l = null;
        }
        c0Var.f20111j.add(b0VarI);
    }
}
