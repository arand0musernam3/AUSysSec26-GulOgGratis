package jf;

import a3.a3;
import a3.u1;
import a3.u2;
import a3.w2;
import a3.y0;
import a60.r;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.util.Log;
import androidx.activity.f0;
import androidx.activity.p;
import androidx.lifecycle.o0;
import b0.q;
import b4.t;
import c5.x1;
import com.app.tgtg.R;
import com.app.tgtg.model.local.BasketManager;
import com.app.tgtg.model.remote.item.Picture;
import com.app.tgtg.model.remote.item.response.BaseItemMnuV2;
import com.app.tgtg.model.remote.item.response.CarouselWithTitle;
import com.app.tgtg.model.remote.item.response.CategoryCard;
import com.app.tgtg.model.remote.item.response.CategoryCarouselMnuV2;
import com.app.tgtg.model.remote.item.response.ElementMnuV2;
import com.app.tgtg.model.remote.item.response.HeroCarouselMnu;
import com.app.tgtg.model.remote.item.response.HighlightedItemCardsCarouselMnuV2;
import com.app.tgtg.model.remote.item.response.ItemCarouselMnu;
import com.app.tgtg.model.remote.item.response.ItemCarouselMnuV2;
import com.app.tgtg.model.remote.manufacturer.request.AdapterItemType;
import com.app.tgtg.model.remote.manufacturer.response.BasketItem;
import com.app.tgtg.model.remote.order.OrderState;
import com.braze.h2;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException;
import com.tgtg.componentlibrary.component.avatar.model.AvatarSize;
import com.tgtg.componentlibrary.component.avatar.variant.PantryAvatarImageKt;
import com.tgtg.componentlibrary.theme.PantryThemeKt;
import d2.b2;
import d2.m2;
import d2.w;
import e.g;
import e.m;
import e0.f;
import e6.i;
import e6.l;
import e6.n;
import ed.o;
import f2.c0;
import f2.e0;
import g3.i2;
import g3.q7;
import g3.r9;
import g3.s5;
import g3.s7;
import g3.t0;
import g3.u7;
import g3.v7;
import i4.g0;
import i4.r0;
import i4.v;
import ib.y;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import m0.i1;
import m2.h0;
import m3.b1;
import m3.d3;
import m3.s;
import m3.v1;
import m3.w1;
import m5.u0;
import n5.j;
import o00.x0;
import org.bouncycastle.crypto.hpke.HPKE;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import s1.b0;
import um.u;
import w.a0;
import x60.h;
import x60.k;
import ym.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f25136a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f25137b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f25138c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f25139d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f25140e = 0;

    public static ArrayList A(Parcel parcel, int i11, Parcelable.Creator creator) {
        int iU = U(i11, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iU == 0) {
            return null;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iU);
        return arrayListCreateTypedArrayList;
    }

    public static void B(int i11, Parcel parcel) {
        if (parcel.dataPosition() != i11) {
            throw new SafeParcelReader$ParseException(parcel, f.h(i11, "Overread allowed size end=", new StringBuilder(String.valueOf(i11).length() + 26)));
        }
    }

    public static final String C(long j9) {
        String strJ;
        if (j9 <= -999500000) {
            strJ = a0.j((j9 - ((long) 500000000)) / ((long) 1000000000), " s ", new StringBuilder());
        } else if (j9 <= -999500) {
            strJ = a0.j((j9 - ((long) 500000)) / ((long) 1000000), " ms", new StringBuilder());
        } else if (j9 <= 0) {
            strJ = a0.j((j9 - ((long) 500)) / ((long) 1000), " µs", new StringBuilder());
        } else if (j9 < 999500) {
            strJ = a0.j((j9 + ((long) 500)) / ((long) 1000), " µs", new StringBuilder());
        } else if (j9 < 999500000) {
            strJ = a0.j((j9 + ((long) 500000)) / ((long) 1000000), " ms", new StringBuilder());
        } else {
            strJ = a0.j((j9 + ((long) 500000000)) / ((long) 1000000000), " s ", new StringBuilder());
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format("%6s", Arrays.copyOf(new Object[]{strJ}, 1));
    }

    public static final float E(Layout layout, int i11, Paint paint) {
        float fAbs;
        float width;
        float lineLeft = layout.getLineLeft(i11);
        ThreadLocal threadLocal = j.f30542a;
        if (layout.getEllipsisCount(i11) <= 0 || layout.getParagraphDirection(i11) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i11) + layout.getLineStart(i11)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i11);
        if ((paragraphAlignment == null ? -1 : p5.d.$EnumSwitchMapping$0[paragraphAlignment.ordinal()]) == 1) {
            fAbs = Math.abs(lineLeft);
            width = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            fAbs = Math.abs(lineLeft);
            width = layout.getWidth() - fMeasureText;
        }
        return width + fAbs;
    }

    public static final float F(Layout layout, int i11, Paint paint) {
        float width;
        float width2;
        ThreadLocal threadLocal = j.f30542a;
        if (layout.getEllipsisCount(i11) <= 0) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i11) != -1 || layout.getWidth() >= layout.getLineRight(i11)) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getLineRight(i11) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i11) + layout.getLineStart(i11)));
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i11);
        if ((paragraphAlignment != null ? p5.d.$EnumSwitchMapping$0[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i11);
            width2 = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i11);
            width2 = layout.getWidth() - fMeasureText;
        }
        return width - width2;
    }

    public static Object G(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            return arrayList.get(arrayList.size() - 1);
        }
        i1.c();
        return null;
    }

    public static final int H(int i11, int i12) {
        return (i11 >> i12) & 31;
    }

    public static final y I(y yVar, String str, Executor executor, Function0 function0) {
        yVar.getClass();
        executor.getClass();
        o0 o0Var = new o0(y.f23769c);
        i iVar = new i();
        iVar.f15778c = new n();
        l lVar = new l(iVar);
        iVar.f15777b = lVar;
        iVar.f15776a = a0.class;
        try {
            executor.execute(new p(yVar, str, function0, o0Var, iVar, 4));
            Unit unit = Unit.f26487a;
            if (unit != null) {
                iVar.f15776a = unit;
            }
        } catch (Exception e5) {
            lVar.b(e5);
        }
        return new y();
    }

    public static final void J(Exception exc, kf.b bVar, String str) {
        bVar.getClass();
        String message = exc.getMessage();
        if (message != null) {
            bVar.a(str + ": " + message);
        }
        if (exc.getStackTrace() != null) {
            bVar.a("Stack trace: " + u70.e.b(exc));
        }
    }

    public static PorterDuff.Mode K(x6.a aVar) {
        if (aVar == null) {
            return null;
        }
        switch (x6.b.f43870a[aVar.ordinal()]) {
        }
        return null;
    }

    public static m8.b L(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j9;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i11 = byteBufferDuplicate.getShort() & HPKE.aead_EXPORT_ONLY;
        if (i11 > 100) {
            i4.a.k("Cannot read metadata.");
            return null;
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i12 = 0;
        while (true) {
            if (i12 >= i11) {
                j9 = -1;
                break;
            }
            int i13 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j9 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i13) {
                break;
            }
            i12++;
        }
        if (j9 != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j9 - ((long) byteBufferDuplicate.position()))));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j11 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            for (int i14 = 0; i14 < j11; i14++) {
                int i15 = byteBufferDuplicate.getInt();
                long j12 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i15 || 1701669481 == i15) {
                    byteBufferDuplicate.position((int) (j12 + j9));
                    m8.b bVar = new m8.b();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    bVar.f21601d = byteBufferDuplicate;
                    bVar.f21598a = iPosition;
                    int i16 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    bVar.f21599b = i16;
                    bVar.f21600c = ((ByteBuffer) bVar.f21601d).getShort(i16);
                    return bVar;
                }
            }
        }
        i4.a.k("Cannot read metadata.");
        return null;
    }

    public static boolean M(int i11, Parcel parcel) {
        Y(parcel, i11, 4);
        return parcel.readInt() != 0;
    }

    public static byte N(int i11, Parcel parcel) {
        Y(parcel, i11, 4);
        return (byte) parcel.readInt();
    }

    public static float O(int i11, Parcel parcel) {
        Y(parcel, i11, 4);
        return parcel.readFloat();
    }

    public static Float P(int i11, Parcel parcel) {
        int iU = U(i11, parcel);
        if (iU == 0) {
            return null;
        }
        Z(parcel, iU, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static IBinder Q(int i11, Parcel parcel) {
        int iU = U(i11, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iU == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iU);
        return strongBinder;
    }

    public static int R(int i11, Parcel parcel) {
        Y(parcel, i11, 4);
        return parcel.readInt();
    }

    public static Integer S(int i11, Parcel parcel) {
        int iU = U(i11, parcel);
        if (iU == 0) {
            return null;
        }
        Z(parcel, iU, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static long T(int i11, Parcel parcel) {
        Y(parcel, i11, 8);
        return parcel.readLong();
    }

    public static int U(int i11, Parcel parcel) {
        return (i11 & (-65536)) != -65536 ? (char) (i11 >> 16) : parcel.readInt();
    }

    public static String V(String str, kf.b bVar) {
        InputStream resourceAsStream;
        try {
            ClassLoader classLoader = e.class.getClassLoader();
            resourceAsStream = classLoader != null ? classLoader.getResourceAsStream(str) : null;
        } catch (Exception e5) {
            if (bVar != null) {
                bVar.b("Failed to read version from " + str + ": " + e5);
            }
        }
        if (resourceAsStream == null) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(resourceAsStream, Charsets.UTF_8), 8192);
        try {
            String line = bufferedReader.readLine();
            String string = line != null ? StringsKt.e0(line).toString() : null;
            bufferedReader.close();
            return string;
        } finally {
        }
    }

    public static void W(int i11, Parcel parcel) {
        parcel.setDataPosition(parcel.dataPosition() + U(i11, parcel));
    }

    public static int X(Parcel parcel) {
        int i11 = parcel.readInt();
        int iU = U(i11, parcel);
        char c3 = (char) i11;
        int iDataPosition = parcel.dataPosition();
        if (c3 != 20293) {
            throw new SafeParcelReader$ParseException(parcel, "Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(i11))));
        }
        int i12 = iU + iDataPosition;
        if (i12 >= iDataPosition && i12 <= parcel.dataSize()) {
            return i12;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(iDataPosition).length() + 32 + String.valueOf(i12).length());
        sb2.append("Size read is invalid start=");
        sb2.append(iDataPosition);
        sb2.append(" end=");
        sb2.append(i12);
        throw new SafeParcelReader$ParseException(parcel, sb2.toString());
    }

    public static void Y(Parcel parcel, int i11, int i12) {
        int iU = U(i11, parcel);
        if (iU == i12) {
            return;
        }
        String hexString = Integer.toHexString(iU);
        int length = String.valueOf(i12).length();
        StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(iU).length() + 4 + 1);
        sb2.append("Expected size ");
        sb2.append(i12);
        sb2.append(" got ");
        sb2.append(iU);
        throw new SafeParcelReader$ParseException(parcel, f.n(sb2, " (0x", hexString, ")"));
    }

    public static void Z(Parcel parcel, int i11, int i12) {
        if (i11 == i12) {
            return;
        }
        String hexString = Integer.toHexString(i11);
        int length = String.valueOf(i12).length();
        StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(i11).length() + 4 + 1);
        sb2.append("Expected size ");
        sb2.append(i12);
        sb2.append(" got ");
        sb2.append(i11);
        throw new SafeParcelReader$ParseException(parcel, f.n(sb2, " (0x", hexString, ")"));
    }

    public static final void a(boolean z11, Function0 function0, m3.n nVar, int i11, int i12) {
        boolean z12;
        int i13;
        boolean z13;
        s sVar = (s) nVar;
        sVar.c0(-361453782);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
            z12 = z11;
        } else if ((i11 & 6) == 0) {
            z12 = z11;
            i13 = i11 | (sVar.g(z12) ? 4 : 2);
        } else {
            z12 = z11;
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= sVar.h(function0) ? 32 : 16;
        }
        if (sVar.R(i13 & 1, (i13 & 19) != 18)) {
            boolean z14 = i14 != 0 ? true : z12;
            Object objA = r9.b.a(sVar);
            if (objA == null) {
                sVar.a0(535274673);
                objA = m.a(sVar);
            } else {
                sVar.a0(535271790);
            }
            sVar.q(false);
            if (objA == null) {
                h2.b("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
                return;
            }
            boolean zF = sVar.f(objA);
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (zF || objM == fVar) {
                q9.d dVar = objA instanceof q9.d ? (q9.d) objA : null;
                q9.c navigationEventDispatcher = dVar != null ? dVar.getNavigationEventDispatcher() : null;
                f0 f0Var = objA instanceof f0 ? (f0) objA : null;
                objM = new f.b(navigationEventDispatcher, f0Var != null ? f0Var.getOnBackPressedDispatcher() : null);
                sVar.k0(objM);
            }
            f.b bVar = (f.b) objM;
            long j9 = sVar.T;
            boolean zF2 = sVar.f(bVar) | sVar.e(j9);
            Object objM2 = sVar.M();
            Object obj = objM2;
            if (zF2 || objM2 == fVar) {
                g gVar = new g(new e.c(j9, objA));
                gVar.f15286c = new db0.c(21);
                sVar.k0(gVar);
                obj = gVar;
            }
            g gVar2 = (g) obj;
            sVar.a0(-585307852);
            boolean zH = sVar.h(gVar2) | ((i13 & 112) == 32);
            Object objM3 = sVar.M();
            if (zH || objM3 == fVar) {
                objM3 = new bs.b(22, gVar2, function0);
                sVar.k0(objM3);
            }
            m3.i.j((Function0) objM3, sVar);
            Boolean boolValueOf = Boolean.valueOf(z14);
            int i15 = i13 & 14;
            boolean zH2 = sVar.h(gVar2) | (i15 == 4);
            Object objM4 = sVar.M();
            if (zH2 || objM4 == fVar) {
                objM4 = new q(gVar2, z14, 2);
                sVar.k0(objM4);
            }
            w8.e.b(boolValueOf, gVar2, null, (Function1) objM4, sVar, i15);
            boolean zH3 = sVar.h(bVar) | sVar.h(gVar2);
            Object objM5 = sVar.M();
            if (zH3 || objM5 == fVar) {
                objM5 = new a3.p(28, bVar, gVar2);
                sVar.k0(objM5);
            }
            m3.i.c(bVar, gVar2, (Function1) objM5, sVar);
            sVar.q(false);
            z13 = z14;
        } else {
            sVar.U();
            z13 = z12;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new e.d(z13, function0, i11, i12, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r12v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r22v0, types: [m3.n] */
    /* JADX WARN: Type inference failed for: r7v1, types: [m3.n, m3.s] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v2, types: [m3.s] */
    /* JADX WARN: Type inference failed for: r7v3, types: [m3.n, m3.s] */
    /* JADX WARN: Type inference failed for: r7v5, types: [m3.s] */
    /* JADX WARN: Type inference failed for: r7v6, types: [m3.s] */
    /* JADX WARN: Type inference failed for: r7v7, types: [m3.s] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public static final void b(t tVar, CategoryCard categoryCard, m3.n nVar, int i11) {
        ?? r02;
        ?? r72;
        int i12;
        ?? r12;
        ?? r73;
        ?? r74;
        ?? r03;
        ?? r75 = (s) nVar;
        r75.c0(-1074693968);
        int i13 = (r75.f(tVar) ? 4 : 2) | i11 | (r75.h(categoryCard) ? 32 : 16);
        if (r75.R(i13 & 1, (i13 & 19) != 18)) {
            x60.l lVar = (x60.l) r75.j(PantryThemeKt.getLocalPantrySize());
            x60.m mVar = (x60.m) r75.j(PantryThemeKt.getLocalPantrySpacing());
            x60.j jVar = (x60.j) r75.j(PantryThemeKt.getLocalPantryTypography());
            h hVar = (h) r75.j(PantryThemeKt.getLocalPantryColor());
            k kVar = (k) r75.j(PantryThemeKt.getLocalPantryRadius());
            x60.i iVar = (x60.i) r75.j(PantryThemeKt.getLocalPantryShadow());
            t tVarQ = m2.q(tVar, lVar.f43991c);
            d2.y yVarA = w.a(d2.i.f13803c, b4.d.f5695n, r75, 48);
            int iHashCode = Long.hashCode(r75.T);
            u3.i iVarL = r75.l();
            t tVarC = b4.a.c(tVarQ, r75);
            b5.j.R.getClass();
            b5.h hVar2 = b5.i.f5839b;
            r75.e0();
            if (r75.S) {
                r75.k(hVar2);
            } else {
                r75.n0();
            }
            m3.i.C(yVarA, b5.i.f5843f, r75);
            m3.i.C(iVarL, b5.i.f5842e, r75);
            m3.i.v(r75, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(r75, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, r75);
            Picture categoryImage = categoryCard.getCategoryImage();
            Unit unit = null;
            String currentUrl = categoryImage != null ? categoryImage.getCurrentUrl() : null;
            b4.q qVar = b4.q.f5711a;
            if (currentUrl == null) {
                r75.a0(1619638208);
                i12 = 0;
                r75.q(false);
            } else {
                r75.a0(1619638209);
                PantryAvatarImageKt.PantryAvatarImage(u3.e.e(1459118398, r75, new u1(1, lVar, currentUrl)), v1.n.j(f4.g.g(qVar, l2.g.b(kVar.f43979c), iVar.f43951b), hVar.B, l2.g.f26790a), "", AvatarSize.Large, r75, 3462, 0);
                i12 = 0;
                r75.q(false);
                unit = Unit.f26487a;
            }
            if (unit == null) {
                r75.a0(1620509030);
                ?? r122 = i12;
                i2.a(x0.z(R.drawable.gfx_tgtg_logo_green_small, r75, i12), null, f4.g.b(m2.m(qVar, lVar.f43990b), l2.g.f26790a), hVar.Y, r75, 56, 0);
                ?? r76 = r75;
                r76.q(r122);
                r73 = r76;
                r12 = r122;
            } else {
                ?? r123 = i12;
                r75.a0(-779038245);
                r75.q(r123);
                r73 = r75;
                r12 = r123;
            }
            d2.c.f(m2.e(qVar, mVar.f44016m), r73);
            if (categoryCard.getTitle() == null) {
                r73.a0(1620931838);
                r73.q(r12);
                r03 = r12;
                r74 = r73;
            } else {
                r73.a0(1620931839);
                String title = categoryCard.getTitle();
                u0 u0Var = jVar.f43960i;
                long j9 = hVar.J;
                ?? r22 = r73;
                boolean z11 = r12 == true ? 1 : 0;
                r9.d(title, null, j9, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, u0Var, r22, 0, 24960, 110586);
                ?? r77 = r22;
                r77.q(z11);
                r03 = z11;
                r74 = r77;
            }
            r74.q(true);
            r02 = r03;
            r72 = r74;
        } else {
            r02 = 0;
            r75.U();
            r72 = r75;
        }
        w1 w1VarS = r72.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.s(tVar, categoryCard, i11, r02);
        }
    }

    public static final void c(BasketItem basketItem, BasketManager basketManager, int i11, u uVar, z zVar, Map map, i80.n nVar, m3.n nVar2, int i12) {
        basketManager.getClass();
        s sVar = (s) nVar2;
        sVar.c0(4633824);
        int i13 = (sVar.h(nVar) ? 1048576 : 524288) | i12 | (sVar.h(basketItem) ? 4 : 2) | (sVar.h(basketManager) ? 32 : 16) | (sVar.d(i11) ? 256 : 128) | (sVar.f(uVar) ? NewHope.SENDB_BYTES : 1024) | (sVar.f(zVar) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192) | (sVar.h(map) ? 131072 : 65536);
        if (sVar.R(i13 & 1, (599187 & i13) != 599186)) {
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = m3.i.w(basketManager);
                sVar.k0(objM);
            }
            b1 b1Var = (b1) objM;
            Object objM2 = sVar.M();
            if (objM2 == fVar) {
                objM2 = m3.i.w(Boolean.FALSE);
                sVar.k0(objM2);
            }
            b1 b1Var2 = (b1) objM2;
            boolean zH = sVar.h(basketItem);
            Object objM3 = sVar.M();
            if (zH || objM3 == fVar) {
                objM3 = new h0(basketItem, b1Var, b1Var2, 20);
                sVar.k0(objM3);
            }
            Function1 function1 = (Function1) objM3;
            Object objM4 = sVar.M();
            if (objM4 == fVar) {
                objM4 = new t1.w1(22);
                sVar.k0(objM4);
            }
            Function1 function12 = (Function1) objM4;
            float f11 = s7.f19478a;
            v7 v7Var = v7.Settled;
            z5.c cVar = (z5.c) sVar.j(x1.f7416h);
            Object[] objArr = new Object[0];
            ub.a aVar = new ub.a(28, new t0(16), new y0(cVar, function1, function12, 14));
            boolean zD = sVar.d(v7Var.ordinal()) | sVar.f(cVar) | sVar.f(function1);
            Object objM5 = sVar.M();
            if (zD || objM5 == fVar) {
                objM5 = new androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.c(8, v7Var, cVar, function1, function12);
                sVar.k0(objM5);
            }
            u7 u7Var = (u7) y3.j.d(objArr, aVar, (Function0) objM5, sVar, 0);
            float f12 = lv.t.f28253g;
            b4.q qVar = b4.q.f5711a;
            s7.a(u7Var, u3.e.e(1156776446, sVar, new tq.c(u7Var, 3)), b0.a(d2.c.B(qVar, f12, 0.0f, 2), null, 3), false, false, false, null, u3.e.e(-554591484, sVar, new oo.t(basketItem, basketManager, i11, uVar, map, nVar)), sVar, 12586040);
            d2.c.f(m2.m(qVar, f12), sVar);
            Boolean bool = (Boolean) b1Var2.getValue();
            bool.getClass();
            boolean zH2 = sVar.h(basketItem) | ((57344 & i13) == 16384) | ((i13 & 7168) == 2048);
            Object objM6 = sVar.M();
            if (zH2 || objM6 == fVar) {
                af.a aVar2 = new af.a(basketItem, zVar, uVar, b1Var2, b1Var, null, 3);
                sVar.k0(aVar2);
                objM6 = aVar2;
            }
            m3.i.h(bool, (Function2) objM6, sVar);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.a0(basketItem, basketManager, i11, uVar, zVar, map, nVar, i12);
        }
    }

    public static final void d(ElementMnuV2 elementMnuV2, BaseItemMnuV2 baseItemMnuV2, String str, ym.y yVar, m3.n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.c0(-1096030854);
        int i12 = (sVar.f(elementMnuV2) ? 4 : 2) | i11 | (sVar.h(baseItemMnuV2) ? 32 : 16) | (sVar.f(str) ? 256 : 128) | (sVar.f(yVar) ? NewHope.SENDB_BYTES : 1024);
        if (!sVar.R(i12 & 1, (i12 & 1171) != 1170)) {
            sVar.U();
        } else if (elementMnuV2 instanceof HighlightedItemCardsCarouselMnuV2) {
            sVar.a0(-1513561175);
            lx.u.j(baseItemMnuV2, str, yVar, sVar, (i12 >> 3) & 1022);
            sVar.q(false);
        } else {
            sVar.a0(-1513356110);
            m0.c.O(baseItemMnuV2, yVar, sVar, ((i12 >> 6) & 112) | ((i12 >> 3) & 14));
            sVar.q(false);
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.p(elementMnuV2, baseItemMnuV2, str, yVar, i11);
        }
    }

    public static final void e(ElementMnuV2 elementMnuV2, long j9, m3.n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.c0(-2035480144);
        int i12 = (sVar.f(elementMnuV2) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            boolean z11 = elementMnuV2 instanceof HighlightedItemCardsCarouselMnuV2;
            r0 r0Var = g0.f23254b;
            b4.q qVar = b4.q.f5711a;
            if (z11) {
                sVar.a0(1654452326);
                t tVarD = m2.d(qVar, 1.0f);
                d2.y yVarA = w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
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
                d2.c.f(m2.e(v1.n.j(m2.d(qVar, 1.0f), j9, r0Var), 38), sVar);
                d2.c.f(m2.e(v1.n.j(m2.d(qVar, 1.0f), lv.s.J, r0Var), lv.t.f28252f), sVar);
                sVar.q(true);
                sVar.q(false);
            } else if (elementMnuV2 instanceof ItemCarouselMnu) {
                sVar.a0(1655055865);
                d2.c.f(m2.e(v1.n.j(m2.d(qVar, 1.0f), j9, r0Var), lv.t.f28252f), sVar);
                sVar.q(false);
            } else if (elementMnuV2 instanceof ItemCarouselMnuV2) {
                sVar.a0(1655304857);
                d2.c.f(m2.e(v1.n.j(m2.d(qVar, 1.0f), j9, r0Var), lv.t.f28249c), sVar);
                sVar.q(false);
            } else {
                sVar.a0(1655531932);
                sVar.q(false);
            }
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new cn.l(elementMnuV2, j9, i11, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(ElementMnuV2 elementMnuV2, long j9, ym.y yVar, m3.n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.c0(725030855);
        int i12 = (sVar.f(elementMnuV2) ? 4 : 2) | i11;
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= (i11 & 512) == 0 ? sVar.f(yVar) : sVar.h(yVar) ? 256 : 128;
        }
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            long j11 = ((h) sVar.j(PantryThemeKt.getLocalPantryColor())).J;
            if (elementMnuV2 instanceof ItemCarouselMnu) {
                sVar.a0(969958178);
                int i13 = i12;
                lx.u.g((ItemCarouselMnu) elementMnuV2, j9, j11, yVar, sVar, (i13 & 126) | ((i13 << 3) & 7168));
                sVar.q(false);
            } else {
                int i14 = i12;
                if ((elementMnuV2 instanceof ItemCarouselMnuV2) || (elementMnuV2 instanceof HeroCarouselMnu)) {
                    sVar.a0(969966007);
                    CarouselWithTitle carouselWithTitle = (CarouselWithTitle) elementMnuV2;
                    m0.c.J(carouselWithTitle.getTitle(), carouselWithTitle.getSubtitle(), carouselWithTitle.getModularFeedAction(), j9, j11, yVar, sVar, 3072 | ((i14 << 9) & 458752));
                    sVar = sVar;
                    sVar.q(false);
                } else if (elementMnuV2 instanceof CategoryCarouselMnuV2) {
                    sVar.a0(969976702);
                    na0.a.J(((CategoryCarouselMnuV2) elementMnuV2).getTitle(), sVar, 0);
                    sVar.q(false);
                } else if (elementMnuV2 instanceof HighlightedItemCardsCarouselMnuV2) {
                    sVar.a0(969980160);
                    lx.u.d((HighlightedItemCardsCarouselMnuV2) elementMnuV2, j11, j9, yVar, sVar, (i14 & 14) | MLKEMEngine.KyberPolyBytes | ((i14 << 3) & 7168));
                    sVar.q(false);
                } else {
                    sVar.a0(4780081);
                    sVar.q(false);
                }
            }
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new cn.k(elementMnuV2, j9, yVar, i11);
        }
    }

    public static final void g(ElementMnuV2 elementMnuV2, String str, int i11, ym.y yVar, m3.n nVar, int i12) {
        s sVar = (s) nVar;
        sVar.c0(-659390524);
        int i13 = i12 | (sVar.f(elementMnuV2) ? 4 : 2) | (sVar.f(str) ? 32 : 16) | (sVar.d(i11) ? 256 : 128) | (sVar.f(yVar) ? NewHope.SENDB_BYTES : 1024);
        if (!sVar.R(i13 & 1, (i13 & 1171) != 1170)) {
            sVar.U();
        } else if ((elementMnuV2 instanceof CategoryCarouselMnuV2) || (elementMnuV2 instanceof ItemCarouselMnu) || (elementMnuV2 instanceof HighlightedItemCardsCarouselMnuV2)) {
            sVar.a0(1277678648);
            h(elementMnuV2, str, i11, yVar, sVar, i13 & 8190);
            sVar.q(false);
        } else if ((elementMnuV2 instanceof ItemCarouselMnuV2) || (elementMnuV2 instanceof HeroCarouselMnu)) {
            sVar.a0(1277851101);
            t tVarD = m2.d(b4.q.f5711a, 1.0f);
            float f11 = lv.t.f28253g;
            float f12 = lv.t.f28251e;
            float f13 = 24;
            q7.a(d2.c.D(tVarD, f11, f12, 0.0f, f12, 4), l2.g.c(f13, 0.0f, 0.0f, f13, 6), lv.s.J, 0L, 0.0f, 0.0f, null, u3.e.e(-1231483256, sVar, new an.i(elementMnuV2, str, i11, yVar, 1)), sVar, 12583302, 120);
            sVar.q(false);
        } else {
            sVar.a0(1278516392);
            sVar.q(false);
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new an.i(elementMnuV2, str, i11, yVar, i12, 2);
        }
    }

    public static final void h(ElementMnuV2 elementMnuV2, String str, int i11, ym.y yVar, m3.n nVar, int i12) {
        s sVar;
        s sVar2 = (s) nVar;
        sVar2.c0(998001435);
        int i13 = i12 | (sVar2.f(elementMnuV2) ? 4 : 2) | (sVar2.f(str) ? 32 : 16) | (sVar2.d(i11) ? 256 : 128) | (sVar2.f(yVar) ? NewHope.SENDB_BYTES : 1024);
        if (sVar2.R(i13 & 1, (i13 & 1171) != 1170)) {
            c0 c0VarA = e0.a(0, 0, 0, 3, sVar2);
            Object objM = sVar2.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                AdapterItemType elementType = elementMnuV2.getElementType();
                int i14 = elementType == null ? -1 : cn.m.$EnumSwitchMapping$0[elementType.ordinal()];
                objM = new v(i14 != 1 ? i14 != 2 ? i14 != 3 ? lv.s.J : lv.s.f28245z : lv.s.H : lv.s.I);
                sVar2.k0(objM);
            }
            long j9 = ((v) objM).f23317a;
            b4.q qVar = b4.q.f5711a;
            t tVarJ = v1.n.j(m2.d(qVar, 1.0f), j9, g0.f23254b);
            d2.y yVarA = w.a(d2.i.f13803c, b4.d.f5694m, sVar2, 0);
            int iHashCode = Long.hashCode(sVar2.T);
            u3.i iVarL = sVar2.l();
            t tVarC = b4.a.c(tVarJ, sVar2);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(hVar);
            } else {
                sVar2.n0();
            }
            m3.i.C(yVarA, b5.i.f5843f, sVar2);
            m3.i.C(iVarL, b5.i.f5842e, sVar2);
            m3.i.v(sVar2, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar2, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar2);
            int i15 = i13 & 14;
            int i16 = i15 | 48;
            f(elementMnuV2, j9, yVar, sVar2, ((i13 >> 3) & 896) | i16);
            t tVarD = d2.c.D(qVar, 0.0f, lv.t.f28249c, 0.0f, 0.0f, 13);
            float f11 = lv.t.f28251e;
            b2 b2VarE = d2.c.e(f11, 0.0f, f11, 0.0f, 10);
            boolean z11 = (i15 == 4) | ((i13 & 896) == 256) | ((i13 & 7168) == 2048) | ((i13 & 112) == 32);
            Object objM2 = sVar2.M();
            if (z11 || objM2 == fVar) {
                objM2 = new cn.j(elementMnuV2, i11, yVar, str);
                sVar2.k0(objM2);
            }
            ox.h.d(tVarD, c0VarA, b2VarE, false, null, null, null, false, null, (Function1) objM2, sVar2, 390, 504);
            sVar = sVar2;
            e(elementMnuV2, j9, sVar, i16);
            sVar.q(true);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new an.i(elementMnuV2, str, i11, yVar, i12, 3);
        }
    }

    public static final void i(t tVar, g9.f0 f0Var, Function1 function1, m3.n nVar, int i11) {
        f0Var.getClass();
        function1.getClass();
        s sVar = (s) nVar;
        sVar.c0(-1081347306);
        int i12 = (sVar.h(f0Var) ? 32 : 16) | i11 | (sVar.h(function1) ? 256 : 128);
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            lv.w.a(false, u3.e.e(-1400140148, sVar, new am.b(f0Var, tVar, function1)), sVar, MLKEMEngine.KyberPolyBytes);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new am.b(tVar, f0Var, function1, i11);
        }
    }

    public static final yc.e j(Context context, ed.q qVar, o oVar) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(ConnectivityManager.class);
        if (connectivityManager == null || androidx.core.app.e.a(context, "android.permission.ACCESS_NETWORK_STATE") != 0) {
            if (oVar != null && oVar.getLevel() <= 5) {
                oVar.log("NetworkObserver", 5, "Unable to register network observer.", null);
            }
            return new y00.e0(8);
        }
        try {
            return new t5.a(connectivityManager, qVar);
        } catch (Exception e5) {
            if (oVar != null) {
                RuntimeException runtimeException = new RuntimeException("Failed to register network observer.", e5);
                if (oVar.getLevel() <= 6) {
                    oVar.log("NetworkObserver", 6, null, runtimeException);
                }
            }
            return new y00.e0(8);
        }
    }

    public static final void k(CategoryCard categoryCard, ym.y yVar, m3.n nVar, int i11) {
        CategoryCard categoryCard2;
        ym.y yVar2;
        categoryCard.getClass();
        s sVar = (s) nVar;
        sVar.c0(-1813716990);
        int i12 = (sVar.h(categoryCard) ? 4 : 2) | i11 | (sVar.f(yVar) ? 32 : 16);
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            Object objM = sVar.M();
            if (objM == m3.m.f29332a) {
                objM = a0.g(sVar);
            }
            b2.l lVar = (b2.l) objM;
            x60.l lVar2 = (x60.l) sVar.j(PantryThemeKt.getLocalPantrySize());
            z4.u0 u0VarD = d2.p.d(b4.d.f5683a, false);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(b4.q.f5711a, sVar);
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
            categoryCard2 = categoryCard;
            yVar2 = yVar;
            m3.i.b(new v1[]{b3.i.t(((z5.c) sVar.j(d3Var)).a(), 1.0f, d3Var), s5.f19473a.a(cg.j.t())}, u3.e.e(-141852676, sVar, new bn.p(0, lVar, lVar2, yVar2, categoryCard2)), sVar, 56);
            sVar.q(true);
        } else {
            categoryCard2 = categoryCard;
            yVar2 = yVar;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.q(categoryCard2, yVar2, i11, 0);
        }
    }

    public static final void l(final OrderState orderState, final boolean z11, final boolean z12, m3.n nVar, final int i11) {
        orderState.getClass();
        s sVar = (s) nVar;
        sVar.c0(30536897);
        int i12 = (sVar.d(orderState.ordinal()) ? 4 : 2) | i11;
        if ((i11 & 48) == 0) {
            i12 |= sVar.g(z11) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.g(z12) ? 256 : 128;
        }
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            Integer numValueOf = Integer.valueOf(R.drawable.system_icon_cancelled);
            int[] iArr = ho.n.$EnumSwitchMapping$0;
            Integer numValueOf2 = null;
            switch (iArr[orderState.ordinal()]) {
                case 1:
                    numValueOf = Integer.valueOf(R.drawable.system_icon_collected);
                    break;
                case 2:
                case 7:
                    break;
                case 3:
                    numValueOf = Integer.valueOf(R.drawable.system_icon_unredeemed);
                    break;
                case 4:
                    numValueOf = Integer.valueOf(R.drawable.system_icon_uncollected);
                    break;
                case 5:
                case 6:
                    numValueOf = Integer.valueOf(R.drawable.system_icon_refunded);
                    break;
                default:
                    numValueOf = null;
                    break;
            }
            if (numValueOf == null) {
                sVar.a0(-808255384);
                sVar.q(false);
            } else {
                sVar.a0(-808255383);
                v1.n.d(x0.z(numValueOf.intValue(), sVar, 0), null, null, null, null, 0.0f, null, sVar, 56, 124);
                sVar.q(false);
            }
            Integer numValueOf3 = Integer.valueOf(R.string.order_status_state_cancelled);
            switch (iArr[orderState.ordinal()]) {
                case 1:
                    numValueOf2 = Integer.valueOf((z12 || !z11) ? z12 ? R.string.order_status_state_redeemed : R.string.orderview_delegate_redeemed_as_collecting_user : R.string.orderview_delegate_redeemed_as_owner);
                    break;
                case 2:
                case 7:
                    numValueOf2 = numValueOf3;
                    break;
                case 3:
                    numValueOf2 = Integer.valueOf(R.string.order_status_state_unredeemed);
                    break;
                case 4:
                    numValueOf2 = Integer.valueOf(R.string.order_status_state_uncollected);
                    break;
                case 5:
                case 6:
                    numValueOf2 = Integer.valueOf(R.string.order_status_state_refunded);
                    break;
                case 8:
                    numValueOf2 = Integer.valueOf(R.string.orderview_delegate_label_info_state);
                    break;
            }
            if (numValueOf2 == null) {
                sVar.a0(-808105685);
                sVar.q(false);
            } else {
                sVar.a0(-808105684);
                r9.d(o30.f0.U(sVar, numValueOf2.intValue()), d2.c.D(b4.q.f5711a, 4, 0.0f, 0.0f, 0.0f, 14), lv.s.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28277q, sVar, 432, 12582912, 131064);
                sVar = sVar;
                sVar.q(false);
            }
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new Function2() { // from class: ho.m
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iF = m3.i.F(i11 | 1);
                    jf.e.l(orderState, z11, z12, (m3.n) obj, iF);
                    return Unit.f26487a;
                }
            };
        }
    }

    public static final void m(t tVar, u3.d dVar, m3.n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.c0(-1854833411);
        int i12 = (sVar.f(tVar) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            Object objM = sVar.M();
            if (objM == m3.m.f29332a) {
                objM = w2.f612a;
                sVar.k0(objM);
            }
            z4.u0 u0Var = (z4.u0) objM;
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVar, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(u0Var, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            r8.k.w(6, dVar, sVar, true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new u2(tVar, dVar, i11, 0);
        }
    }

    public static final void n(Logger logger, t90.a aVar, t90.c cVar, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(cVar.f39870b);
        sb2.append(' ');
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        sb2.append(String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)));
        sb2.append(": ");
        sb2.append(aVar.f39863a);
        logger.fine(sb2.toString());
    }

    public static void o(StringBuilder sb2, String str, Map map) {
        String strValueOf;
        if (map.isEmpty()) {
            sb2.append(str.concat(": (None)\n"));
            return;
        }
        sb2.append(str.concat("\n"));
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            if (key instanceof CameraCharacteristics.Key) {
                strValueOf = ((CameraCharacteristics.Key) key).getName();
                strValueOf.getClass();
            } else if (key instanceof CaptureRequest.Key) {
                strValueOf = ((CaptureRequest.Key) key).getName();
                strValueOf.getClass();
            } else if (key instanceof CaptureResult.Key) {
                strValueOf = ((CaptureResult.Key) key).getName();
                strValueOf.getClass();
            } else {
                strValueOf = String.valueOf(key);
            }
            Object value = entry.getValue();
            arrayList.add(new Pair(strValueOf, value instanceof Object[] ? kotlin.collections.y.H((Object[]) value, null, "[", "]", new g9.r0(21), 25) : String.valueOf(value)));
        }
        for (Pair pair : CollectionsKt.l0(arrayList, new r(10))) {
            sb2.append("  " + StringsKt.L(50, (String) pair.f26485a) + ' ' + ((String) pair.f26486b) + '\n');
        }
    }

    public static Handler p(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return a3.f(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e5) {
            e = e5;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InstantiationException e11) {
            e = e11;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (NoSuchMethodException e12) {
            e = e12;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e13) {
            Throwable cause = e13.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            org.bouncycastle.jce.provider.a.m(cause);
            return null;
        }
    }

    public static Bundle q(int i11, Parcel parcel) {
        int iU = U(i11, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iU == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iU);
        return bundle;
    }

    public static byte[] r(int i11, Parcel parcel) {
        int iU = U(i11, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iU == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iU);
        return bArrCreateByteArray;
    }

    public static byte[][] s(int i11, Parcel parcel) {
        int iU = U(i11, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iU == 0) {
            return null;
        }
        int i12 = parcel.readInt();
        byte[][] bArr = new byte[i12][];
        for (int i13 = 0; i13 < i12; i13++) {
            bArr[i13] = parcel.createByteArray();
        }
        parcel.setDataPosition(iDataPosition + iU);
        return bArr;
    }

    public static int[] t(int i11, Parcel parcel) {
        int iU = U(i11, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iU == 0) {
            return null;
        }
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iDataPosition + iU);
        return iArrCreateIntArray;
    }

    public static ArrayList u(int i11, Parcel parcel) {
        int iU = U(i11, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iU == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i12 = parcel.readInt();
        for (int i13 = 0; i13 < i12; i13++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(iDataPosition + iU);
        return arrayList;
    }

    public static Parcelable v(Parcel parcel, int i11, Parcelable.Creator creator) {
        int iU = U(i11, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iU == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iU);
        return parcelable;
    }

    public static String w(int i11, Parcel parcel) {
        int iU = U(i11, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iU == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iU);
        return string;
    }

    public static String[] x(int i11, Parcel parcel) {
        int iU = U(i11, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iU == 0) {
            return null;
        }
        String[] strArrCreateStringArray = parcel.createStringArray();
        parcel.setDataPosition(iDataPosition + iU);
        return strArrCreateStringArray;
    }

    public static ArrayList y(int i11, Parcel parcel) {
        int iU = U(i11, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iU == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iU);
        return arrayListCreateStringArrayList;
    }

    public static Object[] z(Parcel parcel, int i11, Parcelable.Creator creator) {
        int iU = U(i11, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iU == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iU);
        return objArrCreateTypedArray;
    }

    public abstract void D(n20.y yVar, float f11, float f12);
}
