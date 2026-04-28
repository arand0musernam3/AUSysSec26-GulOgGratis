package com.app.tgtg.model.remote.user.requests;

import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.AdRevenueScheme;
import e0.f;
import i90.g;
import i90.h;
import j4.s;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.m1;
import m90.r1;
import nr.a;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import u70.j;
import u70.l;
import u70.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b/\b\u0087\b\u0018\u0000 s2\u00020\u0001:\u0002tsBÝ\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0017\u0010\u0018BÍ\u0001\b\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u0017\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0019¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0019¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010'J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010'J\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010'J\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010'J\u0012\u0010,\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b,\u0010'J\u0012\u0010-\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010'J\u0012\u0010.\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b.\u0010'J\u0012\u0010/\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b/\u0010'J\u0012\u00100\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b0\u0010'J\u0012\u00101\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b1\u0010'J\u0012\u00102\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b2\u0010'J\u0012\u00103\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b3\u0010'J\u0012\u00104\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b4\u00105J\u0012\u00106\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b6\u0010'J\u0012\u00107\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b7\u0010'J\u0010\u00108\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\b8\u00109J\u0012\u0010:\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b:\u0010'Jæ\u0001\u0010;\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b=\u0010'J\u0010\u0010>\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b>\u0010\u001fJ\u001a\u0010A\u001a\u00020\u00142\b\u0010@\u001a\u0004\u0018\u00010?HÖ\u0003¢\u0006\u0004\bA\u0010BJ'\u0010J\u001a\u00020#2\u0006\u0010C\u001a\u00020\u00002\u0006\u0010E\u001a\u00020D2\u0006\u0010G\u001a\u00020FH\u0001¢\u0006\u0004\bH\u0010IR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010K\u0012\u0004\bM\u0010N\u001a\u0004\bL\u0010'R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010K\u0012\u0004\bP\u0010N\u001a\u0004\bO\u0010'R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010K\u0012\u0004\bR\u0010N\u001a\u0004\bQ\u0010'R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010K\u0012\u0004\bT\u0010N\u001a\u0004\bS\u0010'R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010K\u0012\u0004\bV\u0010N\u001a\u0004\bU\u0010'R\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010K\u0012\u0004\bX\u0010N\u001a\u0004\bW\u0010'R\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010K\u0012\u0004\bZ\u0010N\u001a\u0004\bY\u0010'R\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010K\u0012\u0004\b\\\u0010N\u001a\u0004\b[\u0010'R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010K\u0012\u0004\b^\u0010N\u001a\u0004\b]\u0010'R\"\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010K\u0012\u0004\b`\u0010N\u001a\u0004\b_\u0010'R\"\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010K\u0012\u0004\bb\u0010N\u001a\u0004\ba\u0010'R\"\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010K\u0012\u0004\bd\u0010N\u001a\u0004\bc\u0010'R\"\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010K\u0012\u0004\bf\u0010N\u001a\u0004\be\u0010'R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010g\u0012\u0004\bi\u0010N\u001a\u0004\bh\u00105R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010K\u0012\u0004\bk\u0010N\u001a\u0004\bj\u0010'R\"\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010K\u0012\u0004\bm\u0010N\u001a\u0004\bl\u0010'R \u0010\u0015\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010n\u0012\u0004\bp\u0010N\u001a\u0004\bo\u00109R\"\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010K\u0012\u0004\br\u0010N\u001a\u0004\bq\u0010'¨\u0006u"}, d2 = {"Lcom/app/tgtg/model/remote/user/requests/UserAddress;", "Landroid/os/Parcelable;", "", "name", "email", "phoneCountryCode", "phone", "address1", "address2", "city", "state", "postalCode", AdRevenueScheme.COUNTRY, "streetName", "houseNumber", "houseNumberAddition", "Lnr/a;", "userAddressType", "userAddressId", "deliveryAccessCode", "", "noDeliveryAccessCode", "deliveryInstructions", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lnr/a;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lnr/a;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lm90/m1;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "()Lnr/a;", "component15", "component16", "component17", "()Z", "component18", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lnr/a;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Lcom/app/tgtg/model/remote/user/requests/UserAddress;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "write$Self$app", "(Lcom/app/tgtg/model/remote/user/requests/UserAddress;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getName", "getName$annotations", "()V", "getEmail", "getEmail$annotations", "getPhoneCountryCode", "getPhoneCountryCode$annotations", "getPhone", "getPhone$annotations", "getAddress1", "getAddress1$annotations", "getAddress2", "getAddress2$annotations", "getCity", "getCity$annotations", "getState", "getState$annotations", "getPostalCode", "getPostalCode$annotations", "getCountry", "getCountry$annotations", "getStreetName", "getStreetName$annotations", "getHouseNumber", "getHouseNumber$annotations", "getHouseNumberAddition", "getHouseNumberAddition$annotations", "Lnr/a;", "getUserAddressType", "getUserAddressType$annotations", "getUserAddressId", "getUserAddressId$annotations", "getDeliveryAccessCode", "getDeliveryAccessCode$annotations", "Z", "getNoDeliveryAccessCode", "getNoDeliveryAccessCode$annotations", "getDeliveryInstructions", "getDeliveryInstructions$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class UserAddress implements Parcelable {
    public static final int $stable = 0;

    @Nullable
    private final String address1;

    @Nullable
    private final String address2;

    @Nullable
    private final String city;

    @Nullable
    private final String country;

    @Nullable
    private final String deliveryAccessCode;

    @Nullable
    private final String deliveryInstructions;

    @Nullable
    private final String email;

    @Nullable
    private final String houseNumber;

    @Nullable
    private final String houseNumberAddition;

    @Nullable
    private final String name;
    private final boolean noDeliveryAccessCode;

    @Nullable
    private final String phone;

    @Nullable
    private final String phoneCountryCode;

    @Nullable
    private final String postalCode;

    @Nullable
    private final String state;

    @Nullable
    private final String streetName;

    @Nullable
    private final String userAddressId;

    @Nullable
    private final a userAddressType;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<UserAddress> CREATOR = new Creator();

    @NotNull
    private static final j[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, l.a(m.PUBLICATION, new uu.a(0)), null, null, null, null};

    public /* synthetic */ UserAddress(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, a aVar, String str14, String str15, boolean z11, String str16, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6, (i11 & 64) != 0 ? null : str7, (i11 & 128) != 0 ? null : str8, (i11 & 256) != 0 ? null : str9, (i11 & 512) != 0 ? null : str10, (i11 & 1024) != 0 ? null : str11, (i11 & NewHope.SENDB_BYTES) != 0 ? null : str12, (i11 & 4096) != 0 ? null : str13, (i11 & 8192) != 0 ? null : aVar, (i11 & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) != 0 ? null : str14, (i11 & 32768) != 0 ? null : str15, (i11 & 65536) != 0 ? false : z11, (i11 & 131072) != 0 ? null : str16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer _childSerializers$_anonymous_() {
        a[] aVarArrValues = a.values();
        aVarArrValues.getClass();
        return new i90.a("com.app.tgtg.feature.tabprofile.manageaccount.accountdetails.edit.address.UserAddressType", (Enum[]) aVarArrValues);
    }

    public static /* synthetic */ UserAddress copy$default(UserAddress userAddress, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, a aVar, String str14, String str15, boolean z11, String str16, int i11, Object obj) {
        String str17;
        boolean z12;
        String str18 = (i11 & 1) != 0 ? userAddress.name : str;
        String str19 = (i11 & 2) != 0 ? userAddress.email : str2;
        String str20 = (i11 & 4) != 0 ? userAddress.phoneCountryCode : str3;
        String str21 = (i11 & 8) != 0 ? userAddress.phone : str4;
        String str22 = (i11 & 16) != 0 ? userAddress.address1 : str5;
        String str23 = (i11 & 32) != 0 ? userAddress.address2 : str6;
        String str24 = (i11 & 64) != 0 ? userAddress.city : str7;
        String str25 = (i11 & 128) != 0 ? userAddress.state : str8;
        String str26 = (i11 & 256) != 0 ? userAddress.postalCode : str9;
        String str27 = (i11 & 512) != 0 ? userAddress.country : str10;
        String str28 = (i11 & 1024) != 0 ? userAddress.streetName : str11;
        String str29 = (i11 & NewHope.SENDB_BYTES) != 0 ? userAddress.houseNumber : str12;
        String str30 = (i11 & 4096) != 0 ? userAddress.houseNumberAddition : str13;
        a aVar2 = (i11 & 8192) != 0 ? userAddress.userAddressType : aVar;
        String str31 = str18;
        String str32 = (i11 & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) != 0 ? userAddress.userAddressId : str14;
        String str33 = (i11 & 32768) != 0 ? userAddress.deliveryAccessCode : str15;
        boolean z13 = (i11 & 65536) != 0 ? userAddress.noDeliveryAccessCode : z11;
        if ((i11 & 131072) != 0) {
            z12 = z13;
            str17 = userAddress.deliveryInstructions;
        } else {
            str17 = str16;
            z12 = z13;
        }
        return userAddress.copy(str31, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, aVar2, str32, str33, z12, str17);
    }

    public static final /* synthetic */ void write$Self$app(UserAddress self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        if (output.C(serialDesc) || self.name != null) {
            output.r(serialDesc, 0, r1.f29848a, self.name);
        }
        if (output.C(serialDesc) || self.email != null) {
            output.r(serialDesc, 1, r1.f29848a, self.email);
        }
        if (output.C(serialDesc) || self.phoneCountryCode != null) {
            output.r(serialDesc, 2, r1.f29848a, self.phoneCountryCode);
        }
        if (output.C(serialDesc) || self.phone != null) {
            output.r(serialDesc, 3, r1.f29848a, self.phone);
        }
        if (output.C(serialDesc) || self.address1 != null) {
            output.r(serialDesc, 4, r1.f29848a, self.address1);
        }
        if (output.C(serialDesc) || self.address2 != null) {
            output.r(serialDesc, 5, r1.f29848a, self.address2);
        }
        if (output.C(serialDesc) || self.city != null) {
            output.r(serialDesc, 6, r1.f29848a, self.city);
        }
        if (output.C(serialDesc) || self.state != null) {
            output.r(serialDesc, 7, r1.f29848a, self.state);
        }
        if (output.C(serialDesc) || self.postalCode != null) {
            output.r(serialDesc, 8, r1.f29848a, self.postalCode);
        }
        if (output.C(serialDesc) || self.country != null) {
            output.r(serialDesc, 9, r1.f29848a, self.country);
        }
        if (output.C(serialDesc) || self.streetName != null) {
            output.r(serialDesc, 10, r1.f29848a, self.streetName);
        }
        if (output.C(serialDesc) || self.houseNumber != null) {
            output.r(serialDesc, 11, r1.f29848a, self.houseNumber);
        }
        if (output.C(serialDesc) || self.houseNumberAddition != null) {
            output.r(serialDesc, 12, r1.f29848a, self.houseNumberAddition);
        }
        if (output.C(serialDesc) || self.userAddressType != null) {
            output.r(serialDesc, 13, (KSerializer) jVarArr[13].getValue(), self.userAddressType);
        }
        if (output.C(serialDesc) || self.userAddressId != null) {
            output.r(serialDesc, 14, r1.f29848a, self.userAddressId);
        }
        r1 r1Var = r1.f29848a;
        output.r(serialDesc, 15, r1Var, self.deliveryAccessCode);
        output.p(serialDesc, 16, self.noDeliveryAccessCode);
        output.r(serialDesc, 17, r1Var, self.deliveryInstructions);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getStreetName() {
        return this.streetName;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getHouseNumber() {
        return this.houseNumber;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getHouseNumberAddition() {
        return this.houseNumberAddition;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final a getUserAddressType() {
        return this.userAddressType;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getUserAddressId() {
        return this.userAddressId;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getDeliveryAccessCode() {
        return this.deliveryAccessCode;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final boolean getNoDeliveryAccessCode() {
        return this.noDeliveryAccessCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getDeliveryInstructions() {
        return this.deliveryInstructions;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPhoneCountryCode() {
        return this.phoneCountryCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAddress1() {
        return this.address1;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAddress2() {
        return this.address2;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getState() {
        return this.state;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getPostalCode() {
        return this.postalCode;
    }

    @NotNull
    public final UserAddress copy(@Nullable String name, @Nullable String email, @Nullable String phoneCountryCode, @Nullable String phone, @Nullable String address1, @Nullable String address2, @Nullable String city, @Nullable String state, @Nullable String postalCode, @Nullable String country, @Nullable String streetName, @Nullable String houseNumber, @Nullable String houseNumberAddition, @Nullable a userAddressType, @Nullable String userAddressId, @Nullable String deliveryAccessCode, boolean noDeliveryAccessCode, @Nullable String deliveryInstructions) {
        return new UserAddress(name, email, phoneCountryCode, phone, address1, address2, city, state, postalCode, country, streetName, houseNumber, houseNumberAddition, userAddressType, userAddressId, deliveryAccessCode, noDeliveryAccessCode, deliveryInstructions);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserAddress)) {
            return false;
        }
        UserAddress userAddress = (UserAddress) other;
        return Intrinsics.areEqual(this.name, userAddress.name) && Intrinsics.areEqual(this.email, userAddress.email) && Intrinsics.areEqual(this.phoneCountryCode, userAddress.phoneCountryCode) && Intrinsics.areEqual(this.phone, userAddress.phone) && Intrinsics.areEqual(this.address1, userAddress.address1) && Intrinsics.areEqual(this.address2, userAddress.address2) && Intrinsics.areEqual(this.city, userAddress.city) && Intrinsics.areEqual(this.state, userAddress.state) && Intrinsics.areEqual(this.postalCode, userAddress.postalCode) && Intrinsics.areEqual(this.country, userAddress.country) && Intrinsics.areEqual(this.streetName, userAddress.streetName) && Intrinsics.areEqual(this.houseNumber, userAddress.houseNumber) && Intrinsics.areEqual(this.houseNumberAddition, userAddress.houseNumberAddition) && this.userAddressType == userAddress.userAddressType && Intrinsics.areEqual(this.userAddressId, userAddress.userAddressId) && Intrinsics.areEqual(this.deliveryAccessCode, userAddress.deliveryAccessCode) && this.noDeliveryAccessCode == userAddress.noDeliveryAccessCode && Intrinsics.areEqual(this.deliveryInstructions, userAddress.deliveryInstructions);
    }

    @Nullable
    public final String getAddress1() {
        return this.address1;
    }

    @Nullable
    public final String getAddress2() {
        return this.address2;
    }

    @Nullable
    public final String getCity() {
        return this.city;
    }

    @Nullable
    public final String getCountry() {
        return this.country;
    }

    @Nullable
    public final String getDeliveryAccessCode() {
        return this.deliveryAccessCode;
    }

    @Nullable
    public final String getDeliveryInstructions() {
        return this.deliveryInstructions;
    }

    @Nullable
    public final String getEmail() {
        return this.email;
    }

    @Nullable
    public final String getHouseNumber() {
        return this.houseNumber;
    }

    @Nullable
    public final String getHouseNumberAddition() {
        return this.houseNumberAddition;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final boolean getNoDeliveryAccessCode() {
        return this.noDeliveryAccessCode;
    }

    @Nullable
    public final String getPhone() {
        return this.phone;
    }

    @Nullable
    public final String getPhoneCountryCode() {
        return this.phoneCountryCode;
    }

    @Nullable
    public final String getPostalCode() {
        return this.postalCode;
    }

    @Nullable
    public final String getState() {
        return this.state;
    }

    @Nullable
    public final String getStreetName() {
        return this.streetName;
    }

    @Nullable
    public final String getUserAddressId() {
        return this.userAddressId;
    }

    @Nullable
    public final a getUserAddressType() {
        return this.userAddressType;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.email;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.phoneCountryCode;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.phone;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.address1;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.address2;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.city;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.state;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.postalCode;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.country;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.streetName;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.houseNumber;
        int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.houseNumberAddition;
        int iHashCode13 = (iHashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        a aVar = this.userAddressType;
        int iHashCode14 = (iHashCode13 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str14 = this.userAddressId;
        int iHashCode15 = (iHashCode14 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.deliveryAccessCode;
        int iE = k.e((iHashCode15 + (str15 == null ? 0 : str15.hashCode())) * 31, 31, this.noDeliveryAccessCode);
        String str16 = this.deliveryInstructions;
        return iE + (str16 != null ? str16.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.name;
        String str2 = this.email;
        String str3 = this.phoneCountryCode;
        String str4 = this.phone;
        String str5 = this.address1;
        String str6 = this.address2;
        String str7 = this.city;
        String str8 = this.state;
        String str9 = this.postalCode;
        String str10 = this.country;
        String str11 = this.streetName;
        String str12 = this.houseNumber;
        String str13 = this.houseNumberAddition;
        a aVar = this.userAddressType;
        String str14 = this.userAddressId;
        String str15 = this.deliveryAccessCode;
        boolean z11 = this.noDeliveryAccessCode;
        String str16 = this.deliveryInstructions;
        StringBuilder sbT = f.t("UserAddress(name=", str, ", email=", str2, ", phoneCountryCode=");
        s.A(sbT, str3, ", phone=", str4, ", address1=");
        s.A(sbT, str5, ", address2=", str6, ", city=");
        s.A(sbT, str7, ", state=", str8, ", postalCode=");
        s.A(sbT, str9, ", country=", str10, ", streetName=");
        s.A(sbT, str11, ", houseNumber=", str12, ", houseNumberAddition=");
        sbT.append(str13);
        sbT.append(", userAddressType=");
        sbT.append(aVar);
        sbT.append(", userAddressId=");
        s.A(sbT, str14, ", deliveryAccessCode=", str15, ", noDeliveryAccessCode=");
        sbT.append(z11);
        sbT.append(", deliveryInstructions=");
        sbT.append(str16);
        sbT.append(")");
        return sbT.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.name);
        dest.writeString(this.email);
        dest.writeString(this.phoneCountryCode);
        dest.writeString(this.phone);
        dest.writeString(this.address1);
        dest.writeString(this.address2);
        dest.writeString(this.city);
        dest.writeString(this.state);
        dest.writeString(this.postalCode);
        dest.writeString(this.country);
        dest.writeString(this.streetName);
        dest.writeString(this.houseNumber);
        dest.writeString(this.houseNumberAddition);
        a aVar = this.userAddressType;
        if (aVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(aVar.name());
        }
        dest.writeString(this.userAddressId);
        dest.writeString(this.deliveryAccessCode);
        dest.writeInt(this.noDeliveryAccessCode ? 1 : 0);
        dest.writeString(this.deliveryInstructions);
    }

    public /* synthetic */ UserAddress(int i11, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, a aVar, String str14, String str15, boolean z11, String str16, m1 m1Var) {
        if ((i11 & 1) == 0) {
            this.name = null;
        } else {
            this.name = str;
        }
        if ((i11 & 2) == 0) {
            this.email = null;
        } else {
            this.email = str2;
        }
        if ((i11 & 4) == 0) {
            this.phoneCountryCode = null;
        } else {
            this.phoneCountryCode = str3;
        }
        if ((i11 & 8) == 0) {
            this.phone = null;
        } else {
            this.phone = str4;
        }
        if ((i11 & 16) == 0) {
            this.address1 = null;
        } else {
            this.address1 = str5;
        }
        if ((i11 & 32) == 0) {
            this.address2 = null;
        } else {
            this.address2 = str6;
        }
        if ((i11 & 64) == 0) {
            this.city = null;
        } else {
            this.city = str7;
        }
        if ((i11 & 128) == 0) {
            this.state = null;
        } else {
            this.state = str8;
        }
        if ((i11 & 256) == 0) {
            this.postalCode = null;
        } else {
            this.postalCode = str9;
        }
        if ((i11 & 512) == 0) {
            this.country = null;
        } else {
            this.country = str10;
        }
        if ((i11 & 1024) == 0) {
            this.streetName = null;
        } else {
            this.streetName = str11;
        }
        if ((i11 & NewHope.SENDB_BYTES) == 0) {
            this.houseNumber = null;
        } else {
            this.houseNumber = str12;
        }
        if ((i11 & 4096) == 0) {
            this.houseNumberAddition = null;
        } else {
            this.houseNumberAddition = str13;
        }
        if ((i11 & 8192) == 0) {
            this.userAddressType = null;
        } else {
            this.userAddressType = aVar;
        }
        if ((i11 & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) == 0) {
            this.userAddressId = null;
        } else {
            this.userAddressId = str14;
        }
        if ((32768 & i11) == 0) {
            this.deliveryAccessCode = null;
        } else {
            this.deliveryAccessCode = str15;
        }
        this.noDeliveryAccessCode = (65536 & i11) == 0 ? false : z11;
        if ((i11 & 131072) == 0) {
            this.deliveryInstructions = null;
        } else {
            this.deliveryInstructions = str16;
        }
    }

    public UserAddress(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable a aVar, @Nullable String str14, @Nullable String str15, boolean z11, @Nullable String str16) {
        this.name = str;
        this.email = str2;
        this.phoneCountryCode = str3;
        this.phone = str4;
        this.address1 = str5;
        this.address2 = str6;
        this.city = str7;
        this.state = str8;
        this.postalCode = str9;
        this.country = str10;
        this.streetName = str11;
        this.houseNumber = str12;
        this.houseNumberAddition = str13;
        this.userAddressType = aVar;
        this.userAddressId = str14;
        this.deliveryAccessCode = str15;
        this.noDeliveryAccessCode = z11;
        this.deliveryInstructions = str16;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/user/requests/UserAddress$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/user/requests/UserAddress;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return UserAddress$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<UserAddress> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserAddress createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new UserAddress(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : a.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserAddress[] newArray(int i11) {
            return new UserAddress[i11];
        }
    }

    @g("address1")
    public static /* synthetic */ void getAddress1$annotations() {
    }

    @g("address2")
    public static /* synthetic */ void getAddress2$annotations() {
    }

    @g("city")
    public static /* synthetic */ void getCity$annotations() {
    }

    @g(AdRevenueScheme.COUNTRY)
    public static /* synthetic */ void getCountry$annotations() {
    }

    @g("delivery_access_code")
    public static /* synthetic */ void getDeliveryAccessCode$annotations() {
    }

    @g("delivery_instructions")
    public static /* synthetic */ void getDeliveryInstructions$annotations() {
    }

    @g("email")
    public static /* synthetic */ void getEmail$annotations() {
    }

    @g("house_number")
    public static /* synthetic */ void getHouseNumber$annotations() {
    }

    @g("house_number_addition")
    public static /* synthetic */ void getHouseNumberAddition$annotations() {
    }

    @g("name")
    public static /* synthetic */ void getName$annotations() {
    }

    @g("no_delivery_access_code")
    public static /* synthetic */ void getNoDeliveryAccessCode$annotations() {
    }

    @g("phone")
    public static /* synthetic */ void getPhone$annotations() {
    }

    @g("phone_country_code")
    public static /* synthetic */ void getPhoneCountryCode$annotations() {
    }

    @g("postal_code")
    public static /* synthetic */ void getPostalCode$annotations() {
    }

    @g("state")
    public static /* synthetic */ void getState$annotations() {
    }

    @g("street_name")
    public static /* synthetic */ void getStreetName$annotations() {
    }

    @g("user_address_id")
    public static /* synthetic */ void getUserAddressId$annotations() {
    }

    @g("user_address_type")
    public static /* synthetic */ void getUserAddressType$annotations() {
    }

    public UserAddress() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (a) null, (String) null, (String) null, false, (String) null, 262143, (DefaultConstructorMarker) null);
    }
}
