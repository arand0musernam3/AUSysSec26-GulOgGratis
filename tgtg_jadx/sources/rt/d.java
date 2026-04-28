package rt;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.adyen.checkout.ui.core.internal.ui.view.RoundCornerImageView;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.item.LatLngInfo;
import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.ui.RotationLayout;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import n00.h;
import n00.i;
import n00.j;
import om.n;
import oz.m;
import qc.y;
import u00.g;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d implements st.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f38233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f38234b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f38235c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public n f38236d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f38237e;

    public d(m mVar) {
        this.f38233a = mVar;
        this.f38237e = mVar.q().f12142b;
        mVar.x(new c(this));
        mVar.w(new c(this));
    }

    public final String b(st.b bVar, double d3, int i11) {
        j hVar;
        m mVar = this.f38233a;
        v00.c cVar = new v00.c();
        cVar.f41636a = null;
        cVar.f41637b = 0.0d;
        cVar.f41638c = 10.0f;
        cVar.f41639d = RoundCornerImageView.DEFAULT_STROKE_COLOR;
        cVar.f41640e = 0;
        cVar.f41641f = 0.0f;
        cVar.f41642g = true;
        cVar.f41643h = false;
        cVar.f41644i = null;
        cVar.f41636a = new LatLng(bVar.f39278a, bVar.f39279b);
        cVar.f41637b = d3;
        cVar.f41639d = i11;
        try {
            g gVar = (g) mVar.f33836b;
            Parcel parcelL = gVar.L();
            n00.d.c(parcelL, cVar);
            Parcel parcelJ = gVar.J(35, parcelL);
            IBinder strongBinder = parcelJ.readStrongBinder();
            int i12 = i.f30270h;
            if (strongBinder == null) {
                hVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                hVar = iInterfaceQueryLocalInterface instanceof j ? (j) iInterfaceQueryLocalInterface : new h(strongBinder, "com.google.android.gms.maps.model.internal.ICircleDelegate", 5);
            }
            parcelJ.recycle();
            v00.b bVar2 = new v00.b(hVar);
            this.f38234b.put(bVar2.a(), bVar2);
            String strA = bVar2.a();
            strA.getClass();
            return strA;
        } catch (RemoteException e5) {
            y.l(e5);
            return null;
        }
    }

    public final void c(LatLngInfo latLngInfo, ConstraintLayout constraintLayout, Context context) {
        latLngInfo.getClass();
        constraintLayout.getClass();
        context.getClass();
        m50.a aVar = new m50.a(context);
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.amu_text_bubble, (ViewGroup) null);
        RotationLayout rotationLayout = (RotationLayout) viewGroup.getChildAt(0);
        TextView textView = (TextView) rotationLayout.findViewById(R.id.amu_text);
        aVar.f29678c = -1;
        viewGroup.setBackgroundDrawable(aVar);
        Rect rect = new Rect();
        aVar.getPadding(rect);
        viewGroup.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        if (textView != null) {
            textView.setTextAppearance(context, R.style.amu_Bubble_TextAppearance_Dark);
        }
        if (textView != null) {
            textView.setTextAppearance(context, R.style.Body2_White);
        }
        rotationLayout.removeAllViews();
        rotationLayout.addView(constraintLayout);
        rotationLayout.findViewById(R.id.amu_text);
        viewGroup.setBackgroundDrawable(null);
        viewGroup.setPadding(0, 0, 0, 0);
        v00.g gVar = new v00.g();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        viewGroup.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        int measuredWidth = viewGroup.getMeasuredWidth();
        int measuredHeight = viewGroup.getMeasuredHeight();
        viewGroup.layout(0, 0, measuredWidth, measuredHeight);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.eraseColor(0);
        viewGroup.draw(new Canvas(bitmapCreateBitmap));
        gVar.f41654d = android.support.v4.media.session.a.q(bitmapCreateBitmap);
        gVar.f41651a = xz.b.L(latLngInfo);
        gVar.f41655e = 0.5f;
        gVar.f41656f = 0.5f;
        v00.f fVarL = this.f38233a.l(gVar);
        if (fVarL != null) {
            this.f38235c.put(latLngInfo, fVarL);
        }
    }

    public final void d(LatLngInfo latLngInfo, Bitmap bitmap, Context context) {
        latLngInfo.getClass();
        bitmap.getClass();
        context.getClass();
        v00.g gVar = new v00.g();
        gVar.f41654d = android.support.v4.media.session.a.q(bitmap);
        gVar.f41651a = xz.b.L(latLngInfo);
        gVar.f41655e = 0.5f;
        gVar.f41656f = 0.5f;
        v00.f fVarL = this.f38233a.l(gVar);
        if (fVarL != null) {
            this.f38235c.put(latLngInfo, fVarL);
        }
    }

    public final void e(st.b bVar, Float f11, Function0 function0, Function0 function02) {
        bVar.getClass();
        this.f38233a.m(ba0.g.E(new LatLng(bVar.f39278a, bVar.f39279b), f11.floatValue()), new m(17, function0, function02));
    }

    public final st.b f(Point point) {
        try {
            u00.b bVar = (u00.b) this.f38233a.r().f28697a;
            yz.b bVar2 = new yz.b(point);
            Parcel parcelL = bVar.L();
            n00.d.d(parcelL, bVar2);
            Parcel parcelJ = bVar.J(1, parcelL);
            LatLng latLng = (LatLng) n00.d.a(parcelJ, LatLng.CREATOR);
            parcelJ.recycle();
            latLng.getClass();
            return new st.b(latLng.f12145a, latLng.f12146b);
        } catch (RemoteException e5) {
            y.l(e5);
            return null;
        }
    }

    public final Location g() {
        Location location = new Location("");
        m mVar = this.f38233a;
        location.setLongitude(mVar.q().f12141a.f12146b);
        location.setLatitude(mVar.q().f12141a.f12145a);
        return location;
    }

    public final float h() {
        try {
            g gVar = (g) this.f38233a.f33836b;
            Parcel parcelJ = gVar.J(2, gVar.L());
            float f11 = parcelJ.readFloat();
            parcelJ.recycle();
            return f11;
        } catch (RemoteException e5) {
            y.l(e5);
            return 0.0f;
        }
    }

    public final xk.b i() {
        m mVar = this.f38233a;
        LatLng latLng = mVar.r().u().f41674e.f12147a;
        latLng.getClass();
        LatLngInfo latLngInfo = new LatLngInfo(latLng.f12145a, latLng.f12146b);
        LatLng latLng2 = mVar.r().u().f41674e.f12148b;
        latLng2.getClass();
        return new xk.b(latLngInfo, new LatLngInfo(latLng2.f12145a, latLng2.f12146b));
    }

    public final float j() {
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            this.f38237e = this.f38233a.q().f12142b;
        }
        return this.f38237e;
    }

    public final float k(String str) {
        str.getClass();
        float f11 = this.f38233a.q().f12142b;
        v00.b bVar = (v00.b) this.f38234b.get(str);
        if (bVar == null) {
            return f11;
        }
        try {
            h hVar = (h) bVar.f41635a;
            Parcel parcelJ = hVar.J(6, hVar.L());
            double d3 = parcelJ.readDouble();
            parcelJ.recycle();
            return (float) (((double) 16) - (Math.log((d3 * ((double) 2)) / ((double) 500)) / Math.log(2.0d)));
        } catch (RemoteException e5) {
            y.l(e5);
            return 0.0f;
        }
    }

    public final void l(String str) {
        str.getClass();
        LinkedHashMap linkedHashMap = this.f38234b;
        v00.b bVar = (v00.b) linkedHashMap.get(str);
        if (bVar != null) {
            try {
                h hVar = (h) bVar.f41635a;
                hVar.M(1, hVar.L());
            } catch (RemoteException e5) {
                y.l(e5);
                return;
            }
        }
        linkedHashMap.remove(str);
    }

    public final void m(LatLngInfo latLngInfo) {
        latLngInfo.getClass();
        v00.f fVar = (v00.f) this.f38235c.get(latLngInfo);
        if (fVar != null) {
            try {
                n00.a aVar = (n00.a) fVar.f41650a;
                aVar.M(1, aVar.L());
            } catch (RemoteException e5) {
                y.l(e5);
            }
        }
    }

    public final void n() {
        jd.f fVarS = this.f38233a.s();
        fVarS.getClass();
        try {
            u00.c cVar = (u00.c) fVarS.f24983b;
            Parcel parcelL = cVar.L();
            int i11 = n00.d.f30268a;
            parcelL.writeInt(0);
            cVar.M(8, parcelL);
        } catch (RemoteException e5) {
            y.l(e5);
        }
    }

    public final void o(Context context) {
        context.getClass();
        m mVar = this.f38233a;
        InputStream inputStreamOpenRawResource = context.getResources().openRawResource(R.raw.map_style);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                try {
                    int i11 = inputStreamOpenRawResource.read(bArr, 0, 1024);
                    if (i11 == -1) {
                        vz.c.a(inputStreamOpenRawResource);
                        vz.c.a(byteArrayOutputStream);
                        v00.e eVar = new v00.e(new String(byteArrayOutputStream.toByteArray(), StandardCharsets.UTF_8));
                        try {
                            g gVar = (g) mVar.f33836b;
                            Parcel parcelL = gVar.L();
                            n00.d.c(parcelL, eVar);
                            Parcel parcelJ = gVar.J(91, parcelL);
                            parcelJ.readInt();
                            parcelJ.recycle();
                            return;
                        } catch (RemoteException e5) {
                            y.l(e5);
                            return;
                        }
                    }
                    byteArrayOutputStream.write(bArr, 0, i11);
                } catch (Throwable th2) {
                    vz.c.a(inputStreamOpenRawResource);
                    vz.c.a(byteArrayOutputStream);
                    throw th2;
                }
            }
        } catch (IOException e11) {
            throw new Resources.NotFoundException("Failed to read resource " + R.raw.map_style + ": " + e11.toString());
        }
    }

    public final void p() {
        jd.f fVarS = this.f38233a.s();
        fVarS.getClass();
        try {
            u00.c cVar = (u00.c) fVarS.f24983b;
            Parcel parcelL = cVar.L();
            int i11 = n00.d.f30268a;
            parcelL.writeInt(0);
            cVar.M(18, parcelL);
        } catch (RemoteException e5) {
            y.l(e5);
        }
    }

    public final void q() {
        jd.f fVarS = this.f38233a.s();
        fVarS.getClass();
        try {
            u00.c cVar = (u00.c) fVarS.f24983b;
            Parcel parcelL = cVar.L();
            int i11 = n00.d.f30268a;
            parcelL.writeInt(0);
            cVar.M(3, parcelL);
        } catch (RemoteException e5) {
            y.l(e5);
        }
    }

    public final void r(boolean z11) {
        try {
            g gVar = (g) this.f38233a.f33836b;
            Parcel parcelL = gVar.L();
            int i11 = n00.d.f30268a;
            parcelL.writeInt(z11 ? 1 : 0);
            gVar.M(22, parcelL);
        } catch (RemoteException e5) {
            y.l(e5);
        }
    }

    public final void s(Function0 function0) {
        mp.a aVar = new mp.a(function0, 7);
        m mVar = this.f38233a;
        g gVar = (g) mVar.f33836b;
        try {
            t00.g gVar2 = new t00.g(mVar, aVar, (char) 0);
            Parcel parcelL = gVar.L();
            n00.d.d(parcelL, gVar2);
            gVar.M(97, parcelL);
        } catch (RemoteException e5) {
            y.l(e5);
        }
    }

    public final void t() {
        jd.f fVarS = this.f38233a.s();
        fVarS.getClass();
        try {
            u00.c cVar = (u00.c) fVarS.f24983b;
            Parcel parcelL = cVar.L();
            int i11 = n00.d.f30268a;
            parcelL.writeInt(0);
            cVar.M(7, parcelL);
        } catch (RemoteException e5) {
            y.l(e5);
        }
    }

    public final void u(boolean z11) {
        jd.f fVarS = this.f38233a.s();
        fVarS.getClass();
        try {
            u00.c cVar = (u00.c) fVarS.f24983b;
            Parcel parcelL = cVar.L();
            int i11 = n00.d.f30268a;
            parcelL.writeInt(z11 ? 1 : 0);
            cVar.M(4, parcelL);
        } catch (RemoteException e5) {
            y.l(e5);
        }
    }

    public final void v() {
        jd.f fVarS = this.f38233a.s();
        fVarS.getClass();
        try {
            u00.c cVar = (u00.c) fVarS.f24983b;
            Parcel parcelL = cVar.L();
            int i11 = n00.d.f30268a;
            parcelL.writeInt(0);
            cVar.M(6, parcelL);
        } catch (RemoteException e5) {
            y.l(e5);
        }
    }

    public final void w() {
        jd.f fVarS = this.f38233a.s();
        fVarS.getClass();
        try {
            u00.c cVar = (u00.c) fVarS.f24983b;
            Parcel parcelL = cVar.L();
            int i11 = n00.d.f30268a;
            parcelL.writeInt(0);
            cVar.M(1, parcelL);
        } catch (RemoteException e5) {
            y.l(e5);
        }
    }

    public final void x(boolean z11) {
        jd.f fVarS = this.f38233a.s();
        fVarS.getClass();
        try {
            u00.c cVar = (u00.c) fVarS.f24983b;
            Parcel parcelL = cVar.L();
            int i11 = n00.d.f30268a;
            parcelL.writeInt(z11 ? 1 : 0);
            cVar.M(5, parcelL);
        } catch (RemoteException e5) {
            y.l(e5);
        }
    }
}
