package com.app.tgtg.model.remote.item.requests;

import com.adyen.checkout.components.core.Address;
import com.app.tgtg.model.remote.StoreId;
import com.app.tgtg.model.remote.StoreId$$serializer;
import i90.g;
import i90.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.m1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J\u0010\u0010 \u001a\u00020\bHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\u00022\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b&\u0010'\u001a\u0004\b\u0003\u0010\u0017R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010(\u0012\u0004\b*\u0010'\u001a\u0004\b)\u0010\u0019¨\u0006-"}, d2 = {"Lcom/app/tgtg/model/remote/item/requests/SetFavoriteRequest;", "", "", "isFavorite", "Lcom/app/tgtg/model/remote/StoreId;", "storeId", "<init>", "(ZLjava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(IZLjava/lang/String;Lm90/m1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/item/requests/SetFavoriteRequest;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Z", "component2-7QsYvu8", "()Ljava/lang/String;", "component2", "copy-nOtlLno", "(ZLjava/lang/String;)Lcom/app/tgtg/model/remote/item/requests/SetFavoriteRequest;", "copy", "", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "isFavorite$annotations", "()V", "Ljava/lang/String;", "getStoreId-7QsYvu8", "getStoreId-7QsYvu8$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class SetFavoriteRequest {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final boolean isFavorite;

    @Nullable
    private final String storeId;

    private /* synthetic */ SetFavoriteRequest(int i11, boolean z11, String str, m1 m1Var) {
        if (1 != (i11 & 1)) {
            c1.j(i11, 1, SetFavoriteRequest$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.isFavorite = z11;
        if ((i11 & 2) == 0) {
            this.storeId = null;
        } else {
            this.storeId = str;
        }
    }

    /* JADX INFO: renamed from: copy-nOtlLno$default, reason: not valid java name */
    public static /* synthetic */ SetFavoriteRequest m378copynOtlLno$default(SetFavoriteRequest setFavoriteRequest, boolean z11, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = setFavoriteRequest.isFavorite;
        }
        if ((i11 & 2) != 0) {
            str = setFavoriteRequest.storeId;
        }
        return setFavoriteRequest.m381copynOtlLno(z11, str);
    }

    public static final /* synthetic */ void write$Self$app(SetFavoriteRequest self, b output, SerialDescriptor serialDesc) {
        output.p(serialDesc, 0, self.isFavorite);
        if (!output.C(serialDesc) && self.storeId == null) {
            return;
        }
        StoreId$$serializer storeId$$serializer = StoreId$$serializer.INSTANCE;
        String str = self.storeId;
        output.r(serialDesc, 1, storeId$$serializer, str != null ? StoreId.m269boximpl(str) : null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsFavorite() {
        return this.isFavorite;
    }

    @Nullable
    /* JADX INFO: renamed from: component2-7QsYvu8, reason: not valid java name and from getter */
    public final String getStoreId() {
        return this.storeId;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-nOtlLno, reason: not valid java name */
    public final SetFavoriteRequest m381copynOtlLno(boolean isFavorite, @Nullable String storeId) {
        return new SetFavoriteRequest(isFavorite, storeId, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.app.tgtg.model.remote.item.requests.SetFavoriteRequest
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.app.tgtg.model.remote.item.requests.SetFavoriteRequest r5 = (com.app.tgtg.model.remote.item.requests.SetFavoriteRequest) r5
            boolean r1 = r4.isFavorite
            boolean r3 = r5.isFavorite
            if (r1 == r3) goto L13
            return r2
        L13:
            java.lang.String r1 = r4.storeId
            java.lang.String r5 = r5.storeId
            if (r1 != 0) goto L1f
            if (r5 != 0) goto L1d
            r5 = r0
            goto L26
        L1d:
            r5 = r2
            goto L26
        L1f:
            if (r5 != 0) goto L22
            goto L1d
        L22:
            boolean r5 = com.app.tgtg.model.remote.StoreId.m273equalsimpl0(r1, r5)
        L26:
            if (r5 != 0) goto L29
            return r2
        L29:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.tgtg.model.remote.item.requests.SetFavoriteRequest.equals(java.lang.Object):boolean");
    }

    @Nullable
    /* JADX INFO: renamed from: getStoreId-7QsYvu8, reason: not valid java name */
    public final String m382getStoreId7QsYvu8() {
        return this.storeId;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isFavorite) * 31;
        String str = this.storeId;
        return iHashCode + (str == null ? 0 : StoreId.m274hashCodeimpl(str));
    }

    public final boolean isFavorite() {
        return this.isFavorite;
    }

    @NotNull
    public String toString() {
        boolean z11 = this.isFavorite;
        String str = this.storeId;
        return "SetFavoriteRequest(isFavorite=" + z11 + ", storeId=" + (str == null ? Address.ADDRESS_NULL_PLACEHOLDER : StoreId.m275toStringimpl(str)) + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/item/requests/SetFavoriteRequest$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/item/requests/SetFavoriteRequest;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return SetFavoriteRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("store_id")
    /* JADX INFO: renamed from: getStoreId-7QsYvu8$annotations, reason: not valid java name */
    public static /* synthetic */ void m379getStoreId7QsYvu8$annotations() {
    }

    @g("is_favorite")
    public static /* synthetic */ void isFavorite$annotations() {
    }

    public /* synthetic */ SetFavoriteRequest(boolean z11, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(z11, str);
    }

    public /* synthetic */ SetFavoriteRequest(int i11, boolean z11, String str, m1 m1Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, z11, str, m1Var);
    }

    private SetFavoriteRequest(boolean z11, String str) {
        this.isFavorite = z11;
        this.storeId = str;
    }

    public /* synthetic */ SetFavoriteRequest(boolean z11, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(z11, (i11 & 2) != 0 ? null : str, null);
    }
}
