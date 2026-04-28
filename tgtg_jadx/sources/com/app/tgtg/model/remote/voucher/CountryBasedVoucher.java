package com.app.tgtg.model.remote.voucher;

import android.os.Parcel;
import android.os.Parcelable;
import b3.i;
import com.app.tgtg.model.remote.VoucherId;
import com.app.tgtg.model.remote.VoucherId$$serializer;
import com.app.tgtg.model.remote.item.response.ItemType;
import com.app.tgtg.model.remote.item.response.ItemTypeSerializer;
import com.app.tgtg.model.remote.payment.Price;
import com.app.tgtg.model.remote.payment.Price$$serializer;
import com.app.tgtg.model.remote.voucher.response.VoucherFilterResponse;
import com.app.tgtg.model.remote.voucher.response.VoucherFilterResponse$$serializer;
import com.app.tgtg.model.remote.voucher.response.VoucherType;
import com.app.tgtg.model.remote.voucher.response.VoucherTypeSerializer;
import e0.f;
import i90.g;
import i90.h;
import j4.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.l0;
import m90.m1;
import m90.r1;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import u70.j;
import u70.l;
import u70.m;
import w2.l1;
import xh.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b#\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b6\b\u0087\b\u0018\u0000 \u008a\u00012\u00020\u0001:\u0004\u008b\u0001\u008a\u0001B¹\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001f\u0010 BÓ\u0001\b\u0010\u0012\u0006\u0010!\u001a\u00020\u0015\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b\u001f\u0010$J\r\u0010%\u001a\u00020\u0015¢\u0006\u0004\b%\u0010&J\u001d\u0010+\u001a\u00020*2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u0015¢\u0006\u0004\b+\u0010,J\u0010\u0010/\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u00100\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b0\u0010.J\u0012\u00101\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b1\u0010.J\u0010\u00102\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b2\u0010.J\u0010\u00103\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b3\u0010.J\u0012\u00104\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b4\u0010.J\u0010\u00105\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b5\u00106J\u0012\u00107\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b7\u00108J\u0012\u00109\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b9\u0010.J\u0010\u0010:\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b:\u0010;J\u0010\u0010<\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b<\u0010=J\u0012\u0010>\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b>\u0010?J\u0010\u0010@\u001a\u00020\u0015HÆ\u0003¢\u0006\u0004\b@\u0010&J\u0012\u0010A\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\bA\u0010BJ\u0012\u0010C\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\bC\u00108J\u0012\u0010D\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\bD\u0010EJ\u0018\u0010F\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\bF\u0010GJ\u0012\u0010H\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bH\u0010.JÞ\u0001\u0010K\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\bI\u0010JJ\u0010\u0010L\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\bL\u0010.J\u0010\u0010M\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\bM\u0010&J\u001a\u0010Q\u001a\u00020P2\b\u0010O\u001a\u0004\u0018\u00010NHÖ\u0003¢\u0006\u0004\bQ\u0010RJ'\u0010Z\u001a\u00020*2\u0006\u0010S\u001a\u00020\u00002\u0006\u0010U\u001a\u00020T2\u0006\u0010W\u001a\u00020VH\u0001¢\u0006\u0004\bX\u0010YR \u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010[\u0012\u0004\b]\u0010^\u001a\u0004\b\\\u0010.R \u0010\u0005\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010[\u0012\u0004\b`\u0010^\u001a\u0004\b_\u0010.R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010[\u0012\u0004\bb\u0010^\u001a\u0004\ba\u0010.R \u0010\u0007\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010[\u0012\u0004\bd\u0010^\u001a\u0004\bc\u0010.R \u0010\b\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\b\u0010[\u0012\u0004\bf\u0010^\u001a\u0004\be\u0010.R\"\u0010\t\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\t\u0010[\u0012\u0004\bh\u0010^\u001a\u0004\bg\u0010.R \u0010\u000b\u001a\u00020\n8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010i\u0012\u0004\bk\u0010^\u001a\u0004\bj\u00106R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\r\u0010l\u0012\u0004\bn\u0010^\u001a\u0004\bm\u00108R\"\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010[\u0012\u0004\bp\u0010^\u001a\u0004\bo\u0010.R \u0010\u0010\u001a\u00020\u000f8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010q\u0012\u0004\bs\u0010^\u001a\u0004\br\u0010;R \u0010\u0012\u001a\u00020\u00118\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010t\u0012\u0004\bv\u0010^\u001a\u0004\bu\u0010=R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010w\u0012\u0004\by\u0010^\u001a\u0004\bx\u0010?R \u0010\u0016\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010z\u0012\u0004\b|\u0010^\u001a\u0004\b{\u0010&R\"\u0010\u0017\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010}\u0012\u0004\b\u007f\u0010^\u001a\u0004\b~\u0010BR$\u0010\u0018\u001a\u0004\u0018\u00010\f8\u0016X\u0097\u0004¢\u0006\u0014\n\u0004\b\u0018\u0010l\u0012\u0005\b\u0081\u0001\u0010^\u001a\u0005\b\u0080\u0001\u00108R%\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0016X\u0097\u0004¢\u0006\u0015\n\u0005\b\u001a\u0010\u0082\u0001\u0012\u0005\b\u0084\u0001\u0010^\u001a\u0005\b\u0083\u0001\u0010ER+\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b8\u0016X\u0097\u0004¢\u0006\u0015\n\u0005\b\u001d\u0010\u0085\u0001\u0012\u0005\b\u0087\u0001\u0010^\u001a\u0005\b\u0086\u0001\u0010GR$\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\u0014\n\u0004\b\u001e\u0010[\u0012\u0005\b\u0089\u0001\u0010^\u001a\u0005\b\u0088\u0001\u0010.¨\u0006\u008c\u0001"}, d2 = {"Lcom/app/tgtg/model/remote/voucher/CountryBasedVoucher;", "Lcom/app/tgtg/model/remote/voucher/BasicVoucher;", "Lcom/app/tgtg/model/remote/VoucherId;", "id", "", "name", "shortDescription", "validFromUtc", "validToUtc", "countryId", "Lcom/app/tgtg/model/remote/voucher/VoucherState;", "state", "Lcom/app/tgtg/model/remote/voucher/VoucherFilterType;", "storeVoucherFilterType", "termsLink", "Lcom/app/tgtg/model/remote/voucher/VoucherVersion;", "version", "Lcom/app/tgtg/model/remote/voucher/response/VoucherType;", "voucherType", "Lcom/app/tgtg/model/remote/payment/Price;", "maxItemPrice", "", "itemsLeft", "numberOfItems", "filterType", "Lcom/app/tgtg/model/remote/voucher/response/VoucherFilterResponse;", "filterList", "", "Lcom/app/tgtg/model/remote/item/response/ItemType;", "applicableItemTypes", "eligiblePlatforms", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/voucher/VoucherState;Lcom/app/tgtg/model/remote/voucher/VoucherFilterType;Ljava/lang/String;Lcom/app/tgtg/model/remote/voucher/VoucherVersion;Lcom/app/tgtg/model/remote/voucher/response/VoucherType;Lcom/app/tgtg/model/remote/payment/Price;ILjava/lang/Integer;Lcom/app/tgtg/model/remote/voucher/VoucherFilterType;Lcom/app/tgtg/model/remote/voucher/response/VoucherFilterResponse;Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/voucher/VoucherState;Lcom/app/tgtg/model/remote/voucher/VoucherFilterType;Ljava/lang/String;Lcom/app/tgtg/model/remote/voucher/VoucherVersion;Lcom/app/tgtg/model/remote/voucher/response/VoucherType;Lcom/app/tgtg/model/remote/payment/Price;ILjava/lang/Integer;Lcom/app/tgtg/model/remote/voucher/VoucherFilterType;Lcom/app/tgtg/model/remote/voucher/response/VoucherFilterResponse;Ljava/util/List;Ljava/lang/String;Lm90/m1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1-VUJ7vw4", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "()Lcom/app/tgtg/model/remote/voucher/VoucherState;", "component8", "()Lcom/app/tgtg/model/remote/voucher/VoucherFilterType;", "component9", "component10", "()Lcom/app/tgtg/model/remote/voucher/VoucherVersion;", "component11", "()Lcom/app/tgtg/model/remote/voucher/response/VoucherType;", "component12", "()Lcom/app/tgtg/model/remote/payment/Price;", "component13", "component14", "()Ljava/lang/Integer;", "component15", "component16", "()Lcom/app/tgtg/model/remote/voucher/response/VoucherFilterResponse;", "component17", "()Ljava/util/List;", "component18", "copy-61OguRE", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/voucher/VoucherState;Lcom/app/tgtg/model/remote/voucher/VoucherFilterType;Ljava/lang/String;Lcom/app/tgtg/model/remote/voucher/VoucherVersion;Lcom/app/tgtg/model/remote/voucher/response/VoucherType;Lcom/app/tgtg/model/remote/payment/Price;ILjava/lang/Integer;Lcom/app/tgtg/model/remote/voucher/VoucherFilterType;Lcom/app/tgtg/model/remote/voucher/response/VoucherFilterResponse;Ljava/util/List;Ljava/lang/String;)Lcom/app/tgtg/model/remote/voucher/CountryBasedVoucher;", "copy", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "write$Self$app", "(Lcom/app/tgtg/model/remote/voucher/CountryBasedVoucher;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getId-VUJ7vw4", "getId-VUJ7vw4$annotations", "()V", "getName", "getName$annotations", "getShortDescription", "getShortDescription$annotations", "getValidFromUtc", "getValidFromUtc$annotations", "getValidToUtc", "getValidToUtc$annotations", "getCountryId", "getCountryId$annotations", "Lcom/app/tgtg/model/remote/voucher/VoucherState;", "getState", "getState$annotations", "Lcom/app/tgtg/model/remote/voucher/VoucherFilterType;", "getStoreVoucherFilterType", "getStoreVoucherFilterType$annotations", "getTermsLink", "getTermsLink$annotations", "Lcom/app/tgtg/model/remote/voucher/VoucherVersion;", "getVersion", "getVersion$annotations", "Lcom/app/tgtg/model/remote/voucher/response/VoucherType;", "getVoucherType", "getVoucherType$annotations", "Lcom/app/tgtg/model/remote/payment/Price;", "getMaxItemPrice", "getMaxItemPrice$annotations", "I", "getItemsLeft", "getItemsLeft$annotations", "Ljava/lang/Integer;", "getNumberOfItems", "getNumberOfItems$annotations", "getFilterType", "getFilterType$annotations", "Lcom/app/tgtg/model/remote/voucher/response/VoucherFilterResponse;", "getFilterList", "getFilterList$annotations", "Ljava/util/List;", "getApplicableItemTypes", "getApplicableItemTypes$annotations", "getEligiblePlatforms", "getEligiblePlatforms$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class CountryBasedVoucher extends BasicVoucher {

    @Nullable
    private final List<ItemType> applicableItemTypes;

    @Nullable
    private final String countryId;

    @Nullable
    private final String eligiblePlatforms;

    @Nullable
    private final VoucherFilterResponse filterList;

    @Nullable
    private final VoucherFilterType filterType;

    @NotNull
    private final String id;
    private final int itemsLeft;

    @Nullable
    private final Price maxItemPrice;

    @NotNull
    private final String name;

    @Nullable
    private final Integer numberOfItems;

    @Nullable
    private final String shortDescription;

    @NotNull
    private final VoucherState state;

    @Nullable
    private final VoucherFilterType storeVoucherFilterType;

    @Nullable
    private final String termsLink;

    @NotNull
    private final String validFromUtc;

    @NotNull
    private final String validToUtc;

    @NotNull
    private final VoucherVersion version;

    @NotNull
    private final VoucherType voucherType;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<CountryBasedVoucher> CREATOR = new Creator();

    @NotNull
    private static final j[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, l.a(m.PUBLICATION, new d(16)), null};

    /* JADX WARN: Illegal instructions before constructor call */
    private /* synthetic */ CountryBasedVoucher(int i11, String str, String str2, String str3, String str4, String str5, String str6, VoucherState voucherState, VoucherFilterType voucherFilterType, String str7, VoucherVersion voucherVersion, VoucherType voucherType, Price price, int i12, Integer num, VoucherFilterType voucherFilterType2, VoucherFilterResponse voucherFilterResponse, List list, String str8, m1 m1Var) {
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (16383 != (i11 & 16383)) {
            c1.j(i11, 16383, CountryBasedVoucher$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        super(defaultConstructorMarker);
        this.id = str;
        this.name = str2;
        this.shortDescription = str3;
        this.validFromUtc = str4;
        this.validToUtc = str5;
        this.countryId = str6;
        this.state = voucherState;
        this.storeVoucherFilterType = voucherFilterType;
        this.termsLink = str7;
        this.version = voucherVersion;
        this.voucherType = voucherType;
        this.maxItemPrice = price;
        this.itemsLeft = i12;
        this.numberOfItems = num;
        if ((i11 & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) == 0) {
            this.filterType = null;
        } else {
            this.filterType = voucherFilterType2;
        }
        if ((32768 & i11) == 0) {
            this.filterList = null;
        } else {
            this.filterList = voucherFilterResponse;
        }
        if ((65536 & i11) == 0) {
            this.applicableItemTypes = null;
        } else {
            this.applicableItemTypes = list;
        }
        if ((i11 & 131072) == 0) {
            this.eligiblePlatforms = null;
        } else {
            this.eligiblePlatforms = str8;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new m90.d(ItemTypeSerializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-61OguRE$default, reason: not valid java name */
    public static /* synthetic */ CountryBasedVoucher m530copy61OguRE$default(CountryBasedVoucher countryBasedVoucher, String str, String str2, String str3, String str4, String str5, String str6, VoucherState voucherState, VoucherFilterType voucherFilterType, String str7, VoucherVersion voucherVersion, VoucherType voucherType, Price price, int i11, Integer num, VoucherFilterType voucherFilterType2, VoucherFilterResponse voucherFilterResponse, List list, String str8, int i12, Object obj) {
        String str9;
        List list2;
        String str10 = (i12 & 1) != 0 ? countryBasedVoucher.id : str;
        String str11 = (i12 & 2) != 0 ? countryBasedVoucher.name : str2;
        String str12 = (i12 & 4) != 0 ? countryBasedVoucher.shortDescription : str3;
        String str13 = (i12 & 8) != 0 ? countryBasedVoucher.validFromUtc : str4;
        String str14 = (i12 & 16) != 0 ? countryBasedVoucher.validToUtc : str5;
        String str15 = (i12 & 32) != 0 ? countryBasedVoucher.countryId : str6;
        VoucherState voucherState2 = (i12 & 64) != 0 ? countryBasedVoucher.state : voucherState;
        VoucherFilterType voucherFilterType3 = (i12 & 128) != 0 ? countryBasedVoucher.storeVoucherFilterType : voucherFilterType;
        String str16 = (i12 & 256) != 0 ? countryBasedVoucher.termsLink : str7;
        VoucherVersion voucherVersion2 = (i12 & 512) != 0 ? countryBasedVoucher.version : voucherVersion;
        VoucherType voucherType2 = (i12 & 1024) != 0 ? countryBasedVoucher.voucherType : voucherType;
        Price price2 = (i12 & NewHope.SENDB_BYTES) != 0 ? countryBasedVoucher.maxItemPrice : price;
        int i13 = (i12 & 4096) != 0 ? countryBasedVoucher.itemsLeft : i11;
        Integer num2 = (i12 & 8192) != 0 ? countryBasedVoucher.numberOfItems : num;
        String str17 = str10;
        VoucherFilterType voucherFilterType4 = (i12 & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) != 0 ? countryBasedVoucher.filterType : voucherFilterType2;
        VoucherFilterResponse voucherFilterResponse2 = (i12 & 32768) != 0 ? countryBasedVoucher.filterList : voucherFilterResponse;
        List list3 = (i12 & 65536) != 0 ? countryBasedVoucher.applicableItemTypes : list;
        if ((i12 & 131072) != 0) {
            list2 = list3;
            str9 = countryBasedVoucher.eligiblePlatforms;
        } else {
            str9 = str8;
            list2 = list3;
        }
        return countryBasedVoucher.m533copy61OguRE(str17, str11, str12, str13, str14, str15, voucherState2, voucherFilterType3, str16, voucherVersion2, voucherType2, price2, i13, num2, voucherFilterType4, voucherFilterResponse2, list2, str9);
    }

    public static final /* synthetic */ void write$Self$app(CountryBasedVoucher self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        output.i(serialDesc, 0, VoucherId$$serializer.INSTANCE, VoucherId.m298boximpl(self.mo529getIdVUJ7vw4()));
        output.q(serialDesc, 1, self.getName());
        r1 r1Var = r1.f29848a;
        output.r(serialDesc, 2, r1Var, self.getShortDescription());
        output.q(serialDesc, 3, self.getValidFromUtc());
        output.q(serialDesc, 4, self.getValidToUtc());
        output.r(serialDesc, 5, r1Var, self.getCountryId());
        output.i(serialDesc, 6, VoucherStateSerializer.INSTANCE, self.getState());
        VoucherFilterTypeSerializer voucherFilterTypeSerializer = VoucherFilterTypeSerializer.INSTANCE;
        output.r(serialDesc, 7, voucherFilterTypeSerializer, self.getStoreVoucherFilterType());
        output.r(serialDesc, 8, r1Var, self.getTermsLink());
        output.i(serialDesc, 9, VoucherVersionSerializer.INSTANCE, self.getVersion());
        output.i(serialDesc, 10, VoucherTypeSerializer.INSTANCE, self.getVoucherType());
        output.r(serialDesc, 11, Price$$serializer.INSTANCE, self.maxItemPrice);
        output.m(12, self.itemsLeft, serialDesc);
        output.r(serialDesc, 13, l0.f29821a, self.numberOfItems);
        if (output.C(serialDesc) || self.getFilterType() != null) {
            output.r(serialDesc, 14, voucherFilterTypeSerializer, self.getFilterType());
        }
        if (output.C(serialDesc) || self.getFilterList() != null) {
            output.r(serialDesc, 15, VoucherFilterResponse$$serializer.INSTANCE, self.getFilterList());
        }
        if (output.C(serialDesc) || self.getApplicableItemTypes() != null) {
            output.r(serialDesc, 16, (KSerializer) jVarArr[16].getValue(), self.getApplicableItemTypes());
        }
        if (!output.C(serialDesc) && self.getEligiblePlatforms() == null) {
            return;
        }
        output.r(serialDesc, 17, r1Var, self.getEligiblePlatforms());
    }

    @NotNull
    /* JADX INFO: renamed from: component1-VUJ7vw4, reason: not valid java name and from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final VoucherVersion getVersion() {
        return this.version;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final VoucherType getVoucherType() {
        return this.voucherType;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Price getMaxItemPrice() {
        return this.maxItemPrice;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getItemsLeft() {
        return this.itemsLeft;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Integer getNumberOfItems() {
        return this.numberOfItems;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final VoucherFilterType getFilterType() {
        return this.filterType;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final VoucherFilterResponse getFilterList() {
        return this.filterList;
    }

    @Nullable
    public final List<ItemType> component17() {
        return this.applicableItemTypes;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getEligiblePlatforms() {
        return this.eligiblePlatforms;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getShortDescription() {
        return this.shortDescription;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getValidFromUtc() {
        return this.validFromUtc;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getValidToUtc() {
        return this.validToUtc;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCountryId() {
        return this.countryId;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final VoucherState getState() {
        return this.state;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final VoucherFilterType getStoreVoucherFilterType() {
        return this.storeVoucherFilterType;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getTermsLink() {
        return this.termsLink;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-61OguRE, reason: not valid java name */
    public final CountryBasedVoucher m533copy61OguRE(@NotNull String id2, @NotNull String name, @Nullable String shortDescription, @NotNull String validFromUtc, @NotNull String validToUtc, @Nullable String countryId, @NotNull VoucherState state, @Nullable VoucherFilterType storeVoucherFilterType, @Nullable String termsLink, @NotNull VoucherVersion version, @NotNull VoucherType voucherType, @Nullable Price maxItemPrice, int itemsLeft, @Nullable Integer numberOfItems, @Nullable VoucherFilterType filterType, @Nullable VoucherFilterResponse filterList, @Nullable List<? extends ItemType> applicableItemTypes, @Nullable String eligiblePlatforms) {
        id2.getClass();
        name.getClass();
        validFromUtc.getClass();
        validToUtc.getClass();
        state.getClass();
        version.getClass();
        voucherType.getClass();
        return new CountryBasedVoucher(id2, name, shortDescription, validFromUtc, validToUtc, countryId, state, storeVoucherFilterType, termsLink, version, voucherType, maxItemPrice, itemsLeft, numberOfItems, filterType, filterList, applicableItemTypes, eligiblePlatforms, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CountryBasedVoucher)) {
            return false;
        }
        CountryBasedVoucher countryBasedVoucher = (CountryBasedVoucher) other;
        return VoucherId.m302equalsimpl0(this.id, countryBasedVoucher.id) && Intrinsics.areEqual(this.name, countryBasedVoucher.name) && Intrinsics.areEqual(this.shortDescription, countryBasedVoucher.shortDescription) && Intrinsics.areEqual(this.validFromUtc, countryBasedVoucher.validFromUtc) && Intrinsics.areEqual(this.validToUtc, countryBasedVoucher.validToUtc) && Intrinsics.areEqual(this.countryId, countryBasedVoucher.countryId) && this.state == countryBasedVoucher.state && this.storeVoucherFilterType == countryBasedVoucher.storeVoucherFilterType && Intrinsics.areEqual(this.termsLink, countryBasedVoucher.termsLink) && this.version == countryBasedVoucher.version && this.voucherType == countryBasedVoucher.voucherType && Intrinsics.areEqual(this.maxItemPrice, countryBasedVoucher.maxItemPrice) && this.itemsLeft == countryBasedVoucher.itemsLeft && Intrinsics.areEqual(this.numberOfItems, countryBasedVoucher.numberOfItems) && this.filterType == countryBasedVoucher.filterType && Intrinsics.areEqual(this.filterList, countryBasedVoucher.filterList) && Intrinsics.areEqual(this.applicableItemTypes, countryBasedVoucher.applicableItemTypes) && Intrinsics.areEqual(this.eligiblePlatforms, countryBasedVoucher.eligiblePlatforms);
    }

    @Override // com.app.tgtg.model.remote.voucher.BasicVoucher
    @Nullable
    public List<ItemType> getApplicableItemTypes() {
        return this.applicableItemTypes;
    }

    @Override // com.app.tgtg.model.remote.voucher.BasicVoucher
    @Nullable
    public String getCountryId() {
        return this.countryId;
    }

    @Override // com.app.tgtg.model.remote.voucher.BasicVoucher
    @Nullable
    public String getEligiblePlatforms() {
        return this.eligiblePlatforms;
    }

    @Override // com.app.tgtg.model.remote.voucher.BasicVoucher
    @Nullable
    public VoucherFilterResponse getFilterList() {
        return this.filterList;
    }

    @Override // com.app.tgtg.model.remote.voucher.BasicVoucher
    @Nullable
    public VoucherFilterType getFilterType() {
        return this.filterType;
    }

    @Override // com.app.tgtg.model.remote.voucher.BasicVoucher
    @NotNull
    /* JADX INFO: renamed from: getId-VUJ7vw4 */
    public String mo529getIdVUJ7vw4() {
        return this.id;
    }

    public final int getItemsLeft() {
        return this.itemsLeft;
    }

    @Nullable
    public final Price getMaxItemPrice() {
        return this.maxItemPrice;
    }

    @Override // com.app.tgtg.model.remote.voucher.BasicVoucher
    @NotNull
    public String getName() {
        return this.name;
    }

    @Nullable
    public final Integer getNumberOfItems() {
        return this.numberOfItems;
    }

    @Override // com.app.tgtg.model.remote.voucher.BasicVoucher
    @Nullable
    public String getShortDescription() {
        return this.shortDescription;
    }

    @Override // com.app.tgtg.model.remote.voucher.BasicVoucher
    @NotNull
    public VoucherState getState() {
        return this.state;
    }

    @Override // com.app.tgtg.model.remote.voucher.BasicVoucher
    @Nullable
    public VoucherFilterType getStoreVoucherFilterType() {
        return this.storeVoucherFilterType;
    }

    @Override // com.app.tgtg.model.remote.voucher.BasicVoucher
    @Nullable
    public String getTermsLink() {
        return this.termsLink;
    }

    @Override // com.app.tgtg.model.remote.voucher.BasicVoucher
    @NotNull
    public String getValidFromUtc() {
        return this.validFromUtc;
    }

    @Override // com.app.tgtg.model.remote.voucher.BasicVoucher
    @NotNull
    public String getValidToUtc() {
        return this.validToUtc;
    }

    @Override // com.app.tgtg.model.remote.voucher.BasicVoucher
    @NotNull
    public VoucherVersion getVersion() {
        return this.version;
    }

    @Override // com.app.tgtg.model.remote.voucher.BasicVoucher
    @NotNull
    public VoucherType getVoucherType() {
        return this.voucherType;
    }

    public int hashCode() {
        int iB = l1.b(VoucherId.m303hashCodeimpl(this.id) * 31, 31, this.name);
        String str = this.shortDescription;
        int iB2 = l1.b(l1.b((iB + (str == null ? 0 : str.hashCode())) * 31, 31, this.validFromUtc), 31, this.validToUtc);
        String str2 = this.countryId;
        int iHashCode = (this.state.hashCode() + ((iB2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        VoucherFilterType voucherFilterType = this.storeVoucherFilterType;
        int iHashCode2 = (iHashCode + (voucherFilterType == null ? 0 : voucherFilterType.hashCode())) * 31;
        String str3 = this.termsLink;
        int iHashCode3 = (this.voucherType.hashCode() + ((this.version.hashCode() + ((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31)) * 31;
        Price price = this.maxItemPrice;
        int iB3 = k.b(this.itemsLeft, (iHashCode3 + (price == null ? 0 : price.hashCode())) * 31, 31);
        Integer num = this.numberOfItems;
        int iHashCode4 = (iB3 + (num == null ? 0 : num.hashCode())) * 31;
        VoucherFilterType voucherFilterType2 = this.filterType;
        int iHashCode5 = (iHashCode4 + (voucherFilterType2 == null ? 0 : voucherFilterType2.hashCode())) * 31;
        VoucherFilterResponse voucherFilterResponse = this.filterList;
        int iHashCode6 = (iHashCode5 + (voucherFilterResponse == null ? 0 : voucherFilterResponse.hashCode())) * 31;
        List<ItemType> list = this.applicableItemTypes;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.eligiblePlatforms;
        return iHashCode7 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String strM304toStringimpl = VoucherId.m304toStringimpl(this.id);
        String str = this.name;
        String str2 = this.shortDescription;
        String str3 = this.validFromUtc;
        String str4 = this.validToUtc;
        String str5 = this.countryId;
        VoucherState voucherState = this.state;
        VoucherFilterType voucherFilterType = this.storeVoucherFilterType;
        String str6 = this.termsLink;
        VoucherVersion voucherVersion = this.version;
        VoucherType voucherType = this.voucherType;
        Price price = this.maxItemPrice;
        int i11 = this.itemsLeft;
        Integer num = this.numberOfItems;
        VoucherFilterType voucherFilterType2 = this.filterType;
        VoucherFilterResponse voucherFilterResponse = this.filterList;
        List<ItemType> list = this.applicableItemTypes;
        String str7 = this.eligiblePlatforms;
        StringBuilder sbT = f.t("CountryBasedVoucher(id=", strM304toStringimpl, ", name=", str, ", shortDescription=");
        s.A(sbT, str2, ", validFromUtc=", str3, ", validToUtc=");
        s.A(sbT, str4, ", countryId=", str5, ", state=");
        sbT.append(voucherState);
        sbT.append(", storeVoucherFilterType=");
        sbT.append(voucherFilterType);
        sbT.append(", termsLink=");
        sbT.append(str6);
        sbT.append(", version=");
        sbT.append(voucherVersion);
        sbT.append(", voucherType=");
        sbT.append(voucherType);
        sbT.append(", maxItemPrice=");
        sbT.append(price);
        sbT.append(", itemsLeft=");
        sbT.append(i11);
        sbT.append(", numberOfItems=");
        sbT.append(num);
        sbT.append(", filterType=");
        sbT.append(voucherFilterType2);
        sbT.append(", filterList=");
        sbT.append(voucherFilterResponse);
        sbT.append(", applicableItemTypes=");
        sbT.append(list);
        sbT.append(", eligiblePlatforms=");
        sbT.append(str7);
        sbT.append(")");
        return sbT.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        VoucherId.m305writeToParcelimpl(this.id, dest, flags);
        dest.writeString(this.name);
        dest.writeString(this.shortDescription);
        dest.writeString(this.validFromUtc);
        dest.writeString(this.validToUtc);
        dest.writeString(this.countryId);
        dest.writeString(this.state.name());
        VoucherFilterType voucherFilterType = this.storeVoucherFilterType;
        if (voucherFilterType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(voucherFilterType.name());
        }
        dest.writeString(this.termsLink);
        dest.writeString(this.version.name());
        dest.writeString(this.voucherType.name());
        Price price = this.maxItemPrice;
        if (price == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            price.writeToParcel(dest, flags);
        }
        dest.writeInt(this.itemsLeft);
        Integer num = this.numberOfItems;
        if (num == null) {
            dest.writeInt(0);
        } else {
            i.w(dest, 1, num);
        }
        VoucherFilterType voucherFilterType2 = this.filterType;
        if (voucherFilterType2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(voucherFilterType2.name());
        }
        VoucherFilterResponse voucherFilterResponse = this.filterList;
        if (voucherFilterResponse == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            voucherFilterResponse.writeToParcel(dest, flags);
        }
        List<ItemType> list = this.applicableItemTypes;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = i.q(dest, 1, list);
            while (itQ.hasNext()) {
                dest.writeString(((ItemType) itQ.next()).name());
            }
        }
        dest.writeString(this.eligiblePlatforms);
    }

    public /* synthetic */ CountryBasedVoucher(String str, String str2, String str3, String str4, String str5, String str6, VoucherState voucherState, VoucherFilterType voucherFilterType, String str7, VoucherVersion voucherVersion, VoucherType voucherType, Price price, int i11, Integer num, VoucherFilterType voucherFilterType2, VoucherFilterResponse voucherFilterResponse, List list, String str8, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, voucherState, voucherFilterType, str7, voucherVersion, voucherType, price, i11, num, voucherFilterType2, voucherFilterResponse, list, str8);
    }

    public /* synthetic */ CountryBasedVoucher(int i11, String str, String str2, String str3, String str4, String str5, String str6, VoucherState voucherState, VoucherFilterType voucherFilterType, String str7, VoucherVersion voucherVersion, VoucherType voucherType, Price price, int i12, Integer num, VoucherFilterType voucherFilterType2, VoucherFilterResponse voucherFilterResponse, List list, String str8, m1 m1Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, str, str2, str3, str4, str5, str6, voucherState, voucherFilterType, str7, voucherVersion, voucherType, price, i12, num, voucherFilterType2, voucherFilterResponse, list, str8, m1Var);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/voucher/CountryBasedVoucher$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/voucher/CountryBasedVoucher;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return CountryBasedVoucher$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    private CountryBasedVoucher(String str, String str2, String str3, String str4, String str5, String str6, VoucherState voucherState, VoucherFilterType voucherFilterType, String str7, VoucherVersion voucherVersion, VoucherType voucherType, Price price, int i11, Integer num, VoucherFilterType voucherFilterType2, VoucherFilterResponse voucherFilterResponse, List<? extends ItemType> list, String str8) {
        super(null);
        str.getClass();
        str2.getClass();
        str4.getClass();
        str5.getClass();
        voucherState.getClass();
        voucherVersion.getClass();
        voucherType.getClass();
        this.id = str;
        this.name = str2;
        this.shortDescription = str3;
        this.validFromUtc = str4;
        this.validToUtc = str5;
        this.countryId = str6;
        this.state = voucherState;
        this.storeVoucherFilterType = voucherFilterType;
        this.termsLink = str7;
        this.version = voucherVersion;
        this.voucherType = voucherType;
        this.maxItemPrice = price;
        this.itemsLeft = i11;
        this.numberOfItems = num;
        this.filterType = voucherFilterType2;
        this.filterList = voucherFilterResponse;
        this.applicableItemTypes = list;
        this.eligiblePlatforms = str8;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CountryBasedVoucher> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CountryBasedVoucher createFromParcel(Parcel parcel) {
            parcel.getClass();
            String strM306unboximpl = VoucherId.CREATOR.createFromParcel(parcel).m306unboximpl();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            VoucherState voucherStateValueOf = VoucherState.valueOf(parcel.readString());
            ArrayList arrayList = null;
            VoucherFilterType voucherFilterTypeValueOf = parcel.readInt() == 0 ? null : VoucherFilterType.valueOf(parcel.readString());
            String string6 = parcel.readString();
            VoucherVersion voucherVersionValueOf = VoucherVersion.valueOf(parcel.readString());
            VoucherType voucherTypeValueOf = VoucherType.valueOf(parcel.readString());
            Price priceCreateFromParcel = parcel.readInt() == 0 ? null : Price.CREATOR.createFromParcel(parcel);
            int i11 = parcel.readInt();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            VoucherFilterType voucherFilterTypeValueOf2 = parcel.readInt() == 0 ? null : VoucherFilterType.valueOf(parcel.readString());
            VoucherFilterResponse voucherFilterResponseCreateFromParcel = parcel.readInt() == 0 ? null : VoucherFilterResponse.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    arrayList.add(ItemType.valueOf(parcel.readString()));
                }
            }
            return new CountryBasedVoucher(strM306unboximpl, string, string2, string3, string4, string5, voucherStateValueOf, voucherFilterTypeValueOf, string6, voucherVersionValueOf, voucherTypeValueOf, priceCreateFromParcel, i11, numValueOf, voucherFilterTypeValueOf2, voucherFilterResponseCreateFromParcel, arrayList, parcel.readString(), null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CountryBasedVoucher[] newArray(int i11) {
            return new CountryBasedVoucher[i11];
        }
    }

    @g("applicable_item_types")
    public static /* synthetic */ void getApplicableItemTypes$annotations() {
    }

    @g("country_id")
    public static /* synthetic */ void getCountryId$annotations() {
    }

    @g("eligible_platforms")
    public static /* synthetic */ void getEligiblePlatforms$annotations() {
    }

    @g("filter_list")
    public static /* synthetic */ void getFilterList$annotations() {
    }

    @g("filter_type")
    public static /* synthetic */ void getFilterType$annotations() {
    }

    @g("id")
    /* JADX INFO: renamed from: getId-VUJ7vw4$annotations, reason: not valid java name */
    public static /* synthetic */ void m531getIdVUJ7vw4$annotations() {
    }

    @g("items_left")
    public static /* synthetic */ void getItemsLeft$annotations() {
    }

    @g("max_item_price")
    public static /* synthetic */ void getMaxItemPrice$annotations() {
    }

    @g("name")
    public static /* synthetic */ void getName$annotations() {
    }

    @g("number_of_items")
    public static /* synthetic */ void getNumberOfItems$annotations() {
    }

    @g("short_description")
    public static /* synthetic */ void getShortDescription$annotations() {
    }

    @g("state")
    public static /* synthetic */ void getState$annotations() {
    }

    @g("store_filter_type")
    public static /* synthetic */ void getStoreVoucherFilterType$annotations() {
    }

    @g("terms_link")
    public static /* synthetic */ void getTermsLink$annotations() {
    }

    @g("valid_from")
    public static /* synthetic */ void getValidFromUtc$annotations() {
    }

    @g("valid_to")
    public static /* synthetic */ void getValidToUtc$annotations() {
    }

    @g("version")
    public static /* synthetic */ void getVersion$annotations() {
    }

    @g("type")
    public static /* synthetic */ void getVoucherType$annotations() {
    }

    public /* synthetic */ CountryBasedVoucher(String str, String str2, String str3, String str4, String str5, String str6, VoucherState voucherState, VoucherFilterType voucherFilterType, String str7, VoucherVersion voucherVersion, VoucherType voucherType, Price price, int i11, Integer num, VoucherFilterType voucherFilterType2, VoucherFilterResponse voucherFilterResponse, List list, String str8, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, voucherState, voucherFilterType, str7, voucherVersion, voucherType, price, i11, num, (i12 & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) != 0 ? null : voucherFilterType2, (32768 & i12) != 0 ? null : voucherFilterResponse, (65536 & i12) != 0 ? null : list, (i12 & 131072) != 0 ? null : str8, null);
    }
}
