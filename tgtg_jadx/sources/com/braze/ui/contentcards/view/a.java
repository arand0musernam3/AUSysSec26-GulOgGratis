package com.braze.ui.contentcards.view;

import a3.u2;
import android.view.View;
import com.app.tgtg.feature.main.fragments.delivery.parcelfeed.compose.vertitems.DeliverySortingBottomSheet;
import com.app.tgtg.model.remote.item.response.SortingChoice;
import com.braze.models.cards.Card;
import com.braze.models.inappmessage.IInAppMessageImmersive;
import com.braze.models.inappmessage.MessageButton;
import com.braze.ui.actions.UriAction;
import com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper;
import dn.m;
import java.util.List;
import pg.c2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f10923d;

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, int i11) {
        this.f10920a = i11;
        this.f10921b = obj;
        this.f10922c = obj2;
        this.f10923d = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f10920a) {
            case 0:
                BaseContentCardView.bindViewHolder$lambda$0((BaseContentCardView) this.f10921b, (Card) this.f10922c, (UriAction) this.f10923d, view);
                break;
            case 1:
                DefaultInAppMessageViewWrapper.createButtonClickListeners$lambda$21$lambda$20$lambda$19$lambda$18((DefaultInAppMessageViewWrapper) this.f10921b, (MessageButton) this.f10922c, (IInAppMessageImmersive) this.f10923d, view);
                break;
            default:
                c2 c2Var = (c2) this.f10921b;
                List<SortingChoice> list = (List) this.f10922c;
                m mVar = (m) this.f10923d;
                c2Var.J.setSortingChoices(list);
                DeliverySortingBottomSheet deliverySortingBottomSheet = c2Var.J;
                SortingChoice sortingChoice = mVar.f15024b.f46271t;
                deliverySortingBottomSheet.setSelectedSortingId(sortingChoice != null ? sortingChoice.getId() : null);
                deliverySortingBottomSheet.setShowBs(true);
                deliverySortingBottomSheet.setOnSelectSorting(new u2(10, mVar, c2Var));
                break;
        }
    }
}
