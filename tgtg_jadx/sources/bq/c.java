package bq;

import a3.x0;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.app.tgtg.R;
import com.app.tgtg.feature.storeview.ui.StoreViewActivity;
import com.app.tgtg.model.remote.item.LatLngInfo;
import com.app.tgtg.model.remote.item.StoreInformation;
import com.app.tgtg.model.remote.item.StoreLocation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import oz.m;
import pg.t2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f6580i = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public cq.b f6581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public cq.d f6582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f6583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public rt.f f6584e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public st.a f6585f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final rt.a f6586g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t2 f6587h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.f6586g = new rt.a();
        this.f6587h = t2.a(LayoutInflater.from(getContext()), this);
        c();
        b();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    @Override // bq.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.app.tgtg.model.remote.item.StoreInformation r15, c6.y r16, zp.b r17) {
        /*
            Method dump skipped, instruction units count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bq.c.a(com.app.tgtg.model.remote.item.StoreInformation, c6.y, zp.b):void");
    }

    public final void b() {
        rt.f fVar = this.f6584e;
        rt.f fVar2 = null;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mapViewAdapter");
            fVar = null;
        }
        fVar.b(this.f6583d);
        rt.f fVar3 = this.f6584e;
        if (fVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mapViewAdapter");
        } else {
            fVar2 = fVar3;
        }
        fVar2.a(new x0(this, 26));
    }

    public final void c() {
        setLayoutParams(new RecyclerView.a(-1, -2));
        Context context = getContext();
        context.getClass();
        this.f6586g.getClass();
        rt.f fVar = new rt.f(context);
        this.f6584e = fVar;
        FrameLayout frameLayout = (FrameLayout) this.f6587h.f35169f;
        t00.c cVar = fVar.f38239a;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mapView");
            cVar = null;
        }
        frameLayout.addView(cVar);
    }

    public final void d() {
        StoreLocation storeLocation;
        StoreInformation store = getStore();
        st.a aVar = null;
        LatLngInfo latLngInfo = (store == null || (storeLocation = store.getStoreLocation()) == null) ? null : storeLocation.getLatLngInfo();
        st.a aVar2 = this.f6585f;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mapAdapter");
        } else {
            aVar = aVar2;
        }
        Drawable drawable = getContext().getDrawable(R.drawable.system_icon_map_marker);
        if (latLngInfo != null && drawable != null) {
            rt.d dVar = (rt.d) aVar;
            dVar.getClass();
            m mVar = dVar.f38233a;
            v00.g gVar = new v00.g();
            Canvas canvas = new Canvas();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.getClass();
            canvas.setBitmap(bitmapCreateBitmap);
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            drawable.draw(canvas);
            gVar.f41654d = android.support.v4.media.session.a.q(bitmapCreateBitmap);
            gVar.f41651a = xz.b.L(latLngInfo);
            mVar.l(gVar);
        }
        st.a.a(aVar, new xk.a(latLngInfo, null, null, null, 14), 16.0f, 4);
        Context context = getContext();
        context.getClass();
        rt.d dVar2 = (rt.d) aVar;
        dVar2.o(context);
        dVar2.n();
        dVar2.p();
    }

    public c(StoreViewActivity storeViewActivity, Bundle bundle) {
        super(storeViewActivity);
        this.f6586g = new rt.a();
        this.f6587h = t2.a(LayoutInflater.from(getContext()), this);
        c();
        b();
        this.f6583d = bundle;
    }
}
