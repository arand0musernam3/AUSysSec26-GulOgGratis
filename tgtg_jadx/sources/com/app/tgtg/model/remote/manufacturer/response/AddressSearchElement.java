package com.app.tgtg.model.remote.manufacturer.response;

import e0.f;
import i90.g;
import i90.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.m1;
import org.bouncycastle.i18n.ErrorBundle;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import w.a0;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001e\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tBA\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019J8\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\u00042\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u0019R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010*\u0012\u0004\b+\u0010)\u001a\u0004\b\u0005\u0010\u001bR \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010&\u0012\u0004\b-\u0010)\u001a\u0004\b,\u0010\u0019R \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010&\u0012\u0004\b/\u0010)\u001a\u0004\b.\u0010\u0019¨\u00062"}, d2 = {"Lcom/app/tgtg/model/remote/manufacturer/response/AddressSearchElement;", "", "", "searchId", "", "isFound", TextBundle.TEXT_ENTRY, ErrorBundle.DETAIL_ENTRY, "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/manufacturer/response/AddressSearchElement;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "component4", "copy", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Lcom/app/tgtg/model/remote/manufacturer/response/AddressSearchElement;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSearchId", "getSearchId$annotations", "()V", "Z", "isFound$annotations", "getText", "getText$annotations", "getDetails", "getDetails$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class AddressSearchElement {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String details;
    private final boolean isFound;

    @NotNull
    private final String searchId;

    @NotNull
    private final String text;

    public /* synthetic */ AddressSearchElement(int i11, String str, boolean z11, String str2, String str3, m1 m1Var) {
        if (15 != (i11 & 15)) {
            c1.j(i11, 15, AddressSearchElement$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.searchId = str;
        this.isFound = z11;
        this.text = str2;
        this.details = str3;
    }

    public static /* synthetic */ AddressSearchElement copy$default(AddressSearchElement addressSearchElement, String str, boolean z11, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = addressSearchElement.searchId;
        }
        if ((i11 & 2) != 0) {
            z11 = addressSearchElement.isFound;
        }
        if ((i11 & 4) != 0) {
            str2 = addressSearchElement.text;
        }
        if ((i11 & 8) != 0) {
            str3 = addressSearchElement.details;
        }
        return addressSearchElement.copy(str, z11, str2, str3);
    }

    public static final /* synthetic */ void write$Self$app(AddressSearchElement self, b output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.searchId);
        output.p(serialDesc, 1, self.isFound);
        output.q(serialDesc, 2, self.text);
        output.q(serialDesc, 3, self.details);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSearchId() {
        return this.searchId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsFound() {
        return this.isFound;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDetails() {
        return this.details;
    }

    @NotNull
    public final AddressSearchElement copy(@NotNull String searchId, boolean isFound, @NotNull String text, @NotNull String details) {
        searchId.getClass();
        text.getClass();
        details.getClass();
        return new AddressSearchElement(searchId, isFound, text, details);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressSearchElement)) {
            return false;
        }
        AddressSearchElement addressSearchElement = (AddressSearchElement) other;
        return Intrinsics.areEqual(this.searchId, addressSearchElement.searchId) && this.isFound == addressSearchElement.isFound && Intrinsics.areEqual(this.text, addressSearchElement.text) && Intrinsics.areEqual(this.details, addressSearchElement.details);
    }

    @NotNull
    public final String getDetails() {
        return this.details;
    }

    @NotNull
    public final String getSearchId() {
        return this.searchId;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return this.details.hashCode() + l1.b(k.e(this.searchId.hashCode() * 31, 31, this.isFound), 31, this.text);
    }

    public final boolean isFound() {
        return this.isFound;
    }

    @NotNull
    public String toString() {
        String str = this.searchId;
        boolean z11 = this.isFound;
        String str2 = this.text;
        String str3 = this.details;
        StringBuilder sb2 = new StringBuilder("AddressSearchElement(searchId=");
        sb2.append(str);
        sb2.append(", isFound=");
        sb2.append(z11);
        sb2.append(", text=");
        return f.o(sb2, str2, ", details=", str3, ")");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/manufacturer/response/AddressSearchElement$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/manufacturer/response/AddressSearchElement;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return AddressSearchElement$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g(ErrorBundle.DETAIL_ENTRY)
    public static /* synthetic */ void getDetails$annotations() {
    }

    @g("id")
    public static /* synthetic */ void getSearchId$annotations() {
    }

    @g(TextBundle.TEXT_ENTRY)
    public static /* synthetic */ void getText$annotations() {
    }

    @g("is_found")
    public static /* synthetic */ void isFound$annotations() {
    }

    public AddressSearchElement(@NotNull String str, boolean z11, @NotNull String str2, @NotNull String str3) {
        a0.C(str, str2, str3);
        this.searchId = str;
        this.isFound = z11;
        this.text = str2;
        this.details = str3;
    }
}
