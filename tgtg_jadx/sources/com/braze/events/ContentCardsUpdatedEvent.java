package com.braze.events;

import b3.i;
import com.braze.models.cards.Card;
import com.braze.support.DateTimeUtils;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.d0;
import kotlin.collections.n0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u0000  2\u00020\u0001:\u0001 B/\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\bJ\b\u0010\u001f\u001a\u00020\u0006H\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0011R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\u001c\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0011¨\u0006!"}, d2 = {"Lcom/braze/events/ContentCardsUpdatedEvent;", "", "contentCards", "", "Lcom/braze/models/cards/Card;", "userId", "", "timestampSeconds", "", "isFromOfflineStorage", "", "<init>", "(Ljava/util/List;Ljava/lang/String;JZ)V", "getUserId", "()Ljava/lang/String;", "getTimestampSeconds", "()J", "()Z", "allCards", "", "getAllCards", "()Ljava/util/List;", "cardCount", "", "getCardCount", "()I", "unviewedCardCount", "getUnviewedCardCount", "isEmpty", "isTimestampOlderThan", "ageSeconds", "toString", "Companion", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ContentCardsUpdatedEvent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final List<Card> contentCards;
    private final boolean isFromOfflineStorage;
    private final long timestampSeconds;
    private final String userId;

    /* JADX WARN: Multi-variable type inference failed */
    public ContentCardsUpdatedEvent(List<? extends Card> list, String str, long j9, boolean z11) {
        list.getClass();
        this.contentCards = list;
        this.userId = str;
        this.timestampSeconds = j9;
        this.isFromOfflineStorage = z11;
    }

    public static final ContentCardsUpdatedEvent getEmptyUpdate() {
        return INSTANCE.getEmptyUpdate();
    }

    public final List<Card> getAllCards() {
        return CollectionsKt.t0(this.contentCards);
    }

    public final int getCardCount() {
        return this.contentCards.size();
    }

    public final long getTimestampSeconds() {
        return this.timestampSeconds;
    }

    public final int getUnviewedCardCount() {
        List<Card> list = this.contentCards;
        int i11 = 0;
        if (list != null && list.isEmpty()) {
            return 0;
        }
        for (Card card : list) {
            if (!card.getWasViewedInternal() && !card.isControl() && (i11 = i11 + 1) < 0) {
                d0.m();
                throw null;
            }
        }
        return i11;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final boolean isEmpty() {
        return this.contentCards.isEmpty();
    }

    /* JADX INFO: renamed from: isFromOfflineStorage, reason: from getter */
    public final boolean getIsFromOfflineStorage() {
        return this.isFromOfflineStorage;
    }

    public final boolean isTimestampOlderThan(long ageSeconds) {
        return TimeUnit.SECONDS.toMillis(this.timestampSeconds + ageSeconds) < DateTimeUtils.nowInMilliseconds();
    }

    public String toString() {
        String str = this.userId;
        long j9 = this.timestampSeconds;
        boolean z11 = this.isFromOfflineStorage;
        int cardCount = getCardCount();
        StringBuilder sbN = i.n(j9, "ContentCardsUpdatedEvent{userId='", str, "', timestampSeconds=");
        sbN.append(", isFromOfflineStorage=");
        sbN.append(z11);
        sbN.append(", card count=");
        sbN.append(cardCount);
        sbN.append("}");
        return sbN.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u00058FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/braze/events/ContentCardsUpdatedEvent$Companion;", "", "<init>", "()V", "emptyUpdate", "Lcom/braze/events/ContentCardsUpdatedEvent;", "getEmptyUpdate$annotations", "getEmptyUpdate", "()Lcom/braze/events/ContentCardsUpdatedEvent;", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ContentCardsUpdatedEvent getEmptyUpdate() {
            return new ContentCardsUpdatedEvent(n0.f26529a, null, DateTimeUtils.nowInSeconds(), true);
        }

        private Companion() {
        }

        public static /* synthetic */ void getEmptyUpdate$annotations() {
        }
    }
}
