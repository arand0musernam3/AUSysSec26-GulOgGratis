package qb0;

import kotlin.jvm.functions.Function1;
import zendesk.ui.android.conversation.item.Item;
import zendesk.ui.android.conversation.item.ItemGroupView;
import zendesk.ui.android.conversation.item.ItemRendering;
import zendesk.ui.android.conversation.item.ItemState;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Item f36878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ItemGroupView f36879c;

    public /* synthetic */ a(Item item, ItemGroupView itemGroupView, int i11) {
        this.f36877a = i11;
        this.f36878b = item;
        this.f36879c = itemGroupView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f36877a) {
            case 0:
                return ItemGroupView.createItemView$lambda$7$lambda$6$lambda$3(this.f36878b, this.f36879c, (ItemState) obj);
            default:
                return ItemGroupView.createItemView$lambda$7$lambda$6(this.f36878b, this.f36879c, (ItemRendering) obj);
        }
    }
}
