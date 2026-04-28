package com.app.tgtg.model.remote.payment;

import android.os.Parcel;
import android.os.Parcelable;
import com.adyen.checkout.components.core.Address;
import com.app.tgtg.model.remote.VoucherId;
import com.app.tgtg.model.remote.VoucherId$$serializer;
import e0.f;
import i90.g;
import i90.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.m1;
import m90.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 82\u00020\u0001:\u000298B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB7\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010\"\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010\u0018J2\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001fJ\u0010\u0010'\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b'\u0010\u0018J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b+\u0010,R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010-\u0012\u0004\b/\u00100\u001a\u0004\b.\u0010\u001fR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010-\u0012\u0004\b2\u00100\u001a\u0004\b1\u0010\u001fR(\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0007\u00103\u0012\u0004\b7\u00100\u001a\u0004\b4\u0010\u0018\"\u0004\b5\u00106¨\u0006:"}, d2 = {"Lcom/app/tgtg/model/remote/payment/RecurringPaymentInformation;", "Landroid/os/Parcelable;", "", "displayValue", "Lcom/app/tgtg/model/remote/VoucherId;", "recurringId", "", "itemsLeft", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ILm90/m1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/payment/RecurringPaymentInformation;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2-sIL_j68", "component2", "component3", "copy-bfQE5nY", "(Ljava/lang/String;Ljava/lang/String;I)Lcom/app/tgtg/model/remote/payment/RecurringPaymentInformation;", "copy", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDisplayValue", "getDisplayValue$annotations", "()V", "getRecurringId-sIL_j68", "getRecurringId-sIL_j68$annotations", "I", "getItemsLeft", "setItemsLeft", "(I)V", "getItemsLeft$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class RecurringPaymentInformation implements Parcelable {

    @Nullable
    private final String displayValue;
    private int itemsLeft;

    @Nullable
    private final String recurringId;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<RecurringPaymentInformation> CREATOR = new Creator();

    private /* synthetic */ RecurringPaymentInformation(int i11, String str, String str2, int i12, m1 m1Var) {
        if ((i11 & 1) == 0) {
            this.displayValue = null;
        } else {
            this.displayValue = str;
        }
        if ((i11 & 2) == 0) {
            this.recurringId = null;
        } else {
            this.recurringId = str2;
        }
        if ((i11 & 4) == 0) {
            this.itemsLeft = 0;
        } else {
            this.itemsLeft = i12;
        }
    }

    /* JADX INFO: renamed from: copy-bfQE5nY$default, reason: not valid java name */
    public static /* synthetic */ RecurringPaymentInformation m470copybfQE5nY$default(RecurringPaymentInformation recurringPaymentInformation, String str, String str2, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = recurringPaymentInformation.displayValue;
        }
        if ((i12 & 2) != 0) {
            str2 = recurringPaymentInformation.recurringId;
        }
        if ((i12 & 4) != 0) {
            i11 = recurringPaymentInformation.itemsLeft;
        }
        return recurringPaymentInformation.m473copybfQE5nY(str, str2, i11);
    }

    public static final /* synthetic */ void write$Self$app(RecurringPaymentInformation self, b output, SerialDescriptor serialDesc) {
        if (output.C(serialDesc) || self.displayValue != null) {
            output.r(serialDesc, 0, r1.f29848a, self.displayValue);
        }
        if (output.C(serialDesc) || self.recurringId != null) {
            VoucherId$$serializer voucherId$$serializer = VoucherId$$serializer.INSTANCE;
            String str = self.recurringId;
            output.r(serialDesc, 1, voucherId$$serializer, str != null ? VoucherId.m298boximpl(str) : null);
        }
        if (!output.C(serialDesc) && self.itemsLeft == 0) {
            return;
        }
        output.m(2, self.itemsLeft, serialDesc);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDisplayValue() {
        return this.displayValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component2-sIL_j68, reason: not valid java name and from getter */
    public final String getRecurringId() {
        return this.recurringId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getItemsLeft() {
        return this.itemsLeft;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-bfQE5nY, reason: not valid java name */
    public final RecurringPaymentInformation m473copybfQE5nY(@Nullable String displayValue, @Nullable String recurringId, int itemsLeft) {
        return new RecurringPaymentInformation(displayValue, recurringId, itemsLeft, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0021  */
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
            boolean r1 = r5 instanceof com.app.tgtg.model.remote.payment.RecurringPaymentInformation
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.app.tgtg.model.remote.payment.RecurringPaymentInformation r5 = (com.app.tgtg.model.remote.payment.RecurringPaymentInformation) r5
            java.lang.String r1 = r4.displayValue
            java.lang.String r3 = r5.displayValue
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.recurringId
            java.lang.String r3 = r5.recurringId
            if (r1 != 0) goto L23
            if (r3 != 0) goto L21
            r1 = r0
            goto L2a
        L21:
            r1 = r2
            goto L2a
        L23:
            if (r3 != 0) goto L26
            goto L21
        L26:
            boolean r1 = com.app.tgtg.model.remote.VoucherId.m302equalsimpl0(r1, r3)
        L2a:
            if (r1 != 0) goto L2d
            return r2
        L2d:
            int r1 = r4.itemsLeft
            int r5 = r5.itemsLeft
            if (r1 == r5) goto L34
            return r2
        L34:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.tgtg.model.remote.payment.RecurringPaymentInformation.equals(java.lang.Object):boolean");
    }

    @Nullable
    public final String getDisplayValue() {
        return this.displayValue;
    }

    public final int getItemsLeft() {
        return this.itemsLeft;
    }

    @Nullable
    /* JADX INFO: renamed from: getRecurringId-sIL_j68, reason: not valid java name */
    public final String m474getRecurringIdsIL_j68() {
        return this.recurringId;
    }

    public int hashCode() {
        String str = this.displayValue;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.recurringId;
        return Integer.hashCode(this.itemsLeft) + ((iHashCode + (str2 != null ? VoucherId.m303hashCodeimpl(str2) : 0)) * 31);
    }

    public final void setItemsLeft(int i11) {
        this.itemsLeft = i11;
    }

    @NotNull
    public String toString() {
        String str = this.displayValue;
        String str2 = this.recurringId;
        return k.i(this.itemsLeft, ")", f.t("RecurringPaymentInformation(displayValue=", str, ", recurringId=", str2 == null ? Address.ADDRESS_NULL_PLACEHOLDER : VoucherId.m304toStringimpl(str2), ", itemsLeft="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.displayValue);
        String str = this.recurringId;
        if (str == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            VoucherId.m305writeToParcelimpl(str, dest, flags);
        }
        dest.writeInt(this.itemsLeft);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/payment/RecurringPaymentInformation$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/payment/RecurringPaymentInformation;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return RecurringPaymentInformation$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RecurringPaymentInformation> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecurringPaymentInformation createFromParcel(Parcel parcel) {
            parcel.getClass();
            String string = parcel.readString();
            DefaultConstructorMarker defaultConstructorMarker = null;
            VoucherId voucherIdCreateFromParcel = parcel.readInt() == 0 ? null : VoucherId.CREATOR.createFromParcel(parcel);
            return new RecurringPaymentInformation(string, voucherIdCreateFromParcel != null ? voucherIdCreateFromParcel.m306unboximpl() : null, parcel.readInt(), defaultConstructorMarker);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecurringPaymentInformation[] newArray(int i11) {
            return new RecurringPaymentInformation[i11];
        }
    }

    @g("display_value")
    public static /* synthetic */ void getDisplayValue$annotations() {
    }

    @g("items_left")
    public static /* synthetic */ void getItemsLeft$annotations() {
    }

    @g("recurring_id")
    /* JADX INFO: renamed from: getRecurringId-sIL_j68$annotations, reason: not valid java name */
    public static /* synthetic */ void m471getRecurringIdsIL_j68$annotations() {
    }

    public /* synthetic */ RecurringPaymentInformation(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i11);
    }

    public /* synthetic */ RecurringPaymentInformation(int i11, String str, String str2, int i12, m1 m1Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, str, str2, i12, m1Var);
    }

    private RecurringPaymentInformation(String str, String str2, int i11) {
        this.displayValue = str;
        this.recurringId = str2;
        this.itemsLeft = i11;
    }

    public /* synthetic */ RecurringPaymentInformation(String str, String str2, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? 0 : i11, null);
    }
}
