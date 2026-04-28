package com.braze.ui.contentcards;

import a40.i;
import android.content.Context;
import android.os.Bundle;
import com.braze.enums.Channel;
import com.braze.models.cards.Card;
import com.braze.models.inappmessage.m;
import com.braze.support.BrazeLogger;
import com.braze.ui.BrazeDeeplinkHandler;
import com.braze.ui.actions.UriAction;
import com.braze.ui.actions.brazeactions.BrazeActionUtils;
import e0.f;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\u0010\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u0006J,\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00062\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¨\u0006\u0012"}, d2 = {"Lcom/braze/ui/contentcards/BrazeContentCardUtils;", "", "<init>", "()V", "defaultCardHandling", "", "Lcom/braze/models/cards/Card;", "cards", "getUriActionForCard", "Lcom/braze/ui/actions/UriAction;", "card", "handleCardClick", "", "context", "Landroid/content/Context;", "clickHandler", "Lkotlin/Function1;", "", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBrazeContentCardUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BrazeContentCardUtils.kt\ncom/braze/ui/contentcards/BrazeContentCardUtils\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,92:1\n774#2:93\n865#2,2:94\n*S KotlinDebug\n*F\n+ 1 BrazeContentCardUtils.kt\ncom/braze/ui/contentcards/BrazeContentCardUtils\n*L\n42#1:93\n42#1:94,2\n*E\n"})
public final class BrazeContentCardUtils {

    @NotNull
    public static final BrazeContentCardUtils INSTANCE = new BrazeContentCardUtils();

    private BrazeContentCardUtils() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int defaultCardHandling$lambda$0(Card card, Card card2) {
        card.getClass();
        card2.getClass();
        if (card.getIsPinned() && !card2.getIsPinned()) {
            return -1;
        }
        if (!card.getIsPinned() && card2.getIsPinned()) {
            return 1;
        }
        if (card.getCreated() > card2.getCreated()) {
            return -1;
        }
        if (card.getCreated() < card2.getCreated()) {
            return 1;
        }
        if (card.getId().compareTo(card2.getId()) > 0) {
            return -1;
        }
        return card.getId().compareTo(card2.getId()) < 0 ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getUriActionForCard$lambda$2() {
        return "Card URL is null, returning null for getUriActionForCard";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleCardClick$lambda$3(Card card) {
        return "Handling card click for card: " + card;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleCardClick$lambda$4() {
        return "Calling custom card click handler";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleCardClick$lambda$5(Card card) {
        return f.k("Card action is non-null. Attempting to perform action on card: ", card.getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleCardClick$lambda$6(Card card) {
        return f.k("Card action is null. Not performing any click action on card: ", card.getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleCardClick$lambda$7(Card card) {
        return f.k("Card click was handled by custom listener on card: ", card.getId());
    }

    @NotNull
    public final List<Card> defaultCardHandling(@NotNull List<? extends Card> cards) {
        cards.getClass();
        i iVar = new i(3);
        ArrayList arrayList = new ArrayList();
        for (Object obj : cards) {
            if (!BrazeActionUtils.containsInvalidBrazeAction((Card) obj)) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt.l0(arrayList, iVar);
    }

    @Nullable
    public final UriAction getUriActionForCard(@NotNull Card card) {
        card.getClass();
        String url = card.getUrl();
        if (url == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new m(25), 6, (Object) null);
            return null;
        }
        Bundle bundle = new Bundle();
        for (String str : card.getExtras().keySet()) {
            bundle.putString(str, card.getExtras().get(str));
        }
        return BrazeDeeplinkHandler.INSTANCE.getInstance().createUriActionFromUrlString(url, bundle, card.getOpenUriInWebView(), Channel.CONTENT_CARD);
    }

    public final void handleCardClick(@NotNull Context context, @NotNull Card card, @Nullable Function1<? super Card, Boolean> clickHandler) {
        BrazeContentCardUtils brazeContentCardUtils;
        boolean zBooleanValue;
        context.getClass();
        card.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.V;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new aw.a(card, 6), 6, (Object) null);
        card.setIndicatorHighlighted(true);
        if (clickHandler != null) {
            brazeContentCardUtils = this;
            BrazeLogger.brazelog$default(brazeLogger, (Object) brazeContentCardUtils, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new m(24), 7, (Object) null);
            zBooleanValue = ((Boolean) clickHandler.invoke(card)).booleanValue();
        } else {
            brazeContentCardUtils = this;
            zBooleanValue = false;
        }
        if (zBooleanValue) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new aw.a(card, 9), 7, (Object) null);
            card.logClick();
            return;
        }
        UriAction uriActionForCard = getUriActionForCard(card);
        if (uriActionForCard == null) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new aw.a(card, 8), 6, (Object) null);
            return;
        }
        card.logClick();
        BrazeLogger.brazelog$default(brazeLogger, (Object) brazeContentCardUtils, priority, (Throwable) null, false, (Function0) new aw.a(card, 7), 6, (Object) null);
        BrazeDeeplinkHandler.INSTANCE.getInstance().gotoUri(context, uriActionForCard);
    }
}
