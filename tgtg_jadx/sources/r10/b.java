package r10;

import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f37532b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(CarouselLayoutManager carouselLayoutManager) {
        super(1);
        this.f37532b = carouselLayoutManager;
    }

    @Override // r10.d
    public final int a() {
        return this.f37532b.getHeight();
    }

    @Override // r10.d
    public final int b() {
        return this.f37532b.getPaddingLeft();
    }

    @Override // r10.d
    public final int c() {
        CarouselLayoutManager carouselLayoutManager = this.f37532b;
        return carouselLayoutManager.getWidth() - carouselLayoutManager.getPaddingRight();
    }

    @Override // r10.d
    public final int d() {
        return 0;
    }

    @Override // r10.d
    public final int e() {
        return 0;
    }
}
