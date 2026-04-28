package hp;

import com.app.tgtg.model.remote.mapService.response.MapClustersResponse;
import com.app.tgtg.model.remote.mapService.response.MapFilters;
import com.app.tgtg.model.remote.mapService.response.SearchLocationResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import m90.r1;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22272a;

    public /* synthetic */ f0(int i11) {
        this.f22272a = i11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f22272a) {
            case 0:
                return new m90.d(r1.f29848a, 0);
            case 1:
                return new m90.d(r1.f29848a, 0);
            case 2:
                return new m90.d(e.f22262a, 0);
            case 3:
                return new m90.d(r1.f29848a, 0);
            case 4:
                return new m90.d(e.f22262a, 0);
            case 5:
                return Unit.f26487a;
            case 6:
                return Unit.f26487a;
            case 7:
                return Unit.f26487a;
            case 8:
                return Unit.f26487a;
            case 9:
                int i11 = hq.l.f22384h;
                return Unit.f26487a;
            case 10:
                return MapClustersResponse._childSerializers$_anonymous_();
            case 11:
                return MapClustersResponse._childSerializers$_anonymous_$0();
            case 12:
                return MapClustersResponse._childSerializers$_anonymous_$1();
            case 13:
                return MapClustersResponse._childSerializers$_anonymous_$2();
            case 14:
                return MapFilters._childSerializers$_anonymous_();
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return MapFilters._childSerializers$_anonymous_$0();
            case 16:
                return MapFilters._childSerializers$_anonymous_$1();
            case 17:
                return SearchLocationResponse._childSerializers$_anonymous_();
            case 18:
                return com.braze.requests.a.l();
            case 19:
                return com.braze.requests.a.m();
            case 20:
                return com.braze.requests.a.g();
            case 21:
                return com.braze.requests.b.f();
            case 22:
                return com.braze.requests.b.d();
            case 23:
                return com.braze.requests.b.g();
            case 24:
                return com.braze.requests.b.h();
            case 25:
                return com.braze.requests.b.i();
            case 26:
                return com.braze.requests.b.j();
            case 27:
                return com.braze.requests.b.k();
            case 28:
                return com.braze.requests.e.b();
            default:
                return com.braze.requests.e.d();
        }
    }
}
