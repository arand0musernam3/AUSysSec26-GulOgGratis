package nx;

import a3.u2;
import android.app.Activity;
import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.view.Window;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;
import androidx.credentials.exceptions.GetCredentialCustomException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.publickeycredential.GetPublicKeyCredentialDomException;
import androidx.credentials.internal.FrameworkClassParsingException;
import androidx.datastore.core.DirectBootUsageException;
import b4.q;
import b4.t;
import c5.x1;
import com.adyen.checkout.components.core.Address;
import com.adyen.checkout.components.core.PaymentMethodTypes;
import com.app.tgtg.R;
import com.app.tgtg.model.local.BasketManager;
import com.app.tgtg.model.remote.item.ItemTagInfo;
import com.app.tgtg.model.remote.item.Picture;
import com.app.tgtg.model.remote.item.response.BaseItemMnuV2;
import com.app.tgtg.model.remote.item.response.IntroBanner;
import com.app.tgtg.model.remote.manufacturer.response.Brand;
import com.app.tgtg.model.remote.manufacturer.response.GetRecommendedManufacturerItemsResponse;
import com.app.tgtg.model.remote.manufacturer.response.ManufacturerItemProperties;
import com.tgtg.componentlibrary.component.badgelabel.variant.AccentPantryBadgeLabelKt;
import com.tgtg.componentlibrary.theme.PantryThemeKt;
import d2.b2;
import d2.h2;
import d2.i2;
import d2.m2;
import d2.n1;
import d2.p;
import d2.u;
import d2.x;
import d2.y;
import f2.c0;
import f2.e0;
import g3.r9;
import g3.s5;
import gd.o;
import i4.g0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.SortedSet;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lv.v;
import m0.b0;
import m3.d3;
import m3.s;
import m3.v1;
import m3.w1;
import o00.x0;
import o30.f0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import q5.r;
import t1.w;
import w.a0;
import ym.z;
import z4.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f31425a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f31426b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f31427c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f31428d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f31429e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f31430f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f31431g = 0;

    public static String A(String str, Object... objArr) {
        int iIndexOf;
        String string;
        int i11 = 0;
        for (int i12 = 0; i12 < objArr.length; i12++) {
            Object obj = objArr[i12];
            if (obj == null) {
                string = Address.ADDRESS_NULL_PLACEHOLDER;
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e5) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for ".concat(str2), (Throwable) e5);
                    StringBuilder sbS = e0.f.s("<", str2, " threw ");
                    sbS.append(e5.getClass().getName());
                    sbS.append(">");
                    string = sbS.toString();
                }
            }
            objArr[i12] = string;
        }
        StringBuilder sb2 = new StringBuilder((objArr.length * 16) + str.length());
        int i13 = 0;
        while (i11 < objArr.length && (iIndexOf = str.indexOf("%s", i13)) != -1) {
            sb2.append((CharSequence) str, i13, iIndexOf);
            sb2.append(objArr[i11]);
            i13 = iIndexOf + 2;
            i11++;
        }
        sb2.append((CharSequence) str, i13, str.length());
        if (i11 < objArr.length) {
            sb2.append(" [");
            sb2.append(objArr[i11]);
            for (int i14 = i11 + 1; i14 < objArr.length; i14++) {
                sb2.append(", ");
                sb2.append(objArr[i14]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    public static MappedByteBuffer C(Context context, Uri uri) {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        try {
            parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
        } catch (IOException unused) {
        }
        if (parcelFileDescriptorOpenFileDescriptor == null) {
            if (parcelFileDescriptorOpenFileDescriptor != null) {
                parcelFileDescriptorOpenFileDescriptor.close();
                return null;
            }
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                parcelFileDescriptorOpenFileDescriptor.close();
                return map;
            } finally {
            }
        } finally {
        }
    }

    public static Uri D(File file, b0 b0Var) {
        try {
            try {
                b0Var.getClass();
                return m(file, (File) b0Var.f28471b);
            } catch (IOException unused) {
                throw new ImageCaptureException(1, "Failed to write to OutputStream.", null);
            }
        } finally {
            file.delete();
        }
    }

    public static final boolean E(Pair pair) {
        if (Intrinsics.areEqual(pair.f26485a, "processor")) {
            CharSequence charSequence = (CharSequence) pair.f26486b;
            for (int i11 = 0; i11 < charSequence.length(); i11++) {
                if (Character.isDigit(charSequence.charAt(i11))) {
                }
            }
            return true;
        }
        return false;
    }

    public static final Exception F(String str, FileNotFoundException fileNotFoundException) {
        int i11;
        boolean zAreEqual = false;
        try {
            Method method = Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class);
            method.getClass();
            try {
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.getClass();
                Process.myUserHandle().writeToParcel(parcelObtain, 0);
                parcelObtain.setDataPosition(0);
                i11 = parcelObtain.readInt();
            } catch (Throwable unused) {
                Log.d("DirectBootExceptionUtil", "Error when reading current user id. Selected default user id `0`.");
                i11 = 0;
            }
            Object objInvoke = method.invoke(null, "sys.user." + i11 + ".ce_available", "false");
            objInvoke.getClass();
            zAreEqual = Intrinsics.areEqual((String) objInvoke, "true");
        } catch (Throwable th2) {
            u70.e.a(fileNotFoundException, th2);
        }
        if (zAreEqual || str == null) {
            return fileNotFoundException;
        }
        File file = new File(str, "siblingTestFile.txt");
        if (file.exists()) {
            file.delete();
        }
        try {
            file.createNewFile();
            return fileNotFoundException;
        } catch (IOException unused2) {
            return new DirectBootUsageException(fileNotFoundException);
        } finally {
            file.delete();
        }
    }

    public static final void a(Brand brand, t tVar, m3.n nVar, int i11) {
        tVar.getClass();
        s sVar = (s) nVar;
        sVar.c0(-1522938199);
        int i12 = i11 | (sVar.h(brand) ? 4 : 2);
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(tVar) ? 32 : 16;
        }
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5693k, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            q qVar = q.f5711a;
            t tVarC = b4.a.c(qVar, sVar);
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
            Picture brandLogo = brand.getBrandLogo();
            String currentUrl = brandLogo != null ? brandLogo.getCurrentUrl() : null;
            if (currentUrl == null) {
                sVar.a0(-42663780);
                sVar.q(false);
            } else {
                sVar.a0(-42663779);
                t tVarM = m2.m(qVar, 32);
                l2.f fVar = l2.g.f26790a;
                o.a(currentUrl, null, s1.b0.a(v1.n.k(f4.g.b(tVarM, fVar), 1, lv.s.H, fVar), t1.c.k(300, 0, w.f39594b, 2), 2), z4.l.f47166a, sVar, 1572912, 0, 1976);
                sVar.q(false);
            }
            float f11 = lv.t.f28248b;
            d2.c.f(m2.m(qVar, f11), sVar);
            String brandName = brand.getBrandName();
            if (brandName == null) {
                brandName = "";
            }
            r9.d(brandName, tVar, lv.s.C, 0L, null, 0L, null, null, 0L, 0, false, 2, 0, null, v.f28277q, sVar, (i12 & 112) | MLKEMEngine.KyberPolyBytes, 12607488, 114680);
            sVar = sVar;
            b3.i.y(qVar, f11, sVar, true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new ug.i(brand, tVar, i11, 15);
        }
    }

    public static final void b(IntroBanner introBanner, Function0 function0, m3.n nVar, int i11) {
        q qVar;
        float f11;
        x60.h hVar;
        b5.g gVar;
        b5.g gVar2;
        b5.g gVar3;
        b5.d dVar;
        boolean z11;
        function0.getClass();
        s sVar = (s) nVar;
        sVar.c0(422535270);
        int i12 = i11 | (sVar.f(introBanner) ? 4 : 2) | (sVar.h(function0) ? 32 : 16);
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            x60.h hVar2 = (x60.h) sVar.j(PantryThemeKt.getLocalPantryColor());
            x60.m mVar = (x60.m) sVar.j(PantryThemeKt.getLocalPantrySpacing());
            q qVar2 = q.f5711a;
            t tVarD = m2.d(qVar2, 1.0f);
            float f12 = mVar.f44015k;
            float f13 = mVar.l;
            t tVarJ = v1.n.j(d2.c.A(tVarD, f12, f13), lv.s.K, g0.f23254b);
            u0 u0VarD = p.d(b4.d.f5683a, false);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarJ, sVar);
            b5.j.R.getClass();
            b5.h hVar3 = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar3);
            } else {
                sVar.n0();
            }
            b5.g gVar4 = b5.i.f5843f;
            m3.i.C(u0VarD, gVar4, sVar);
            b5.g gVar5 = b5.i.f5842e;
            m3.i.C(iVarL, gVar5, sVar);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b5.g gVar6 = b5.i.f5844g;
            m3.i.v(sVar, numValueOf, gVar6);
            b5.d dVar2 = b5.i.f5845h;
            m3.i.z(sVar, dVar2);
            b5.g gVar7 = b5.i.f5841d;
            m3.i.C(tVarC, gVar7, sVar);
            t tVarB = f4.g.b(d2.c.z(f4.g.h(m2.d(qVar2, 1.0f), x0.z(R.drawable.rounded_border_bg_green, sVar, 0), null, z4.l.f47172g, 0.0f, null, 54), mVar.f44015k), l2.g.b(12));
            y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            t tVarC2 = b4.a.c(tVarB, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar3);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA, gVar4, sVar);
            m3.i.C(iVarL2, gVar5, sVar);
            a0.y(iHashCode2, sVar, gVar6, sVar, dVar2);
            m3.i.C(tVarC2, gVar7, sVar);
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5692j, sVar, 0);
            int iHashCode3 = Long.hashCode(sVar.T);
            u3.i iVarL3 = sVar.l();
            t tVarC3 = b4.a.c(qVar2, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar3);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA, gVar4, sVar);
            m3.i.C(iVarL3, gVar5, sVar);
            a0.y(iHashCode3, sVar, gVar6, sVar, dVar2);
            m3.i.C(tVarC3, gVar7, sVar);
            String label = introBanner.getLabel();
            if (label == null) {
                sVar.a0(-2084839735);
                sVar.q(false);
                qVar = qVar2;
                f11 = f13;
                hVar = hVar2;
                gVar2 = gVar5;
                gVar = gVar6;
                gVar3 = gVar7;
                dVar = dVar2;
            } else {
                sVar.a0(-2084839734);
                qVar = qVar2;
                f11 = f13;
                hVar = hVar2;
                gVar = gVar6;
                gVar2 = gVar5;
                gVar3 = gVar7;
                dVar = dVar2;
                AccentPantryBadgeLabelKt.SmallAccentPantryBadgeLabel(label, null, null, null, null, sVar, 0, 30);
                sVar = sVar;
                sVar.q(false);
            }
            t tVarM = m2.m(qVar, f11);
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            d2.c.f(tVarM.then(new n1(1.0f, true)), sVar);
            b4.k kVar = b4.d.f5687e;
            t tVarZ = d2.c.z(f4.g.b(qVar, l2.g.f26790a), mVar.f44016m);
            bm.f fVar = new bm.f(3, function0);
            c5.s sVar2 = c5.m2.f7291a;
            t tVarA = b4.a.a(tVarZ, sVar2, fVar);
            u0 u0VarD2 = p.d(kVar, false);
            int iHashCode4 = Long.hashCode(sVar.T);
            u3.i iVarL4 = sVar.l();
            t tVarC4 = b4.a.c(tVarA, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar3);
            } else {
                sVar.n0();
            }
            m3.i.C(u0VarD2, gVar4, sVar);
            m3.i.C(iVarL4, gVar2, sVar);
            a0.y(iHashCode4, sVar, gVar, sVar, dVar);
            m3.i.C(tVarC4, gVar3, sVar);
            t tVarA2 = b4.a.a(m2.m(qVar, 24), sVar2, new bm.f(4, function0));
            q qVar3 = qVar;
            s sVar3 = sVar;
            v1.n.d(x0.z(R.drawable.ic_close24, sVar, 0), f0.U(sVar, R.string.voice_over_close), tVarA2, null, null, 0.0f, new i4.o(hVar.J, 5), sVar3, 8, 56);
            sVar3.q(true);
            sVar3.q(true);
            String title = introBanner.getTitle();
            if (title == null) {
                z11 = false;
                title = b3.i.j(-1639130086, R.string.mnu_basket_intro_title, sVar3, sVar3, false);
            } else {
                z11 = false;
                sVar3.a0(85671579);
                sVar3.q(false);
            }
            boolean z12 = z11;
            long j9 = lv.s.C;
            r9.d(title, null, j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28265d, sVar3, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
            d2.c.f(m2.m(qVar3, f11), sVar3);
            String text = introBanner.getText();
            if (text == null) {
                text = b3.i.j(-1638802757, R.string.mnu_basket_intro_body, sVar3, sVar3, z12);
            } else {
                sVar3.a0(85682169);
                sVar3.q(z12);
            }
            r9.d(text, null, j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28274n, sVar3, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
            sVar = sVar3;
            String imageUrl = introBanner.getImageUrl();
            if (imageUrl == null) {
                sVar.a0(-1638568305);
                sVar.q(z12);
            } else {
                r8.k.t(f11, -1638568304, qVar3, sVar, sVar);
                o.a(imageUrl, null, f4.g.b(m2.d(m2.e(qVar3, 141), 1.0f), l2.g.b(8)), z4.l.f47166a, sVar, 1572912, 0, 1976);
                sVar.q(z12);
            }
            sVar.q(true);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new u2(introBanner, function0, i11, 6);
        }
    }

    public static q5.a0 c(int i11, r rVar, int i12) {
        return new q5.a0(i11, rVar, (i12 & 4) != 0 ? 0 : 1, new q5.q(new q5.p[0]));
    }

    public static final void d(final BaseItemMnuV2 baseItemMnuV2, final float f11, m3.n nVar, final int i11) {
        s sVar;
        baseItemMnuV2.getClass();
        s sVar2 = (s) nVar;
        sVar2.c0(-1948050005);
        int i12 = (sVar2.h(baseItemMnuV2) ? 4 : 2) | i11;
        if ((i11 & 48) == 0) {
            i12 |= sVar2.c(f11) ? 32 : 16;
        }
        if (sVar2.R(i12 & 1, (i12 & 19) != 18)) {
            Picture coverPicture = baseItemMnuV2.getCoverPicture();
            gd.i iVarG = o.g(coverPicture != null ? coverPicture.getCurrentUrl() : null, x0.z(R.drawable.transparent_vector, sVar2, 0), x0.z(R.drawable.transparent_vector, sVar2, 0), x0.z(R.drawable.transparent_vector, sVar2, 0), sVar2);
            l2.f fVarB = l2.g.b(8);
            q qVar = q.f5711a;
            t tVarB = f4.g.b(qVar, fVarB);
            b4.k kVar = b4.d.f5683a;
            u0 u0VarD = p.d(kVar, false);
            int iHashCode = Long.hashCode(sVar2.T);
            u3.i iVarL = sVar2.l();
            t tVarC = b4.a.c(tVarB, sVar2);
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
            sVar = sVar2;
            v1.n.d(iVarG, null, m2.n(qVar, 160, f11), null, z4.l.f47166a, 0.0f, null, sVar, 24624, 104);
            List<ItemTagInfo> tags = baseItemMnuV2.getTags();
            if (tags == null || tags.isEmpty()) {
                sVar.a0(-1740995939);
                sVar.q(false);
            } else {
                sVar.a0(-1741245799);
                float f12 = 4;
                bg.m.d(d2.c.v(b4.a.d(u.f13938a.a(qVar, kVar), 1.0f), f12, f12), baseItemMnuV2.getTags(), null, sVar, 0, 4);
                sVar.q(false);
            }
            sVar.q(true);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new Function2() { // from class: vm.n
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iF = m3.i.F(i11 | 1);
                    nx.d.d(baseItemMnuV2, f11, (m3.n) obj, iF);
                    return Unit.f26487a;
                }
            };
        }
    }

    public static id.q e(ia0.a0 a0Var, ia0.m mVar, String str, jd.g gVar, int i11) {
        if ((i11 & 4) != 0) {
            str = null;
        }
        if ((i11 & 8) != 0) {
            gVar = null;
        }
        return new id.q(a0Var, mVar, str, gVar);
    }

    public static final void f(BaseItemMnuV2 baseItemMnuV2, float f11, BasketManager basketManager, um.u uVar, m3.n nVar, int i11) {
        float f12;
        basketManager.getClass();
        s sVar = (s) nVar;
        sVar.c0(567404999);
        int i12 = i11 | (sVar.h(baseItemMnuV2) ? 4 : 2) | (sVar.h(basketManager) ? 256 : 128) | (sVar.f(uVar) ? NewHope.SENDB_BYTES : 1024);
        if (sVar.R(i12 & 1, (i12 & 1171) != 1170)) {
            q qVar = q.f5711a;
            f12 = f11;
            t tVarE = m2.e(qVar, f12);
            y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarE, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
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
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5693k, sVar, 48);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            t tVarC2 = b4.a.c(qVar, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC2, gVar4, sVar);
            ManufacturerItemProperties manufacturerItemProperties = baseItemMnuV2.getManufacturerItemProperties();
            Brand brand = manufacturerItemProperties != null ? manufacturerItemProperties.getBrand() : null;
            if (brand == null) {
                sVar.a0(-1946772071);
                sVar.q(false);
            } else {
                sVar.a0(-1946772070);
                a(brand, qVar, sVar, 48);
                sVar.q(false);
            }
            t tVarM = m2.m(qVar, lv.t.f28251e);
            double d3 = 1.0f;
            if (d3 <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            d2.c.f(tVarM.then(new n1(1.0f, true)), sVar);
            t tVarA = b4.a.a(m2.m(qVar, 36), c5.m2.f7291a, new fg.f(basketManager, baseItemMnuV2, uVar, 4));
            u0 u0VarD = p.d(b4.d.f5683a, false);
            int iHashCode3 = Long.hashCode(sVar.T);
            u3.i iVarL3 = sVar.l();
            t tVarC3 = b4.a.c(tVarA, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(u0VarD, gVar, sVar);
            m3.i.C(iVarL3, gVar2, sVar);
            a0.y(iHashCode3, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC3, gVar4, sVar);
            g3.i2.a(x0.z(R.drawable.ic_add, sVar, 0), null, u.f13938a.a(m2.m(qVar, 20), b4.d.f5687e), lv.s.f28217b, sVar, 3128, 0);
            sVar.q(true);
            sVar.q(true);
            if (d3 <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            g(baseItemMnuV2, new n1(1.0f, true), sVar, i12 & 14);
            sVar.q(true);
        } else {
            f12 = f11;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new vm.l(baseItemMnuV2, f12, basketManager, uVar, i11);
        }
    }

    public static final void g(BaseItemMnuV2 baseItemMnuV2, n1 n1Var, m3.n nVar, int i11) {
        b5.h hVar;
        boolean z11;
        baseItemMnuV2.getClass();
        s sVar = (s) nVar;
        sVar.c0(1783321667);
        int i12 = i11 | (sVar.h(baseItemMnuV2) ? 4 : 2) | (sVar.f(n1Var) ? 32 : 16);
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            d2.c.f(n1Var, sVar);
            String itemName = baseItemMnuV2.getItemName();
            if (itemName == null) {
                itemName = "";
            }
            m5.u0 u0Var = v.f28275o;
            long j9 = lv.s.C;
            r9.d(itemName, null, j9, 0L, null, 0L, null, null, 0L, 0, false, 1, 0, null, u0Var, sVar, MLKEMEngine.KyberPolyBytes, 12607488, 114682);
            String subtitle = baseItemMnuV2.getSubtitle();
            if (subtitle == null) {
                subtitle = "";
            }
            m5.u0 u0Var2 = v.f28276p;
            r9.d(subtitle, null, j9, 0L, null, 0L, null, null, 0L, 0, false, 1, 0, null, u0Var2, sVar, MLKEMEngine.KyberPolyBytes, 12607488, 114682);
            d2.c.f(n1Var, sVar);
            q qVar = q.f5711a;
            t tVarD = m2.d(qVar, 1.0f);
            i2 i2VarA = h2.a(d2.i.f13802b, b4.d.f5693k, sVar, 54);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarD, sVar);
            b5.j.R.getClass();
            b5.h hVar2 = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar2);
            } else {
                sVar.n0();
            }
            b5.g gVar = b5.i.f5843f;
            m3.i.C(i2VarA, gVar, sVar);
            b5.g gVar2 = b5.i.f5842e;
            m3.i.C(iVarL, gVar2, sVar);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b5.g gVar3 = b5.i.f5844g;
            m3.i.v(sVar, numValueOf, gVar3);
            b5.d dVar = b5.i.f5845h;
            m3.i.z(sVar, dVar);
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar);
            r9.d(mv.d.i(baseItemMnuV2.getItemValue(), 1), null, lv.s.D, 0L, null, 0L, x5.l.f43855d, null, 0L, 0, false, 1, 0, null, u0Var2, sVar, 805306752, 12607488, 114170);
            float f11 = lv.t.f28251e;
            d2.c.f(m2.m(qVar, f11), sVar);
            r9.d(mv.d.i(baseItemMnuV2.getItemPrice(), 1), null, j9, 0L, null, 0L, null, null, 0L, 0, false, 1, 0, null, v.f28277q, sVar, MLKEMEngine.KyberPolyBytes, 12607488, 114682);
            sVar = sVar;
            float f12 = lv.t.f28249c;
            b3.i.y(qVar, f12, sVar, true);
            d2.c.f(n1Var, sVar);
            t tVarD2 = m2.d(qVar, 1.0f);
            i2 i2VarA2 = h2.a(d2.i.f13801a, b4.d.f5692j, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            t tVarC2 = b4.a.c(tVarD2, sVar);
            sVar.e0();
            if (sVar.S) {
                hVar = hVar2;
                sVar.k(hVar);
            } else {
                hVar = hVar2;
                sVar.n0();
            }
            m3.i.C(i2VarA2, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC2, gVar4, sVar);
            String discountLabel = baseItemMnuV2.getDiscountLabel();
            if (discountLabel == null) {
                sVar.a0(311525146);
                sVar.q(false);
                z11 = true;
            } else {
                sVar.a0(311525147);
                if (1.0f <= 0.0d) {
                    e2.a.a("invalid weight; must be greater than zero");
                }
                d2.c.f(new n1(1.0f, true), sVar);
                float f13 = 16;
                t tVarA = d2.c.A(v1.n.j(f4.g.b(v1.n.k(qVar, 1, ((x60.h) sVar.j(PantryThemeKt.getLocalPantryColor())).f43915f, l2.g.b(f13)), l2.g.b(f13)), ((x60.h) sVar.j(PantryThemeKt.getLocalPantryColor())).f43915f, g0.f23254b), f11, f12);
                u0 u0VarD = p.d(b4.d.f5683a, false);
                int iHashCode3 = Long.hashCode(sVar.T);
                u3.i iVarL3 = sVar.l();
                t tVarC3 = b4.a.c(tVarA, sVar);
                sVar.e0();
                if (sVar.S) {
                    sVar.k(hVar);
                } else {
                    sVar.n0();
                }
                m3.i.C(u0VarD, gVar, sVar);
                m3.i.C(iVarL3, gVar2, sVar);
                a0.y(iHashCode3, sVar, gVar3, sVar, dVar);
                m3.i.C(tVarC3, gVar4, sVar);
                r9.d(discountLabel, null, ((x60.h) sVar.j(PantryThemeKt.getLocalPantryColor())).L, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((x60.j) sVar.j(PantryThemeKt.getLocalPantryTypography())).f43968r, sVar, 0, 24960, 110586);
                sVar = sVar;
                z11 = true;
                sVar.q(true);
                sVar.q(false);
            }
            sVar.q(z11);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new rk.a0(baseItemMnuV2, n1Var, i11, 15);
        }
    }

    public static final void h(final GetRecommendedManufacturerItemsResponse getRecommendedManufacturerItemsResponse, final int i11, final String str, final String str2, final um.u uVar, final z zVar, m3.n nVar, final int i12) {
        getRecommendedManufacturerItemsResponse.getClass();
        str.getClass();
        uVar.getClass();
        s sVar = (s) nVar;
        sVar.c0(-372608285);
        int i13 = i12 | (sVar.h(getRecommendedManufacturerItemsResponse) ? 4 : 2) | (sVar.d(i11) ? 32 : 16) | (sVar.f(str) ? 256 : 128) | (sVar.f(str2) ? NewHope.SENDB_BYTES : 1024) | (sVar.f(uVar) ? 16384 : 8192) | (sVar.f(zVar) ? 131072 : 65536);
        if (sVar.R(i13 & 1, (74899 & i13) != 74898)) {
            x60.m mVar = (x60.m) sVar.j(PantryThemeKt.getLocalPantrySpacing());
            x60.h hVar = (x60.h) sVar.j(PantryThemeKt.getLocalPantryColor());
            x60.j jVar = (x60.j) sVar.j(PantryThemeKt.getLocalPantryTypography());
            if (getRecommendedManufacturerItemsResponse.getRecommendedItems() == null) {
                w1 w1VarS = sVar.s();
                if (w1VarS != null) {
                    final int i14 = 0;
                    w1VarS.f29476d = new Function2(getRecommendedManufacturerItemsResponse, i11, str, str2, uVar, zVar, i12, i14) { // from class: vm.m

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ int f42472a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ GetRecommendedManufacturerItemsResponse f42473b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ int f42474c;

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        public final /* synthetic */ String f42475d;

                        /* JADX INFO: renamed from: e, reason: collision with root package name */
                        public final /* synthetic */ String f42476e;

                        /* JADX INFO: renamed from: f, reason: collision with root package name */
                        public final /* synthetic */ um.u f42477f;

                        /* JADX INFO: renamed from: g, reason: collision with root package name */
                        public final /* synthetic */ z f42478g;

                        {
                            this.f42472a = i14;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            switch (this.f42472a) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int iF = m3.i.F(1);
                                    nx.d.h(this.f42473b, this.f42474c, this.f42475d, this.f42476e, this.f42477f, this.f42478g, (m3.n) obj, iF);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int iF2 = m3.i.F(1);
                                    nx.d.h(this.f42473b, this.f42474c, this.f42475d, this.f42476e, this.f42477f, this.f42478g, (m3.n) obj, iF2);
                                    break;
                            }
                            return Unit.f26487a;
                        }
                    };
                    return;
                }
                return;
            }
            c0 c0VarA = e0.a(0, 0, 0, 3, sVar);
            y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            q qVar = q.f5711a;
            t tVarC = b4.a.c(qVar, sVar);
            b5.j.R.getClass();
            b5.h hVar2 = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar2);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            d2.c.f(m2.m(qVar, mVar.f44008d), sVar);
            r9.d(str, d2.c.z(qVar, mVar.f44008d), hVar.J, 0L, null, 0L, null, null, 0L, 0, false, 1, 0, null, jVar.f43957f, sVar, (i13 >> 6) & 14, 24576, 114680);
            sVar = sVar;
            b4.j jVar2 = b4.d.f5693k;
            a2.j jVarG = b0.a0.G(c0VarA, sVar, 48, 0);
            b2 b2VarC = d2.c.c(lv.t.f28251e, 0.0f, 2);
            boolean zH = sVar.h(getRecommendedManufacturerItemsResponse) | ((57344 & i13) == 16384) | ((i13 & 7168) == 2048) | ((i13 & 112) == 32) | ((458752 & i13) == 131072);
            Object objM = sVar.M();
            if (zH || objM == m3.m.f29332a) {
                x xVar = new x(getRecommendedManufacturerItemsResponse, uVar, str2, i11, zVar, 7);
                sVar.k0(xVar);
                objM = xVar;
            }
            ox.h.d(null, c0VarA, b2VarC, false, null, jVar2, jVarG, false, null, (Function1) objM, sVar, 196992, 409);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS2 = sVar.s();
        if (w1VarS2 != null) {
            final int i15 = 1;
            w1VarS2.f29476d = new Function2(getRecommendedManufacturerItemsResponse, i11, str, str2, uVar, zVar, i12, i15) { // from class: vm.m

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f42472a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ GetRecommendedManufacturerItemsResponse f42473b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ int f42474c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ String f42475d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ String f42476e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ um.u f42477f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ z f42478g;

                {
                    this.f42472a = i15;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (this.f42472a) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iF = m3.i.F(1);
                            nx.d.h(this.f42473b, this.f42474c, this.f42475d, this.f42476e, this.f42477f, this.f42478g, (m3.n) obj, iF);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iF2 = m3.i.F(1);
                            nx.d.h(this.f42473b, this.f42474c, this.f42475d, this.f42476e, this.f42477f, this.f42478g, (m3.n) obj, iF2);
                            break;
                    }
                    return Unit.f26487a;
                }
            };
        }
    }

    public static final void i(BaseItemMnuV2 baseItemMnuV2, BasketManager basketManager, um.u uVar, m3.n nVar, int i11) {
        basketManager.getClass();
        s sVar = (s) nVar;
        sVar.c0(1041216912);
        int i12 = i11 | (sVar.h(baseItemMnuV2) ? 4 : 2) | (sVar.h(basketManager) ? 32 : 16) | (sVar.f(uVar) ? 256 : 128);
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            float f11 = 102;
            t tVarJ = v1.n.j(m2.d(q.f5711a, 1.0f), lv.s.K, g0.f23254b);
            u0 u0VarD = p.d(b4.d.f5683a, false);
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
            m3.i.C(u0VarD, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            d3 d3Var = x1.f7416h;
            m3.i.b(new v1[]{b3.i.t(((z5.c) sVar.j(d3Var)).a(), 1.0f, d3Var), s5.f19473a.a(cg.j.t())}, u3.e.e(-889562154, sVar, new vm.l(uVar, baseItemMnuV2, f11, basketManager, 0)), sVar, 56);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new vm.k(baseItemMnuV2, basketManager, uVar, i11, 1);
        }
    }

    public static final void j(BaseItemMnuV2 baseItemMnuV2, BasketManager basketManager, um.u uVar, m3.n nVar, int i11) {
        BaseItemMnuV2 baseItemMnuV22 = baseItemMnuV2;
        BasketManager basketManager2 = basketManager;
        basketManager2.getClass();
        s sVar = (s) nVar;
        sVar.c0(-636532635);
        int i12 = i11 | (sVar.h(baseItemMnuV22) ? 4 : 2) | (sVar.h(basketManager2) ? 32 : 16) | (sVar.f(uVar) ? 256 : 128);
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            sVar.a0(-662924468);
            float f11 = lv.t.f28253g;
            q qVar = q.f5711a;
            d2.c.f(m2.m(qVar, f11), sVar);
            wi.a.k(lv.s.G, 1, sVar, 54, 0);
            t tVarB = d2.c.B(qVar, f11, 0.0f, 2);
            y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarB, sVar);
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
            r9.d(r8.k.f(f11, R.string.mnu_basket_screen_section_title_recommended, qVar, sVar, sVar), null, lv.s.C, 0L, null, 0L, null, null, 0L, 0, false, 1, 0, null, v.f28286z, sVar, MLKEMEngine.KyberPolyBytes, 12607488, 114682);
            sVar = sVar;
            d2.c.f(m2.m(qVar, f11), sVar);
            baseItemMnuV22 = baseItemMnuV2;
            basketManager2 = basketManager;
            i(baseItemMnuV22, basketManager2, uVar, sVar, i12 & 1008);
            sVar.q(true);
            sVar.q(false);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new vm.k(baseItemMnuV22, basketManager2, uVar, i11, 0);
        }
    }

    public static final h4.d k(float f11, float f12, float f13, float f14, long j9) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j9 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j9 & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2)));
        return new h4.d(f11, f12, f13, f14, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits);
    }

    public static final h4.d l(long j9, h4.c cVar) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j9 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j9 & 4294967295L));
        float f11 = cVar.f21380a;
        float f12 = cVar.f21381b;
        float f13 = cVar.f21382c;
        float f14 = cVar.f21383d;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
        return new h4.d(f11, f12, f13, f14, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits);
    }

    public static Uri m(File file, File file2) throws ImageCaptureException {
        if (file2.exists()) {
            file2.delete();
        }
        if (file.renameTo(file2)) {
            return Uri.fromFile(file2);
        }
        throw new ImageCaptureException(1, "Failed to overwrite the file: " + file2.getAbsolutePath(), null);
    }

    public static boolean n(File file, InputStream inputStream) throws Throwable {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e5) {
                e = e5;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int i11 = inputStream.read(bArr);
                if (i11 != -1) {
                    fileOutputStream.write(bArr, 0, i11);
                } else {
                    try {
                        break;
                    } catch (IOException unused) {
                    }
                }
            }
            fileOutputStream.close();
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            return true;
        } catch (IOException e11) {
            e = e11;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused2) {
                }
            }
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            return false;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
            }
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            throw th;
        }
    }

    public static GetCredentialException o(String str, String str2) {
        Exception excU;
        str.getClass();
        try {
            GetPublicKeyCredentialDomException getPublicKeyCredentialDomException = new GetPublicKeyCredentialDomException(new o7.a(26), null);
            if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ABORT_ERROR")) {
                excU = na0.a.U(new o7.a(0), str2, getPublicKeyCredentialDomException);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_CONSTRAINT_ERROR")) {
                excU = na0.a.U(new o7.a(1), str2, getPublicKeyCredentialDomException);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_CLONE_ERROR")) {
                excU = na0.a.U(new o7.a(2), str2, getPublicKeyCredentialDomException);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_ERROR")) {
                excU = na0.a.U(new o7.a(3), str2, getPublicKeyCredentialDomException);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ENCODING_ERROR")) {
                excU = na0.a.U(new o7.a(4), str2, getPublicKeyCredentialDomException);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_HIERARCHY_REQUEST_ERROR")) {
                excU = na0.a.U(new o7.a(5), str2, getPublicKeyCredentialDomException);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_IN_USE_ATTRIBUTE_ERROR")) {
                excU = na0.a.U(new o7.a(6), str2, getPublicKeyCredentialDomException);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_CHARACTER_ERROR")) {
                excU = na0.a.U(new o7.a(7), str2, getPublicKeyCredentialDomException);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_MODIFICATION_ERROR")) {
                excU = na0.a.U(new o7.a(8), str2, getPublicKeyCredentialDomException);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_NODE_TYPE_ERROR")) {
                excU = na0.a.U(new o7.a(9), str2, getPublicKeyCredentialDomException);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_STATE_ERROR")) {
                excU = na0.a.U(new o7.a(10), str2, getPublicKeyCredentialDomException);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NAMESPACE_ERROR")) {
                excU = na0.a.U(new o7.a(11), str2, getPublicKeyCredentialDomException);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NETWORK_ERROR")) {
                excU = na0.a.U(new o7.a(12), str2, getPublicKeyCredentialDomException);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NO_MODIFICATION_ALLOWED_ERROR")) {
                excU = na0.a.U(new o7.a(13), str2, getPublicKeyCredentialDomException);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_ALLOWED_ERROR")) {
                excU = na0.a.U(new o7.a(14), str2, getPublicKeyCredentialDomException);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_FOUND_ERROR")) {
                excU = na0.a.U(new o7.a(15), str2, getPublicKeyCredentialDomException);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_READABLE_ERROR")) {
                excU = na0.a.U(new o7.a(16), str2, getPublicKeyCredentialDomException);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_SUPPORTED_ERROR")) {
                excU = na0.a.U(new o7.a(17), str2, getPublicKeyCredentialDomException);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPERATION_ERROR")) {
                excU = na0.a.U(new o7.a(18), str2, getPublicKeyCredentialDomException);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPT_OUT_ERROR")) {
                excU = na0.a.U(new o7.a(19), str2, getPublicKeyCredentialDomException);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_QUOTA_EXCEEDED_ERROR")) {
                excU = na0.a.U(new o7.a(20), str2, getPublicKeyCredentialDomException);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_READ_ONLY_ERROR")) {
                excU = na0.a.U(new o7.a(21), str2, getPublicKeyCredentialDomException);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SECURITY_ERROR")) {
                excU = na0.a.U(new o7.a(22), str2, getPublicKeyCredentialDomException);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SYNTAX_ERROR")) {
                excU = na0.a.U(new o7.a(23), str2, getPublicKeyCredentialDomException);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TIMEOUT_ERROR")) {
                excU = na0.a.U(new o7.a(24), str2, getPublicKeyCredentialDomException);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TRANSACTION_INACTIVE_ERROR")) {
                excU = na0.a.U(new o7.a(25), str2, getPublicKeyCredentialDomException);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_UNKNOWN_ERROR")) {
                excU = na0.a.U(new o7.a(26), str2, getPublicKeyCredentialDomException);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_VERSION_ERROR")) {
                excU = na0.a.U(new o7.a(27), str2, getPublicKeyCredentialDomException);
            } else {
                if (!Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_WRONG_DOCUMENT_ERROR")) {
                    throw new FrameworkClassParsingException();
                }
                excU = na0.a.U(new o7.a(28), str2, getPublicKeyCredentialDomException);
            }
            return (GetCredentialException) excU;
        } catch (FrameworkClassParsingException unused) {
            return new GetCredentialCustomException(str2, str);
        }
    }

    public static File p(b0 b0Var) throws ImageCaptureException {
        try {
            File file = (File) b0Var.f28471b;
            String parent = file.getParent();
            StringBuilder sb2 = new StringBuilder("CameraX");
            sb2.append(UUID.randomUUID().toString());
            String name = file.getName();
            int iLastIndexOf = name.lastIndexOf(46);
            sb2.append(iLastIndexOf >= 0 ? name.substring(iLastIndexOf) : "");
            return new File(parent, sb2.toString());
        } catch (IOException e5) {
            throw new ImageCaptureException(1, "Failed to create temp file.", e5);
        }
    }

    public static int s(Exception exc) {
        boolean zAreEqual;
        boolean z11 = false;
        if (exc instanceof CameraAccessException) {
            CameraAccessException cameraAccessException = (CameraAccessException) exc;
            int reason = cameraAccessException.getReason();
            if (reason == 1) {
                return 3;
            }
            if (reason == 2) {
                return 6;
            }
            if (reason == 3) {
                return 0;
            }
            if (reason == 4) {
                return 1;
            }
            if (reason == 5) {
                return 2;
            }
            Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
            return 11;
        }
        if (exc instanceof IllegalArgumentException) {
            return 7;
        }
        if (exc instanceof SecurityException) {
            return 8;
        }
        if (Build.VERSION.SDK_INT == 28) {
            if (exc instanceof RuntimeException) {
                StackTraceElement[] stackTrace = ((RuntimeException) exc).getStackTrace();
                stackTrace.getClass();
                zAreEqual = Intrinsics.areEqual(stackTrace.length == 0 ? null : stackTrace[0].getMethodName(), "_enableShutterSound");
            } else {
                zAreEqual = false;
            }
            if (zAreEqual) {
                z11 = true;
            }
        }
        if (z11) {
            return 10;
        }
        Log.w("CXCP", "Unexpected throwable: " + exc);
        return 11;
    }

    public static final String t(int i11, bp.v vVar) {
        vVar.getClass();
        int i12 = bp.w.$EnumSwitchMapping$0[vVar.ordinal()];
        if (i12 == 1) {
            return (1 > i11 || i11 >= 4) ? "Experience" : "Experience_Reason";
        }
        if (i12 == 2) {
            return (1 > i11 || i11 >= 4) ? "Quality" : "Quality_Reason";
        }
        if (i12 == 3) {
            return (1 > i11 || i11 >= 4) ? "Contents" : "Contents_Reason";
        }
        if (i12 == 4) {
            return (1 > i11 || i11 >= 4) ? "Quantity" : "Quantity_Reason";
        }
        if (i12 == 5) {
            return "Rating_Described";
        }
        e40.a.f();
        return null;
    }

    public static final View u(Activity activity) {
        if (yx.a.f46339a.contains(d.class) || activity == null) {
            return null;
        }
        try {
            Window window = activity.getWindow();
            if (window == null) {
                return null;
            }
            return window.getDecorView().getRootView();
        } catch (Exception unused) {
            return null;
        } catch (Throwable th2) {
            yx.a.a(d.class, th2);
            return null;
        }
    }

    public static File v(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i11 = 0; i11 < 100; i11++) {
            File file = new File(cacheDir, str + i11);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static boolean w(Comparator comparator, Collection collection) {
        Object objComparator;
        comparator.getClass();
        collection.getClass();
        if (collection instanceof SortedSet) {
            objComparator = ((SortedSet) collection).comparator();
            if (objComparator == null) {
                objComparator = k30.v.f25925a;
            }
        } else {
            if (!(collection instanceof k30.p)) {
                return false;
            }
            objComparator = ((k30.p) collection).f25917d;
        }
        return comparator.equals(objComparator);
    }

    public static void x(List list) throws DeferrableSurface$SurfaceClosedException {
        if (list.isEmpty()) {
            return;
        }
        int i11 = 0;
        do {
            try {
                ((s0.x0) list.get(i11)).d();
                i11++;
            } catch (DeferrableSurface$SurfaceClosedException e5) {
                for (int i12 = i11 - 1; i12 >= 0; i12--) {
                    ((s0.x0) list.get(i12)).b();
                }
                throw e5;
            }
        } while (i11 < list.size());
    }

    public static final boolean y() {
        String str = Build.FINGERPRINT;
        str.getClass();
        if (kotlin.text.y.p(str, "generic", false) || kotlin.text.y.p(str, PaymentMethodTypes.UNKNOWN, false)) {
            return true;
        }
        String str2 = Build.MODEL;
        str2.getClass();
        if (StringsKt.z(str2, "google_sdk", false) || StringsKt.z(str2, "Emulator", false) || StringsKt.z(str2, "Android SDK built for x86", false)) {
            return true;
        }
        String str3 = Build.MANUFACTURER;
        str3.getClass();
        if (StringsKt.z(str3, "Genymotion", false)) {
            return true;
        }
        String str4 = Build.BRAND;
        str4.getClass();
        if (kotlin.text.y.p(str4, "generic", false)) {
            String str5 = Build.DEVICE;
            str5.getClass();
            if (kotlin.text.y.p(str5, "generic", false)) {
                return true;
            }
        }
        return Intrinsics.areEqual("google_sdk", Build.PRODUCT);
    }

    public static final boolean z(h4.d dVar) {
        long j9 = dVar.f21388e;
        return (j9 >>> 32) == (4294967295L & j9) && j9 == dVar.f21389f && j9 == dVar.f21390g && j9 == dVar.f21391h;
    }

    public abstract String q(int i11, int i12, byte[] bArr);

    public abstract int r(String str, byte[] bArr, int i11, int i12);
}
