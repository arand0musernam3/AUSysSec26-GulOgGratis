package com.app.tgtg.model.remote.voucher;

import android.os.Parcel;
import android.os.Parcelable;
import b3.i;
import com.app.tgtg.model.remote.VoucherId;
import com.app.tgtg.model.remote.VoucherId$$serializer;
import com.app.tgtg.model.remote.item.response.ItemType;
import com.app.tgtg.model.remote.item.response.ItemTypeSerializer;
import com.app.tgtg.model.remote.order.Order;
import com.app.tgtg.model.remote.order.Order$$serializer;
import com.app.tgtg.model.remote.payment.Price;
import com.app.tgtg.model.remote.payment.Price$$serializer;
import com.app.tgtg.model.remote.voucher.response.VoucherFilterResponse;
import com.app.tgtg.model.remote.voucher.response.VoucherFilterResponse$$serializer;
import com.app.tgtg.model.remote.voucher.response.VoucherType;
import e0.f;
import i90.g;
import i90.h;
import j4.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.n0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.m1;
import m90.r1;
import m90.v;
import o30.f0;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
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
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b7\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u0000 \u009e\u00012\u00020\u0001:\u0004\u009f\u0001\u009e\u0001BÝ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u0019\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\"\u0010#B÷\u0001\b\u0010\u0012\u0006\u0010$\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0007\u0012\u0010\u0010\u001b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0018\u00010\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u0019\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b\"\u0010'J\r\u0010(\u001a\u00020\u0004¢\u0006\u0004\b(\u0010)J\u001d\u0010.\u001a\u00020-2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\u0004¢\u0006\u0004\b.\u0010/J\u0010\u00102\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00103\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b3\u0010)J\u0010\u00104\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b4\u0010)J\u0010\u00105\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b5\u00101J\u0010\u00106\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b6\u00101J\u0010\u00107\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b7\u00101J\u0010\u00108\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b:\u00101J\u0010\u0010;\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b;\u00101J\u0012\u0010<\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b<\u0010=J\u0012\u0010>\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b>\u0010?J\u0012\u0010@\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b@\u0010?J\u0012\u0010A\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\bA\u0010?J\u0012\u0010B\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bB\u00101J\u0012\u0010C\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\bC\u0010DJ\u0012\u0010E\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bE\u00101J\u0018\u0010F\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0019HÆ\u0003¢\u0006\u0004\bF\u0010GJ\u0012\u0010H\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\bH\u0010DJ\u0012\u0010I\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0004\bI\u0010JJ\u0018\u0010K\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\bK\u0010GJ\u0012\u0010L\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bL\u00101J\u0086\u0002\u0010O\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u00192\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\bM\u0010NJ\u0010\u0010P\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\bP\u00101J\u0010\u0010Q\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\bQ\u0010)J\u001a\u0010U\u001a\u00020T2\b\u0010S\u001a\u0004\u0018\u00010RHÖ\u0003¢\u0006\u0004\bU\u0010VJ'\u0010^\u001a\u00020-2\u0006\u0010W\u001a\u00020\u00002\u0006\u0010Y\u001a\u00020X2\u0006\u0010[\u001a\u00020ZH\u0001¢\u0006\u0004\b\\\u0010]R \u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010_\u0012\u0004\ba\u0010b\u001a\u0004\b`\u00101R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010c\u0012\u0004\be\u0010b\u001a\u0004\bd\u0010)R \u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010c\u0012\u0004\bg\u0010b\u001a\u0004\bf\u0010)R \u0010\b\u001a\u00020\u00078\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\b\u0010_\u0012\u0004\bi\u0010b\u001a\u0004\bh\u00101R \u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010_\u0012\u0004\bk\u0010b\u001a\u0004\bj\u00101R \u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010_\u0012\u0004\bm\u0010b\u001a\u0004\bl\u00101R \u0010\f\u001a\u00020\u000b8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\f\u0010n\u0012\u0004\bp\u0010b\u001a\u0004\bo\u00109R \u0010\r\u001a\u00020\u00078\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\r\u0010_\u0012\u0004\br\u0010b\u001a\u0004\bq\u00101R \u0010\u000e\u001a\u00020\u00078\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010_\u0012\u0004\bt\u0010b\u001a\u0004\bs\u00101R\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010u\u0012\u0004\bw\u0010b\u001a\u0004\bv\u0010=R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010x\u0012\u0004\bz\u0010b\u001a\u0004\by\u0010?R\"\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010x\u0012\u0004\b|\u0010b\u001a\u0004\b{\u0010?R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010x\u0012\u0004\b~\u0010b\u001a\u0004\b}\u0010?R#\u0010\u0015\u001a\u0004\u0018\u00010\u00078\u0016X\u0097\u0004¢\u0006\u0013\n\u0004\b\u0015\u0010_\u0012\u0005\b\u0080\u0001\u0010b\u001a\u0004\b\u007f\u00101R%\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0016X\u0097\u0004¢\u0006\u0015\n\u0005\b\u0017\u0010\u0081\u0001\u0012\u0005\b\u0083\u0001\u0010b\u001a\u0005\b\u0082\u0001\u0010DR$\u0010\u0018\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b\u0018\u0010_\u0012\u0005\b\u0085\u0001\u0010b\u001a\u0005\b\u0084\u0001\u00101R+\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00198\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u001b\u0010\u0086\u0001\u0012\u0005\b\u0088\u0001\u0010b\u001a\u0005\b\u0087\u0001\u0010GR%\u0010\u001c\u001a\u0004\u0018\u00010\u00168\u0016X\u0097\u0004¢\u0006\u0015\n\u0005\b\u001c\u0010\u0081\u0001\u0012\u0005\b\u008a\u0001\u0010b\u001a\u0005\b\u0089\u0001\u0010DR%\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0016X\u0097\u0004¢\u0006\u0015\n\u0005\b\u001e\u0010\u008b\u0001\u0012\u0005\b\u008d\u0001\u0010b\u001a\u0005\b\u008c\u0001\u0010JR+\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u00198\u0016X\u0097\u0004¢\u0006\u0015\n\u0005\b \u0010\u0086\u0001\u0012\u0005\b\u008f\u0001\u0010b\u001a\u0005\b\u008e\u0001\u0010GR$\u0010!\u001a\u0004\u0018\u00010\u00078\u0016X\u0097\u0004¢\u0006\u0014\n\u0004\b!\u0010_\u0012\u0005\b\u0091\u0001\u0010b\u001a\u0005\b\u0090\u0001\u00101R\u0018\u0010\u0095\u0001\u001a\u00030\u0092\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0018\u0010\u0099\u0001\u001a\u00030\u0096\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0018\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u009a\u0001\u00101R\u0016\u0010\u009d\u0001\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u009c\u0001\u00101¨\u0006 \u0001"}, d2 = {"Lcom/app/tgtg/model/remote/voucher/DiscountVoucher;", "Lcom/app/tgtg/model/remote/voucher/BasicVoucher;", "Lcom/app/tgtg/model/remote/VoucherId;", "id", "", "numberOfInitialOrders", "numberOfOrdersUsed", "", "name", "description", "termsUrl", "Lcom/app/tgtg/model/remote/voucher/VoucherState;", "state", "validFromUtc", "validToUtc", "", "discountPercentage", "Lcom/app/tgtg/model/remote/payment/Price;", "discountAmount", "maxDiscountAmount", "maxOrderAmount", "countryId", "Lcom/app/tgtg/model/remote/voucher/VoucherFilterType;", "storeVoucherFilterType", "currency", "", "Lcom/app/tgtg/model/remote/order/Order;", "orders", "filterType", "Lcom/app/tgtg/model/remote/voucher/response/VoucherFilterResponse;", "filterList", "Lcom/app/tgtg/model/remote/item/response/ItemType;", "applicableItemTypes", "eligiblePlatforms", "<init>", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/voucher/VoucherState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Lcom/app/tgtg/model/remote/payment/Price;Lcom/app/tgtg/model/remote/payment/Price;Lcom/app/tgtg/model/remote/payment/Price;Ljava/lang/String;Lcom/app/tgtg/model/remote/voucher/VoucherFilterType;Ljava/lang/String;Ljava/util/List;Lcom/app/tgtg/model/remote/voucher/VoucherFilterType;Lcom/app/tgtg/model/remote/voucher/response/VoucherFilterResponse;Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/voucher/VoucherState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Lcom/app/tgtg/model/remote/payment/Price;Lcom/app/tgtg/model/remote/payment/Price;Lcom/app/tgtg/model/remote/payment/Price;Ljava/lang/String;Lcom/app/tgtg/model/remote/voucher/VoucherFilterType;Ljava/lang/String;Ljava/util/List;Lcom/app/tgtg/model/remote/voucher/VoucherFilterType;Lcom/app/tgtg/model/remote/voucher/response/VoucherFilterResponse;Ljava/util/List;Ljava/lang/String;Lm90/m1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1-VUJ7vw4", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "()Lcom/app/tgtg/model/remote/voucher/VoucherState;", "component8", "component9", "component10", "()Ljava/lang/Double;", "component11", "()Lcom/app/tgtg/model/remote/payment/Price;", "component12", "component13", "component14", "component15", "()Lcom/app/tgtg/model/remote/voucher/VoucherFilterType;", "component16", "component17", "()Ljava/util/List;", "component18", "component19", "()Lcom/app/tgtg/model/remote/voucher/response/VoucherFilterResponse;", "component20", "component21", "copy-dWnhSKQ", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/voucher/VoucherState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Lcom/app/tgtg/model/remote/payment/Price;Lcom/app/tgtg/model/remote/payment/Price;Lcom/app/tgtg/model/remote/payment/Price;Ljava/lang/String;Lcom/app/tgtg/model/remote/voucher/VoucherFilterType;Ljava/lang/String;Ljava/util/List;Lcom/app/tgtg/model/remote/voucher/VoucherFilterType;Lcom/app/tgtg/model/remote/voucher/response/VoucherFilterResponse;Ljava/util/List;Ljava/lang/String;)Lcom/app/tgtg/model/remote/voucher/DiscountVoucher;", "copy", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "write$Self$app", "(Lcom/app/tgtg/model/remote/voucher/DiscountVoucher;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getId-VUJ7vw4", "getId-VUJ7vw4$annotations", "()V", "I", "getNumberOfInitialOrders", "getNumberOfInitialOrders$annotations", "getNumberOfOrdersUsed", "getNumberOfOrdersUsed$annotations", "getName", "getName$annotations", "getDescription", "getDescription$annotations", "getTermsUrl", "getTermsUrl$annotations", "Lcom/app/tgtg/model/remote/voucher/VoucherState;", "getState", "getState$annotations", "getValidFromUtc", "getValidFromUtc$annotations", "getValidToUtc", "getValidToUtc$annotations", "Ljava/lang/Double;", "getDiscountPercentage", "getDiscountPercentage$annotations", "Lcom/app/tgtg/model/remote/payment/Price;", "getDiscountAmount", "getDiscountAmount$annotations", "getMaxDiscountAmount", "getMaxDiscountAmount$annotations", "getMaxOrderAmount", "getMaxOrderAmount$annotations", "getCountryId", "getCountryId$annotations", "Lcom/app/tgtg/model/remote/voucher/VoucherFilterType;", "getStoreVoucherFilterType", "getStoreVoucherFilterType$annotations", "getCurrency", "getCurrency$annotations", "Ljava/util/List;", "getOrders", "getOrders$annotations", "getFilterType", "getFilterType$annotations", "Lcom/app/tgtg/model/remote/voucher/response/VoucherFilterResponse;", "getFilterList", "getFilterList$annotations", "getApplicableItemTypes", "getApplicableItemTypes$annotations", "getEligiblePlatforms", "getEligiblePlatforms$annotations", "Lcom/app/tgtg/model/remote/voucher/VoucherVersion;", "getVersion", "()Lcom/app/tgtg/model/remote/voucher/VoucherVersion;", "version", "Lcom/app/tgtg/model/remote/voucher/response/VoucherType;", "getVoucherType", "()Lcom/app/tgtg/model/remote/voucher/response/VoucherType;", "voucherType", "getShortDescription", "shortDescription", "getTermsLink", "termsLink", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class DiscountVoucher extends BasicVoucher {

    @NotNull
    private static final j[] $childSerializers;

    @Nullable
    private final List<ItemType> applicableItemTypes;

    @Nullable
    private final String countryId;

    @Nullable
    private final String currency;

    @NotNull
    private final String description;

    @Nullable
    private final Price discountAmount;

    @Nullable
    private final Double discountPercentage;

    @Nullable
    private final String eligiblePlatforms;

    @Nullable
    private final VoucherFilterResponse filterList;

    @Nullable
    private final VoucherFilterType filterType;

    @NotNull
    private final String id;

    @Nullable
    private final Price maxDiscountAmount;

    @Nullable
    private final Price maxOrderAmount;

    @NotNull
    private final String name;
    private final int numberOfInitialOrders;
    private final int numberOfOrdersUsed;

    @NotNull
    private final List<Order> orders;

    @NotNull
    private final VoucherState state;

    @Nullable
    private final VoucherFilterType storeVoucherFilterType;

    @NotNull
    private final String termsUrl;

    @NotNull
    private final String validFromUtc;

    @NotNull
    private final String validToUtc;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<DiscountVoucher> CREATOR = new Creator();

    static {
        m mVar = m.PUBLICATION;
        $childSerializers = new j[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, l.a(mVar, new d(18)), null, null, l.a(mVar, new d(19)), null};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private DiscountVoucher(int i11, String str, int i12, int i13, String str2, String str3, String str4, VoucherState voucherState, String str5, String str6, Double d3, Price price, Price price2, Price price3, String str7, VoucherFilterType voucherFilterType, String str8, List list, VoucherFilterType voucherFilterType2, VoucherFilterResponse voucherFilterResponse, List list2, String str9, m1 m1Var) {
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (65535 != (i11 & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH)) {
            c1.j(i11, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH, DiscountVoucher$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        super(defaultConstructorMarker);
        this.id = str;
        this.numberOfInitialOrders = i12;
        this.numberOfOrdersUsed = i13;
        this.name = str2;
        this.description = str3;
        this.termsUrl = str4;
        this.state = voucherState;
        this.validFromUtc = str5;
        this.validToUtc = str6;
        this.discountPercentage = d3;
        this.discountAmount = price;
        this.maxDiscountAmount = price2;
        this.maxOrderAmount = price3;
        this.countryId = str7;
        this.storeVoucherFilterType = voucherFilterType;
        this.currency = str8;
        this.orders = (65536 & i11) == 0 ? n0.f26529a : list;
        if ((131072 & i11) == 0) {
            this.filterType = null;
        } else {
            this.filterType = voucherFilterType2;
        }
        if ((262144 & i11) == 0) {
            this.filterList = null;
        } else {
            this.filterList = voucherFilterResponse;
        }
        if ((524288 & i11) == 0) {
            this.applicableItemTypes = null;
        } else {
            this.applicableItemTypes = list2;
        }
        if ((i11 & 1048576) == 0) {
            this.eligiblePlatforms = null;
        } else {
            this.eligiblePlatforms = str9;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new m90.d(f0.B(Order$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new m90.d(ItemTypeSerializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-dWnhSKQ$default, reason: not valid java name */
    public static /* synthetic */ DiscountVoucher m538copydWnhSKQ$default(DiscountVoucher discountVoucher, String str, int i11, int i12, String str2, String str3, String str4, VoucherState voucherState, String str5, String str6, Double d3, Price price, Price price2, Price price3, String str7, VoucherFilterType voucherFilterType, String str8, List list, VoucherFilterType voucherFilterType2, VoucherFilterResponse voucherFilterResponse, List list2, String str9, int i13, Object obj) {
        String str10;
        List list3;
        String str11 = (i13 & 1) != 0 ? discountVoucher.id : str;
        int i14 = (i13 & 2) != 0 ? discountVoucher.numberOfInitialOrders : i11;
        int i15 = (i13 & 4) != 0 ? discountVoucher.numberOfOrdersUsed : i12;
        String str12 = (i13 & 8) != 0 ? discountVoucher.name : str2;
        String str13 = (i13 & 16) != 0 ? discountVoucher.description : str3;
        String str14 = (i13 & 32) != 0 ? discountVoucher.termsUrl : str4;
        VoucherState voucherState2 = (i13 & 64) != 0 ? discountVoucher.state : voucherState;
        String str15 = (i13 & 128) != 0 ? discountVoucher.validFromUtc : str5;
        String str16 = (i13 & 256) != 0 ? discountVoucher.validToUtc : str6;
        Double d11 = (i13 & 512) != 0 ? discountVoucher.discountPercentage : d3;
        Price price4 = (i13 & 1024) != 0 ? discountVoucher.discountAmount : price;
        Price price5 = (i13 & NewHope.SENDB_BYTES) != 0 ? discountVoucher.maxDiscountAmount : price2;
        Price price6 = (i13 & 4096) != 0 ? discountVoucher.maxOrderAmount : price3;
        String str17 = (i13 & 8192) != 0 ? discountVoucher.countryId : str7;
        String str18 = str11;
        VoucherFilterType voucherFilterType3 = (i13 & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) != 0 ? discountVoucher.storeVoucherFilterType : voucherFilterType;
        String str19 = (i13 & 32768) != 0 ? discountVoucher.currency : str8;
        List list4 = (i13 & 65536) != 0 ? discountVoucher.orders : list;
        VoucherFilterType voucherFilterType4 = (i13 & 131072) != 0 ? discountVoucher.filterType : voucherFilterType2;
        VoucherFilterResponse voucherFilterResponse2 = (i13 & 262144) != 0 ? discountVoucher.filterList : voucherFilterResponse;
        List list5 = (i13 & 524288) != 0 ? discountVoucher.applicableItemTypes : list2;
        if ((i13 & 1048576) != 0) {
            list3 = list5;
            str10 = discountVoucher.eligiblePlatforms;
        } else {
            str10 = str9;
            list3 = list5;
        }
        return discountVoucher.m541copydWnhSKQ(str18, i14, i15, str12, str13, str14, voucherState2, str15, str16, d11, price4, price5, price6, str17, voucherFilterType3, str19, list4, voucherFilterType4, voucherFilterResponse2, list3, str10);
    }

    public static final void write$Self$app(DiscountVoucher self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        output.i(serialDesc, 0, VoucherId$$serializer.INSTANCE, VoucherId.m298boximpl(self.mo529getIdVUJ7vw4()));
        output.m(1, self.numberOfInitialOrders, serialDesc);
        output.m(2, self.numberOfOrdersUsed, serialDesc);
        output.q(serialDesc, 3, self.getName());
        output.q(serialDesc, 4, self.description);
        output.q(serialDesc, 5, self.termsUrl);
        output.i(serialDesc, 6, VoucherStateSerializer.INSTANCE, self.getState());
        output.q(serialDesc, 7, self.getValidFromUtc());
        output.q(serialDesc, 8, self.getValidToUtc());
        output.r(serialDesc, 9, v.f29868a, self.discountPercentage);
        Price$$serializer price$$serializer = Price$$serializer.INSTANCE;
        output.r(serialDesc, 10, price$$serializer, self.discountAmount);
        output.r(serialDesc, 11, price$$serializer, self.maxDiscountAmount);
        output.r(serialDesc, 12, price$$serializer, self.maxOrderAmount);
        r1 r1Var = r1.f29848a;
        output.r(serialDesc, 13, r1Var, self.getCountryId());
        VoucherFilterTypeSerializer voucherFilterTypeSerializer = VoucherFilterTypeSerializer.INSTANCE;
        output.r(serialDesc, 14, voucherFilterTypeSerializer, self.getStoreVoucherFilterType());
        output.r(serialDesc, 15, r1Var, self.currency);
        if (output.C(serialDesc) || !Intrinsics.areEqual(self.orders, n0.f26529a)) {
            output.i(serialDesc, 16, (KSerializer) jVarArr[16].getValue(), self.orders);
        }
        if (output.C(serialDesc) || self.getFilterType() != null) {
            output.r(serialDesc, 17, voucherFilterTypeSerializer, self.getFilterType());
        }
        if (output.C(serialDesc) || self.getFilterList() != null) {
            output.r(serialDesc, 18, VoucherFilterResponse$$serializer.INSTANCE, self.getFilterList());
        }
        if (output.C(serialDesc) || self.getApplicableItemTypes() != null) {
            output.r(serialDesc, 19, (KSerializer) jVarArr[19].getValue(), self.getApplicableItemTypes());
        }
        if (!output.C(serialDesc) && self.getEligiblePlatforms() == null) {
            return;
        }
        output.r(serialDesc, 20, r1Var, self.getEligiblePlatforms());
    }

    @NotNull
    /* JADX INFO: renamed from: component1-VUJ7vw4, reason: not valid java name and from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Double getDiscountPercentage() {
        return this.discountPercentage;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Price getDiscountAmount() {
        return this.discountAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Price getMaxDiscountAmount() {
        return this.maxDiscountAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Price getMaxOrderAmount() {
        return this.maxOrderAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getCountryId() {
        return this.countryId;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final VoucherFilterType getStoreVoucherFilterType() {
        return this.storeVoucherFilterType;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @NotNull
    public final List<Order> component17() {
        return this.orders;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final VoucherFilterType getFilterType() {
        return this.filterType;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final VoucherFilterResponse getFilterList() {
        return this.filterList;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getNumberOfInitialOrders() {
        return this.numberOfInitialOrders;
    }

    @Nullable
    public final List<ItemType> component20() {
        return this.applicableItemTypes;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getEligiblePlatforms() {
        return this.eligiblePlatforms;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getNumberOfOrdersUsed() {
        return this.numberOfOrdersUsed;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTermsUrl() {
        return this.termsUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final VoucherState getState() {
        return this.state;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getValidFromUtc() {
        return this.validFromUtc;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getValidToUtc() {
        return this.validToUtc;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-dWnhSKQ, reason: not valid java name */
    public final DiscountVoucher m541copydWnhSKQ(@NotNull String id2, int numberOfInitialOrders, int numberOfOrdersUsed, @NotNull String name, @NotNull String description, @NotNull String termsUrl, @NotNull VoucherState state, @NotNull String validFromUtc, @NotNull String validToUtc, @Nullable Double discountPercentage, @Nullable Price discountAmount, @Nullable Price maxDiscountAmount, @Nullable Price maxOrderAmount, @Nullable String countryId, @Nullable VoucherFilterType storeVoucherFilterType, @Nullable String currency, @NotNull List<Order> orders, @Nullable VoucherFilterType filterType, @Nullable VoucherFilterResponse filterList, @Nullable List<? extends ItemType> applicableItemTypes, @Nullable String eligiblePlatforms) {
        id2.getClass();
        name.getClass();
        description.getClass();
        termsUrl.getClass();
        state.getClass();
        validFromUtc.getClass();
        validToUtc.getClass();
        orders.getClass();
        return new DiscountVoucher(id2, numberOfInitialOrders, numberOfOrdersUsed, name, description, termsUrl, state, validFromUtc, validToUtc, discountPercentage, discountAmount, maxDiscountAmount, maxOrderAmount, countryId, storeVoucherFilterType, currency, orders, filterType, filterList, applicableItemTypes, eligiblePlatforms, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DiscountVoucher)) {
            return false;
        }
        DiscountVoucher discountVoucher = (DiscountVoucher) other;
        return VoucherId.m302equalsimpl0(this.id, discountVoucher.id) && this.numberOfInitialOrders == discountVoucher.numberOfInitialOrders && this.numberOfOrdersUsed == discountVoucher.numberOfOrdersUsed && Intrinsics.areEqual(this.name, discountVoucher.name) && Intrinsics.areEqual(this.description, discountVoucher.description) && Intrinsics.areEqual(this.termsUrl, discountVoucher.termsUrl) && this.state == discountVoucher.state && Intrinsics.areEqual(this.validFromUtc, discountVoucher.validFromUtc) && Intrinsics.areEqual(this.validToUtc, discountVoucher.validToUtc) && Intrinsics.areEqual((Object) this.discountPercentage, (Object) discountVoucher.discountPercentage) && Intrinsics.areEqual(this.discountAmount, discountVoucher.discountAmount) && Intrinsics.areEqual(this.maxDiscountAmount, discountVoucher.maxDiscountAmount) && Intrinsics.areEqual(this.maxOrderAmount, discountVoucher.maxOrderAmount) && Intrinsics.areEqual(this.countryId, discountVoucher.countryId) && this.storeVoucherFilterType == discountVoucher.storeVoucherFilterType && Intrinsics.areEqual(this.currency, discountVoucher.currency) && Intrinsics.areEqual(this.orders, discountVoucher.orders) && this.filterType == discountVoucher.filterType && Intrinsics.areEqual(this.filterList, discountVoucher.filterList) && Intrinsics.areEqual(this.applicableItemTypes, discountVoucher.applicableItemTypes) && Intrinsics.areEqual(this.eligiblePlatforms, discountVoucher.eligiblePlatforms);
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

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final Price getDiscountAmount() {
        return this.discountAmount;
    }

    @Nullable
    public final Double getDiscountPercentage() {
        return this.discountPercentage;
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

    @Nullable
    public final Price getMaxDiscountAmount() {
        return this.maxDiscountAmount;
    }

    @Nullable
    public final Price getMaxOrderAmount() {
        return this.maxOrderAmount;
    }

    @Override // com.app.tgtg.model.remote.voucher.BasicVoucher
    @NotNull
    public String getName() {
        return this.name;
    }

    public final int getNumberOfInitialOrders() {
        return this.numberOfInitialOrders;
    }

    public final int getNumberOfOrdersUsed() {
        return this.numberOfOrdersUsed;
    }

    @NotNull
    public final List<Order> getOrders() {
        return this.orders;
    }

    @Override // com.app.tgtg.model.remote.voucher.BasicVoucher
    @Nullable
    public String getShortDescription() {
        return null;
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
    @NotNull
    public String getTermsLink() {
        return this.termsUrl;
    }

    @NotNull
    public final String getTermsUrl() {
        return this.termsUrl;
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
        return VoucherVersion.DISCOUNT;
    }

    @Override // com.app.tgtg.model.remote.voucher.BasicVoucher
    @NotNull
    public VoucherType getVoucherType() {
        return VoucherType.OTHER;
    }

    public int hashCode() {
        int iB = l1.b(l1.b((this.state.hashCode() + l1.b(l1.b(l1.b(k.b(this.numberOfOrdersUsed, k.b(this.numberOfInitialOrders, VoucherId.m303hashCodeimpl(this.id) * 31, 31), 31), 31, this.name), 31, this.description), 31, this.termsUrl)) * 31, 31, this.validFromUtc), 31, this.validToUtc);
        Double d3 = this.discountPercentage;
        int iHashCode = (iB + (d3 == null ? 0 : d3.hashCode())) * 31;
        Price price = this.discountAmount;
        int iHashCode2 = (iHashCode + (price == null ? 0 : price.hashCode())) * 31;
        Price price2 = this.maxDiscountAmount;
        int iHashCode3 = (iHashCode2 + (price2 == null ? 0 : price2.hashCode())) * 31;
        Price price3 = this.maxOrderAmount;
        int iHashCode4 = (iHashCode3 + (price3 == null ? 0 : price3.hashCode())) * 31;
        String str = this.countryId;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        VoucherFilterType voucherFilterType = this.storeVoucherFilterType;
        int iHashCode6 = (iHashCode5 + (voucherFilterType == null ? 0 : voucherFilterType.hashCode())) * 31;
        String str2 = this.currency;
        int iC = f.c(this.orders, (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        VoucherFilterType voucherFilterType2 = this.filterType;
        int iHashCode7 = (iC + (voucherFilterType2 == null ? 0 : voucherFilterType2.hashCode())) * 31;
        VoucherFilterResponse voucherFilterResponse = this.filterList;
        int iHashCode8 = (iHashCode7 + (voucherFilterResponse == null ? 0 : voucherFilterResponse.hashCode())) * 31;
        List<ItemType> list = this.applicableItemTypes;
        int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.eligiblePlatforms;
        return iHashCode9 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String strM304toStringimpl = VoucherId.m304toStringimpl(this.id);
        int i11 = this.numberOfInitialOrders;
        int i12 = this.numberOfOrdersUsed;
        String str = this.name;
        String str2 = this.description;
        String str3 = this.termsUrl;
        VoucherState voucherState = this.state;
        String str4 = this.validFromUtc;
        String str5 = this.validToUtc;
        Double d3 = this.discountPercentage;
        Price price = this.discountAmount;
        Price price2 = this.maxDiscountAmount;
        Price price3 = this.maxOrderAmount;
        String str6 = this.countryId;
        VoucherFilterType voucherFilterType = this.storeVoucherFilterType;
        String str7 = this.currency;
        List<Order> list = this.orders;
        VoucherFilterType voucherFilterType2 = this.filterType;
        VoucherFilterResponse voucherFilterResponse = this.filterList;
        List<ItemType> list2 = this.applicableItemTypes;
        String str8 = this.eligiblePlatforms;
        StringBuilder sb2 = new StringBuilder("DiscountVoucher(id=");
        sb2.append(strM304toStringimpl);
        sb2.append(", numberOfInitialOrders=");
        sb2.append(i11);
        sb2.append(", numberOfOrdersUsed=");
        sb2.append(i12);
        sb2.append(", name=");
        sb2.append(str);
        sb2.append(", description=");
        s.A(sb2, str2, ", termsUrl=", str3, ", state=");
        sb2.append(voucherState);
        sb2.append(", validFromUtc=");
        sb2.append(str4);
        sb2.append(", validToUtc=");
        sb2.append(str5);
        sb2.append(", discountPercentage=");
        sb2.append(d3);
        sb2.append(", discountAmount=");
        sb2.append(price);
        sb2.append(", maxDiscountAmount=");
        sb2.append(price2);
        sb2.append(", maxOrderAmount=");
        sb2.append(price3);
        sb2.append(", countryId=");
        sb2.append(str6);
        sb2.append(", storeVoucherFilterType=");
        sb2.append(voucherFilterType);
        sb2.append(", currency=");
        sb2.append(str7);
        sb2.append(", orders=");
        sb2.append(list);
        sb2.append(", filterType=");
        sb2.append(voucherFilterType2);
        sb2.append(", filterList=");
        sb2.append(voucherFilterResponse);
        sb2.append(", applicableItemTypes=");
        sb2.append(list2);
        sb2.append(", eligiblePlatforms=");
        return k.p(sb2, str8, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        VoucherId.m305writeToParcelimpl(this.id, dest, flags);
        dest.writeInt(this.numberOfInitialOrders);
        dest.writeInt(this.numberOfOrdersUsed);
        dest.writeString(this.name);
        dest.writeString(this.description);
        dest.writeString(this.termsUrl);
        dest.writeString(this.state.name());
        dest.writeString(this.validFromUtc);
        dest.writeString(this.validToUtc);
        Double d3 = this.discountPercentage;
        if (d3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d3.doubleValue());
        }
        Price price = this.discountAmount;
        if (price == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            price.writeToParcel(dest, flags);
        }
        Price price2 = this.maxDiscountAmount;
        if (price2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            price2.writeToParcel(dest, flags);
        }
        Price price3 = this.maxOrderAmount;
        if (price3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            price3.writeToParcel(dest, flags);
        }
        dest.writeString(this.countryId);
        VoucherFilterType voucherFilterType = this.storeVoucherFilterType;
        if (voucherFilterType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(voucherFilterType.name());
        }
        dest.writeString(this.currency);
        Iterator itR = i.r(this.orders, dest);
        while (itR.hasNext()) {
            Order order = (Order) itR.next();
            if (order == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                order.writeToParcel(dest, flags);
            }
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

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/voucher/DiscountVoucher$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/voucher/DiscountVoucher;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return DiscountVoucher$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DiscountVoucher> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DiscountVoucher createFromParcel(Parcel parcel) {
            VoucherFilterType voucherFilterType;
            ArrayList arrayList;
            ArrayList arrayList2;
            int i11;
            Order orderCreateFromParcel;
            parcel.getClass();
            String strM306unboximpl = VoucherId.CREATOR.createFromParcel(parcel).m306unboximpl();
            int i12 = parcel.readInt();
            int i13 = parcel.readInt();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            VoucherState voucherStateValueOf = VoucherState.valueOf(parcel.readString());
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            Double dValueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Price priceCreateFromParcel = parcel.readInt() == 0 ? null : Price.CREATOR.createFromParcel(parcel);
            Price priceCreateFromParcel2 = parcel.readInt() == 0 ? null : Price.CREATOR.createFromParcel(parcel);
            Price priceCreateFromParcel3 = parcel.readInt() == 0 ? null : Price.CREATOR.createFromParcel(parcel);
            String string6 = parcel.readString();
            VoucherFilterType voucherFilterTypeValueOf = parcel.readInt() == 0 ? null : VoucherFilterType.valueOf(parcel.readString());
            String string7 = parcel.readString();
            int i14 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i14);
            int i15 = 0;
            while (i15 != i14) {
                if (parcel.readInt() == 0) {
                    i11 = i14;
                    orderCreateFromParcel = null;
                } else {
                    i11 = i14;
                    orderCreateFromParcel = Order.CREATOR.createFromParcel(parcel);
                }
                arrayList3.add(orderCreateFromParcel);
                i15++;
                i14 = i11;
            }
            VoucherFilterType voucherFilterTypeValueOf2 = parcel.readInt() == 0 ? null : VoucherFilterType.valueOf(parcel.readString());
            VoucherFilterResponse voucherFilterResponseCreateFromParcel = parcel.readInt() == 0 ? null : VoucherFilterResponse.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                voucherFilterType = voucherFilterTypeValueOf2;
                arrayList = arrayList3;
                arrayList2 = null;
            } else {
                int i16 = parcel.readInt();
                voucherFilterType = voucherFilterTypeValueOf2;
                ArrayList arrayList4 = new ArrayList(i16);
                arrayList = arrayList3;
                int i17 = 0;
                while (i17 != i16) {
                    arrayList4.add(ItemType.valueOf(parcel.readString()));
                    i17++;
                    i16 = i16;
                }
                arrayList2 = arrayList4;
            }
            return new DiscountVoucher(strM306unboximpl, i12, i13, string, string2, string3, voucherStateValueOf, string4, string5, dValueOf, priceCreateFromParcel, priceCreateFromParcel2, priceCreateFromParcel3, string6, voucherFilterTypeValueOf, string7, arrayList, voucherFilterType, voucherFilterResponseCreateFromParcel, arrayList2, parcel.readString(), null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DiscountVoucher[] newArray(int i11) {
            return new DiscountVoucher[i11];
        }
    }

    @g("applicable_item_types")
    public static /* synthetic */ void getApplicableItemTypes$annotations() {
    }

    @g("country_id")
    public static /* synthetic */ void getCountryId$annotations() {
    }

    @g("currency")
    public static /* synthetic */ void getCurrency$annotations() {
    }

    @g("description")
    public static /* synthetic */ void getDescription$annotations() {
    }

    @g("discount_amount")
    public static /* synthetic */ void getDiscountAmount$annotations() {
    }

    @g("discount_percentage")
    public static /* synthetic */ void getDiscountPercentage$annotations() {
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
    public static /* synthetic */ void m539getIdVUJ7vw4$annotations() {
    }

    @g("max_discount_amount")
    public static /* synthetic */ void getMaxDiscountAmount$annotations() {
    }

    @g("max_order_amount")
    public static /* synthetic */ void getMaxOrderAmount$annotations() {
    }

    @g("name")
    public static /* synthetic */ void getName$annotations() {
    }

    @g("number_of_initial_orders")
    public static /* synthetic */ void getNumberOfInitialOrders$annotations() {
    }

    @g("number_of_orders_used")
    public static /* synthetic */ void getNumberOfOrdersUsed$annotations() {
    }

    @g("orders")
    public static /* synthetic */ void getOrders$annotations() {
    }

    @g("state")
    public static /* synthetic */ void getState$annotations() {
    }

    @g("store_filter_type")
    public static /* synthetic */ void getStoreVoucherFilterType$annotations() {
    }

    @g("terms_url")
    public static /* synthetic */ void getTermsUrl$annotations() {
    }

    @g("valid_from")
    public static /* synthetic */ void getValidFromUtc$annotations() {
    }

    @g("valid_to")
    public static /* synthetic */ void getValidToUtc$annotations() {
    }

    public /* synthetic */ DiscountVoucher(String str, int i11, int i12, String str2, String str3, String str4, VoucherState voucherState, String str5, String str6, Double d3, Price price, Price price2, Price price3, String str7, VoucherFilterType voucherFilterType, String str8, List list, VoucherFilterType voucherFilterType2, VoucherFilterResponse voucherFilterResponse, List list2, String str9, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i11, i12, str2, str3, str4, voucherState, str5, str6, d3, price, price2, price3, str7, voucherFilterType, str8, list, voucherFilterType2, voucherFilterResponse, list2, str9);
    }

    public DiscountVoucher(String str, int i11, int i12, String str2, String str3, String str4, VoucherState voucherState, String str5, String str6, Double d3, Price price, Price price2, Price price3, String str7, VoucherFilterType voucherFilterType, String str8, List list, VoucherFilterType voucherFilterType2, VoucherFilterResponse voucherFilterResponse, List list2, String str9, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i11, i12, str2, str3, str4, voucherState, str5, str6, d3, price, price2, price3, str7, voucherFilterType, str8, (i13 & 65536) != 0 ? n0.f26529a : list, (i13 & 131072) != 0 ? null : voucherFilterType2, (i13 & 262144) != 0 ? null : voucherFilterResponse, (i13 & 524288) != 0 ? null : list2, (i13 & 1048576) != 0 ? null : str9, null);
    }

    public /* synthetic */ DiscountVoucher(int i11, String str, int i12, int i13, String str2, String str3, String str4, VoucherState voucherState, String str5, String str6, Double d3, Price price, Price price2, Price price3, String str7, VoucherFilterType voucherFilterType, String str8, List list, VoucherFilterType voucherFilterType2, VoucherFilterResponse voucherFilterResponse, List list2, String str9, m1 m1Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, str, i12, i13, str2, str3, str4, voucherState, str5, str6, d3, price, price2, price3, str7, voucherFilterType, str8, list, voucherFilterType2, voucherFilterResponse, list2, str9, m1Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    private DiscountVoucher(String str, int i11, int i12, String str2, String str3, String str4, VoucherState voucherState, String str5, String str6, Double d3, Price price, Price price2, Price price3, String str7, VoucherFilterType voucherFilterType, String str8, List<Order> list, VoucherFilterType voucherFilterType2, VoucherFilterResponse voucherFilterResponse, List<? extends ItemType> list2, String str9) {
        super(null);
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        voucherState.getClass();
        str5.getClass();
        str6.getClass();
        list.getClass();
        this.id = str;
        this.numberOfInitialOrders = i11;
        this.numberOfOrdersUsed = i12;
        this.name = str2;
        this.description = str3;
        this.termsUrl = str4;
        this.state = voucherState;
        this.validFromUtc = str5;
        this.validToUtc = str6;
        this.discountPercentage = d3;
        this.discountAmount = price;
        this.maxDiscountAmount = price2;
        this.maxOrderAmount = price3;
        this.countryId = str7;
        this.storeVoucherFilterType = voucherFilterType;
        this.currency = str8;
        this.orders = list;
        this.filterType = voucherFilterType2;
        this.filterList = voucherFilterResponse;
        this.applicableItemTypes = list2;
        this.eligiblePlatforms = str9;
    }
}
