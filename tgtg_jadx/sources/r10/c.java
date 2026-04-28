package r10;

import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f37533b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CarouselLayoutManager carouselLayoutManager) {
        super(0);
        this.f37533b = carouselLayoutManager;
    }

    @Override // r10.d
    public final int a() {
        CarouselLayoutManager carouselLayoutManager = this.f37533b;
        return carouselLayoutManager.getHeight() - carouselLayoutManager.getPaddingBottom();
    }

    @Override // r10.d
    public final int b() {
        return 0;
    }

    @Override // r10.d
    public final int c() {
        return this.f37533b.getWidth();
    }

    @Override // r10.d
    public final int d() {
        CarouselLayoutManager carouselLayoutManager = this.f37533b;
        if (carouselLayoutManager.f()) {
            return carouselLayoutManager.getWidth();
        }
        return 0;
    }

    @Override // r10.d
    public final int e() {
        return this.f37533b.getPaddingTop();
    }
}
