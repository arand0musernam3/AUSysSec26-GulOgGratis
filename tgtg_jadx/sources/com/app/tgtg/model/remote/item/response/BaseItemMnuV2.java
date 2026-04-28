package com.app.tgtg.model.remote.item.response;

import android.os.Parcel;
import android.os.Parcelable;
import b3.i;
import cg.e;
import com.app.tgtg.model.remote.ItemId;
import com.app.tgtg.model.remote.ItemId$$serializer;
import com.app.tgtg.model.remote.item.ItemTagInfo;
import com.app.tgtg.model.remote.item.ItemTagInfo$$serializer;
import com.app.tgtg.model.remote.item.Picture;
import com.app.tgtg.model.remote.item.Picture$$serializer;
import com.app.tgtg.model.remote.manufacturer.response.CateringProperties;
import com.app.tgtg.model.remote.manufacturer.response.CateringProperties$$serializer;
import com.app.tgtg.model.remote.manufacturer.response.ManufacturerItemProperties;
import com.app.tgtg.model.remote.manufacturer.response.ManufacturerItemProperties$$serializer;
import com.app.tgtg.model.remote.payment.Price;
import com.app.tgtg.model.remote.payment.Price$$serializer;
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
import m90.d;
import m90.l0;
import m90.m1;
import m90.r1;
import m90.v;
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
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b!\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b6\b\u0087\b\u0018\u0000 \u0087\u00012\u00020\u0001:\u0004\u0088\u0001\u0087\u0001B·\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eBÇ\u0001\b\u0010\u0012\u0006\u0010\u001f\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u0006\u0010 \u001a\u00020\f\u0012\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b\u001d\u0010#J\r\u0010$\u001a\u00020\f¢\u0006\u0004\b$\u0010%J\u001d\u0010*\u001a\u00020)2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\f¢\u0006\u0004\b*\u0010+J\u0010\u0010.\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010/\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b1\u0010-J\u0012\u00102\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b2\u0010-J\u0012\u00103\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b3\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b5\u00104J\u0010\u00106\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b6\u0010%J\u0012\u00107\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b7\u00108J\u0012\u00109\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b9\u0010:J\u0012\u0010;\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b;\u0010<J\u0018\u0010=\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b=\u0010>J\u0012\u0010?\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b?\u0010-J\u0012\u0010@\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b@\u0010AJ\u0012\u0010B\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bB\u0010-J\u0012\u0010C\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bC\u0010-J\u0012\u0010D\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\bD\u0010EJÐ\u0001\u0010H\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÆ\u0001¢\u0006\u0004\bF\u0010GJ\u0010\u0010I\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\bI\u0010-J\u0010\u0010J\u001a\u00020\fHÖ\u0001¢\u0006\u0004\bJ\u0010%J\u001a\u0010N\u001a\u00020M2\b\u0010L\u001a\u0004\u0018\u00010KHÖ\u0003¢\u0006\u0004\bN\u0010OJ'\u0010W\u001a\u00020)2\u0006\u0010P\u001a\u00020\u00002\u0006\u0010R\u001a\u00020Q2\u0006\u0010T\u001a\u00020SH\u0001¢\u0006\u0004\bU\u0010VR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010X\u0012\u0004\bZ\u0010[\u001a\u0004\bY\u0010-R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\\\u0012\u0004\b^\u0010[\u001a\u0004\b]\u00100R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010X\u0012\u0004\b`\u0010[\u001a\u0004\b_\u0010-R\"\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010X\u0012\u0004\bb\u0010[\u001a\u0004\ba\u0010-R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010c\u0012\u0004\be\u0010[\u001a\u0004\bd\u00104R\"\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010c\u0012\u0004\bg\u0010[\u001a\u0004\bf\u00104R \u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010h\u0012\u0004\bj\u0010[\u001a\u0004\bi\u0010%R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010k\u0012\u0004\bm\u0010[\u001a\u0004\bl\u00108R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010n\u0012\u0004\bp\u0010[\u001a\u0004\bo\u0010:R\"\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010q\u0012\u0004\bs\u0010[\u001a\u0004\br\u0010<R(\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010t\u0012\u0004\bv\u0010[\u001a\u0004\bu\u0010>R\"\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010X\u0012\u0004\bx\u0010[\u001a\u0004\bw\u0010-R\"\u0010\u0018\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010y\u0012\u0004\b{\u0010[\u001a\u0004\bz\u0010AR\"\u0010\u0019\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010X\u0012\u0004\b}\u0010[\u001a\u0004\b|\u0010-R\"\u0010\u001a\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010X\u0012\u0004\b\u007f\u0010[\u001a\u0004\b~\u0010-R%\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u001c\u0010\u0080\u0001\u0012\u0005\b\u0082\u0001\u0010[\u001a\u0005\b\u0081\u0001\u0010ER,\u0010 \u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u001c\n\u0004\b \u0010h\u0012\u0005\b\u0086\u0001\u0010[\u001a\u0005\b\u0083\u0001\u0010%\"\u0006\b\u0084\u0001\u0010\u0085\u0001¨\u0006\u0089\u0001"}, d2 = {"Lcom/app/tgtg/model/remote/item/response/BaseItemMnuV2;", "Landroid/os/Parcelable;", "Lcom/app/tgtg/model/remote/ItemId;", "itemId", "Lcom/app/tgtg/model/remote/item/response/ItemType;", "itemType", "", "itemName", "subtitle", "Lcom/app/tgtg/model/remote/payment/Price;", "itemPrice", "itemValue", "", "availableStock", "Lcom/app/tgtg/model/remote/item/Picture;", "coverPicture", "Lcom/app/tgtg/model/remote/manufacturer/response/ManufacturerItemProperties;", "manufacturerItemProperties", "Lcom/app/tgtg/model/remote/manufacturer/response/CateringProperties;", "cateringProperties", "", "Lcom/app/tgtg/model/remote/item/ItemTagInfo;", "tags", "storeName", "itemCount", "contextLabel", "discountLabel", "", "averageOverallRating", "<init>", "(Ljava/lang/String;Lcom/app/tgtg/model/remote/item/response/ItemType;Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/payment/Price;Lcom/app/tgtg/model/remote/payment/Price;ILcom/app/tgtg/model/remote/item/Picture;Lcom/app/tgtg/model/remote/manufacturer/response/ManufacturerItemProperties;Lcom/app/tgtg/model/remote/manufacturer/response/CateringProperties;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "seen0", "currentQuantity", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/app/tgtg/model/remote/item/response/ItemType;Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/payment/Price;Lcom/app/tgtg/model/remote/payment/Price;ILcom/app/tgtg/model/remote/item/Picture;Lcom/app/tgtg/model/remote/manufacturer/response/ManufacturerItemProperties;Lcom/app/tgtg/model/remote/manufacturer/response/CateringProperties;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;ILm90/m1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1-FvU5WIY", "()Ljava/lang/String;", "component1", "component2", "()Lcom/app/tgtg/model/remote/item/response/ItemType;", "component3", "component4", "component5", "()Lcom/app/tgtg/model/remote/payment/Price;", "component6", "component7", "component8", "()Lcom/app/tgtg/model/remote/item/Picture;", "component9", "()Lcom/app/tgtg/model/remote/manufacturer/response/ManufacturerItemProperties;", "component10", "()Lcom/app/tgtg/model/remote/manufacturer/response/CateringProperties;", "component11", "()Ljava/util/List;", "component12", "component13", "()Ljava/lang/Integer;", "component14", "component15", "component16", "()Ljava/lang/Double;", "copy-ZDwVLKM", "(Ljava/lang/String;Lcom/app/tgtg/model/remote/item/response/ItemType;Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/payment/Price;Lcom/app/tgtg/model/remote/payment/Price;ILcom/app/tgtg/model/remote/item/Picture;Lcom/app/tgtg/model/remote/manufacturer/response/ManufacturerItemProperties;Lcom/app/tgtg/model/remote/manufacturer/response/CateringProperties;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)Lcom/app/tgtg/model/remote/item/response/BaseItemMnuV2;", "copy", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "write$Self$app", "(Lcom/app/tgtg/model/remote/item/response/BaseItemMnuV2;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getItemId-FvU5WIY", "getItemId-FvU5WIY$annotations", "()V", "Lcom/app/tgtg/model/remote/item/response/ItemType;", "getItemType", "getItemType$annotations", "getItemName", "getItemName$annotations", "getSubtitle", "getSubtitle$annotations", "Lcom/app/tgtg/model/remote/payment/Price;", "getItemPrice", "getItemPrice$annotations", "getItemValue", "getItemValue$annotations", "I", "getAvailableStock", "getAvailableStock$annotations", "Lcom/app/tgtg/model/remote/item/Picture;", "getCoverPicture", "getCoverPicture$annotations", "Lcom/app/tgtg/model/remote/manufacturer/response/ManufacturerItemProperties;", "getManufacturerItemProperties", "getManufacturerItemProperties$annotations", "Lcom/app/tgtg/model/remote/manufacturer/response/CateringProperties;", "getCateringProperties", "getCateringProperties$annotations", "Ljava/util/List;", "getTags", "getTags$annotations", "getStoreName", "getStoreName$annotations", "Ljava/lang/Integer;", "getItemCount", "getItemCount$annotations", "getContextLabel", "getContextLabel$annotations", "getDiscountLabel", "getDiscountLabel$annotations", "Ljava/lang/Double;", "getAverageOverallRating", "getAverageOverallRating$annotations", "getCurrentQuantity", "setCurrentQuantity", "(I)V", "getCurrentQuantity$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class BaseItemMnuV2 implements Parcelable {
    private final int availableStock;

    @Nullable
    private final Double averageOverallRating;

    @Nullable
    private final CateringProperties cateringProperties;

    @Nullable
    private final String contextLabel;

    @Nullable
    private final Picture coverPicture;
    private int currentQuantity;

    @Nullable
    private final String discountLabel;

    @Nullable
    private final Integer itemCount;

    @NotNull
    private final String itemId;

    @Nullable
    private final String itemName;

    @Nullable
    private final Price itemPrice;

    @NotNull
    private final ItemType itemType;

    @Nullable
    private final Price itemValue;

    @Nullable
    private final ManufacturerItemProperties manufacturerItemProperties;

    @Nullable
    private final String storeName;

    @Nullable
    private final String subtitle;

    @Nullable
    private final List<ItemTagInfo> tags;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<BaseItemMnuV2> CREATOR = new Creator();

    @NotNull
    private static final j[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, l.a(m.PUBLICATION, new e(11)), null, null, null, null, null, null};

    private /* synthetic */ BaseItemMnuV2(int i11, String str, ItemType itemType, String str2, String str3, Price price, Price price2, int i12, Picture picture, ManufacturerItemProperties manufacturerItemProperties, CateringProperties cateringProperties, List list, String str4, Integer num, String str5, String str6, Double d3, int i13, m1 m1Var) {
        if (255 != (i11 & 255)) {
            c1.j(i11, 255, BaseItemMnuV2$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.itemId = str;
        this.itemType = itemType;
        this.itemName = str2;
        this.subtitle = str3;
        this.itemPrice = price;
        this.itemValue = price2;
        this.availableStock = i12;
        this.coverPicture = picture;
        if ((i11 & 256) == 0) {
            this.manufacturerItemProperties = null;
        } else {
            this.manufacturerItemProperties = manufacturerItemProperties;
        }
        if ((i11 & 512) == 0) {
            this.cateringProperties = null;
        } else {
            this.cateringProperties = cateringProperties;
        }
        if ((i11 & 1024) == 0) {
            this.tags = null;
        } else {
            this.tags = list;
        }
        if ((i11 & NewHope.SENDB_BYTES) == 0) {
            this.storeName = null;
        } else {
            this.storeName = str4;
        }
        if ((i11 & 4096) == 0) {
            this.itemCount = null;
        } else {
            this.itemCount = num;
        }
        if ((i11 & 8192) == 0) {
            this.contextLabel = null;
        } else {
            this.contextLabel = str5;
        }
        if ((i11 & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) == 0) {
            this.discountLabel = null;
        } else {
            this.discountLabel = str6;
        }
        if ((32768 & i11) == 0) {
            this.averageOverallRating = null;
        } else {
            this.averageOverallRating = d3;
        }
        this.currentQuantity = (i11 & 65536) == 0 ? 0 : i13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(ItemTagInfo$$serializer.INSTANCE, 0);
    }

    public static final /* synthetic */ void write$Self$app(BaseItemMnuV2 self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        output.i(serialDesc, 0, ItemId$$serializer.INSTANCE, ItemId.m197boximpl(self.itemId));
        output.i(serialDesc, 1, ItemTypeSerializer.INSTANCE, self.itemType);
        r1 r1Var = r1.f29848a;
        output.r(serialDesc, 2, r1Var, self.itemName);
        output.r(serialDesc, 3, r1Var, self.subtitle);
        Price$$serializer price$$serializer = Price$$serializer.INSTANCE;
        output.r(serialDesc, 4, price$$serializer, self.itemPrice);
        output.r(serialDesc, 5, price$$serializer, self.itemValue);
        output.m(6, self.availableStock, serialDesc);
        output.r(serialDesc, 7, Picture$$serializer.INSTANCE, self.coverPicture);
        if (output.C(serialDesc) || self.manufacturerItemProperties != null) {
            output.r(serialDesc, 8, ManufacturerItemProperties$$serializer.INSTANCE, self.manufacturerItemProperties);
        }
        if (output.C(serialDesc) || self.cateringProperties != null) {
            output.r(serialDesc, 9, CateringProperties$$serializer.INSTANCE, self.cateringProperties);
        }
        if (output.C(serialDesc) || self.tags != null) {
            output.r(serialDesc, 10, (KSerializer) jVarArr[10].getValue(), self.tags);
        }
        if (output.C(serialDesc) || self.storeName != null) {
            output.r(serialDesc, 11, r1Var, self.storeName);
        }
        if (output.C(serialDesc) || self.itemCount != null) {
            output.r(serialDesc, 12, l0.f29821a, self.itemCount);
        }
        if (output.C(serialDesc) || self.contextLabel != null) {
            output.r(serialDesc, 13, r1Var, self.contextLabel);
        }
        if (output.C(serialDesc) || self.discountLabel != null) {
            output.r(serialDesc, 14, r1Var, self.discountLabel);
        }
        if (output.C(serialDesc) || self.averageOverallRating != null) {
            output.r(serialDesc, 15, v.f29868a, self.averageOverallRating);
        }
        if (!output.C(serialDesc) && self.currentQuantity == 0) {
            return;
        }
        output.m(16, self.currentQuantity, serialDesc);
    }

    @NotNull
    /* JADX INFO: renamed from: component1-FvU5WIY, reason: not valid java name and from getter */
    public final String getItemId() {
        return this.itemId;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final CateringProperties getCateringProperties() {
        return this.cateringProperties;
    }

    @Nullable
    public final List<ItemTagInfo> component11() {
        return this.tags;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getStoreName() {
        return this.storeName;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Integer getItemCount() {
        return this.itemCount;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getContextLabel() {
        return this.contextLabel;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getDiscountLabel() {
        return this.discountLabel;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Double getAverageOverallRating() {
        return this.averageOverallRating;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ItemType getItemType() {
        return this.itemType;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getItemName() {
        return this.itemName;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Price getItemPrice() {
        return this.itemPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Price getItemValue() {
        return this.itemValue;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getAvailableStock() {
        return this.availableStock;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Picture getCoverPicture() {
        return this.coverPicture;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final ManufacturerItemProperties getManufacturerItemProperties() {
        return this.manufacturerItemProperties;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-ZDwVLKM, reason: not valid java name */
    public final BaseItemMnuV2 m392copyZDwVLKM(@NotNull String itemId, @NotNull ItemType itemType, @Nullable String itemName, @Nullable String subtitle, @Nullable Price itemPrice, @Nullable Price itemValue, int availableStock, @Nullable Picture coverPicture, @Nullable ManufacturerItemProperties manufacturerItemProperties, @Nullable CateringProperties cateringProperties, @Nullable List<ItemTagInfo> tags, @Nullable String storeName, @Nullable Integer itemCount, @Nullable String contextLabel, @Nullable String discountLabel, @Nullable Double averageOverallRating) {
        itemId.getClass();
        itemType.getClass();
        return new BaseItemMnuV2(itemId, itemType, itemName, subtitle, itemPrice, itemValue, availableStock, coverPicture, manufacturerItemProperties, cateringProperties, tags, storeName, itemCount, contextLabel, discountLabel, averageOverallRating, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BaseItemMnuV2)) {
            return false;
        }
        BaseItemMnuV2 baseItemMnuV2 = (BaseItemMnuV2) other;
        return ItemId.m201equalsimpl0(this.itemId, baseItemMnuV2.itemId) && this.itemType == baseItemMnuV2.itemType && Intrinsics.areEqual(this.itemName, baseItemMnuV2.itemName) && Intrinsics.areEqual(this.subtitle, baseItemMnuV2.subtitle) && Intrinsics.areEqual(this.itemPrice, baseItemMnuV2.itemPrice) && Intrinsics.areEqual(this.itemValue, baseItemMnuV2.itemValue) && this.availableStock == baseItemMnuV2.availableStock && Intrinsics.areEqual(this.coverPicture, baseItemMnuV2.coverPicture) && Intrinsics.areEqual(this.manufacturerItemProperties, baseItemMnuV2.manufacturerItemProperties) && Intrinsics.areEqual(this.cateringProperties, baseItemMnuV2.cateringProperties) && Intrinsics.areEqual(this.tags, baseItemMnuV2.tags) && Intrinsics.areEqual(this.storeName, baseItemMnuV2.storeName) && Intrinsics.areEqual(this.itemCount, baseItemMnuV2.itemCount) && Intrinsics.areEqual(this.contextLabel, baseItemMnuV2.contextLabel) && Intrinsics.areEqual(this.discountLabel, baseItemMnuV2.discountLabel) && Intrinsics.areEqual((Object) this.averageOverallRating, (Object) baseItemMnuV2.averageOverallRating);
    }

    public final int getAvailableStock() {
        return this.availableStock;
    }

    @Nullable
    public final Double getAverageOverallRating() {
        return this.averageOverallRating;
    }

    @Nullable
    public final CateringProperties getCateringProperties() {
        return this.cateringProperties;
    }

    @Nullable
    public final String getContextLabel() {
        return this.contextLabel;
    }

    @Nullable
    public final Picture getCoverPicture() {
        return this.coverPicture;
    }

    public final int getCurrentQuantity() {
        return this.currentQuantity;
    }

    @Nullable
    public final String getDiscountLabel() {
        return this.discountLabel;
    }

    @Nullable
    public final Integer getItemCount() {
        return this.itemCount;
    }

    @NotNull
    /* JADX INFO: renamed from: getItemId-FvU5WIY, reason: not valid java name */
    public final String m393getItemIdFvU5WIY() {
        return this.itemId;
    }

    @Nullable
    public final String getItemName() {
        return this.itemName;
    }

    @Nullable
    public final Price getItemPrice() {
        return this.itemPrice;
    }

    @NotNull
    public final ItemType getItemType() {
        return this.itemType;
    }

    @Nullable
    public final Price getItemValue() {
        return this.itemValue;
    }

    @Nullable
    public final ManufacturerItemProperties getManufacturerItemProperties() {
        return this.manufacturerItemProperties;
    }

    @Nullable
    public final String getStoreName() {
        return this.storeName;
    }

    @Nullable
    public final String getSubtitle() {
        return this.subtitle;
    }

    @Nullable
    public final List<ItemTagInfo> getTags() {
        return this.tags;
    }

    public int hashCode() {
        int iHashCode = (this.itemType.hashCode() + (ItemId.m202hashCodeimpl(this.itemId) * 31)) * 31;
        String str = this.itemName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subtitle;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Price price = this.itemPrice;
        int iHashCode4 = (iHashCode3 + (price == null ? 0 : price.hashCode())) * 31;
        Price price2 = this.itemValue;
        int iB = k.b(this.availableStock, (iHashCode4 + (price2 == null ? 0 : price2.hashCode())) * 31, 31);
        Picture picture = this.coverPicture;
        int iHashCode5 = (iB + (picture == null ? 0 : picture.hashCode())) * 31;
        ManufacturerItemProperties manufacturerItemProperties = this.manufacturerItemProperties;
        int iHashCode6 = (iHashCode5 + (manufacturerItemProperties == null ? 0 : manufacturerItemProperties.hashCode())) * 31;
        CateringProperties cateringProperties = this.cateringProperties;
        int iHashCode7 = (iHashCode6 + (cateringProperties == null ? 0 : cateringProperties.hashCode())) * 31;
        List<ItemTagInfo> list = this.tags;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.storeName;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.itemCount;
        int iHashCode10 = (iHashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.contextLabel;
        int iHashCode11 = (iHashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.discountLabel;
        int iHashCode12 = (iHashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Double d3 = this.averageOverallRating;
        return iHashCode12 + (d3 != null ? d3.hashCode() : 0);
    }

    public final void setCurrentQuantity(int i11) {
        this.currentQuantity = i11;
    }

    @NotNull
    public String toString() {
        String strM203toStringimpl = ItemId.m203toStringimpl(this.itemId);
        ItemType itemType = this.itemType;
        String str = this.itemName;
        String str2 = this.subtitle;
        Price price = this.itemPrice;
        Price price2 = this.itemValue;
        int i11 = this.availableStock;
        Picture picture = this.coverPicture;
        ManufacturerItemProperties manufacturerItemProperties = this.manufacturerItemProperties;
        CateringProperties cateringProperties = this.cateringProperties;
        List<ItemTagInfo> list = this.tags;
        String str3 = this.storeName;
        Integer num = this.itemCount;
        String str4 = this.contextLabel;
        String str5 = this.discountLabel;
        Double d3 = this.averageOverallRating;
        StringBuilder sb2 = new StringBuilder("BaseItemMnuV2(itemId=");
        sb2.append(strM203toStringimpl);
        sb2.append(", itemType=");
        sb2.append(itemType);
        sb2.append(", itemName=");
        s.A(sb2, str, ", subtitle=", str2, ", itemPrice=");
        sb2.append(price);
        sb2.append(", itemValue=");
        sb2.append(price2);
        sb2.append(", availableStock=");
        sb2.append(i11);
        sb2.append(", coverPicture=");
        sb2.append(picture);
        sb2.append(", manufacturerItemProperties=");
        sb2.append(manufacturerItemProperties);
        sb2.append(", cateringProperties=");
        sb2.append(cateringProperties);
        sb2.append(", tags=");
        sb2.append(list);
        sb2.append(", storeName=");
        sb2.append(str3);
        sb2.append(", itemCount=");
        sb2.append(num);
        sb2.append(", contextLabel=");
        sb2.append(str4);
        sb2.append(", discountLabel=");
        sb2.append(str5);
        sb2.append(", averageOverallRating=");
        sb2.append(d3);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        ItemId.m204writeToParcelimpl(this.itemId, dest, flags);
        dest.writeString(this.itemType.name());
        dest.writeString(this.itemName);
        dest.writeString(this.subtitle);
        Price price = this.itemPrice;
        if (price == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            price.writeToParcel(dest, flags);
        }
        Price price2 = this.itemValue;
        if (price2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            price2.writeToParcel(dest, flags);
        }
        dest.writeInt(this.availableStock);
        Picture picture = this.coverPicture;
        if (picture == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            picture.writeToParcel(dest, flags);
        }
        ManufacturerItemProperties manufacturerItemProperties = this.manufacturerItemProperties;
        if (manufacturerItemProperties == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            manufacturerItemProperties.writeToParcel(dest, flags);
        }
        CateringProperties cateringProperties = this.cateringProperties;
        if (cateringProperties == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            cateringProperties.writeToParcel(dest, flags);
        }
        List<ItemTagInfo> list = this.tags;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = i.q(dest, 1, list);
            while (itQ.hasNext()) {
                ((ItemTagInfo) itQ.next()).writeToParcel(dest, flags);
            }
        }
        dest.writeString(this.storeName);
        Integer num = this.itemCount;
        if (num == null) {
            dest.writeInt(0);
        } else {
            i.w(dest, 1, num);
        }
        dest.writeString(this.contextLabel);
        dest.writeString(this.discountLabel);
        Double d3 = this.averageOverallRating;
        if (d3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d3.doubleValue());
        }
    }

    public /* synthetic */ BaseItemMnuV2(String str, ItemType itemType, String str2, String str3, Price price, Price price2, int i11, Picture picture, ManufacturerItemProperties manufacturerItemProperties, CateringProperties cateringProperties, List list, String str4, Integer num, String str5, String str6, Double d3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, itemType, str2, str3, price, price2, i11, picture, manufacturerItemProperties, cateringProperties, list, str4, num, str5, str6, d3);
    }

    public /* synthetic */ BaseItemMnuV2(int i11, String str, ItemType itemType, String str2, String str3, Price price, Price price2, int i12, Picture picture, ManufacturerItemProperties manufacturerItemProperties, CateringProperties cateringProperties, List list, String str4, Integer num, String str5, String str6, Double d3, int i13, m1 m1Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, str, itemType, str2, str3, price, price2, i12, picture, manufacturerItemProperties, cateringProperties, list, str4, num, str5, str6, d3, i13, m1Var);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/item/response/BaseItemMnuV2$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/item/response/BaseItemMnuV2;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return BaseItemMnuV2$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    private BaseItemMnuV2(String str, ItemType itemType, String str2, String str3, Price price, Price price2, int i11, Picture picture, ManufacturerItemProperties manufacturerItemProperties, CateringProperties cateringProperties, List<ItemTagInfo> list, String str4, Integer num, String str5, String str6, Double d3) {
        str.getClass();
        itemType.getClass();
        this.itemId = str;
        this.itemType = itemType;
        this.itemName = str2;
        this.subtitle = str3;
        this.itemPrice = price;
        this.itemValue = price2;
        this.availableStock = i11;
        this.coverPicture = picture;
        this.manufacturerItemProperties = manufacturerItemProperties;
        this.cateringProperties = cateringProperties;
        this.tags = list;
        this.storeName = str4;
        this.itemCount = num;
        this.contextLabel = str5;
        this.discountLabel = str6;
        this.averageOverallRating = d3;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BaseItemMnuV2> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BaseItemMnuV2 createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            String strM205unboximpl = ItemId.CREATOR.createFromParcel(parcel).m205unboximpl();
            ItemType itemTypeValueOf = ItemType.valueOf(parcel.readString());
            String string = parcel.readString();
            String string2 = parcel.readString();
            Price priceCreateFromParcel = parcel.readInt() == 0 ? null : Price.CREATOR.createFromParcel(parcel);
            Price priceCreateFromParcel2 = parcel.readInt() == 0 ? null : Price.CREATOR.createFromParcel(parcel);
            int i11 = parcel.readInt();
            Picture pictureCreateFromParcel = parcel.readInt() == 0 ? null : Picture.CREATOR.createFromParcel(parcel);
            ManufacturerItemProperties manufacturerItemPropertiesCreateFromParcel = parcel.readInt() == 0 ? null : ManufacturerItemProperties.CREATOR.createFromParcel(parcel);
            CateringProperties cateringPropertiesCreateFromParcel = parcel.readInt() == 0 ? null : CateringProperties.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC = 0;
                while (iC != i12) {
                    iC = i.c(ItemTagInfo.CREATOR, parcel, arrayList, iC, 1);
                }
            }
            return new BaseItemMnuV2(strM205unboximpl, itemTypeValueOf, string, string2, priceCreateFromParcel, priceCreateFromParcel2, i11, pictureCreateFromParcel, manufacturerItemPropertiesCreateFromParcel, cateringPropertiesCreateFromParcel, arrayList, parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BaseItemMnuV2[] newArray(int i11) {
            return new BaseItemMnuV2[i11];
        }
    }

    @g("available_stock")
    public static /* synthetic */ void getAvailableStock$annotations() {
    }

    @g("average_overall_rating")
    public static /* synthetic */ void getAverageOverallRating$annotations() {
    }

    @g("catering_properties")
    public static /* synthetic */ void getCateringProperties$annotations() {
    }

    @g("context_label")
    public static /* synthetic */ void getContextLabel$annotations() {
    }

    @g("cover_picture")
    public static /* synthetic */ void getCoverPicture$annotations() {
    }

    public static /* synthetic */ void getCurrentQuantity$annotations() {
    }

    @g("discount_label")
    public static /* synthetic */ void getDiscountLabel$annotations() {
    }

    @g("item_count")
    public static /* synthetic */ void getItemCount$annotations() {
    }

    @g("item_id")
    /* JADX INFO: renamed from: getItemId-FvU5WIY$annotations, reason: not valid java name */
    public static /* synthetic */ void m390getItemIdFvU5WIY$annotations() {
    }

    @g("name")
    public static /* synthetic */ void getItemName$annotations() {
    }

    @g("item_price")
    public static /* synthetic */ void getItemPrice$annotations() {
    }

    @g("item_type")
    public static /* synthetic */ void getItemType$annotations() {
    }

    @g("item_value")
    public static /* synthetic */ void getItemValue$annotations() {
    }

    @g("manufacturer_properties")
    public static /* synthetic */ void getManufacturerItemProperties$annotations() {
    }

    @g("store_name")
    public static /* synthetic */ void getStoreName$annotations() {
    }

    @g("subtitle")
    public static /* synthetic */ void getSubtitle$annotations() {
    }

    @g("tags")
    public static /* synthetic */ void getTags$annotations() {
    }

    public /* synthetic */ BaseItemMnuV2(String str, ItemType itemType, String str2, String str3, Price price, Price price2, int i11, Picture picture, ManufacturerItemProperties manufacturerItemProperties, CateringProperties cateringProperties, List list, String str4, Integer num, String str5, String str6, Double d3, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, itemType, str2, str3, price, price2, i11, picture, (i12 & 256) != 0 ? null : manufacturerItemProperties, (i12 & 512) != 0 ? null : cateringProperties, (i12 & 1024) != 0 ? null : list, (i12 & NewHope.SENDB_BYTES) != 0 ? null : str4, (i12 & 4096) != 0 ? null : num, (i12 & 8192) != 0 ? null : str5, (i12 & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) != 0 ? null : str6, (i12 & 32768) != 0 ? null : d3, null);
    }
}
