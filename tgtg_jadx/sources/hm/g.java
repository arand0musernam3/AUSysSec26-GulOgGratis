package hm;

import androidx.activity.result.ActivityResultLauncher;
import androidx.lifecycle.m1;
import com.app.tgtg.feature.main.MainActivity;
import com.app.tgtg.model.remote.brief.BriefItemInfo;
import com.app.tgtg.model.remote.brief.BriefOrder;
import com.app.tgtg.model.remote.brief.BriefOrderChangeState;
import com.app.tgtg.model.remote.brief.BriefStoreInfo;
import com.app.tgtg.model.remote.order.CancelOrderState;
import com.app.tgtg.model.remote.order.OrderType;
import h2.a0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mv.m0;
import mv.r0;
import pg.u1;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainActivity f22117b;

    public /* synthetic */ g(MainActivity mainActivity, int i11) {
        this.f22116a = i11;
        this.f22117b = mainActivity;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String strM314getItemIdRWxzYZM;
        int i11 = this.f22116a;
        int i12 = 2;
        ActivityResultLauncher activityResultLauncher = null;
        ActivityResultLauncher activityResultLauncher2 = null;
        str = null;
        String str = null;
        boolean z11 = true;
        char c3 = 1;
        int i13 = 0;
        MainActivity mainActivity = this.f22117b;
        switch (i11) {
            case 0:
                z20.a aVar = (z20.a) obj;
                boolean z12 = MainActivity.f9078v;
                if (aVar.f46928a == 2 && aVar.a(z20.m.a(0).a()) != null) {
                    mainActivity.h0();
                    ActivityResultLauncher activityResultLauncher3 = mainActivity.f9088p;
                    if (activityResultLauncher3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("updateFlowLauncher");
                    } else {
                        activityResultLauncher = activityResultLauncher3;
                    }
                    z20.e.b(aVar, activityResultLauncher, z20.m.a(0).a());
                }
                break;
            case 1:
                f70.h hVar = (f70.h) obj;
                boolean z13 = MainActivity.f9078v;
                hVar.getClass();
                if (Intrinsics.areEqual(hVar, jm.a.f25315a)) {
                    new ng.d().show(mainActivity.getSupportFragmentManager(), "ServerSelector");
                } else {
                    z11 = false;
                }
                break;
            case 2:
                mv.z zVar = (mv.z) obj;
                boolean z14 = MainActivity.f9078v;
                zVar.getClass();
                mainActivity.k0(zVar, f70.i.NAVIGATION);
                ae.c cVar = mainActivity.f9083j;
                u1 u1Var = mainActivity.f9089q;
                u1Var.getClass();
                cVar.d(u1Var);
                u1 u1Var2 = mainActivity.f9089q;
                u1Var2.getClass();
                u1Var2.f35190y.setVisibility(8);
                break;
            case 3:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ae.c cVar2 = mainActivity.f9083j;
                yn.l lVar = new yn.l(zBooleanValue);
                boolean zC = mainActivity.g0().c();
                cVar2.getClass();
                m0 m0Var = sa0.a.f38953a;
                m0Var.h("PopupHandler");
                m0Var.a("registerAndShowImmediately()  popup = " + lVar.f46299b, new Object[0]);
                if (((yn.o) cVar2.f1246e) != null || cVar2.f1242a) {
                    cVar2.g(lVar);
                    cVar2.i("registerAndShowImmediately()", zC);
                } else {
                    cVar2.k(lVar, zC);
                }
                break;
            case 4:
                CancelOrderState cancelOrderState = (CancelOrderState) obj;
                boolean z15 = MainActivity.f9078v;
                int i14 = cancelOrderState == null ? -1 : j.$EnumSwitchMapping$2[cancelOrderState.ordinal()];
                if (i14 != 1 && i14 != 2) {
                    if (i14 != 3) {
                        r0.o(mainActivity, new Throwable(""));
                    } else {
                        BriefOrder briefOrder = mainActivity.g0().f22169w;
                        if (briefOrder != null) {
                            String strM321getOrderIdreIZeYA = briefOrder.m321getOrderIdreIZeYA();
                            OrderType orderType = briefOrder.getOrderType();
                            if (orderType == null) {
                                orderType = OrderType.MAGICBAG;
                            }
                            p30.b.w(mainActivity, new io.a(strM321getOrderIdreIZeYA, null, orderType, false, null, 122), null);
                        }
                        if (briefOrder != null) {
                            v vVarG0 = mainActivity.g0();
                            cv.i iVar = cv.i.OTHER_PURCHASE_CANCELLED;
                            dv.a aVar2 = dv.a.ITEM_TYPE;
                            OrderType orderType2 = briefOrder.getOrderType();
                            vVarG0.d(iVar, h0.g.E(new Pair(aVar2, new dv.c(orderType2 != null ? orderType2.name() : null))));
                            cv.i iVar2 = cv.i.CORE_PURCHASE_CANCELLED;
                            dv.a aVar3 = dv.a.STORE_NAME;
                            BriefStoreInfo briefStoreInfo = briefOrder.getBriefStoreInfo();
                            Pair pair = new Pair(aVar3, new dv.c(briefStoreInfo != null ? briefStoreInfo.getStoreDisplayName() : null));
                            dv.a aVar4 = dv.a.ITEM_ID;
                            BriefItemInfo briefItemInfo = briefOrder.getBriefItemInfo();
                            if (briefItemInfo != null && (strM314getItemIdRWxzYZM = briefItemInfo.m314getItemIdRWxzYZM()) != null) {
                                str = strM314getItemIdRWxzYZM;
                            }
                            vVarG0.d(iVar2, h0.g.E(pair, new Pair(aVar4, new dv.c(str))));
                        }
                    }
                }
                break;
            case 5:
                z20.a aVar5 = (z20.a) obj;
                boolean z16 = MainActivity.f9078v;
                if (aVar5.f46928a == 3) {
                    mainActivity.h0();
                    ActivityResultLauncher activityResultLauncher4 = mainActivity.f9088p;
                    if (activityResultLauncher4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("updateFlowLauncher");
                    } else {
                        activityResultLauncher2 = activityResultLauncher4;
                    }
                    z20.e.b(aVar5, activityResultLauncher2, z20.m.a(1).a());
                } else if (aVar5.f46929b == 11) {
                    mainActivity.p0(mainActivity.f0(), mainActivity.e0());
                }
                break;
            case 6:
                cv.i iVar3 = (cv.i) obj;
                boolean z17 = MainActivity.f9078v;
                iVar3.getClass();
                mainActivity.g0().d(iVar3, null);
                break;
            default:
                List list = (List) ((qt.a) obj).a();
                if (list != null && !list.isEmpty()) {
                    ae.c cVar3 = mainActivity.f9083j;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        BriefOrder briefOrder2 = (BriefOrder) obj2;
                        if (briefOrder2.getChangeState() == BriefOrderChangeState.TIME_CHANGED || briefOrder2.getChangeState() == BriefOrderChangeState.DELEGATED_TIME_RETURNED) {
                            arrayList.add(obj2);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : list) {
                        BriefOrder briefOrder3 = (BriefOrder) obj3;
                        if (briefOrder3.getChangeState() == BriefOrderChangeState.CANCELLED || briefOrder3.getChangeState() == BriefOrderChangeState.DELEGATED_CANCELLED || briefOrder3.getChangeState() == BriefOrderChangeState.DELEGATE_ACCEPTED || briefOrder3.getChangeState() == BriefOrderChangeState.DELEGATED_FULFILLED || briefOrder3.getChangeState() == BriefOrderChangeState.REFUNDED) {
                            arrayList2.add(obj3);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj4 : list) {
                        if (((BriefOrder) obj4).getChangeState() == BriefOrderChangeState.DELEGATED_RETURNED) {
                            arrayList3.add(obj4);
                        }
                    }
                    if (!arrayList.isEmpty() || !arrayList2.isEmpty()) {
                        u1 u1Var3 = mainActivity.f9089q;
                        u1Var3.getClass();
                        cVar3.h(u1Var3);
                    }
                    if (!arrayList3.isEmpty()) {
                        cVar3.g(new yn.h((BriefOrder) list.get(0), new g(mainActivity, 6)));
                    }
                    x70.c cVar4 = null;
                    if (!arrayList.isEmpty()) {
                        v vVarG02 = mainActivity.g0();
                        f0.B(m1.d(vVarG02), null, null, new r(arrayList, vVarG02, cVar4, c3 == true ? 1 : 0), 3);
                        if (arrayList.size() != 1) {
                            cVar3.g(new yn.k());
                            v vVarG03 = mainActivity.g0();
                            f0.B(m1.d(vVarG03), null, null, new q(vVarG03, cVar4, i13), 3);
                        } else if (((BriefOrder) arrayList.get(0)).getTimeInterval() != null) {
                            cVar3.g(new yn.j((BriefOrder) arrayList.get(0)));
                            v vVarG04 = mainActivity.g0();
                            BriefOrder briefOrder4 = (BriefOrder) arrayList.get(0);
                            briefOrder4.getClass();
                            f0.B(m1.d(vVarG04), null, null, new gf.g(vVarG04, briefOrder4, cVar4, 4), 3);
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        if (list.size() == 1) {
                            v vVarG05 = mainActivity.g0();
                            BriefItemInfo briefItemInfo2 = ((BriefOrder) list.get(0)).getBriefItemInfo();
                            String strM314getItemIdRWxzYZM2 = briefItemInfo2 != null ? briefItemInfo2.m314getItemIdRWxzYZM() : null;
                            hb0.o oVar = new hb0.o(i12, mainActivity, list);
                            if (strM314getItemIdRWxzYZM2 == null) {
                                oVar.invoke(null);
                            } else {
                                f0.B(m1.d(vVarG05), null, null, new a0(vVarG05, strM314getItemIdRWxzYZM2, oVar, cVar4, 3), 3);
                            }
                        } else {
                            cVar3.g(new yn.w());
                            v vVarG06 = mainActivity.g0();
                            f0.B(m1.d(vVarG06), null, null, new q(vVarG06, cVar4, i13), 3);
                            cVar3.i("end high prio // Order change3", mainActivity.g0().c());
                        }
                        mainActivity.g0().d(cv.i.SCREEN_ORDER_CHANGED_ALERT, h0.g.E(new Pair(dv.a.ORDER_CHANGED_COUNT, new dv.c(Integer.valueOf(list.size())))));
                    }
                }
                break;
        }
        return Unit.f26487a;
    }
}
