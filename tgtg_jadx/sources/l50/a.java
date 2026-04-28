package l50;

import a40.h;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.location.Location;
import android.os.Parcel;
import android.util.Size;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk;
import ax.a0;
import ax.m0;
import c5.a1;
import com.adyen.checkout.core.Environment;
import com.app.tgtg.model.remote.ItemId;
import com.app.tgtg.model.remote.OrderId;
import com.app.tgtg.model.remote.item.response.CancellingEntity;
import com.app.tgtg.model.remote.item.response.PackagingOptions;
import com.app.tgtg.model.remote.item.response.PaymentState;
import com.app.tgtg.model.remote.order.OrderItem;
import com.app.tgtg.model.remote.order.OrderState;
import com.app.tgtg.model.remote.payment.Icon;
import com.app.tgtg.model.remote.payment.SpecificationLine;
import com.braze.h2;
import com.google.android.gms.internal.measurement.j3;
import com.google.android.gms.internal.measurement.p3;
import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import h50.f;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.s0;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.text.StringsKt__StringsKt;
import m00.j;
import n20.o;
import n50.d;
import n80.p;
import o.l;
import o.w;
import o30.f0;
import org.json.JSONArray;
import pd.g;
import q5.x;
import qz.q;
import r0.n;
import r8.k;
import s0.c2;
import s0.e2;
import s0.g2;
import s0.i2;
import s0.r0;
import s0.y;
import tx.n0;
import u30.e;
import w9.c;
import xc.i;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;
import zw.q2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements b, q, d, w, x, q40.a, e, t50.b, c, i, y00.w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f27381b = new a(3);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a f27382c = new a(13);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a f27383d = new a(16);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a f27384e = new a(28);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f27385f = new a(29);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27386a;

    public /* synthetic */ a(int i11) {
        this.f27386a = i11;
    }

    public static void A(m0 m0Var, String str, String str2, Object... objArr) {
        m0Var.getClass();
        str.getClass();
        synchronized (a0.f4850b) {
        }
    }

    public static void C() {
        File[] fileArrListFiles;
        if (n0.v()) {
            return;
        }
        File fileT = p30.b.t();
        if (fileT == null) {
            fileArrListFiles = new File[0];
        } else {
            fileArrListFiles = fileT.listFiles(new h(5));
            if (fileArrListFiles == null) {
                fileArrListFiles = new File[0];
            }
        }
        ArrayList arrayList = new ArrayList(fileArrListFiles.length);
        for (File file : fileArrListFiles) {
            arrayList.add(ox.h.J(file));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((vx.d) obj).a()) {
                arrayList2.add(obj);
            }
        }
        List listL0 = CollectionsKt.l0(arrayList2, new a40.i(16));
        JSONArray jSONArray = new JSONArray();
        Iterator it = p.j(0, Math.min(listL0.size(), 5)).iterator();
        while (((n80.h) it).f30715c) {
            jSONArray.put(listL0.get(((s0) it).nextInt()));
        }
        p30.b.D("crash_reports", jSONArray, new wx.b(listL0, 1));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static Environment D(String str) {
        str.getClass();
        switch (str.hashCode()) {
            case -1837188962:
                if (str.equals("united_states")) {
                    return Environment.UNITED_STATES;
                }
                break;
            case -1291864670:
                if (str.equals("europe")) {
                    return Environment.EUROPE;
                }
                break;
            case 3001025:
                if (str.equals("apse")) {
                    return Environment.APSE;
                }
                break;
            case 933923200:
                if (str.equals("australia")) {
                    return Environment.AUSTRALIA;
                }
                break;
        }
        return Environment.EUROPE;
    }

    public static String E(String str) {
        str.getClass();
        return ItemId.m198constructorimpl(str);
    }

    public static String F(String str) {
        str.getClass();
        return OrderId.m210constructorimpl(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static s0.i2 G(int r5, android.util.Size r6, s0.o r7, int r8, s0.f2 r9, s0.c2 r10) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l50.a.G(int, android.util.Size, s0.o, int, s0.f2, s0.c2):s0.i2");
    }

    public static a m(Context context, int i11) {
        g.i("Cannot create a CalendarItemStyle with a styleResId of 0", i11 != 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i11, j10.a.A);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
        h0.g.p(context, typedArrayObtainStyledAttributes, 4);
        h0.g.p(context, typedArrayObtainStyledAttributes, 9);
        h0.g.p(context, typedArrayObtainStyledAttributes, 7);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        o.a(context, typedArrayObtainStyledAttributes.getResourceId(5, 0), typedArrayObtainStyledAttributes.getResourceId(6, 0)).a();
        typedArrayObtainStyledAttributes.recycle();
        a aVar = new a(25);
        g.l(rect.left);
        g.l(rect.top);
        g.l(rect.right);
        g.l(rect.bottom);
        return aVar;
    }

    public static i2 n(g2 g2Var, e2 e2Var, c2 c2Var) {
        g2Var.getClass();
        e2Var.getClass();
        c2Var.getClass();
        return new i2(g2Var, e2Var, c2Var);
    }

    public static String p(List list) {
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        String strM = "";
        while (it.hasNext()) {
            strM = k.m(strM, (String) it.next(), MessageLogView.COMMA_SEPARATOR);
        }
        return strM;
    }

    public static CancellingEntity q(String str) {
        if (str == null) {
            return null;
        }
        int iHashCode = str.hashCode();
        if (iHashCode == 62130991) {
            if (str.equals("ADMIN")) {
                return CancellingEntity.ADMIN;
            }
            return null;
        }
        if (iHashCode == 79233217) {
            if (str.equals("STORE")) {
                return CancellingEntity.STORE;
            }
            return null;
        }
        if (iHashCode == 214856694 && str.equals("CONSUMER")) {
            return CancellingEntity.CONSUMER;
        }
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static OrderState r(String str) {
        str.getClass();
        switch (str.hashCode()) {
            case -1750699932:
                if (str.equals("DELIVERED")) {
                    return OrderState.DELIVERED;
                }
                break;
            case -1536851811:
                if (str.equals("NOT_COLLECTED")) {
                    return OrderState.NOT_COLLECTED;
                }
                break;
            case -1515427533:
                if (str.equals("SHIPPED")) {
                    return OrderState.SHIPPED;
                }
                break;
            case -1415190787:
                if (str.equals("REFUNDED_OR_CANCELLED")) {
                    return OrderState.REFUNDED_OR_CANCELLED;
                }
                break;
            case -1031784143:
                if (str.equals("CANCELLED")) {
                    return OrderState.CANCELLED;
                }
                break;
            case -1015619173:
                if (str.equals("AUTHORIZED")) {
                    return OrderState.AUTHORIZED;
                }
                break;
            case -900969730:
                if (str.equals("COLLECTION_DELEGATED")) {
                    return OrderState.COLLECTION_DELEGATED;
                }
                break;
            case -476794961:
                if (str.equals("ABORTED")) {
                    return OrderState.ABORTED;
                }
                break;
            case 2408251:
                if (str.equals("REDEEMED")) {
                    return OrderState.REDEEMED;
                }
                break;
            case 2448076:
                if (str.equals("PAID")) {
                    return OrderState.PAID;
                }
                break;
            case 74702359:
                if (str.equals("REFUNDED")) {
                    return OrderState.REFUNDED;
                }
                break;
            case 732893662:
                if (str.equals("CAPTURED")) {
                    return OrderState.CAPTURED;
                }
                break;
            case 774655802:
                if (str.equals("COLLECTION_OFFERED")) {
                    return OrderState.COLLECTION_OFFERED;
                }
                break;
            case 1231102164:
                if (str.equals("UNREDEEMED")) {
                    return OrderState.UNREDEEMED;
                }
                break;
            case 1691233959:
                if (str.equals("AUTO_REFUNDED")) {
                    return OrderState.AUTO_REFUNDED;
                }
                break;
            case 1925346054:
                if (str.equals("ACTIVE")) {
                    return OrderState.ACTIVE;
                }
                break;
        }
        return OrderState.UNKNOWN;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static PackagingOptions s(String str) {
        str.getClass();
        switch (str.hashCode()) {
            case -1109365334:
                if (str.equals("CANT_BRING_ANYTHING")) {
                    return PackagingOptions.CANT_BRING_ANYTHING;
                }
                break;
            case -1061971296:
                if (str.equals("MUST_BRING_PACKAGING")) {
                    return PackagingOptions.MUST_BRING_PACKAGING;
                }
                break;
            case 161467441:
                if (str.equals("BAG_ALLOWED")) {
                    return PackagingOptions.BAG_ALLOWED;
                }
                break;
            case 1085646053:
                if (str.equals("MUST_BRING_BAG")) {
                    return PackagingOptions.MUST_BRING_BAG;
                }
                break;
            case 1911513500:
                if (str.equals("ADDITIONAL_CHARGES_MAY_APPLY")) {
                    return PackagingOptions.ADDITIONAL_CHARGES_MAY_APPLY;
                }
                break;
            case 1938566804:
                if (str.equals("ADDITIONAL_CHARGES_MANDATED")) {
                    return PackagingOptions.ADDITIONAL_CHARGES_MANDATED;
                }
                break;
        }
        return PackagingOptions.UNKNOWN;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static PaymentState t(String str) {
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case -1894284067:
                if (str.equals("RESERVATION_LIFTED")) {
                    return PaymentState.RESERVATION_LIFTED;
                }
                return null;
            case -1649913084:
                if (str.equals("ZERO_COST")) {
                    return PaymentState.ZERO_COST;
                }
                return null;
            case 321940110:
                if (str.equals("MONEY_RETURNED")) {
                    return PaymentState.MONEY_RETURNED;
                }
                return null;
            case 1685354716:
                if (str.equals("VOUCHER_REINSTATED")) {
                    return PaymentState.VOUCHER_REINSTATED;
                }
                return null;
            default:
                return null;
        }
    }

    public static ArrayList u(String str) {
        return (str == null || str.length() == 0) ? new ArrayList() : new ArrayList(StringsKt__StringsKt.split$default(str, new String[]{"\\s*,\\s*"}, false, 0, 6, null));
    }

    public static List w(String str) {
        if (str == null) {
            return null;
        }
        n90.b bVar = n90.c.f30748d;
        bVar.getClass();
        return (List) bVar.b(f0.B(new m90.d(Icon.INSTANCE.serializer(), 0)), str);
    }

    public static List x(String str) {
        n90.b bVar = n90.c.f30748d;
        bVar.getClass();
        return (List) bVar.b(new m90.d(OrderItem.INSTANCE.serializer(), 0), str);
    }

    public static List y(String str) {
        if (str == null) {
            return null;
        }
        n90.b bVar = n90.c.f30748d;
        bVar.getClass();
        return (List) bVar.b(f0.B(new m90.d(SpecificationLine.INSTANCE.serializer(), 0)), str);
    }

    public static void z(m0 m0Var, String str, String str2) {
        m0Var.getClass();
        str.getClass();
        synchronized (a0.f4850b) {
        }
    }

    public synchronized void B(String str) {
        str.getClass();
        a0.g(m0.INCLUDE_ACCESS_TOKENS);
        synchronized (this) {
            tx.f0.f40509e.put(str, "ACCESS_TOKEN_REMOVED");
        }
    }

    @Override // y00.w
    public Object a() {
        switch (this.f27386a) {
            case 28:
                return new Boolean(((Boolean) j3.f11506a.get()).booleanValue());
            default:
                return new Boolean(((Boolean) p3.f11744a.get()).booleanValue());
        }
    }

    @Override // qz.q
    public void accept(Object obj, Object obj2) {
        pz.d dVar;
        d10.g gVar = (d10.g) obj2;
        m00.h hVar = (m00.h) obj;
        s00.a aVar = new s00.a(LongCompanionObject.MAX_VALUE, 0, false, null);
        pz.d[] availableFeatures = hVar.getAvailableFeatures();
        pz.d dVar2 = null;
        if (availableFeatures != null) {
            int i11 = 0;
            while (true) {
                if (i11 >= availableFeatures.length) {
                    dVar = null;
                    break;
                }
                dVar = availableFeatures[i11];
                if ("location_updates_with_callback".equals(dVar.f35651a)) {
                    break;
                } else {
                    i11++;
                }
            }
            if (dVar != null && dVar.d() >= 1) {
                m00.w wVar = (m00.w) hVar.getService();
                j jVar = new j(4, null, new m00.d(1, gVar), null, null);
                Parcel parcelL = wVar.L();
                m00.b.b(parcelL, aVar);
                m00.b.b(parcelL, jVar);
                wVar.M(90, parcelL);
                return;
            }
        }
        pz.d[] availableFeatures2 = hVar.getAvailableFeatures();
        if (availableFeatures2 != null) {
            int i12 = 0;
            while (true) {
                if (i12 >= availableFeatures2.length) {
                    break;
                }
                pz.d dVar3 = availableFeatures2[i12];
                if ("get_last_location_with_request".equals(dVar3.f35651a)) {
                    dVar2 = dVar3;
                    break;
                }
                i12++;
            }
            if (dVar2 != null && dVar2.d() >= 1) {
                m00.w wVar2 = (m00.w) hVar.getService();
                m00.d dVar4 = new m00.d(1, gVar);
                Parcel parcelL2 = wVar2.L();
                m00.b.b(parcelL2, aVar);
                parcelL2.writeStrongBinder(dVar4);
                wVar2.M(82, parcelL2);
                return;
            }
        }
        m00.w wVar3 = (m00.w) hVar.getService();
        Parcel parcelL3 = wVar3.L();
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                wVar3.f11627h.transact(7, parcelL3, parcelObtain, 0);
                parcelObtain.readException();
                parcelL3.recycle();
                Location location = (Location) m00.b.a(parcelObtain, Location.CREATOR);
                parcelObtain.recycle();
                gVar.b(location);
            } catch (RuntimeException e5) {
                parcelObtain.recycle();
                throw e5;
            }
        } catch (Throwable th2) {
            parcelL3.recycle();
            throw th2;
        }
    }

    @Override // xc.i
    public xc.c b(xc.b bVar) {
        return null;
    }

    @Override // l50.b
    public Object d(f fVar) {
        return fVar.I;
    }

    @Override // u30.e
    public /* synthetic */ Object i(q2 q2Var) {
        return AnalyticsConnectorRegistrar.lambda$getComponents$0(q2Var);
    }

    @Override // t50.b
    public void j(t50.c cVar) {
        StringBuilder sb2;
        StringBuilder sb3 = new StringBuilder();
        sb3.append((char) 0);
        while (true) {
            boolean zB = cVar.b();
            sb2 = cVar.f39801c;
            if (!zB) {
                break;
            }
            sb3.append(cVar.a());
            int i11 = cVar.f39802d + 1;
            cVar.f39802d = i11;
            if (ex.i.C(i11, 5, cVar.f39799a) != 5) {
                cVar.f39803e = 0;
                break;
            }
        }
        int length = sb3.length() - 1;
        int length2 = sb2.length() + length + 1;
        cVar.c(length2);
        boolean z11 = cVar.f39804f.f39812b - length2 > 0;
        if (cVar.b() || z11) {
            if (length <= 249) {
                sb3.setCharAt(0, (char) length);
            } else if (length > 1555) {
                h2.b("Message length not in valid ranges: ".concat(String.valueOf(length)));
                return;
            } else {
                sb3.setCharAt(0, (char) ((length / androidx.recyclerview.widget.m0.DEFAULT_SWIPE_ANIMATION_DURATION) + 249));
                sb3.insert(1, (char) (length % androidx.recyclerview.widget.m0.DEFAULT_SWIPE_ANIMATION_DURATION));
            }
        }
        int length3 = sb3.length();
        for (int i12 = 0; i12 < length3; i12++) {
            int length4 = (((sb2.length() + 1) * 149) % 255) + 1 + sb3.charAt(i12);
            if (length4 > 255) {
                length4 -= 256;
            }
            cVar.d((char) length4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    @Override // n50.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public q50.b k(java.lang.String r21, n50.a r22, java.util.EnumMap r23) {
        /*
            Method dump skipped, instruction units count: 1130
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l50.a.k(java.lang.String, n50.a, java.util.EnumMap):q50.b");
    }

    public Object l(Object obj) throws ImageCaptureException {
        v0.d dVar;
        r0.d dVar2 = (r0.d) obj;
        m0.n0 n0Var = dVar2.f37447b;
        n nVar = dVar2.f37446a;
        if (zz.f.w(n0Var.getFormat())) {
            try {
                a1 a1Var = v0.d.f41591b;
                ByteBuffer byteBufferF = n0Var.o()[0].f();
                byteBufferF.rewind();
                byte[] bArr = new byte[byteBufferF.capacity()];
                byteBufferF.get(bArr);
                dVar = new v0.d(new o8.h(new ByteArrayInputStream(bArr)));
                n0Var.o()[0].f().rewind();
            } catch (IOException e5) {
                throw new ImageCaptureException(1, "Failed to extract EXIF data.", e5);
            }
        } else {
            dVar = null;
        }
        int i11 = 15;
        if (((ImageCaptureRotationOptionQuirk) z0.a.f46383a.b(ImageCaptureRotationOptionQuirk.class)) != null) {
            s0.g gVar = r0.f38435f;
        } else if (zz.f.w(n0Var.getFormat())) {
            g.m(dVar, "JPEG image must have exif.");
            Size size = new Size(n0Var.b(), n0Var.getHeight());
            int iB = nVar.f37487e - dVar.b();
            Size size2 = v0.o.d(v0.o.j(iB)) ? new Size(size.getHeight(), size.getWidth()) : size;
            Matrix matrixA = v0.o.a(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), new RectF(0.0f, 0.0f, size2.getWidth(), size2.getHeight()), iB, false);
            RectF rectF = new RectF(nVar.f37486d);
            matrixA.mapRect(rectF);
            rectF.sort();
            Rect rect = new Rect();
            rectF.round(rect);
            Size size3 = size2;
            int iB2 = dVar.b();
            Matrix matrix = new Matrix(nVar.f37489g);
            matrix.postConcat(matrixA);
            y cVar = n0Var.Y() instanceof y0.b ? ((y0.b) n0Var.Y()).f44537a : new l20.c(i11);
            n0Var.getFormat();
            return new c1.b(n0Var, dVar, n0Var.getFormat(), size3, rect, iB2, matrix, cVar);
        }
        v0.d dVar3 = dVar;
        Rect rect2 = nVar.f37486d;
        int i12 = nVar.f37487e;
        Matrix matrix2 = nVar.f37489g;
        y cVar2 = n0Var.Y() instanceof y0.b ? ((y0.b) n0Var.Y()).f44537a : new l20.c(i11);
        Size size4 = new Size(n0Var.b(), n0Var.getHeight());
        if (zz.f.w(n0Var.getFormat())) {
            g.m(dVar3, "JPEG image must have Exif.");
        }
        return new c1.b(n0Var, dVar3, n0Var.getFormat(), size4, rect2, i12, matrix2, cVar2);
    }

    @Override // o.w
    public boolean v(l lVar) {
        return false;
    }

    @Override // w9.c
    public void f() {
    }

    @Override // xc.i
    public void c(int i11) {
    }

    @Override // w9.c
    public void g(int i11, Object obj) {
    }

    @Override // o.w
    public void h(l lVar, boolean z11) {
    }

    @Override // xc.i
    public void e(xc.b bVar, Bitmap bitmap, Map map, int i11) {
    }
}
