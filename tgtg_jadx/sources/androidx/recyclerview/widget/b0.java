package androidx.recyclerview.widget;

import android.view.View;
import com.app.tgtg.feature.flashsales.list.FlashSalesListActivity;
import com.app.tgtg.feature.tabprofile.impact.orderList.OrderListActivity;
import com.app.tgtg.feature.tabprofile.impact.orderList.OrderListActivity$initListeners$1$3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3670b;

    public /* synthetic */ b0(Object obj, int i11) {
        this.f3669a = i11;
        this.f3670b = obj;
    }

    @Override // androidx.recyclerview.widget.c2
    public final void onScrolled(RecyclerView recyclerView, int i11, int i12) {
        ym.o oVar;
        int i13 = this.f3669a;
        OrderListActivity$initListeners$1$3 orderListActivity$initListeners$1$3 = null;
        Object obj = this.f3670b;
        switch (i13) {
            case 0:
                e0 e0Var = (e0) obj;
                int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
                int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
                int i14 = e0Var.f3692a;
                int iComputeVerticalScrollRange = e0Var.f3709s.computeVerticalScrollRange();
                int i15 = e0Var.f3708r;
                e0Var.f3710t = iComputeVerticalScrollRange - i15 > 0 && i15 >= i14;
                int iComputeHorizontalScrollRange = e0Var.f3709s.computeHorizontalScrollRange();
                int i16 = e0Var.f3707q;
                boolean z11 = iComputeHorizontalScrollRange - i16 > 0 && i16 >= i14;
                e0Var.f3711u = z11;
                boolean z12 = e0Var.f3710t;
                if (z12 || z11) {
                    if (z12) {
                        float f11 = i15;
                        e0Var.l = (int) ((((f11 / 2.0f) + iComputeVerticalScrollOffset) * f11) / iComputeVerticalScrollRange);
                        e0Var.f3702k = Math.min(i15, (i15 * i15) / iComputeVerticalScrollRange);
                    }
                    if (e0Var.f3711u) {
                        float f12 = iComputeHorizontalScrollOffset;
                        float f13 = i16;
                        e0Var.f3705o = (int) ((((f13 / 2.0f) + f12) * f13) / iComputeHorizontalScrollRange);
                        e0Var.f3704n = Math.min(i16, (i16 * i16) / iComputeHorizontalScrollRange);
                    }
                    int i17 = e0Var.f3712v;
                    if (i17 == 0 || i17 == 1) {
                        e0Var.i(1);
                    }
                } else if (e0Var.f3712v != 0) {
                    e0Var.i(0);
                }
                break;
            case 1:
                OrderListActivity orderListActivity = (OrderListActivity) obj;
                OrderListActivity$initListeners$1$3 orderListActivity$initListeners$1$32 = orderListActivity.f9321i;
                if (orderListActivity$initListeners$1$32 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutManager");
                    orderListActivity$initListeners$1$32 = null;
                }
                int childCount = orderListActivity$initListeners$1$32.getChildCount();
                OrderListActivity$initListeners$1$3 orderListActivity$initListeners$1$33 = orderListActivity.f9321i;
                if (orderListActivity$initListeners$1$33 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutManager");
                    orderListActivity$initListeners$1$33 = null;
                }
                int itemCount = orderListActivity$initListeners$1$33.getItemCount();
                OrderListActivity$initListeners$1$3 orderListActivity$initListeners$1$34 = orderListActivity.f9321i;
                if (orderListActivity$initListeners$1$34 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutManager");
                } else {
                    orderListActivity$initListeners$1$3 = orderListActivity$initListeners$1$34;
                }
                int iFindFirstVisibleItemPosition = orderListActivity$initListeners$1$3.findFirstVisibleItemPosition();
                if (!orderListActivity.b0().f6661g && orderListActivity.b0().f6662h && childCount + iFindFirstVisibleItemPosition >= itemCount && iFindFirstVisibleItemPosition >= 0 && !orderListActivity.b0().f6661g) {
                    orderListActivity.d0();
                    break;
                }
                break;
            case 2:
                if (i12 < -10 || i12 > 10) {
                    int i18 = FlashSalesListActivity.f8995p;
                    ((FlashSalesListActivity) obj).a0();
                }
                break;
            case 3:
                if (i12 > 10 || i12 < -10) {
                    pg.o0 o0Var = ((fn.t) obj).f17859s;
                    o0Var.getClass();
                    y1 layoutManager = o0Var.f35016b.getLayoutManager();
                    layoutManager.getClass();
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                    int iFindFirstVisibleItemPosition2 = linearLayoutManager.findFirstVisibleItemPosition();
                    int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                    if (iFindFirstVisibleItemPosition2 != -1 && iFindLastVisibleItemPosition != -1 && iFindFirstVisibleItemPosition2 <= iFindLastVisibleItemPosition) {
                        while (true) {
                            View viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition2);
                            hq.c cVar = viewFindViewByPosition instanceof hq.c ? (hq.c) viewFindViewByPosition : null;
                            if (cVar != null) {
                                cVar.c(false);
                            }
                            if (iFindFirstVisibleItemPosition2 != iFindLastVisibleItemPosition) {
                                iFindFirstVisibleItemPosition2++;
                            }
                            break;
                        }
                    }
                }
                break;
            case 4:
                if (i11 > 10 || i11 < -10) {
                    int i19 = hq.c.f22343r;
                    ((hq.c) obj).c(false);
                }
                break;
            default:
                ym.u uVar = (ym.u) obj;
                if (i12 < -10 || i12 > 10) {
                    dn.i iVar = uVar.f46240o;
                    if (iVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("deliveryFeedImpressionHandler");
                        iVar = null;
                    }
                    ym.o oVar2 = uVar.f46236j;
                    iVar.a(oVar2 != null ? oVar2.f46203c : null);
                    dn.m mVar = uVar.f46249x;
                    if (mVar != null && mVar.f15025c && (oVar = uVar.f46236j) != null) {
                        y1 layoutManager2 = recyclerView.getLayoutManager();
                        layoutManager2.getClass();
                        int iFindFirstVisibleItemPosition3 = ((LinearLayoutManager) layoutManager2).findFirstVisibleItemPosition();
                        y1 layoutManager3 = recyclerView.getLayoutManager();
                        layoutManager3.getClass();
                        mVar.b(oVar.c(iFindFirstVisibleItemPosition3, ((LinearLayoutManager) layoutManager3).findLastVisibleItemPosition(), i12 > 0));
                        break;
                    }
                }
                break;
        }
    }
}
