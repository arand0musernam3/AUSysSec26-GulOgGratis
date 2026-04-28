package com.app.tgtg.model.remote.manufacturer.response;

import android.os.Parcel;
import android.os.Parcelable;
import b3.i;
import com.app.tgtg.model.remote.payment.Price;
import com.app.tgtg.model.remote.payment.Price$$serializer;
import e0.f;
import eu.a;
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
import m90.d;
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

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bB\b\u0087\b\u0018\u0000 \u0086\u00012\u00020\u0001:\u0004\u0087\u0001\u0086\u0001B³\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0018\u0010\u0019B©\u0001\b\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u0018\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0002¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001fJ\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001fJ\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001fJ\u0010\u0010)\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\u001fJ\u0012\u0010*\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b,\u0010+J\u0010\u0010-\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b-\u0010\u001fJ\u0010\u0010.\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b.\u0010\u001fJ\u0018\u0010/\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b3\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\b7\u00108J\u0012\u00109\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b9\u0010+J\u0012\u0010:\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b:\u00106J¼\u0001\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b=\u0010+J\u0010\u0010>\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b>\u0010\u001fJ\u001a\u0010A\u001a\u00020\u00142\b\u0010@\u001a\u0004\u0018\u00010?HÖ\u0003¢\u0006\u0004\bA\u0010BJ'\u0010J\u001a\u00020#2\u0006\u0010C\u001a\u00020\u00002\u0006\u0010E\u001a\u00020D2\u0006\u0010G\u001a\u00020FH\u0001¢\u0006\u0004\bH\u0010IR(\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010K\u0012\u0004\bO\u0010P\u001a\u0004\bL\u0010\u001f\"\u0004\bM\u0010NR(\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0004\u0010K\u0012\u0004\bS\u0010P\u001a\u0004\bQ\u0010\u001f\"\u0004\bR\u0010NR(\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010K\u0012\u0004\bV\u0010P\u001a\u0004\bT\u0010\u001f\"\u0004\bU\u0010NR(\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0006\u0010K\u0012\u0004\bY\u0010P\u001a\u0004\bW\u0010\u001f\"\u0004\bX\u0010NR*\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\b\u0010Z\u0012\u0004\b^\u0010P\u001a\u0004\b[\u0010+\"\u0004\b\\\u0010]R*\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\t\u0010Z\u0012\u0004\ba\u0010P\u001a\u0004\b_\u0010+\"\u0004\b`\u0010]R(\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\n\u0010K\u0012\u0004\bd\u0010P\u001a\u0004\bb\u0010\u001f\"\u0004\bc\u0010NR(\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u000b\u0010K\u0012\u0004\bg\u0010P\u001a\u0004\be\u0010\u001f\"\u0004\bf\u0010NR0\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u000e\u0010h\u0012\u0004\bl\u0010P\u001a\u0004\bi\u00100\"\u0004\bj\u0010kR*\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u000f\u0010m\u0012\u0004\bq\u0010P\u001a\u0004\bn\u00102\"\u0004\bo\u0010pR*\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0011\u0010r\u0012\u0004\bv\u0010P\u001a\u0004\bs\u00104\"\u0004\bt\u0010uR*\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0013\u0010w\u0012\u0004\b{\u0010P\u001a\u0004\bx\u00106\"\u0004\by\u0010zR(\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0015\u0010|\u0012\u0004\b\u007f\u0010P\u001a\u0004\b\u0015\u00108\"\u0004\b}\u0010~R-\u0010\u0016\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u001b\n\u0004\b\u0016\u0010Z\u0012\u0005\b\u0082\u0001\u0010P\u001a\u0005\b\u0080\u0001\u0010+\"\u0005\b\u0081\u0001\u0010]R-\u0010\u0017\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u001b\n\u0004\b\u0017\u0010w\u0012\u0005\b\u0085\u0001\u0010P\u001a\u0005\b\u0083\u0001\u00106\"\u0005\b\u0084\u0001\u0010z¨\u0006\u0088\u0001"}, d2 = {"Lcom/app/tgtg/model/remote/manufacturer/response/ManufacturerInformation;", "Landroid/os/Parcelable;", "", "boxWeightGrams", "boxWidthMM", "boxHeightMM", "boxLengthMM", "", "estimatedDelivery", "minimumExpirationDate", "productCount", "itemSurpriseLevel", "", "Lcom/app/tgtg/model/remote/manufacturer/response/ItemDetailsFaqItem;", "faqList", "itemsSoldToday", "Lcom/app/tgtg/model/remote/manufacturer/response/Brand;", "brand", "Lcom/app/tgtg/model/remote/payment/Price;", "priceBeforeDiscount", "", "isFreeDelivery", "parcelType", "bottleDeposit", "<init>", "(IIIILjava/lang/String;Ljava/lang/String;IILjava/util/List;Ljava/lang/Integer;Lcom/app/tgtg/model/remote/manufacturer/response/Brand;Lcom/app/tgtg/model/remote/payment/Price;ZLjava/lang/String;Lcom/app/tgtg/model/remote/payment/Price;)V", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(IIIIILjava/lang/String;Ljava/lang/String;IILjava/util/List;Ljava/lang/Integer;Lcom/app/tgtg/model/remote/manufacturer/response/Brand;Lcom/app/tgtg/model/remote/payment/Price;ZLjava/lang/String;Lcom/app/tgtg/model/remote/payment/Price;Lm90/m1;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "component2", "component3", "component4", "component5", "()Ljava/lang/String;", "component6", "component7", "component8", "component9", "()Ljava/util/List;", "component10", "()Ljava/lang/Integer;", "component11", "()Lcom/app/tgtg/model/remote/manufacturer/response/Brand;", "component12", "()Lcom/app/tgtg/model/remote/payment/Price;", "component13", "()Z", "component14", "component15", "copy", "(IIIILjava/lang/String;Ljava/lang/String;IILjava/util/List;Ljava/lang/Integer;Lcom/app/tgtg/model/remote/manufacturer/response/Brand;Lcom/app/tgtg/model/remote/payment/Price;ZLjava/lang/String;Lcom/app/tgtg/model/remote/payment/Price;)Lcom/app/tgtg/model/remote/manufacturer/response/ManufacturerInformation;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "write$Self$app", "(Lcom/app/tgtg/model/remote/manufacturer/response/ManufacturerInformation;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getBoxWeightGrams", "setBoxWeightGrams", "(I)V", "getBoxWeightGrams$annotations", "()V", "getBoxWidthMM", "setBoxWidthMM", "getBoxWidthMM$annotations", "getBoxHeightMM", "setBoxHeightMM", "getBoxHeightMM$annotations", "getBoxLengthMM", "setBoxLengthMM", "getBoxLengthMM$annotations", "Ljava/lang/String;", "getEstimatedDelivery", "setEstimatedDelivery", "(Ljava/lang/String;)V", "getEstimatedDelivery$annotations", "getMinimumExpirationDate", "setMinimumExpirationDate", "getMinimumExpirationDate$annotations", "getProductCount", "setProductCount", "getProductCount$annotations", "getItemSurpriseLevel", "setItemSurpriseLevel", "getItemSurpriseLevel$annotations", "Ljava/util/List;", "getFaqList", "setFaqList", "(Ljava/util/List;)V", "getFaqList$annotations", "Ljava/lang/Integer;", "getItemsSoldToday", "setItemsSoldToday", "(Ljava/lang/Integer;)V", "getItemsSoldToday$annotations", "Lcom/app/tgtg/model/remote/manufacturer/response/Brand;", "getBrand", "setBrand", "(Lcom/app/tgtg/model/remote/manufacturer/response/Brand;)V", "getBrand$annotations", "Lcom/app/tgtg/model/remote/payment/Price;", "getPriceBeforeDiscount", "setPriceBeforeDiscount", "(Lcom/app/tgtg/model/remote/payment/Price;)V", "getPriceBeforeDiscount$annotations", "Z", "setFreeDelivery", "(Z)V", "isFreeDelivery$annotations", "getParcelType", "setParcelType", "getParcelType$annotations", "getBottleDeposit", "setBottleDeposit", "getBottleDeposit$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class ManufacturerInformation implements Parcelable {

    @Nullable
    private Price bottleDeposit;
    private int boxHeightMM;
    private int boxLengthMM;
    private int boxWeightGrams;
    private int boxWidthMM;

    @Nullable
    private Brand brand;

    @Nullable
    private String estimatedDelivery;

    @Nullable
    private List<ItemDetailsFaqItem> faqList;
    private boolean isFreeDelivery;
    private int itemSurpriseLevel;

    @Nullable
    private Integer itemsSoldToday;

    @Nullable
    private String minimumExpirationDate;

    @Nullable
    private String parcelType;

    @Nullable
    private Price priceBeforeDiscount;
    private int productCount;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<ManufacturerInformation> CREATOR = new Creator();

    @NotNull
    private static final j[] $childSerializers = {null, null, null, null, null, null, null, null, l.a(m.PUBLICATION, new a(24)), null, null, null, null, null, null};

    public /* synthetic */ ManufacturerInformation(int i11, int i12, int i13, int i14, String str, String str2, int i15, int i16, List list, Integer num, Brand brand, Price price, boolean z11, String str3, Price price2, int i17, DefaultConstructorMarker defaultConstructorMarker) {
        this((i17 & 1) != 0 ? 0 : i11, (i17 & 2) != 0 ? 0 : i12, (i17 & 4) != 0 ? 0 : i13, (i17 & 8) != 0 ? 0 : i14, (i17 & 16) != 0 ? null : str, (i17 & 32) != 0 ? null : str2, (i17 & 64) != 0 ? 0 : i15, (i17 & 128) != 0 ? 0 : i16, (i17 & 256) != 0 ? null : list, (i17 & 512) != 0 ? null : num, (i17 & 1024) != 0 ? null : brand, (i17 & NewHope.SENDB_BYTES) != 0 ? null : price, (i17 & 4096) == 0 ? z11 : false, (i17 & 8192) != 0 ? null : str3, (i17 & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) != 0 ? null : price2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(ItemDetailsFaqItem$$serializer.INSTANCE, 0);
    }

    public static final /* synthetic */ void write$Self$app(ManufacturerInformation self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        if (output.C(serialDesc) || self.boxWeightGrams != 0) {
            output.m(0, self.boxWeightGrams, serialDesc);
        }
        if (output.C(serialDesc) || self.boxWidthMM != 0) {
            output.m(1, self.boxWidthMM, serialDesc);
        }
        if (output.C(serialDesc) || self.boxHeightMM != 0) {
            output.m(2, self.boxHeightMM, serialDesc);
        }
        if (output.C(serialDesc) || self.boxLengthMM != 0) {
            output.m(3, self.boxLengthMM, serialDesc);
        }
        if (output.C(serialDesc) || self.estimatedDelivery != null) {
            output.r(serialDesc, 4, r1.f29848a, self.estimatedDelivery);
        }
        if (output.C(serialDesc) || self.minimumExpirationDate != null) {
            output.r(serialDesc, 5, r1.f29848a, self.minimumExpirationDate);
        }
        if (output.C(serialDesc) || self.productCount != 0) {
            output.m(6, self.productCount, serialDesc);
        }
        if (output.C(serialDesc) || self.itemSurpriseLevel != 0) {
            output.m(7, self.itemSurpriseLevel, serialDesc);
        }
        if (output.C(serialDesc) || self.faqList != null) {
            output.r(serialDesc, 8, (KSerializer) jVarArr[8].getValue(), self.faqList);
        }
        if (output.C(serialDesc) || self.itemsSoldToday != null) {
            output.r(serialDesc, 9, l0.f29821a, self.itemsSoldToday);
        }
        if (output.C(serialDesc) || self.brand != null) {
            output.r(serialDesc, 10, Brand$$serializer.INSTANCE, self.brand);
        }
        if (output.C(serialDesc) || self.priceBeforeDiscount != null) {
            output.r(serialDesc, 11, Price$$serializer.INSTANCE, self.priceBeforeDiscount);
        }
        if (output.C(serialDesc) || self.isFreeDelivery) {
            output.p(serialDesc, 12, self.isFreeDelivery);
        }
        if (output.C(serialDesc) || self.parcelType != null) {
            output.r(serialDesc, 13, r1.f29848a, self.parcelType);
        }
        if (!output.C(serialDesc) && self.bottleDeposit == null) {
            return;
        }
        output.r(serialDesc, 14, Price$$serializer.INSTANCE, self.bottleDeposit);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getBoxWeightGrams() {
        return this.boxWeightGrams;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Integer getItemsSoldToday() {
        return this.itemsSoldToday;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Brand getBrand() {
        return this.brand;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Price getPriceBeforeDiscount() {
        return this.priceBeforeDiscount;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getIsFreeDelivery() {
        return this.isFreeDelivery;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getParcelType() {
        return this.parcelType;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Price getBottleDeposit() {
        return this.bottleDeposit;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getBoxWidthMM() {
        return this.boxWidthMM;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getBoxHeightMM() {
        return this.boxHeightMM;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getBoxLengthMM() {
        return this.boxLengthMM;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getEstimatedDelivery() {
        return this.estimatedDelivery;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getMinimumExpirationDate() {
        return this.minimumExpirationDate;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getProductCount() {
        return this.productCount;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getItemSurpriseLevel() {
        return this.itemSurpriseLevel;
    }

    @Nullable
    public final List<ItemDetailsFaqItem> component9() {
        return this.faqList;
    }

    @NotNull
    public final ManufacturerInformation copy(int boxWeightGrams, int boxWidthMM, int boxHeightMM, int boxLengthMM, @Nullable String estimatedDelivery, @Nullable String minimumExpirationDate, int productCount, int itemSurpriseLevel, @Nullable List<ItemDetailsFaqItem> faqList, @Nullable Integer itemsSoldToday, @Nullable Brand brand, @Nullable Price priceBeforeDiscount, boolean isFreeDelivery, @Nullable String parcelType, @Nullable Price bottleDeposit) {
        return new ManufacturerInformation(boxWeightGrams, boxWidthMM, boxHeightMM, boxLengthMM, estimatedDelivery, minimumExpirationDate, productCount, itemSurpriseLevel, faqList, itemsSoldToday, brand, priceBeforeDiscount, isFreeDelivery, parcelType, bottleDeposit);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ManufacturerInformation)) {
            return false;
        }
        ManufacturerInformation manufacturerInformation = (ManufacturerInformation) other;
        return this.boxWeightGrams == manufacturerInformation.boxWeightGrams && this.boxWidthMM == manufacturerInformation.boxWidthMM && this.boxHeightMM == manufacturerInformation.boxHeightMM && this.boxLengthMM == manufacturerInformation.boxLengthMM && Intrinsics.areEqual(this.estimatedDelivery, manufacturerInformation.estimatedDelivery) && Intrinsics.areEqual(this.minimumExpirationDate, manufacturerInformation.minimumExpirationDate) && this.productCount == manufacturerInformation.productCount && this.itemSurpriseLevel == manufacturerInformation.itemSurpriseLevel && Intrinsics.areEqual(this.faqList, manufacturerInformation.faqList) && Intrinsics.areEqual(this.itemsSoldToday, manufacturerInformation.itemsSoldToday) && Intrinsics.areEqual(this.brand, manufacturerInformation.brand) && Intrinsics.areEqual(this.priceBeforeDiscount, manufacturerInformation.priceBeforeDiscount) && this.isFreeDelivery == manufacturerInformation.isFreeDelivery && Intrinsics.areEqual(this.parcelType, manufacturerInformation.parcelType) && Intrinsics.areEqual(this.bottleDeposit, manufacturerInformation.bottleDeposit);
    }

    @Nullable
    public final Price getBottleDeposit() {
        return this.bottleDeposit;
    }

    public final int getBoxHeightMM() {
        return this.boxHeightMM;
    }

    public final int getBoxLengthMM() {
        return this.boxLengthMM;
    }

    public final int getBoxWeightGrams() {
        return this.boxWeightGrams;
    }

    public final int getBoxWidthMM() {
        return this.boxWidthMM;
    }

    @Nullable
    public final Brand getBrand() {
        return this.brand;
    }

    @Nullable
    public final String getEstimatedDelivery() {
        return this.estimatedDelivery;
    }

    @Nullable
    public final List<ItemDetailsFaqItem> getFaqList() {
        return this.faqList;
    }

    public final int getItemSurpriseLevel() {
        return this.itemSurpriseLevel;
    }

    @Nullable
    public final Integer getItemsSoldToday() {
        return this.itemsSoldToday;
    }

    @Nullable
    public final String getMinimumExpirationDate() {
        return this.minimumExpirationDate;
    }

    @Nullable
    public final String getParcelType() {
        return this.parcelType;
    }

    @Nullable
    public final Price getPriceBeforeDiscount() {
        return this.priceBeforeDiscount;
    }

    public final int getProductCount() {
        return this.productCount;
    }

    public int hashCode() {
        int iB = k.b(this.boxLengthMM, k.b(this.boxHeightMM, k.b(this.boxWidthMM, Integer.hashCode(this.boxWeightGrams) * 31, 31), 31), 31);
        String str = this.estimatedDelivery;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.minimumExpirationDate;
        int iB2 = k.b(this.itemSurpriseLevel, k.b(this.productCount, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31);
        List<ItemDetailsFaqItem> list = this.faqList;
        int iHashCode2 = (iB2 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.itemsSoldToday;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Brand brand = this.brand;
        int iHashCode4 = (iHashCode3 + (brand == null ? 0 : brand.hashCode())) * 31;
        Price price = this.priceBeforeDiscount;
        int iE = k.e((iHashCode4 + (price == null ? 0 : price.hashCode())) * 31, 31, this.isFreeDelivery);
        String str3 = this.parcelType;
        int iHashCode5 = (iE + (str3 == null ? 0 : str3.hashCode())) * 31;
        Price price2 = this.bottleDeposit;
        return iHashCode5 + (price2 != null ? price2.hashCode() : 0);
    }

    public final boolean isFreeDelivery() {
        return this.isFreeDelivery;
    }

    public final void setBottleDeposit(@Nullable Price price) {
        this.bottleDeposit = price;
    }

    public final void setBoxHeightMM(int i11) {
        this.boxHeightMM = i11;
    }

    public final void setBoxLengthMM(int i11) {
        this.boxLengthMM = i11;
    }

    public final void setBoxWeightGrams(int i11) {
        this.boxWeightGrams = i11;
    }

    public final void setBoxWidthMM(int i11) {
        this.boxWidthMM = i11;
    }

    public final void setBrand(@Nullable Brand brand) {
        this.brand = brand;
    }

    public final void setEstimatedDelivery(@Nullable String str) {
        this.estimatedDelivery = str;
    }

    public final void setFaqList(@Nullable List<ItemDetailsFaqItem> list) {
        this.faqList = list;
    }

    public final void setFreeDelivery(boolean z11) {
        this.isFreeDelivery = z11;
    }

    public final void setItemSurpriseLevel(int i11) {
        this.itemSurpriseLevel = i11;
    }

    public final void setItemsSoldToday(@Nullable Integer num) {
        this.itemsSoldToday = num;
    }

    public final void setMinimumExpirationDate(@Nullable String str) {
        this.minimumExpirationDate = str;
    }

    public final void setParcelType(@Nullable String str) {
        this.parcelType = str;
    }

    public final void setPriceBeforeDiscount(@Nullable Price price) {
        this.priceBeforeDiscount = price;
    }

    public final void setProductCount(int i11) {
        this.productCount = i11;
    }

    @NotNull
    public String toString() {
        int i11 = this.boxWeightGrams;
        int i12 = this.boxWidthMM;
        int i13 = this.boxHeightMM;
        int i14 = this.boxLengthMM;
        String str = this.estimatedDelivery;
        String str2 = this.minimumExpirationDate;
        int i15 = this.productCount;
        int i16 = this.itemSurpriseLevel;
        List<ItemDetailsFaqItem> list = this.faqList;
        Integer num = this.itemsSoldToday;
        Brand brand = this.brand;
        Price price = this.priceBeforeDiscount;
        boolean z11 = this.isFreeDelivery;
        String str3 = this.parcelType;
        Price price2 = this.bottleDeposit;
        StringBuilder sbR = k.r(i11, i12, "ManufacturerInformation(boxWeightGrams=", ", boxWidthMM=", ", boxHeightMM=");
        f.C(sbR, i13, ", boxLengthMM=", i14, ", estimatedDelivery=");
        s.A(sbR, str, ", minimumExpirationDate=", str2, ", productCount=");
        f.C(sbR, i15, ", itemSurpriseLevel=", i16, ", faqList=");
        sbR.append(list);
        sbR.append(", itemsSoldToday=");
        sbR.append(num);
        sbR.append(", brand=");
        sbR.append(brand);
        sbR.append(", priceBeforeDiscount=");
        sbR.append(price);
        sbR.append(", isFreeDelivery=");
        sbR.append(z11);
        sbR.append(", parcelType=");
        sbR.append(str3);
        sbR.append(", bottleDeposit=");
        sbR.append(price2);
        sbR.append(")");
        return sbR.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeInt(this.boxWeightGrams);
        dest.writeInt(this.boxWidthMM);
        dest.writeInt(this.boxHeightMM);
        dest.writeInt(this.boxLengthMM);
        dest.writeString(this.estimatedDelivery);
        dest.writeString(this.minimumExpirationDate);
        dest.writeInt(this.productCount);
        dest.writeInt(this.itemSurpriseLevel);
        List<ItemDetailsFaqItem> list = this.faqList;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = i.q(dest, 1, list);
            while (itQ.hasNext()) {
                ((ItemDetailsFaqItem) itQ.next()).writeToParcel(dest, flags);
            }
        }
        Integer num = this.itemsSoldToday;
        if (num == null) {
            dest.writeInt(0);
        } else {
            i.w(dest, 1, num);
        }
        Brand brand = this.brand;
        if (brand == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            brand.writeToParcel(dest, flags);
        }
        Price price = this.priceBeforeDiscount;
        if (price == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            price.writeToParcel(dest, flags);
        }
        dest.writeInt(this.isFreeDelivery ? 1 : 0);
        dest.writeString(this.parcelType);
        Price price2 = this.bottleDeposit;
        if (price2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            price2.writeToParcel(dest, flags);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/manufacturer/response/ManufacturerInformation$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/manufacturer/response/ManufacturerInformation;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return ManufacturerInformation$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ManufacturerInformation> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ManufacturerInformation createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            int i11 = parcel.readInt();
            int i12 = parcel.readInt();
            int i13 = parcel.readInt();
            int i14 = parcel.readInt();
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i15 = parcel.readInt();
            int i16 = parcel.readInt();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i17 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i17);
                int iC = 0;
                while (iC != i17) {
                    iC = i.c(ItemDetailsFaqItem.CREATOR, parcel, arrayList2, iC, 1);
                }
                arrayList = arrayList2;
            }
            return new ManufacturerInformation(i11, i12, i13, i14, string, string2, i15, i16, arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Brand.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Price.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0 ? Price.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ManufacturerInformation[] newArray(int i11) {
            return new ManufacturerInformation[i11];
        }
    }

    @g("bottle_deposit")
    public static /* synthetic */ void getBottleDeposit$annotations() {
    }

    @g("box_height_mm")
    public static /* synthetic */ void getBoxHeightMM$annotations() {
    }

    @g("box_length_mm")
    public static /* synthetic */ void getBoxLengthMM$annotations() {
    }

    @g("boxWeightGrams")
    public static /* synthetic */ void getBoxWeightGrams$annotations() {
    }

    @g("box_width_mm")
    public static /* synthetic */ void getBoxWidthMM$annotations() {
    }

    @g("brand")
    public static /* synthetic */ void getBrand$annotations() {
    }

    @g("estimated_delivery")
    public static /* synthetic */ void getEstimatedDelivery$annotations() {
    }

    @g("faq_list")
    public static /* synthetic */ void getFaqList$annotations() {
    }

    @g("item_surprise_level")
    public static /* synthetic */ void getItemSurpriseLevel$annotations() {
    }

    @g("items_sold_today")
    public static /* synthetic */ void getItemsSoldToday$annotations() {
    }

    @g("minimum_expiration_date")
    public static /* synthetic */ void getMinimumExpirationDate$annotations() {
    }

    @g("parcel_type")
    public static /* synthetic */ void getParcelType$annotations() {
    }

    @g("price_before_discount")
    public static /* synthetic */ void getPriceBeforeDiscount$annotations() {
    }

    @g("product_count")
    public static /* synthetic */ void getProductCount$annotations() {
    }

    @g("free_delivery")
    public static /* synthetic */ void isFreeDelivery$annotations() {
    }

    public /* synthetic */ ManufacturerInformation(int i11, int i12, int i13, int i14, int i15, String str, String str2, int i16, int i17, List list, Integer num, Brand brand, Price price, boolean z11, String str3, Price price2, m1 m1Var) {
        if ((i11 & 1) == 0) {
            this.boxWeightGrams = 0;
        } else {
            this.boxWeightGrams = i12;
        }
        if ((i11 & 2) == 0) {
            this.boxWidthMM = 0;
        } else {
            this.boxWidthMM = i13;
        }
        if ((i11 & 4) == 0) {
            this.boxHeightMM = 0;
        } else {
            this.boxHeightMM = i14;
        }
        if ((i11 & 8) == 0) {
            this.boxLengthMM = 0;
        } else {
            this.boxLengthMM = i15;
        }
        if ((i11 & 16) == 0) {
            this.estimatedDelivery = null;
        } else {
            this.estimatedDelivery = str;
        }
        if ((i11 & 32) == 0) {
            this.minimumExpirationDate = null;
        } else {
            this.minimumExpirationDate = str2;
        }
        if ((i11 & 64) == 0) {
            this.productCount = 0;
        } else {
            this.productCount = i16;
        }
        if ((i11 & 128) == 0) {
            this.itemSurpriseLevel = 0;
        } else {
            this.itemSurpriseLevel = i17;
        }
        if ((i11 & 256) == 0) {
            this.faqList = null;
        } else {
            this.faqList = list;
        }
        if ((i11 & 512) == 0) {
            this.itemsSoldToday = null;
        } else {
            this.itemsSoldToday = num;
        }
        if ((i11 & 1024) == 0) {
            this.brand = null;
        } else {
            this.brand = brand;
        }
        if ((i11 & NewHope.SENDB_BYTES) == 0) {
            this.priceBeforeDiscount = null;
        } else {
            this.priceBeforeDiscount = price;
        }
        if ((i11 & 4096) == 0) {
            this.isFreeDelivery = false;
        } else {
            this.isFreeDelivery = z11;
        }
        if ((i11 & 8192) == 0) {
            this.parcelType = null;
        } else {
            this.parcelType = str3;
        }
        if ((i11 & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) == 0) {
            this.bottleDeposit = null;
        } else {
            this.bottleDeposit = price2;
        }
    }

    public ManufacturerInformation(int i11, int i12, int i13, int i14, @Nullable String str, @Nullable String str2, int i15, int i16, @Nullable List<ItemDetailsFaqItem> list, @Nullable Integer num, @Nullable Brand brand, @Nullable Price price, boolean z11, @Nullable String str3, @Nullable Price price2) {
        this.boxWeightGrams = i11;
        this.boxWidthMM = i12;
        this.boxHeightMM = i13;
        this.boxLengthMM = i14;
        this.estimatedDelivery = str;
        this.minimumExpirationDate = str2;
        this.productCount = i15;
        this.itemSurpriseLevel = i16;
        this.faqList = list;
        this.itemsSoldToday = num;
        this.brand = brand;
        this.priceBeforeDiscount = price;
        this.isFreeDelivery = z11;
        this.parcelType = str3;
        this.bottleDeposit = price2;
    }

    public ManufacturerInformation() {
        this(0, 0, 0, 0, (String) null, (String) null, 0, 0, (List) null, (Integer) null, (Brand) null, (Price) null, false, (String) null, (Price) null, 32767, (DefaultConstructorMarker) null);
    }
}
