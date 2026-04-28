package com.app.tgtg.feature.tabprofile.manageaccount.hiddenstores.network.model.request;

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
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J\u0010\u0010\u001c\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010\"\u0012\u0004\b&\u0010'\u001a\u0004\b#\u0010\u0015\"\u0004\b$\u0010%¨\u0006*"}, d2 = {"Lcom/app/tgtg/feature/tabprofile/manageaccount/hiddenstores/network/model/request/RemoveHiddenStoreRequest;", "", "Lcom/app/tgtg/model/remote/StoreId;", "storeId", "<init>", "(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Lm90/m1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/feature/tabprofile/manageaccount/hiddenstores/network/model/request/RemoveHiddenStoreRequest;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-7QsYvu8", "()Ljava/lang/String;", "component1", "copy-A-HFjaE", "(Ljava/lang/String;)Lcom/app/tgtg/feature/tabprofile/manageaccount/hiddenstores/network/model/request/RemoveHiddenStoreRequest;", "copy", "", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getStoreId-7QsYvu8", "setStoreId-A-HFjaE", "(Ljava/lang/String;)V", "getStoreId-7QsYvu8$annotations", "()V", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class RemoveHiddenStoreRequest {

    @Nullable
    private String storeId;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    private /* synthetic */ RemoveHiddenStoreRequest(int i11, String str, m1 m1Var) {
        if (1 == (i11 & 1)) {
            this.storeId = str;
        } else {
            c1.j(i11, 1, RemoveHiddenStoreRequest$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    /* JADX INFO: renamed from: copy-A-HFjaE$default, reason: not valid java name */
    public static /* synthetic */ RemoveHiddenStoreRequest m178copyAHFjaE$default(RemoveHiddenStoreRequest removeHiddenStoreRequest, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = removeHiddenStoreRequest.storeId;
        }
        return removeHiddenStoreRequest.m181copyAHFjaE(str);
    }

    public static final /* synthetic */ void write$Self$app(RemoveHiddenStoreRequest self, b output, SerialDescriptor serialDesc) {
        StoreId$$serializer storeId$$serializer = StoreId$$serializer.INSTANCE;
        String str = self.storeId;
        output.r(serialDesc, 0, storeId$$serializer, str != null ? StoreId.m269boximpl(str) : null);
    }

    @Nullable
    /* JADX INFO: renamed from: component1-7QsYvu8, reason: not valid java name and from getter */
    public final String getStoreId() {
        return this.storeId;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-A-HFjaE, reason: not valid java name */
    public final RemoveHiddenStoreRequest m181copyAHFjaE(@Nullable String storeId) {
        return new RemoveHiddenStoreRequest(storeId, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof com.app.tgtg.feature.tabprofile.manageaccount.hiddenstores.network.model.request.RemoveHiddenStoreRequest
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.app.tgtg.feature.tabprofile.manageaccount.hiddenstores.network.model.request.RemoveHiddenStoreRequest r4 = (com.app.tgtg.feature.tabprofile.manageaccount.hiddenstores.network.model.request.RemoveHiddenStoreRequest) r4
            java.lang.String r1 = r3.storeId
            java.lang.String r4 = r4.storeId
            if (r1 != 0) goto L18
            if (r4 != 0) goto L16
            r4 = r0
            goto L1f
        L16:
            r4 = r2
            goto L1f
        L18:
            if (r4 != 0) goto L1b
            goto L16
        L1b:
            boolean r4 = com.app.tgtg.model.remote.StoreId.m273equalsimpl0(r1, r4)
        L1f:
            if (r4 != 0) goto L22
            return r2
        L22:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.tgtg.feature.tabprofile.manageaccount.hiddenstores.network.model.request.RemoveHiddenStoreRequest.equals(java.lang.Object):boolean");
    }

    @Nullable
    /* JADX INFO: renamed from: getStoreId-7QsYvu8, reason: not valid java name */
    public final String m182getStoreId7QsYvu8() {
        return this.storeId;
    }

    public int hashCode() {
        String str = this.storeId;
        if (str == null) {
            return 0;
        }
        return StoreId.m274hashCodeimpl(str);
    }

    /* JADX INFO: renamed from: setStoreId-A-HFjaE, reason: not valid java name */
    public final void m183setStoreIdAHFjaE(@Nullable String str) {
        this.storeId = str;
    }

    @NotNull
    public String toString() {
        String str = this.storeId;
        return a0.p("RemoveHiddenStoreRequest(storeId=", str == null ? Address.ADDRESS_NULL_PLACEHOLDER : StoreId.m275toStringimpl(str), ")");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/feature/tabprofile/manageaccount/hiddenstores/network/model/request/RemoveHiddenStoreRequest$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/feature/tabprofile/manageaccount/hiddenstores/network/model/request/RemoveHiddenStoreRequest;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return RemoveHiddenStoreRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("store_id")
    /* JADX INFO: renamed from: getStoreId-7QsYvu8$annotations, reason: not valid java name */
    public static /* synthetic */ void m179getStoreId7QsYvu8$annotations() {
    }

    public /* synthetic */ RemoveHiddenStoreRequest(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public /* synthetic */ RemoveHiddenStoreRequest(int i11, String str, m1 m1Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, str, m1Var);
    }

    private RemoveHiddenStoreRequest(String str) {
        this.storeId = str;
    }
}
