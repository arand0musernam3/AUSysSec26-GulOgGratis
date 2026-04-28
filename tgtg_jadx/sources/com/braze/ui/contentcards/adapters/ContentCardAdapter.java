package com.braze.ui.contentcards.adapters;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.l1;
import androidx.recyclerview.widget.r2;
import androidx.recyclerview.widget.t;
import androidx.recyclerview.widget.v;
import b0.h;
import c1.l;
import com.braze.models.cards.Card;
import com.braze.support.BrazeLogger;
import com.braze.ui.contentcards.handlers.IContentCardsViewBindingHandler;
import com.braze.ui.contentcards.listeners.IContentCardsActionListener;
import com.braze.ui.contentcards.managers.BrazeContentCardsManager;
import com.braze.ui.contentcards.recycler.ItemTouchHelperAdapter;
import com.braze.ui.contentcards.view.ContentCardViewHolder;
import e0.f;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\b\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001IB-\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u0002H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u0002H\u0016¢\u0006\u0004\b&\u0010%J\u0017\u0010(\u001a\u00020'2\u0006\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b(\u0010)J\u001b\u0010,\u001a\u00020\u00172\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\t0*¢\u0006\u0004\b,\u0010-J\r\u0010.\u001a\u00020\u0017¢\u0006\u0004\b.\u0010/J\u0015\u00101\u001a\u00020 2\u0006\u00100\u001a\u00020\u0011¢\u0006\u0004\b1\u0010\"J\u0019\u00103\u001a\u0004\u0018\u00010\t2\u0006\u00102\u001a\u00020\u0011H\u0007¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00020 2\u0006\u00100\u001a\u00020\u0011H\u0007¢\u0006\u0004\b5\u0010\"J\u0019\u00107\u001a\u00020\u00172\b\u00106\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b7\u00108J\u0017\u00109\u001a\u00020 2\u0006\u00102\u001a\u00020\u0011H\u0002¢\u0006\u0004\b9\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010:R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010;R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010<R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u001c\u0010C\u001a\b\u0012\u0004\u0012\u00020B0A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR0\u0010E\u001a\b\u0012\u0004\u0012\u00020B0*2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020B0*8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bF\u0010G\"\u0004\bH\u0010-¨\u0006J"}, d2 = {"Lcom/braze/ui/contentcards/adapters/ContentCardAdapter;", "Landroidx/recyclerview/widget/l1;", "Lcom/braze/ui/contentcards/view/ContentCardViewHolder;", "Lcom/braze/ui/contentcards/recycler/ItemTouchHelperAdapter;", "Landroid/content/Context;", "context", "Landroidx/recyclerview/widget/LinearLayoutManager;", "layoutManager", "", "Lcom/braze/models/cards/Card;", "cardData", "Lcom/braze/ui/contentcards/handlers/IContentCardsViewBindingHandler;", "contentCardsViewBindingHandler", "<init>", "(Landroid/content/Context;Landroidx/recyclerview/widget/LinearLayoutManager;Ljava/util/List;Lcom/braze/ui/contentcards/handlers/IContentCardsViewBindingHandler;)V", "Landroid/view/ViewGroup;", "viewGroup", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/braze/ui/contentcards/view/ContentCardViewHolder;", "viewHolder", "position", "", "onBindViewHolder", "(Lcom/braze/ui/contentcards/view/ContentCardViewHolder;I)V", "getItemViewType", "(I)I", "getItemCount", "()I", "onItemDismiss", "(I)V", "", "isItemDismissable", "(I)Z", "holder", "onViewAttachedToWindow", "(Lcom/braze/ui/contentcards/view/ContentCardViewHolder;)V", "onViewDetachedFromWindow", "", "getItemId", "(I)J", "", "newCardData", "replaceCards", "(Ljava/util/List;)V", "markOnScreenCardsAsRead", "()V", "adapterPosition", "isControlCardAtPosition", "index", "getCardAtIndex", "(I)Lcom/braze/models/cards/Card;", "isAdapterPositionOnScreen", "card", "logImpression", "(Lcom/braze/models/cards/Card;)V", "isInvalidIndex", "Landroid/content/Context;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Ljava/util/List;", "Lcom/braze/ui/contentcards/handlers/IContentCardsViewBindingHandler;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "", "", "impressedCardIdsInternal", "Ljava/util/Set;", "impressedCardIds", "getImpressedCardIds", "()Ljava/util/List;", "setImpressedCardIds", "CardListDiffCallback", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class ContentCardAdapter extends l1 implements ItemTouchHelperAdapter {

    @NotNull
    private final List<Card> cardData;

    @NotNull
    private final IContentCardsViewBindingHandler contentCardsViewBindingHandler;

    @NotNull
    private final Context context;

    @NotNull
    private final Handler handler;

    @NotNull
    private Set<String> impressedCardIdsInternal;

    @NotNull
    private final LinearLayoutManager layoutManager;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\rR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/braze/ui/contentcards/adapters/ContentCardAdapter$CardListDiffCallback;", "Landroidx/recyclerview/widget/t;", "", "Lcom/braze/models/cards/Card;", "oldCards", "newCards", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "oldItemPosition", "newItemPosition", "", "doItemsShareIds", "(II)Z", "getOldListSize", "()I", "getNewListSize", "areItemsTheSame", "areContentsTheSame", "Ljava/util/List;", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CardListDiffCallback extends t {

        @NotNull
        private final List<Card> newCards;

        @NotNull
        private final List<Card> oldCards;

        /* JADX WARN: Multi-variable type inference failed */
        public CardListDiffCallback(@NotNull List<? extends Card> list, @NotNull List<? extends Card> list2) {
            list.getClass();
            list2.getClass();
            this.oldCards = list;
            this.newCards = list2;
        }

        private final boolean doItemsShareIds(int oldItemPosition, int newItemPosition) {
            return Intrinsics.areEqual(this.oldCards.get(oldItemPosition).getId(), this.newCards.get(newItemPosition).getId());
        }

        @Override // androidx.recyclerview.widget.t
        public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
            return doItemsShareIds(oldItemPosition, newItemPosition);
        }

        @Override // androidx.recyclerview.widget.t
        public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
            return doItemsShareIds(oldItemPosition, newItemPosition);
        }

        @Override // androidx.recyclerview.widget.t
        public int getNewListSize() {
            return this.newCards.size();
        }

        @Override // androidx.recyclerview.widget.t
        public int getOldListSize() {
            return this.oldCards.size();
        }
    }

    public ContentCardAdapter(@NotNull Context context, @NotNull LinearLayoutManager linearLayoutManager, @NotNull List<Card> list, @NotNull IContentCardsViewBindingHandler iContentCardsViewBindingHandler) {
        context.getClass();
        linearLayoutManager.getClass();
        list.getClass();
        iContentCardsViewBindingHandler.getClass();
        this.context = context;
        this.layoutManager = linearLayoutManager;
        this.cardData = list;
        this.contentCardsViewBindingHandler = iContentCardsViewBindingHandler;
        this.handler = new Handler(Looper.getMainLooper());
        this.impressedCardIdsInternal = new LinkedHashSet();
        setHasStableIds(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getCardAtIndex$lambda$7(int i11, ContentCardAdapter contentCardAdapter) {
        return k.k("Cannot return card at index: ", i11, contentCardAdapter.cardData.size(), " in cards list of size: ");
    }

    private final boolean isInvalidIndex(int index) {
        return index < 0 || index >= this.cardData.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logImpression$lambda$8(Card card) {
        return f.k("Logged impression for card ", card.getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logImpression$lambda$9(Card card) {
        return f.k("Already counted impression for card ", card.getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String markOnScreenCardsAsRead$lambda$4() {
        return "Card list is empty. Not marking on-screen cards as read.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String markOnScreenCardsAsRead$lambda$5(int i11, int i12) {
        return k.k("Not marking all on-screen cards as read. Either the first or last index is negative. First visible: ", i11, i12, " . Last visible: ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void markOnScreenCardsAsRead$lambda$6(int i11, int i12, ContentCardAdapter contentCardAdapter) {
        contentCardAdapter.notifyItemRangeChanged(i12, (i11 - i12) + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onItemDismiss$lambda$0(int i11, ContentCardAdapter contentCardAdapter) {
        return k.k("Cannot dismiss card at index: ", i11, contentCardAdapter.cardData.size(), " in cards list of size: ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onViewAttachedToWindow$lambda$1(int i11) {
        return k.h(i11, "The card at position ", " isn't on screen or does not have a valid adapter position. Not logging impression.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onViewDetachedFromWindow$lambda$2(int i11) {
        return k.h(i11, "The card at position ", " isn't on screen or does not have a valid adapter position. Not marking as read.");
    }

    @Nullable
    public final Card getCardAtIndex(int index) {
        if (!isInvalidIndex(index)) {
            return this.cardData.get(index);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new c(index, 1, this), 7, (Object) null);
        return null;
    }

    @NotNull
    public final List<String> getImpressedCardIds() {
        return CollectionsKt.r0(this.impressedCardIdsInternal);
    }

    @Override // androidx.recyclerview.widget.l1
    public int getItemCount() {
        return this.cardData.size();
    }

    @Override // androidx.recyclerview.widget.l1
    public long getItemId(int position) {
        String id2;
        Card cardAtIndex = getCardAtIndex(position);
        if (cardAtIndex == null || (id2 = cardAtIndex.getId()) == null) {
            return 0L;
        }
        return id2.hashCode();
    }

    @Override // androidx.recyclerview.widget.l1
    public int getItemViewType(int position) {
        return this.contentCardsViewBindingHandler.getItemViewType(this.context, this.cardData, position);
    }

    public final boolean isAdapterPositionOnScreen(int adapterPosition) {
        return Math.min(this.layoutManager.findFirstVisibleItemPosition(), this.layoutManager.findFirstCompletelyVisibleItemPosition()) <= adapterPosition && adapterPosition <= Math.max(this.layoutManager.findLastVisibleItemPosition(), this.layoutManager.findLastCompletelyVisibleItemPosition());
    }

    public final boolean isControlCardAtPosition(int adapterPosition) {
        Card cardAtIndex = getCardAtIndex(adapterPosition);
        return cardAtIndex != null && cardAtIndex.isControl();
    }

    @Override // com.braze.ui.contentcards.recycler.ItemTouchHelperAdapter
    public boolean isItemDismissable(int position) {
        if (this.cardData.isEmpty() || isInvalidIndex(position)) {
            return false;
        }
        return this.cardData.get(position).getIsDismissibleByUser();
    }

    public final void logImpression(@Nullable Card card) {
        if (card == null) {
            return;
        }
        if (this.impressedCardIdsInternal.contains(card.getId())) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new aw.a(card, 11), 6, (Object) null);
        } else {
            card.logImpression();
            this.impressedCardIdsInternal.add(card.getId());
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new aw.a(card, 10), 6, (Object) null);
        }
        if (card.getWasViewedInternal()) {
            return;
        }
        card.setViewed(true);
    }

    public final void markOnScreenCardsAsRead() {
        if (this.cardData.isEmpty()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new a(0), 7, (Object) null);
            return;
        }
        int iFindFirstVisibleItemPosition = this.layoutManager.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = this.layoutManager.findLastVisibleItemPosition();
        if (iFindFirstVisibleItemPosition < 0 || iFindLastVisibleItemPosition < 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new b(iFindFirstVisibleItemPosition, iFindLastVisibleItemPosition, 0), 7, (Object) null);
            return;
        }
        if (iFindFirstVisibleItemPosition <= iFindLastVisibleItemPosition) {
            int i11 = iFindFirstVisibleItemPosition;
            while (true) {
                Card cardAtIndex = getCardAtIndex(i11);
                if (cardAtIndex != null) {
                    cardAtIndex.setIndicatorHighlighted(true);
                }
                if (i11 == iFindLastVisibleItemPosition) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        this.handler.post(new l(iFindLastVisibleItemPosition, iFindFirstVisibleItemPosition, this));
    }

    @Override // androidx.recyclerview.widget.l1
    public void onBindViewHolder(@NotNull ContentCardViewHolder viewHolder, int position) {
        viewHolder.getClass();
        this.contentCardsViewBindingHandler.onBindViewHolder(this.context, this.cardData, viewHolder, position);
    }

    @Override // androidx.recyclerview.widget.l1
    @NotNull
    public ContentCardViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int viewType) {
        viewGroup.getClass();
        return this.contentCardsViewBindingHandler.onCreateViewHolder(this.context, this.cardData, viewGroup, viewType);
    }

    @Override // com.braze.ui.contentcards.recycler.ItemTouchHelperAdapter
    public void onItemDismiss(int position) {
        if (isInvalidIndex(position)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new c(position, 0, this), 7, (Object) null);
            return;
        }
        Card cardRemove = this.cardData.remove(position);
        cardRemove.setDismissed(true);
        notifyItemRemoved(position);
        IContentCardsActionListener contentCardsActionListener = BrazeContentCardsManager.INSTANCE.getInstance().getContentCardsActionListener();
        if (contentCardsActionListener != null) {
            contentCardsActionListener.onContentCardDismissed(this.context, cardRemove);
        }
    }

    @Override // androidx.recyclerview.widget.l1
    public void onViewAttachedToWindow(@NotNull ContentCardViewHolder holder) {
        holder.getClass();
        super.onViewAttachedToWindow((r2) holder);
        if (this.cardData.isEmpty()) {
            return;
        }
        int bindingAdapterPosition = holder.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1 || !isAdapterPositionOnScreen(bindingAdapterPosition)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new com.braze.models.inappmessage.l(bindingAdapterPosition, 7), 6, (Object) null);
        } else {
            logImpression(getCardAtIndex(bindingAdapterPosition));
        }
    }

    @Override // androidx.recyclerview.widget.l1
    public void onViewDetachedFromWindow(@NotNull ContentCardViewHolder holder) {
        holder.getClass();
        super.onViewDetachedFromWindow((r2) holder);
        if (this.cardData.isEmpty()) {
            return;
        }
        int bindingAdapterPosition = holder.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1 || !isAdapterPositionOnScreen(bindingAdapterPosition)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new com.braze.models.inappmessage.l(bindingAdapterPosition, 8), 6, (Object) null);
            return;
        }
        Card cardAtIndex = getCardAtIndex(bindingAdapterPosition);
        if (cardAtIndex == null || cardAtIndex.getIsIndicatorHighlightedInternal()) {
            return;
        }
        cardAtIndex.setIndicatorHighlighted(true);
        this.handler.post(new h(this, bindingAdapterPosition, 2));
    }

    public final synchronized void replaceCards(@NotNull List<? extends Card> newCardData) {
        newCardData.getClass();
        v vVarA = d.a(new CardListDiffCallback(this.cardData, newCardData));
        this.cardData.clear();
        this.cardData.addAll(newCardData);
        vVarA.a(new androidx.recyclerview.widget.c(this));
    }

    public final void setImpressedCardIds(@NotNull List<String> list) {
        list.getClass();
        this.impressedCardIdsInternal = CollectionsKt.u0(list);
    }
}
