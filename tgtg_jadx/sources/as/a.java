package as;

import com.app.tgtg.feature.tabprofile.manageaccount.hiddenstores.network.model.request.UnlockHiddenStoreRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import x70.c;
import y80.j;
import z70.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f4753j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f4754k;
    public final /* synthetic */ b l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ UnlockHiddenStoreRequest f4755m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, UnlockHiddenStoreRequest unlockHiddenStoreRequest, c cVar) {
        super(2, cVar);
        this.l = bVar;
        this.f4755m = unlockHiddenStoreRequest;
    }

    @Override // z70.a
    public final c create(Object obj, c cVar) {
        a aVar = new a(this.l, this.f4755m, cVar);
        aVar.f4754k = obj;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((j) obj, (c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    
        if (r0.emit(r6, r5) == r1) goto L15;
     */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f4754k
            y80.j r0 = (y80.j) r0
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r5.f4753j
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L1f
            if (r2 == r4) goto L1b
            if (r2 != r3) goto L14
            ba0.g.M(r6)
            goto L4d
        L14:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
            r6 = 0
            return r6
        L1b:
            ba0.g.M(r6)
            goto L35
        L1f:
            ba0.g.M(r6)
            as.b r6 = r5.l
            zr.a r6 = r6.f4756a
            r5.f4754k = r0
            r5.f4753j = r4
            zr.b r6 = r6.f48056a
            com.app.tgtg.feature.tabprofile.manageaccount.hiddenstores.network.model.request.UnlockHiddenStoreRequest r2 = r5.f4755m
            java.lang.Object r6 = r6.b(r2, r5)
            if (r6 != r1) goto L35
            goto L4c
        L35:
            com.app.tgtg.feature.tabprofile.manageaccount.hiddenstores.network.model.response.UnlockHiddenStoreResponse r6 = (com.app.tgtg.feature.tabprofile.manageaccount.hiddenstores.network.model.response.UnlockHiddenStoreResponse) r6
            java.lang.String r6 = r6.getState()
            com.app.tgtg.feature.tabprofile.manageaccount.hiddenstores.network.model.HiddenStoreUnlockState$Companion r2 = com.app.tgtg.feature.tabprofile.manageaccount.hiddenstores.network.model.HiddenStoreUnlockState.INSTANCE
            com.app.tgtg.feature.tabprofile.manageaccount.hiddenstores.network.model.HiddenStoreUnlockState r6 = r2.fromString(r6)
            r2 = 0
            r5.f4754k = r2
            r5.f4753j = r3
            java.lang.Object r6 = r0.emit(r6, r5)
            if (r6 != r1) goto L4d
        L4c:
            return r1
        L4d:
            kotlin.Unit r6 = kotlin.Unit.f26487a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: as.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
