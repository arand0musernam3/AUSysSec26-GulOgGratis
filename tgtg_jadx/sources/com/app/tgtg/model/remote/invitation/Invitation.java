package com.app.tgtg.model.remote.invitation;

import android.os.Parcel;
import android.os.Parcelable;
import b3.i;
import com.adyen.checkout.components.core.Address;
import com.app.tgtg.model.remote.OrderId;
import com.app.tgtg.model.remote.OrderId$$serializer;
import com.app.tgtg.model.remote.UserId;
import com.app.tgtg.model.remote.UserId$$serializer;
import e0.f;
import i90.g;
import i90.h;
import j4.s;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.m1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u0000 P2\u00020\u0001:\u0002QPBI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010Bi\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000f\u0010\u0014J\r\u0010\u0015\u001a\u00020\r¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\r¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0010\u0010\"\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\u001eJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b#\u0010\u001eJ\u0010\u0010&\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b%\u0010\u001eJ\u0010\u0010'\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b)\u0010\u0016Jb\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010-\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b-\u0010\u001eJ\u0010\u0010.\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b.\u0010\u0016J\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010/HÖ\u0003¢\u0006\u0004\b2\u00103J'\u0010;\u001a\u00020\u001a2\u0006\u00104\u001a\u00020\u00002\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u000207H\u0001¢\u0006\u0004\b9\u0010:R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010<\u0012\u0004\b>\u0010?\u001a\u0004\b=\u0010\u001eR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010<\u0012\u0004\bA\u0010?\u001a\u0004\b@\u0010\u001eR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010<\u0012\u0004\bC\u0010?\u001a\u0004\bB\u0010\u001eR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010<\u0012\u0004\bE\u0010?\u001a\u0004\bD\u0010\u001eR\"\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010<\u0012\u0004\bG\u0010?\u001a\u0004\bF\u0010\u001eR \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010<\u0012\u0004\bI\u0010?\u001a\u0004\bH\u0010\u001eR \u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010J\u0012\u0004\bL\u0010?\u001a\u0004\bK\u0010(R \u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010M\u0012\u0004\bO\u0010?\u001a\u0004\bN\u0010\u0016¨\u0006R"}, d2 = {"Lcom/app/tgtg/model/remote/invitation/Invitation;", "Landroid/os/Parcelable;", "", "id", "externalId", "invitationType", "Lcom/app/tgtg/model/remote/UserId;", "sender", "recipient", "Lcom/app/tgtg/model/remote/OrderId;", "relatedEntityId", "Lcom/app/tgtg/model/remote/invitation/InvitationState;", "state", "", "declineCount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/invitation/InvitationState;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/invitation/InvitationState;ILm90/m1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4-8nKqa5U", "component4", "component5-4FZwupo", "component5", "component6-reIZeYA", "component6", "component7", "()Lcom/app/tgtg/model/remote/invitation/InvitationState;", "component8", "copy-RxPmQbs", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/invitation/InvitationState;I)Lcom/app/tgtg/model/remote/invitation/Invitation;", "copy", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "write$Self$app", "(Lcom/app/tgtg/model/remote/invitation/Invitation;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getExternalId", "getExternalId$annotations", "getInvitationType", "getInvitationType$annotations", "getSender-8nKqa5U", "getSender-8nKqa5U$annotations", "getRecipient-4FZwupo", "getRecipient-4FZwupo$annotations", "getRelatedEntityId-reIZeYA", "getRelatedEntityId-reIZeYA$annotations", "Lcom/app/tgtg/model/remote/invitation/InvitationState;", "getState", "getState$annotations", "I", "getDeclineCount", "getDeclineCount$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class Invitation implements Parcelable {
    public static final int $stable = 0;
    private final int declineCount;

    @NotNull
    private final String externalId;

    @NotNull
    private final String id;

    @NotNull
    private final String invitationType;

    @Nullable
    private final String recipient;

    @NotNull
    private final String relatedEntityId;

    @NotNull
    private final String sender;

    @NotNull
    private final InvitationState state;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<Invitation> CREATOR = new Creator();

    private /* synthetic */ Invitation(int i11, String str, String str2, String str3, String str4, String str5, String str6, InvitationState invitationState, int i12, m1 m1Var) {
        if (255 != (i11 & 255)) {
            c1.j(i11, 255, Invitation$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = str;
        this.externalId = str2;
        this.invitationType = str3;
        this.sender = str4;
        this.recipient = str5;
        this.relatedEntityId = str6;
        this.state = invitationState;
        this.declineCount = i12;
    }

    /* JADX INFO: renamed from: copy-RxPmQbs$default, reason: not valid java name */
    public static /* synthetic */ Invitation m329copyRxPmQbs$default(Invitation invitation, String str, String str2, String str3, String str4, String str5, String str6, InvitationState invitationState, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = invitation.id;
        }
        if ((i12 & 2) != 0) {
            str2 = invitation.externalId;
        }
        if ((i12 & 4) != 0) {
            str3 = invitation.invitationType;
        }
        if ((i12 & 8) != 0) {
            str4 = invitation.sender;
        }
        if ((i12 & 16) != 0) {
            str5 = invitation.recipient;
        }
        if ((i12 & 32) != 0) {
            str6 = invitation.relatedEntityId;
        }
        if ((i12 & 64) != 0) {
            invitationState = invitation.state;
        }
        if ((i12 & 128) != 0) {
            i11 = invitation.declineCount;
        }
        InvitationState invitationState2 = invitationState;
        int i13 = i11;
        String str7 = str5;
        String str8 = str6;
        return invitation.m336copyRxPmQbs(str, str2, str3, str4, str7, str8, invitationState2, i13);
    }

    public static final /* synthetic */ void write$Self$app(Invitation self, b output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.id);
        output.q(serialDesc, 1, self.externalId);
        output.q(serialDesc, 2, self.invitationType);
        UserId$$serializer userId$$serializer = UserId$$serializer.INSTANCE;
        output.i(serialDesc, 3, userId$$serializer, UserId.m286boximpl(self.sender));
        String str = self.recipient;
        output.r(serialDesc, 4, userId$$serializer, str != null ? UserId.m286boximpl(str) : null);
        output.i(serialDesc, 5, OrderId$$serializer.INSTANCE, OrderId.m209boximpl(self.relatedEntityId));
        output.i(serialDesc, 6, InvitationStateSerializer.INSTANCE, self.state);
        output.m(7, self.declineCount, serialDesc);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getExternalId() {
        return this.externalId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getInvitationType() {
        return this.invitationType;
    }

    @NotNull
    /* JADX INFO: renamed from: component4-8nKqa5U, reason: not valid java name and from getter */
    public final String getSender() {
        return this.sender;
    }

    @Nullable
    /* JADX INFO: renamed from: component5-4FZwupo, reason: not valid java name and from getter */
    public final String getRecipient() {
        return this.recipient;
    }

    @NotNull
    /* JADX INFO: renamed from: component6-reIZeYA, reason: not valid java name and from getter */
    public final String getRelatedEntityId() {
        return this.relatedEntityId;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final InvitationState getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getDeclineCount() {
        return this.declineCount;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-RxPmQbs, reason: not valid java name */
    public final Invitation m336copyRxPmQbs(@NotNull String id2, @NotNull String externalId, @NotNull String invitationType, @NotNull String sender, @Nullable String recipient, @NotNull String relatedEntityId, @NotNull InvitationState state, int declineCount) {
        i.B(id2, externalId, invitationType, sender, relatedEntityId);
        state.getClass();
        return new Invitation(id2, externalId, invitationType, sender, recipient, relatedEntityId, state, declineCount, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
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
            boolean r1 = r5 instanceof com.app.tgtg.model.remote.invitation.Invitation
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.app.tgtg.model.remote.invitation.Invitation r5 = (com.app.tgtg.model.remote.invitation.Invitation) r5
            java.lang.String r1 = r4.id
            java.lang.String r3 = r5.id
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.externalId
            java.lang.String r3 = r5.externalId
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.invitationType
            java.lang.String r3 = r5.invitationType
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.String r1 = r4.sender
            java.lang.String r3 = r5.sender
            boolean r1 = com.app.tgtg.model.remote.UserId.m290equalsimpl0(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            java.lang.String r1 = r4.recipient
            java.lang.String r3 = r5.recipient
            if (r1 != 0) goto L44
            if (r3 != 0) goto L42
            r1 = r0
            goto L4b
        L42:
            r1 = r2
            goto L4b
        L44:
            if (r3 != 0) goto L47
            goto L42
        L47:
            boolean r1 = com.app.tgtg.model.remote.UserId.m290equalsimpl0(r1, r3)
        L4b:
            if (r1 != 0) goto L4e
            return r2
        L4e:
            java.lang.String r1 = r4.relatedEntityId
            java.lang.String r3 = r5.relatedEntityId
            boolean r1 = com.app.tgtg.model.remote.OrderId.m213equalsimpl0(r1, r3)
            if (r1 != 0) goto L59
            return r2
        L59:
            com.app.tgtg.model.remote.invitation.InvitationState r1 = r4.state
            com.app.tgtg.model.remote.invitation.InvitationState r3 = r5.state
            if (r1 == r3) goto L60
            return r2
        L60:
            int r1 = r4.declineCount
            int r5 = r5.declineCount
            if (r1 == r5) goto L67
            return r2
        L67:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.tgtg.model.remote.invitation.Invitation.equals(java.lang.Object):boolean");
    }

    public final int getDeclineCount() {
        return this.declineCount;
    }

    @NotNull
    public final String getExternalId() {
        return this.externalId;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getInvitationType() {
        return this.invitationType;
    }

    @Nullable
    /* JADX INFO: renamed from: getRecipient-4FZwupo, reason: not valid java name */
    public final String m337getRecipient4FZwupo() {
        return this.recipient;
    }

    @NotNull
    /* JADX INFO: renamed from: getRelatedEntityId-reIZeYA, reason: not valid java name */
    public final String m338getRelatedEntityIdreIZeYA() {
        return this.relatedEntityId;
    }

    @NotNull
    /* JADX INFO: renamed from: getSender-8nKqa5U, reason: not valid java name */
    public final String m339getSender8nKqa5U() {
        return this.sender;
    }

    @NotNull
    public final InvitationState getState() {
        return this.state;
    }

    public int hashCode() {
        int iM291hashCodeimpl = (UserId.m291hashCodeimpl(this.sender) + l1.b(l1.b(this.id.hashCode() * 31, 31, this.externalId), 31, this.invitationType)) * 31;
        String str = this.recipient;
        return Integer.hashCode(this.declineCount) + ((this.state.hashCode() + ((OrderId.m214hashCodeimpl(this.relatedEntityId) + ((iM291hashCodeimpl + (str == null ? 0 : UserId.m291hashCodeimpl(str))) * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.externalId;
        String str3 = this.invitationType;
        String strM292toStringimpl = UserId.m292toStringimpl(this.sender);
        String str4 = this.recipient;
        String strM292toStringimpl2 = str4 == null ? Address.ADDRESS_NULL_PLACEHOLDER : UserId.m292toStringimpl(str4);
        String strM215toStringimpl = OrderId.m215toStringimpl(this.relatedEntityId);
        InvitationState invitationState = this.state;
        int i11 = this.declineCount;
        StringBuilder sbT = f.t("Invitation(id=", str, ", externalId=", str2, ", invitationType=");
        s.A(sbT, str3, ", sender=", strM292toStringimpl, ", recipient=");
        s.A(sbT, strM292toStringimpl2, ", relatedEntityId=", strM215toStringimpl, ", state=");
        sbT.append(invitationState);
        sbT.append(", declineCount=");
        sbT.append(i11);
        sbT.append(")");
        return sbT.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.id);
        dest.writeString(this.externalId);
        dest.writeString(this.invitationType);
        UserId.m293writeToParcelimpl(this.sender, dest, flags);
        String str = this.recipient;
        if (str == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            UserId.m293writeToParcelimpl(str, dest, flags);
        }
        OrderId.m216writeToParcelimpl(this.relatedEntityId, dest, flags);
        dest.writeString(this.state.name());
        dest.writeInt(this.declineCount);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/invitation/Invitation$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/invitation/Invitation;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return Invitation$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Invitation> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Invitation createFromParcel(Parcel parcel) {
            parcel.getClass();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Parcelable.Creator<UserId> creator = UserId.CREATOR;
            String strM294unboximpl = creator.createFromParcel(parcel).m294unboximpl();
            UserId userIdCreateFromParcel = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
            return new Invitation(string, string2, string3, strM294unboximpl, userIdCreateFromParcel != null ? userIdCreateFromParcel.m294unboximpl() : null, OrderId.CREATOR.createFromParcel(parcel).m217unboximpl(), InvitationState.valueOf(parcel.readString()), parcel.readInt(), null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Invitation[] newArray(int i11) {
            return new Invitation[i11];
        }
    }

    @g("decline_count")
    public static /* synthetic */ void getDeclineCount$annotations() {
    }

    @g("external_id")
    public static /* synthetic */ void getExternalId$annotations() {
    }

    @g("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @g("invitation_type")
    public static /* synthetic */ void getInvitationType$annotations() {
    }

    @g("recipient")
    /* JADX INFO: renamed from: getRecipient-4FZwupo$annotations, reason: not valid java name */
    public static /* synthetic */ void m330getRecipient4FZwupo$annotations() {
    }

    @g("related_entity_id")
    /* JADX INFO: renamed from: getRelatedEntityId-reIZeYA$annotations, reason: not valid java name */
    public static /* synthetic */ void m331getRelatedEntityIdreIZeYA$annotations() {
    }

    @g("sender")
    /* JADX INFO: renamed from: getSender-8nKqa5U$annotations, reason: not valid java name */
    public static /* synthetic */ void m332getSender8nKqa5U$annotations() {
    }

    @g("state")
    public static /* synthetic */ void getState$annotations() {
    }

    private Invitation(String str, String str2, String str3, String str4, String str5, String str6, InvitationState invitationState, int i11) {
        i.B(str, str2, str3, str4, str6);
        invitationState.getClass();
        this.id = str;
        this.externalId = str2;
        this.invitationType = str3;
        this.sender = str4;
        this.recipient = str5;
        this.relatedEntityId = str6;
        this.state = invitationState;
        this.declineCount = i11;
    }

    public /* synthetic */ Invitation(String str, String str2, String str3, String str4, String str5, String str6, InvitationState invitationState, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, invitationState, i11);
    }

    public /* synthetic */ Invitation(int i11, String str, String str2, String str3, String str4, String str5, String str6, InvitationState invitationState, int i12, m1 m1Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, str, str2, str3, str4, str5, str6, invitationState, i12, m1Var);
    }
}
