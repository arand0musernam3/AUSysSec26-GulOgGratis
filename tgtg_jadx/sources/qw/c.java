package qw;

import android.os.Handler;
import android.os.Looper;
import com.app.tgtg.model.remote.widgets.response.FavouriteWidgetItem$$serializer;
import java.lang.annotation.Annotation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import m3.e0;
import org.bouncycastle.iana.AEADAlgorithm;
import q90.d0;
import rg.j;
import rg.k;
import rg.l;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37279a;

    public /* synthetic */ c(int i11) {
        this.f37279a = i11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f37279a) {
            case 0:
                return com.braze.triggers.managers.a.b();
            case 1:
                return com.braze.triggers.managers.b.a();
            case 2:
                return com.braze.triggers.managers.c.a();
            case 3:
                return com.braze.triggers.managers.f.n();
            case 4:
                return com.braze.triggers.managers.f.e();
            case 5:
                return com.braze.triggers.managers.f.f();
            case 6:
                return com.braze.triggers.managers.f.h();
            case 7:
                return com.braze.triggers.managers.f.c();
            case 8:
                return com.braze.triggers.managers.f.i();
            case 9:
                return com.braze.triggers.managers.f.m();
            case 10:
                return com.braze.triggers.managers.f.j();
            case 11:
                return com.braze.triggers.managers.f.k();
            case 12:
                return com.braze.triggers.managers.f.d();
            case 13:
                return com.braze.triggers.managers.h.b();
            case 14:
                return new Handler(Looper.getMainLooper());
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return Unit.f26487a;
            case 16:
                return Unit.f26487a;
            case 17:
                return Unit.f26487a;
            case 18:
                return Unit.f26487a;
            case 19:
                e0 e0Var = r9.b.f37790a;
                return null;
            case 20:
                return Unit.f26487a;
            case 21:
                return Unit.f26487a;
            case 22:
                return Unit.f26487a;
            case 23:
                return new sd.b(new d0());
            case 24:
                return new m90.d(FavouriteWidgetItem$$serializer.INSTANCE, 0);
            case 25:
                return new i90.a("com.app.tgtg.favWidget.FavouriteWidgetState.Failure", rg.h.INSTANCE, new Annotation[0]);
            case 26:
                return new i90.a("com.app.tgtg.favWidget.FavouriteWidgetState.Loading", rg.i.INSTANCE, new Annotation[0]);
            case 27:
                return new i90.a("com.app.tgtg.favWidget.FavouriteWidgetState.MyStoreUser", j.INSTANCE, new Annotation[0]);
            case 28:
                return new i90.a("com.app.tgtg.favWidget.FavouriteWidgetState.NoFavourites", k.INSTANCE, new Annotation[0]);
            default:
                return new i90.a("com.app.tgtg.favWidget.FavouriteWidgetState.NoInternet", l.INSTANCE, new Annotation[0]);
        }
    }
}
