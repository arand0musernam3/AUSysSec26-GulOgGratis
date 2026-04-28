package fi;

import androidx.lifecycle.c1;
import androidx.lifecycle.l1;
import ao.g3;
import com.app.tgtg.feature.charity.ui.model.CharityIdError;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.o0;
import kotlin.jvm.internal.SourceDebugExtension;
import xh.i0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfi/i;", "Landroidx/lifecycle/l1;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nProvideCharityIdViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProvideCharityIdViewModel.kt\ncom/app/tgtg/feature/charity/ui/connect/provide/ProvideCharityIdViewModel\n+ 2 SavedStateHandle.kt\nandroidx/navigation/SavedStateHandleKt__SavedStateHandleKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,65:1\n43#2,3:66\n43#2,3:69\n296#3,2:72\n*S KotlinDebug\n*F\n+ 1 ProvideCharityIdViewModel.kt\ncom/app/tgtg/feature/charity/ui/connect/provide/ProvideCharityIdViewModel\n*L\n30#1:66,3\n33#1:69,3\n37#1:72,2\n*E\n"})
public final class i extends l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c1 f17769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ao.c f17770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g3 f17771c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final xh.c f17772d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final cv.b f17773e;

    public i(c1 c1Var, ao.c cVar, g3 g3Var, xh.c cVar2, cv.b bVar) {
        c1Var.getClass();
        cVar.getClass();
        g3Var.getClass();
        cVar2.getClass();
        bVar.getClass();
        this.f17769a = c1Var;
        this.f17770b = cVar;
        this.f17771c = g3Var;
        this.f17772d = cVar2;
        this.f17773e = bVar;
        b(cv.i.SCREEN_CHARITY_LOGIN_CHARITY_ID, null);
        if (a() == CharityIdError.CHARITY_NOT_FOUND) {
            b(cv.i.CHARITY_LOGIN_INVALID_CHARITY_ID, h0.g.E(new Pair(dv.a.ERROR_TYPE, new dv.c("CHARITY_NOT_FOUND"))));
        } else if (a() != null) {
            b(cv.i.CHARITY_LOGIN_INVALID_CHARITY_ID, h0.g.E(new Pair(dv.a.ERROR_TYPE, new dv.c("UNKNOWN"))));
        }
    }

    public final CharityIdError a() {
        o0 o0Var = o0.f26530a;
        return ((i0) e0.f.f(o0Var, i0.class, this.f17769a, o0Var)).f44331c;
    }

    public final void b(cv.i iVar, dv.b bVar) {
        iVar.getClass();
        this.f17773e.c(iVar, bVar);
    }
}
