package com.braze.storage;

import android.content.Context;
import com.braze.support.StringUtils;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class m extends DataStoreProvider {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ContentCardsDataStoreProvider$Companion f10621d = new ContentCardsDataStoreProvider$Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u70.j f10624c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Context context, String str, String str2) {
        super(context);
        context.getClass();
        str2.getClass();
        this.f10622a = str;
        this.f10623b = str2;
        this.f10624c = u70.l.b(new lw.b(12, context, this));
    }

    public static final String a(Context context, m mVar) {
        return StringUtils.getCacheFileSuffix(context, mVar.f10622a, mVar.f10623b);
    }

    @Override // com.braze.storage.DataStoreProvider
    public final d8.f getDataStore() {
        Context context = getContext();
        String strK = e0.f.k("com.appboy.storage.content_cards_storage_provider.cards", (String) this.f10624c.getValue());
        ContentCardsDataStoreProvider$Companion contentCardsDataStoreProvider$Companion = f10621d;
        return createOrGetDataStore(kotlin.collections.d0.h(new f8.b(context, strK, (aa.l0) null, new k(contentCardsDataStoreProvider$Companion), 12), new f8.b(getContext(), e0.f.k("com.braze.storage.content_cards_storage_provider.metadata", (String) this.f10624c.getValue()), (aa.l0) null, new l(contentCardsDataStoreProvider$Companion), 12)));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return e0.f.k("com.braze.contentcards.", (String) this.f10624c.getValue());
    }
}
