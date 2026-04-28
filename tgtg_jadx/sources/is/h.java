package is;

import com.app.tgtg.feature.itemview.ui.ItemViewActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.accountdetails.edit.EditDataActivity;
import com.app.tgtg.model.remote.ItemId;
import com.app.tgtg.model.remote.discover.response.DiscoverSingleBucketResponse;
import com.app.tgtg.model.remote.item.response.BasicItem;
import f0.f2;
import g9.p;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import lh.c0;
import lh.w;
import m3.b1;
import m3.c3;
import m3.h1;
import nj.t;
import nk.q0;
import nk.s0;
import ok.n;
import ok.o;
import oq.u;
import org.bouncycastle.iana.AEADAlgorithm;
import pm.y;
import pm.z;
import qk.l;
import ss.e1;
import ss.l1;
import v80.b0;
import y80.j;
import y80.m1;
import z70.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f24197j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f24198k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(b1 b1Var, p pVar, x70.c cVar) {
        super(2, cVar);
        this.f24197j = 5;
        this.l = b1Var;
        this.f24198k = pVar;
    }

    private final Object a(Object obj) {
        z zVar;
        List list;
        List<BasicItem> list2;
        b1 b1Var = (b1) this.l;
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        ba0.g.M(obj);
        y yVar = (y) this.f24198k;
        if (yVar != null && (list2 = yVar.f35566b) != null) {
            for (BasicItem basicItem : list2) {
                boolean zContains = ((List) b1Var.getValue()).contains(ItemId.m197boximpl(basicItem.getInformation().mo340getItemIdFvU5WIY()));
                if (basicItem.getFavorite() != zContains) {
                    basicItem.setFavorite(zContains);
                }
            }
        }
        if (yVar != null && (zVar = yVar.f35565a) != null && (list = zVar.f35568a) != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                for (BasicItem basicItem2 : (List) it.next()) {
                    boolean zContains2 = ((List) b1Var.getValue()).contains(ItemId.m197boximpl(basicItem2.getInformation().mo340getItemIdFvU5WIY()));
                    if (basicItem2.getFavorite() != zContains2) {
                        basicItem2.setFavorite(zContains2);
                    }
                }
            }
        }
        return Unit.f26487a;
    }

    private final Object b(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        ba0.g.M(obj);
        b1 b1Var = (b1) this.l;
        int i11 = ItemViewActivity.f9011k;
        if (((s0) b1Var.getValue()) instanceof q0) {
            m1.a aVar2 = ((ItemViewActivity) this.f24198k).E().f37190e;
            s0 s0Var = (s0) b1Var.getValue();
            s0Var.getClass();
            String strMo340getItemIdFvU5WIY = ((q0) s0Var).f31035a.getInformation().mo340getItemIdFvU5WIY();
            aVar2.getClass();
            strMo340getItemIdFvU5WIY.getClass();
            f2 f2Var = (f2) aVar2.f28697a;
            ((m1) f2Var.f16653f).i(new ok.p(new ok.q0(strMo340getItemIdFvU5WIY)));
        }
        return Unit.f26487a;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f24197j) {
            case 0:
                return new h((hs.h) this.f24198k, (b1) this.l, cVar, 0);
            case 1:
                return new h((ih.i) this.f24198k, (h1) this.l, cVar, 1);
            case 2:
                h hVar = new h((w) this.l, cVar, 2);
                hVar.f24198k = obj;
                return hVar;
            case 3:
                return new h((Function1) this.f24198k, (mp.c) this.l, cVar, 3);
            case 4:
                return new h((Function1) this.f24198k, (h1) this.l, cVar, 4);
            case 5:
                return new h((b1) this.l, (p) this.f24198k, cVar);
            case 6:
                return new h((Function1) this.f24198k, (c3) this.l, cVar, 6);
            case 7:
                h hVar2 = new h((mm.c) this.l, cVar, 7);
                hVar2.f24198k = obj;
                return hVar2;
            case 8:
                return new h((EditDataActivity) this.f24198k, (pg.p) this.l, cVar, 8);
            case 9:
                return new h((nh.b) this.f24198k, (BasicItem) this.l, cVar, 9);
            case 10:
                h hVar3 = new h((nh.b) this.l, cVar, 10);
                hVar3.f24198k = obj;
                return hVar3;
            case 11:
                h hVar4 = new h((t) this.l, cVar, 11);
                hVar4.f24198k = obj;
                return hVar4;
            case 12:
                return new h((f2) this.f24198k, (ok.i) this.l, cVar, 12);
            case 13:
                h hVar5 = new h((f2) this.l, cVar, 13);
                hVar5.f24198k = obj;
                return hVar5;
            case 14:
                return new h((f2) this.f24198k, (o) this.l, cVar, 14);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return new h((n) this.f24198k, (f2) this.l, cVar, 15);
            case 16:
                return new h((ok.p) this.f24198k, (f2) this.l, cVar, 16);
            case 17:
                h hVar6 = new h((np.b) this.l, cVar, 17);
                hVar6.f24198k = obj;
                return hVar6;
            case 18:
                return new h((np.b) this.f24198k, (String) this.l, cVar, 18);
            case 19:
                h hVar7 = new h((oh.c) this.l, cVar, 19);
                hVar7.f24198k = obj;
                return hVar7;
            case 20:
                h hVar8 = new h((oj.a) this.l, cVar, 20);
                hVar8.f24198k = obj;
                return hVar8;
            case 21:
                return new h((Integer) this.f24198k, (h1) this.l, cVar, 21);
            case 22:
                return new h((oq.n) this.f24198k, (pq.b) this.l, cVar, 22);
            case 23:
                h hVar9 = new h((oq.n) this.l, cVar, 23);
                hVar9.f24198k = obj;
                return hVar9;
            case 24:
                return new h((ns.g) this.f24198k, (b1) this.l, cVar, 24);
            case 25:
                return new h((y) this.f24198k, (b1) this.l, cVar, 25);
            case 26:
                return new h((ItemViewActivity) this.f24198k, (b1) this.l, cVar, 26);
            case 27:
                h hVar10 = new h((l) this.l, cVar, 27);
                hVar10.f24198k = obj;
                return hVar10;
            case 28:
                h hVar11 = new h((qs.h) this.l, cVar, 28);
                hVar11.f24198k = obj;
                return hVar11;
            default:
                h hVar12 = new h((qs.i) this.l, cVar, 29);
                hVar12.f24198k = obj;
                return hVar12;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f24197j) {
            case 0:
                return ((h) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 1:
                return ((h) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 2:
                return ((h) create((c0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 3:
                return ((h) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 4:
                return ((h) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 5:
                return ((h) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 6:
                return ((h) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 7:
                return ((h) create((String) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 8:
                return ((h) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 9:
                return ((h) create((j) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 10:
                return ((h) create((DiscoverSingleBucketResponse) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 11:
                return ((h) create((nj.y) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 12:
                return ((h) create((j) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 13:
                return ((h) create((s0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 14:
                return ((h) create((j) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return ((h) create((j) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 16:
                return ((h) create((j) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 17:
                return ((h) create((String) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 18:
                return ((h) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 19:
                return ((h) create((c0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 20:
                return ((h) create((nj.y) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 21:
                return ((h) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 22:
                return ((h) create((j) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 23:
                return ((h) create((u) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 24:
                return ((h) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 25:
                return ((h) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 26:
                return ((h) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 27:
                return ((h) create((s0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 28:
                return ((h) create((e1) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            default:
                return ((h) create((l1) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:367:0x0c89  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            Method dump skipped, instruction units count: 3366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: is.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj, x70.c cVar, int i11) {
        super(2, cVar);
        this.f24197j = i11;
        this.l = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj, Object obj2, x70.c cVar, int i11) {
        super(2, cVar);
        this.f24197j = i11;
        this.f24198k = obj;
        this.l = obj2;
    }
}
