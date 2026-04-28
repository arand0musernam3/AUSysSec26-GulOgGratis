package com.app.tgtg.model.remote.item;

import android.os.Parcel;
import android.os.Parcelable;
import com.app.tgtg.model.remote.ItemId;
import com.app.tgtg.model.remote.ItemId$$serializer;
import com.app.tgtg.model.remote.item.response.AllergensInfo;
import com.app.tgtg.model.remote.item.response.AllergensInfo$$serializer;
import com.app.tgtg.model.remote.item.response.PackagingOptions;
import com.app.tgtg.model.remote.payment.Price;
import com.app.tgtg.model.remote.payment.Price$$serializer;
import com.braze.ui.inappmessage.views.a;
import i90.g;
import i90.h;
import j4.s;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.n0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.d;
import m90.m1;
import m90.r1;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.j;
import u70.l;
import u70.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b7\b\u0087\b\u0018\u0000 \u008f\u00012\u00020\u00012\u00020\u0002:\u0004\u0090\u0001\u008f\u0001Bå\u0001\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"Bã\u0001\b\u0010\u0012\u0006\u0010$\u001a\u00020#\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0010\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\b\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b!\u0010'J\u001a\u0010*\u001a\u00020\u001f2\b\u0010)\u001a\u0004\u0018\u00010(H\u0096\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020#H\u0016¢\u0006\u0004\b,\u0010-J\r\u0010.\u001a\u00020#¢\u0006\u0004\b.\u0010-J\u001d\u00103\u001a\u0002022\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020#¢\u0006\u0004\b3\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b5\u00106J\u0012\u00107\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b7\u00108J\u0012\u00109\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b9\u00108J\u0010\u0010;\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b:\u00108J\u0010\u0010<\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b<\u0010=J\u0012\u0010>\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b>\u0010=J\u0012\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b?\u00106J\u0010\u0010@\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b@\u0010AJ\u0016\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010HÆ\u0003¢\u0006\u0004\bB\u0010CJ\u0010\u0010D\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\bD\u0010EJ\u0018\u0010F\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\bF\u0010CJ\u0012\u0010G\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\bG\u0010HJ\u0012\u0010I\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\bI\u0010JJ\u0012\u0010K\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\bK\u0010LJ\u0012\u0010M\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\bM\u0010=J\u0012\u0010N\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\bN\u00108J\u0012\u0010O\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\bO\u00108J\u0012\u0010P\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\bP\u00108J\u0010\u0010Q\u001a\u00020\u001fHÆ\u0003¢\u0006\u0004\bQ\u0010RJô\u0001\u0010U\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00102\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010 \u001a\u00020\u001fHÆ\u0001¢\u0006\u0004\bS\u0010TJ\u0010\u0010V\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\bV\u00108J'\u0010^\u001a\u0002022\u0006\u0010W\u001a\u00020\u00002\u0006\u0010Y\u001a\u00020X2\u0006\u0010[\u001a\u00020ZH\u0001¢\u0006\u0004\b\\\u0010]R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010_\u0012\u0004\ba\u0010b\u001a\u0004\b`\u00106R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010c\u0012\u0004\be\u0010b\u001a\u0004\bd\u00108R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010c\u0012\u0004\bg\u0010b\u001a\u0004\bf\u00108R \u0010\t\u001a\u00020\b8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\t\u0010c\u0012\u0004\bi\u0010b\u001a\u0004\bh\u00108R \u0010\u000b\u001a\u00020\n8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010j\u0012\u0004\bl\u0010b\u001a\u0004\bk\u0010=R\"\u0010\f\u001a\u0004\u0018\u00010\n8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\f\u0010j\u0012\u0004\bn\u0010b\u001a\u0004\bm\u0010=R\"\u0010\r\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\r\u0010_\u0012\u0004\bp\u0010b\u001a\u0004\bo\u00106R \u0010\u000f\u001a\u00020\u000e8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010q\u0012\u0004\bs\u0010b\u001a\u0004\br\u0010AR&\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00108\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010t\u0012\u0004\bv\u0010b\u001a\u0004\bu\u0010CR \u0010\u0013\u001a\u00020\u00128\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010w\u0012\u0004\by\u0010b\u001a\u0004\bx\u0010ER(\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00108\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010t\u0012\u0004\b{\u0010b\u001a\u0004\bz\u0010CR\"\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010|\u0012\u0004\b~\u0010b\u001a\u0004\b}\u0010HR$\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0016X\u0097\u0004¢\u0006\u0014\n\u0004\b\u0018\u0010\u007f\u0012\u0005\b\u0081\u0001\u0010b\u001a\u0005\b\u0080\u0001\u0010JR%\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0016X\u0097\u0004¢\u0006\u0015\n\u0005\b\u001a\u0010\u0082\u0001\u0012\u0005\b\u0084\u0001\u0010b\u001a\u0005\b\u0083\u0001\u0010LR$\u0010\u001b\u001a\u0004\u0018\u00010\n8\u0016X\u0097\u0004¢\u0006\u0014\n\u0004\b\u001b\u0010j\u0012\u0005\b\u0086\u0001\u0010b\u001a\u0005\b\u0085\u0001\u0010=R$\u0010\u001c\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\u0014\n\u0004\b\u001c\u0010c\u0012\u0005\b\u0088\u0001\u0010b\u001a\u0005\b\u0087\u0001\u00108R$\u0010\u001d\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\u0014\n\u0004\b\u001d\u0010c\u0012\u0005\b\u008a\u0001\u0010b\u001a\u0005\b\u0089\u0001\u00108R$\u0010\u001e\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\u0014\n\u0004\b\u001e\u0010c\u0012\u0005\b\u008c\u0001\u0010b\u001a\u0005\b\u008b\u0001\u00108R\"\u0010 \u001a\u00020\u001f8\u0016X\u0097\u0004¢\u0006\u0014\n\u0005\b \u0010\u008d\u0001\u0012\u0005\b\u008e\u0001\u0010b\u001a\u0004\b \u0010R¨\u0006\u0091\u0001"}, d2 = {"Lcom/app/tgtg/model/remote/item/FlashSalesItemInformation;", "Landroid/os/Parcelable;", "Lcom/app/tgtg/model/remote/item/BasicItemInformation;", "Lcom/app/tgtg/model/remote/item/Picture;", "coverPicture_", "", "name", "description", "Lcom/app/tgtg/model/remote/ItemId;", "itemId", "Lcom/app/tgtg/model/remote/payment/Price;", "itemPrice", "itemValue", "logoPicture_", "Lcom/app/tgtg/model/remote/item/ItemCategory;", "itemCategory", "", "dietCategories", "Lcom/app/tgtg/model/remote/item/response/PackagingOptions;", "packagingOption", "positiveRatingReasons", "Lcom/app/tgtg/model/remote/item/AverageItemRating;", "averageItemRating", "Lcom/app/tgtg/model/remote/item/response/AllergensInfo;", "allergensInfo", "Lcom/app/tgtg/model/remote/item/DynamicPriceInfo;", "dynamicPriceInfo", "soldOutAtDynamicItemPrice", "descriptionTranslated", "collectionInfo", "smileyReportLink", "", "isEdible", "<init>", "(Lcom/app/tgtg/model/remote/item/Picture;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/payment/Price;Lcom/app/tgtg/model/remote/payment/Price;Lcom/app/tgtg/model/remote/item/Picture;Lcom/app/tgtg/model/remote/item/ItemCategory;Ljava/util/List;Lcom/app/tgtg/model/remote/item/response/PackagingOptions;Ljava/util/List;Lcom/app/tgtg/model/remote/item/AverageItemRating;Lcom/app/tgtg/model/remote/item/response/AllergensInfo;Lcom/app/tgtg/model/remote/item/DynamicPriceInfo;Lcom/app/tgtg/model/remote/payment/Price;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILcom/app/tgtg/model/remote/item/Picture;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/payment/Price;Lcom/app/tgtg/model/remote/payment/Price;Lcom/app/tgtg/model/remote/item/Picture;Lcom/app/tgtg/model/remote/item/ItemCategory;Ljava/util/List;Lcom/app/tgtg/model/remote/item/response/PackagingOptions;Ljava/util/List;Lcom/app/tgtg/model/remote/item/AverageItemRating;Lcom/app/tgtg/model/remote/item/response/AllergensInfo;Lcom/app/tgtg/model/remote/item/DynamicPriceInfo;Lcom/app/tgtg/model/remote/payment/Price;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLm90/m1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "describeContents", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/app/tgtg/model/remote/item/Picture;", "component2", "()Ljava/lang/String;", "component3", "component4-FvU5WIY", "component4", "component5", "()Lcom/app/tgtg/model/remote/payment/Price;", "component6", "component7", "component8", "()Lcom/app/tgtg/model/remote/item/ItemCategory;", "component9", "()Ljava/util/List;", "component10", "()Lcom/app/tgtg/model/remote/item/response/PackagingOptions;", "component11", "component12", "()Lcom/app/tgtg/model/remote/item/AverageItemRating;", "component13", "()Lcom/app/tgtg/model/remote/item/response/AllergensInfo;", "component14", "()Lcom/app/tgtg/model/remote/item/DynamicPriceInfo;", "component15", "component16", "component17", "component18", "component19", "()Z", "copy-FppsJRw", "(Lcom/app/tgtg/model/remote/item/Picture;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/payment/Price;Lcom/app/tgtg/model/remote/payment/Price;Lcom/app/tgtg/model/remote/item/Picture;Lcom/app/tgtg/model/remote/item/ItemCategory;Ljava/util/List;Lcom/app/tgtg/model/remote/item/response/PackagingOptions;Ljava/util/List;Lcom/app/tgtg/model/remote/item/AverageItemRating;Lcom/app/tgtg/model/remote/item/response/AllergensInfo;Lcom/app/tgtg/model/remote/item/DynamicPriceInfo;Lcom/app/tgtg/model/remote/payment/Price;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/app/tgtg/model/remote/item/FlashSalesItemInformation;", "copy", "toString", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "write$Self$app", "(Lcom/app/tgtg/model/remote/item/FlashSalesItemInformation;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/app/tgtg/model/remote/item/Picture;", "getCoverPicture_", "getCoverPicture_$annotations", "()V", "Ljava/lang/String;", "getName", "getName$annotations", "getDescription", "getDescription$annotations", "getItemId-FvU5WIY", "getItemId-FvU5WIY$annotations", "Lcom/app/tgtg/model/remote/payment/Price;", "getItemPrice", "getItemPrice$annotations", "getItemValue", "getItemValue$annotations", "getLogoPicture_", "getLogoPicture_$annotations", "Lcom/app/tgtg/model/remote/item/ItemCategory;", "getItemCategory", "getItemCategory$annotations", "Ljava/util/List;", "getDietCategories", "getDietCategories$annotations", "Lcom/app/tgtg/model/remote/item/response/PackagingOptions;", "getPackagingOption", "getPackagingOption$annotations", "getPositiveRatingReasons", "getPositiveRatingReasons$annotations", "Lcom/app/tgtg/model/remote/item/AverageItemRating;", "getAverageItemRating", "getAverageItemRating$annotations", "Lcom/app/tgtg/model/remote/item/response/AllergensInfo;", "getAllergensInfo", "getAllergensInfo$annotations", "Lcom/app/tgtg/model/remote/item/DynamicPriceInfo;", "getDynamicPriceInfo", "getDynamicPriceInfo$annotations", "getSoldOutAtDynamicItemPrice", "getSoldOutAtDynamicItemPrice$annotations", "getDescriptionTranslated", "getDescriptionTranslated$annotations", "getCollectionInfo", "getCollectionInfo$annotations", "getSmileyReportLink", "getSmileyReportLink$annotations", "Z", "isEdible$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class FlashSalesItemInformation extends BasicItemInformation implements Parcelable {

    @NotNull
    private static final j[] $childSerializers;

    @Nullable
    private final AllergensInfo allergensInfo;

    @Nullable
    private final AverageItemRating averageItemRating;

    @Nullable
    private final String collectionInfo;

    @Nullable
    private final Picture coverPicture_;

    @Nullable
    private final String description;

    @Nullable
    private final String descriptionTranslated;

    @NotNull
    private final List<String> dietCategories;

    @Nullable
    private final DynamicPriceInfo dynamicPriceInfo;
    private final boolean isEdible;

    @NotNull
    private final ItemCategory itemCategory;

    @NotNull
    private final String itemId;

    @NotNull
    private final Price itemPrice;

    @Nullable
    private final Price itemValue;

    @Nullable
    private final Picture logoPicture_;

    @Nullable
    private final String name;

    @NotNull
    private final PackagingOptions packagingOption;

    @Nullable
    private final List<String> positiveRatingReasons;

    @Nullable
    private final String smileyReportLink;

    @Nullable
    private final Price soldOutAtDynamicItemPrice;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<FlashSalesItemInformation> CREATOR = new Creator();

    static {
        m mVar = m.PUBLICATION;
        $childSerializers = new j[]{null, null, null, null, null, null, null, null, l.a(mVar, new a(28)), l.a(mVar, new a(29)), l.a(mVar, new cu.a(0)), null, null, null, null, null, null, null, null};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private FlashSalesItemInformation(int i11, Picture picture, String str, String str2, String str3, Price price, Price price2, Picture picture2, ItemCategory itemCategory, List list, PackagingOptions packagingOptions, List list2, AverageItemRating averageItemRating, AllergensInfo allergensInfo, DynamicPriceInfo dynamicPriceInfo, Price price3, String str4, String str5, String str6, boolean z11, m1 m1Var) {
        super(i11, m1Var);
        if (56 != (i11 & 56)) {
            c1.j(i11, 56, FlashSalesItemInformation$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i11 & 1) == 0) {
            this.coverPicture_ = null;
        } else {
            this.coverPicture_ = picture;
        }
        if ((i11 & 2) == 0) {
            this.name = null;
        } else {
            this.name = str;
        }
        if ((i11 & 4) == 0) {
            this.description = null;
        } else {
            this.description = str2;
        }
        this.itemId = str3;
        this.itemPrice = price;
        this.itemValue = price2;
        if ((i11 & 64) == 0) {
            this.logoPicture_ = null;
        } else {
            this.logoPicture_ = picture2;
        }
        if ((i11 & 128) == 0) {
            this.itemCategory = ItemCategory.OTHER;
        } else {
            this.itemCategory = itemCategory;
        }
        if ((i11 & 256) == 0) {
            this.dietCategories = n0.f26529a;
        } else {
            this.dietCategories = list;
        }
        if ((i11 & 512) == 0) {
            this.packagingOption = PackagingOptions.UNKNOWN;
        } else {
            this.packagingOption = packagingOptions;
        }
        if ((i11 & 1024) == 0) {
            this.positiveRatingReasons = null;
        } else {
            this.positiveRatingReasons = list2;
        }
        if ((i11 & NewHope.SENDB_BYTES) == 0) {
            this.averageItemRating = null;
        } else {
            this.averageItemRating = averageItemRating;
        }
        if ((i11 & 4096) == 0) {
            this.allergensInfo = null;
        } else {
            this.allergensInfo = allergensInfo;
        }
        if ((i11 & 8192) == 0) {
            this.dynamicPriceInfo = null;
        } else {
            this.dynamicPriceInfo = dynamicPriceInfo;
        }
        if ((i11 & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) == 0) {
            this.soldOutAtDynamicItemPrice = null;
        } else {
            this.soldOutAtDynamicItemPrice = price3;
        }
        if ((32768 & i11) == 0) {
            this.descriptionTranslated = null;
        } else {
            this.descriptionTranslated = str4;
        }
        if ((65536 & i11) == 0) {
            this.collectionInfo = null;
        } else {
            this.collectionInfo = str5;
        }
        if ((131072 & i11) == 0) {
            this.smileyReportLink = null;
        } else {
            this.smileyReportLink = str6;
        }
        this.isEdible = (i11 & 262144) == 0 ? true : z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(r1.f29848a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer _childSerializers$_anonymous_$0() {
        PackagingOptions[] packagingOptionsArrValues = PackagingOptions.values();
        packagingOptionsArrValues.getClass();
        return new i90.a("com.app.tgtg.model.remote.item.response.PackagingOptions", (Enum[]) packagingOptionsArrValues);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new d(r1.f29848a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-FppsJRw$default, reason: not valid java name */
    public static /* synthetic */ FlashSalesItemInformation m349copyFppsJRw$default(FlashSalesItemInformation flashSalesItemInformation, Picture picture, String str, String str2, String str3, Price price, Price price2, Picture picture2, ItemCategory itemCategory, List list, PackagingOptions packagingOptions, List list2, AverageItemRating averageItemRating, AllergensInfo allergensInfo, DynamicPriceInfo dynamicPriceInfo, Price price3, String str4, String str5, String str6, boolean z11, int i11, Object obj) {
        boolean z12;
        String str7;
        Picture picture3 = (i11 & 1) != 0 ? flashSalesItemInformation.coverPicture_ : picture;
        String str8 = (i11 & 2) != 0 ? flashSalesItemInformation.name : str;
        String str9 = (i11 & 4) != 0 ? flashSalesItemInformation.description : str2;
        String str10 = (i11 & 8) != 0 ? flashSalesItemInformation.itemId : str3;
        Price price4 = (i11 & 16) != 0 ? flashSalesItemInformation.itemPrice : price;
        Price price5 = (i11 & 32) != 0 ? flashSalesItemInformation.itemValue : price2;
        Picture picture4 = (i11 & 64) != 0 ? flashSalesItemInformation.logoPicture_ : picture2;
        ItemCategory itemCategory2 = (i11 & 128) != 0 ? flashSalesItemInformation.itemCategory : itemCategory;
        List list3 = (i11 & 256) != 0 ? flashSalesItemInformation.dietCategories : list;
        PackagingOptions packagingOptions2 = (i11 & 512) != 0 ? flashSalesItemInformation.packagingOption : packagingOptions;
        List list4 = (i11 & 1024) != 0 ? flashSalesItemInformation.positiveRatingReasons : list2;
        AverageItemRating averageItemRating2 = (i11 & NewHope.SENDB_BYTES) != 0 ? flashSalesItemInformation.averageItemRating : averageItemRating;
        AllergensInfo allergensInfo2 = (i11 & 4096) != 0 ? flashSalesItemInformation.allergensInfo : allergensInfo;
        DynamicPriceInfo dynamicPriceInfo2 = (i11 & 8192) != 0 ? flashSalesItemInformation.dynamicPriceInfo : dynamicPriceInfo;
        Picture picture5 = picture3;
        Price price6 = (i11 & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) != 0 ? flashSalesItemInformation.soldOutAtDynamicItemPrice : price3;
        String str11 = (i11 & 32768) != 0 ? flashSalesItemInformation.descriptionTranslated : str4;
        String str12 = (i11 & 65536) != 0 ? flashSalesItemInformation.collectionInfo : str5;
        String str13 = (i11 & 131072) != 0 ? flashSalesItemInformation.smileyReportLink : str6;
        if ((i11 & 262144) != 0) {
            str7 = str13;
            z12 = flashSalesItemInformation.isEdible;
        } else {
            z12 = z11;
            str7 = str13;
        }
        return flashSalesItemInformation.m352copyFppsJRw(picture5, str8, str9, str10, price4, price5, picture4, itemCategory2, list3, packagingOptions2, list4, averageItemRating2, allergensInfo2, dynamicPriceInfo2, price6, str11, str12, str7, z12);
    }

    public static final void write$Self$app(FlashSalesItemInformation self, b output, SerialDescriptor serialDesc) {
        BasicItemInformation.write$Self(self, output, serialDesc);
        j[] jVarArr = $childSerializers;
        if (output.C(serialDesc) || self.getCoverPicture_() != null) {
            output.r(serialDesc, 0, Picture$$serializer.INSTANCE, self.getCoverPicture_());
        }
        if (output.C(serialDesc) || self.getName() != null) {
            output.r(serialDesc, 1, r1.f29848a, self.getName());
        }
        if (output.C(serialDesc) || self.getDescription() != null) {
            output.r(serialDesc, 2, r1.f29848a, self.getDescription());
        }
        output.i(serialDesc, 3, ItemId$$serializer.INSTANCE, ItemId.m197boximpl(self.mo340getItemIdFvU5WIY()));
        Price$$serializer price$$serializer = Price$$serializer.INSTANCE;
        output.i(serialDesc, 4, price$$serializer, self.getItemPrice());
        output.r(serialDesc, 5, price$$serializer, self.getItemValue());
        if (output.C(serialDesc) || self.getLogoPicture_() != null) {
            output.r(serialDesc, 6, Picture$$serializer.INSTANCE, self.getLogoPicture_());
        }
        if (output.C(serialDesc) || self.getItemCategory() != ItemCategory.OTHER) {
            output.i(serialDesc, 7, ItemCategorySerializer.INSTANCE, self.getItemCategory());
        }
        if (output.C(serialDesc) || !Intrinsics.areEqual(self.getDietCategories(), n0.f26529a)) {
            output.i(serialDesc, 8, (KSerializer) jVarArr[8].getValue(), self.getDietCategories());
        }
        if (output.C(serialDesc) || self.getPackagingOption() != PackagingOptions.UNKNOWN) {
            output.i(serialDesc, 9, (KSerializer) jVarArr[9].getValue(), self.getPackagingOption());
        }
        if (output.C(serialDesc) || self.getPositiveRatingReasons() != null) {
            output.r(serialDesc, 10, (KSerializer) jVarArr[10].getValue(), self.getPositiveRatingReasons());
        }
        if (output.C(serialDesc) || self.getAverageItemRating() != null) {
            output.r(serialDesc, 11, AverageItemRating$$serializer.INSTANCE, self.getAverageItemRating());
        }
        if (output.C(serialDesc) || self.getAllergensInfo() != null) {
            output.r(serialDesc, 12, AllergensInfo$$serializer.INSTANCE, self.getAllergensInfo());
        }
        if (output.C(serialDesc) || self.getDynamicPriceInfo() != null) {
            output.r(serialDesc, 13, DynamicPriceInfo$$serializer.INSTANCE, self.getDynamicPriceInfo());
        }
        if (output.C(serialDesc) || self.getSoldOutAtDynamicItemPrice() != null) {
            output.r(serialDesc, 14, price$$serializer, self.getSoldOutAtDynamicItemPrice());
        }
        if (output.C(serialDesc) || self.getDescriptionTranslated() != null) {
            output.r(serialDesc, 15, r1.f29848a, self.getDescriptionTranslated());
        }
        if (output.C(serialDesc) || self.getCollectionInfo() != null) {
            output.r(serialDesc, 16, r1.f29848a, self.getCollectionInfo());
        }
        if (output.C(serialDesc) || self.getSmileyReportLink() != null) {
            output.r(serialDesc, 17, r1.f29848a, self.getSmileyReportLink());
        }
        if (!output.C(serialDesc) && self.isEdible()) {
            return;
        }
        output.p(serialDesc, 18, self.isEdible());
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Picture getCoverPicture_() {
        return this.coverPicture_;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final PackagingOptions getPackagingOption() {
        return this.packagingOption;
    }

    @Nullable
    public final List<String> component11() {
        return this.positiveRatingReasons;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final AverageItemRating getAverageItemRating() {
        return this.averageItemRating;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final AllergensInfo getAllergensInfo() {
        return this.allergensInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final DynamicPriceInfo getDynamicPriceInfo() {
        return this.dynamicPriceInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Price getSoldOutAtDynamicItemPrice() {
        return this.soldOutAtDynamicItemPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getDescriptionTranslated() {
        return this.descriptionTranslated;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getCollectionInfo() {
        return this.collectionInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getSmileyReportLink() {
        return this.smileyReportLink;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final boolean getIsEdible() {
        return this.isEdible;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    /* JADX INFO: renamed from: component4-FvU5WIY, reason: not valid java name and from getter */
    public final String getItemId() {
        return this.itemId;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Price getItemPrice() {
        return this.itemPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Price getItemValue() {
        return this.itemValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Picture getLogoPicture_() {
        return this.logoPicture_;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final ItemCategory getItemCategory() {
        return this.itemCategory;
    }

    @NotNull
    public final List<String> component9() {
        return this.dietCategories;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-FppsJRw, reason: not valid java name */
    public final FlashSalesItemInformation m352copyFppsJRw(@Nullable Picture coverPicture_, @Nullable String name, @Nullable String description, @NotNull String itemId, @NotNull Price itemPrice, @Nullable Price itemValue, @Nullable Picture logoPicture_, @NotNull ItemCategory itemCategory, @NotNull List<String> dietCategories, @NotNull PackagingOptions packagingOption, @Nullable List<String> positiveRatingReasons, @Nullable AverageItemRating averageItemRating, @Nullable AllergensInfo allergensInfo, @Nullable DynamicPriceInfo dynamicPriceInfo, @Nullable Price soldOutAtDynamicItemPrice, @Nullable String descriptionTranslated, @Nullable String collectionInfo, @Nullable String smileyReportLink, boolean isEdible) {
        itemId.getClass();
        itemPrice.getClass();
        itemCategory.getClass();
        dietCategories.getClass();
        packagingOption.getClass();
        return new FlashSalesItemInformation(coverPicture_, name, description, itemId, itemPrice, itemValue, logoPicture_, itemCategory, dietCategories, packagingOption, positiveRatingReasons, averageItemRating, allergensInfo, dynamicPriceInfo, soldOutAtDynamicItemPrice, descriptionTranslated, collectionInfo, smileyReportLink, isEdible, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlashSalesItemInformation)) {
            return false;
        }
        BasicItemInformation basicItemInformation = (BasicItemInformation) other;
        return Intrinsics.areEqual(getCoverPicture(), basicItemInformation.getCoverPicture()) && Intrinsics.areEqual(getDescription(), basicItemInformation.getDescription()) && ItemId.m201equalsimpl0(mo340getItemIdFvU5WIY(), basicItemInformation.mo340getItemIdFvU5WIY()) && Intrinsics.areEqual(getName(), basicItemInformation.getName()) && Intrinsics.areEqual(getDisplayPrice(), basicItemInformation.getDisplayPrice()) && Intrinsics.areEqual(getDisplayValue(), basicItemInformation.getDisplayValue()) && Intrinsics.areEqual(getLogoPicture(), basicItemInformation.getLogoPicture());
    }

    @Override // com.app.tgtg.model.remote.item.BasicItemInformation
    @Nullable
    public AllergensInfo getAllergensInfo() {
        return this.allergensInfo;
    }

    @Override // com.app.tgtg.model.remote.item.BasicItemInformation
    @Nullable
    public AverageItemRating getAverageItemRating() {
        return this.averageItemRating;
    }

    @Override // com.app.tgtg.model.remote.item.BasicItemInformation
    @Nullable
    public String getCollectionInfo() {
        return this.collectionInfo;
    }

    @Override // com.app.tgtg.model.remote.item.BasicItemInformation
    @Nullable
    public Picture getCoverPicture_() {
        return this.coverPicture_;
    }

    @Override // com.app.tgtg.model.remote.item.BasicItemInformation
    @Nullable
    public String getDescription() {
        return this.description;
    }

    @Override // com.app.tgtg.model.remote.item.BasicItemInformation
    @Nullable
    public String getDescriptionTranslated() {
        return this.descriptionTranslated;
    }

    @Override // com.app.tgtg.model.remote.item.BasicItemInformation
    @NotNull
    public List<String> getDietCategories() {
        return this.dietCategories;
    }

    @Override // com.app.tgtg.model.remote.item.BasicItemInformation
    @Nullable
    public DynamicPriceInfo getDynamicPriceInfo() {
        return this.dynamicPriceInfo;
    }

    @Override // com.app.tgtg.model.remote.item.BasicItemInformation
    @NotNull
    public ItemCategory getItemCategory() {
        return this.itemCategory;
    }

    @Override // com.app.tgtg.model.remote.item.BasicItemInformation
    @NotNull
    /* JADX INFO: renamed from: getItemId-FvU5WIY */
    public String mo340getItemIdFvU5WIY() {
        return this.itemId;
    }

    @Override // com.app.tgtg.model.remote.item.BasicItemInformation
    @NotNull
    public Price getItemPrice() {
        return this.itemPrice;
    }

    @Override // com.app.tgtg.model.remote.item.BasicItemInformation
    @Nullable
    public Price getItemValue() {
        return this.itemValue;
    }

    @Override // com.app.tgtg.model.remote.item.BasicItemInformation
    @Nullable
    public Picture getLogoPicture_() {
        return this.logoPicture_;
    }

    @Override // com.app.tgtg.model.remote.item.BasicItemInformation
    @Nullable
    public String getName() {
        return this.name;
    }

    @Override // com.app.tgtg.model.remote.item.BasicItemInformation
    @NotNull
    public PackagingOptions getPackagingOption() {
        return this.packagingOption;
    }

    @Override // com.app.tgtg.model.remote.item.BasicItemInformation
    @Nullable
    public List<String> getPositiveRatingReasons() {
        return this.positiveRatingReasons;
    }

    @Override // com.app.tgtg.model.remote.item.BasicItemInformation
    @Nullable
    public String getSmileyReportLink() {
        return this.smileyReportLink;
    }

    @Override // com.app.tgtg.model.remote.item.BasicItemInformation
    @Nullable
    public Price getSoldOutAtDynamicItemPrice() {
        return this.soldOutAtDynamicItemPrice;
    }

    public int hashCode() {
        return Objects.hash(getCoverPicture(), getDescription(), ItemId.m197boximpl(mo340getItemIdFvU5WIY()), getDisplayPrice(), getDisplayValue(), getPositiveRatingReasons(), getAverageItemRating());
    }

    @Override // com.app.tgtg.model.remote.item.BasicItemInformation
    public boolean isEdible() {
        return this.isEdible;
    }

    @NotNull
    public String toString() {
        Picture picture = this.coverPicture_;
        String str = this.name;
        String str2 = this.description;
        String strM203toStringimpl = ItemId.m203toStringimpl(this.itemId);
        Price price = this.itemPrice;
        Price price2 = this.itemValue;
        Picture picture2 = this.logoPicture_;
        ItemCategory itemCategory = this.itemCategory;
        List<String> list = this.dietCategories;
        PackagingOptions packagingOptions = this.packagingOption;
        List<String> list2 = this.positiveRatingReasons;
        AverageItemRating averageItemRating = this.averageItemRating;
        AllergensInfo allergensInfo = this.allergensInfo;
        DynamicPriceInfo dynamicPriceInfo = this.dynamicPriceInfo;
        Price price3 = this.soldOutAtDynamicItemPrice;
        String str3 = this.descriptionTranslated;
        String str4 = this.collectionInfo;
        String str5 = this.smileyReportLink;
        boolean z11 = this.isEdible;
        StringBuilder sb2 = new StringBuilder("FlashSalesItemInformation(coverPicture_=");
        sb2.append(picture);
        sb2.append(", name=");
        sb2.append(str);
        sb2.append(", description=");
        s.A(sb2, str2, ", itemId=", strM203toStringimpl, ", itemPrice=");
        sb2.append(price);
        sb2.append(", itemValue=");
        sb2.append(price2);
        sb2.append(", logoPicture_=");
        sb2.append(picture2);
        sb2.append(", itemCategory=");
        sb2.append(itemCategory);
        sb2.append(", dietCategories=");
        sb2.append(list);
        sb2.append(", packagingOption=");
        sb2.append(packagingOptions);
        sb2.append(", positiveRatingReasons=");
        sb2.append(list2);
        sb2.append(", averageItemRating=");
        sb2.append(averageItemRating);
        sb2.append(", allergensInfo=");
        sb2.append(allergensInfo);
        sb2.append(", dynamicPriceInfo=");
        sb2.append(dynamicPriceInfo);
        sb2.append(", soldOutAtDynamicItemPrice=");
        sb2.append(price3);
        sb2.append(", descriptionTranslated=");
        sb2.append(str3);
        sb2.append(", collectionInfo=");
        s.A(sb2, str4, ", smileyReportLink=", str5, ", isEdible=");
        return s.o(sb2, z11, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        Picture picture = this.coverPicture_;
        if (picture == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            picture.writeToParcel(dest, flags);
        }
        dest.writeString(this.name);
        dest.writeString(this.description);
        ItemId.m204writeToParcelimpl(this.itemId, dest, flags);
        this.itemPrice.writeToParcel(dest, flags);
        Price price = this.itemValue;
        if (price == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            price.writeToParcel(dest, flags);
        }
        Picture picture2 = this.logoPicture_;
        if (picture2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            picture2.writeToParcel(dest, flags);
        }
        dest.writeString(this.itemCategory.name());
        dest.writeStringList(this.dietCategories);
        dest.writeString(this.packagingOption.name());
        dest.writeStringList(this.positiveRatingReasons);
        AverageItemRating averageItemRating = this.averageItemRating;
        if (averageItemRating == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            averageItemRating.writeToParcel(dest, flags);
        }
        AllergensInfo allergensInfo = this.allergensInfo;
        if (allergensInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            allergensInfo.writeToParcel(dest, flags);
        }
        DynamicPriceInfo dynamicPriceInfo = this.dynamicPriceInfo;
        if (dynamicPriceInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dynamicPriceInfo.writeToParcel(dest, flags);
        }
        Price price2 = this.soldOutAtDynamicItemPrice;
        if (price2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            price2.writeToParcel(dest, flags);
        }
        dest.writeString(this.descriptionTranslated);
        dest.writeString(this.collectionInfo);
        dest.writeString(this.smileyReportLink);
        dest.writeInt(this.isEdible ? 1 : 0);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/item/FlashSalesItemInformation$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/item/FlashSalesItemInformation;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FlashSalesItemInformation$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FlashSalesItemInformation> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FlashSalesItemInformation createFromParcel(Parcel parcel) {
            Picture picture;
            DynamicPriceInfo dynamicPriceInfoCreateFromParcel;
            parcel.getClass();
            Picture pictureCreateFromParcel = parcel.readInt() == 0 ? null : Picture.CREATOR.createFromParcel(parcel);
            String string = parcel.readString();
            String string2 = parcel.readString();
            String strM205unboximpl = ItemId.CREATOR.createFromParcel(parcel).m205unboximpl();
            Parcelable.Creator<Price> creator = Price.CREATOR;
            Price priceCreateFromParcel = creator.createFromParcel(parcel);
            Price priceCreateFromParcel2 = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
            Picture pictureCreateFromParcel2 = parcel.readInt() == 0 ? null : Picture.CREATOR.createFromParcel(parcel);
            ItemCategory itemCategoryValueOf = ItemCategory.valueOf(parcel.readString());
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            PackagingOptions packagingOptionsValueOf = PackagingOptions.valueOf(parcel.readString());
            AllergensInfo allergensInfoCreateFromParcel = null;
            ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
            AverageItemRating averageItemRatingCreateFromParcel = parcel.readInt() == 0 ? null : AverageItemRating.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                allergensInfoCreateFromParcel = AllergensInfo.CREATOR.createFromParcel(parcel);
            }
            AllergensInfo allergensInfo = allergensInfoCreateFromParcel;
            if (parcel.readInt() == 0) {
                picture = pictureCreateFromParcel;
                dynamicPriceInfoCreateFromParcel = null;
            } else {
                picture = pictureCreateFromParcel;
                dynamicPriceInfoCreateFromParcel = DynamicPriceInfo.CREATOR.createFromParcel(parcel);
            }
            return new FlashSalesItemInformation(picture, string, string2, strM205unboximpl, priceCreateFromParcel, priceCreateFromParcel2, pictureCreateFromParcel2, itemCategoryValueOf, arrayListCreateStringArrayList, packagingOptionsValueOf, arrayListCreateStringArrayList2, averageItemRatingCreateFromParcel, allergensInfo, dynamicPriceInfoCreateFromParcel, parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FlashSalesItemInformation[] newArray(int i11) {
            return new FlashSalesItemInformation[i11];
        }
    }

    @g("allergens_info")
    public static /* synthetic */ void getAllergensInfo$annotations() {
    }

    @g("average_overall_rating")
    public static /* synthetic */ void getAverageItemRating$annotations() {
    }

    @g("collection_info")
    public static /* synthetic */ void getCollectionInfo$annotations() {
    }

    @g("cover_picture")
    public static /* synthetic */ void getCoverPicture_$annotations() {
    }

    @g("description")
    public static /* synthetic */ void getDescription$annotations() {
    }

    @g("description_translated")
    public static /* synthetic */ void getDescriptionTranslated$annotations() {
    }

    @g("diet_categories")
    public static /* synthetic */ void getDietCategories$annotations() {
    }

    @g("price_info")
    public static /* synthetic */ void getDynamicPriceInfo$annotations() {
    }

    @g("item_category")
    public static /* synthetic */ void getItemCategory$annotations() {
    }

    @g("item_id")
    /* JADX INFO: renamed from: getItemId-FvU5WIY$annotations, reason: not valid java name */
    public static /* synthetic */ void m350getItemIdFvU5WIY$annotations() {
    }

    @g("item_price")
    public static /* synthetic */ void getItemPrice$annotations() {
    }

    @g("item_value")
    public static /* synthetic */ void getItemValue$annotations() {
    }

    @g("logo_picture")
    public static /* synthetic */ void getLogoPicture_$annotations() {
    }

    @g("name")
    public static /* synthetic */ void getName$annotations() {
    }

    @g("packaging_option")
    public static /* synthetic */ void getPackagingOption$annotations() {
    }

    @g("positive_rating_reasons")
    public static /* synthetic */ void getPositiveRatingReasons$annotations() {
    }

    @g("smiley_report_link")
    public static /* synthetic */ void getSmileyReportLink$annotations() {
    }

    @g("sold_out_at_dynamic_item_price")
    public static /* synthetic */ void getSoldOutAtDynamicItemPrice$annotations() {
    }

    @g("is_edible")
    public static /* synthetic */ void isEdible$annotations() {
    }

    public /* synthetic */ FlashSalesItemInformation(Picture picture, String str, String str2, String str3, Price price, Price price2, Picture picture2, ItemCategory itemCategory, List list, PackagingOptions packagingOptions, List list2, AverageItemRating averageItemRating, AllergensInfo allergensInfo, DynamicPriceInfo dynamicPriceInfo, Price price3, String str4, String str5, String str6, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
        this(picture, str, str2, str3, price, price2, picture2, itemCategory, list, packagingOptions, list2, averageItemRating, allergensInfo, dynamicPriceInfo, price3, str4, str5, str6, z11);
    }

    public /* synthetic */ FlashSalesItemInformation(int i11, Picture picture, String str, String str2, String str3, Price price, Price price2, Picture picture2, ItemCategory itemCategory, List list, PackagingOptions packagingOptions, List list2, AverageItemRating averageItemRating, AllergensInfo allergensInfo, DynamicPriceInfo dynamicPriceInfo, Price price3, String str4, String str5, String str6, boolean z11, m1 m1Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, picture, str, str2, str3, price, price2, picture2, itemCategory, list, packagingOptions, list2, averageItemRating, allergensInfo, dynamicPriceInfo, price3, str4, str5, str6, z11, m1Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private FlashSalesItemInformation(Picture picture, String str, String str2, String str3, Price price, Price price2, Picture picture2, ItemCategory itemCategory, List<String> list, PackagingOptions packagingOptions, List<String> list2, AverageItemRating averageItemRating, AllergensInfo allergensInfo, DynamicPriceInfo dynamicPriceInfo, Price price3, String str4, String str5, String str6, boolean z11) {
        super(null);
        str3.getClass();
        price.getClass();
        itemCategory.getClass();
        list.getClass();
        packagingOptions.getClass();
        this.coverPicture_ = picture;
        this.name = str;
        this.description = str2;
        this.itemId = str3;
        this.itemPrice = price;
        this.itemValue = price2;
        this.logoPicture_ = picture2;
        this.itemCategory = itemCategory;
        this.dietCategories = list;
        this.packagingOption = packagingOptions;
        this.positiveRatingReasons = list2;
        this.averageItemRating = averageItemRating;
        this.allergensInfo = allergensInfo;
        this.dynamicPriceInfo = dynamicPriceInfo;
        this.soldOutAtDynamicItemPrice = price3;
        this.descriptionTranslated = str4;
        this.collectionInfo = str5;
        this.smileyReportLink = str6;
        this.isEdible = z11;
    }

    public FlashSalesItemInformation(Picture picture, String str, String str2, String str3, Price price, Price price2, Picture picture2, ItemCategory itemCategory, List list, PackagingOptions packagingOptions, List list2, AverageItemRating averageItemRating, AllergensInfo allergensInfo, DynamicPriceInfo dynamicPriceInfo, Price price3, String str4, String str5, String str6, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : picture, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : str2, str3, price, price2, (i11 & 64) != 0 ? null : picture2, (i11 & 128) != 0 ? ItemCategory.OTHER : itemCategory, (i11 & 256) != 0 ? n0.f26529a : list, (i11 & 512) != 0 ? PackagingOptions.UNKNOWN : packagingOptions, (i11 & 1024) != 0 ? null : list2, (i11 & NewHope.SENDB_BYTES) != 0 ? null : averageItemRating, (i11 & 4096) != 0 ? null : allergensInfo, (i11 & 8192) != 0 ? null : dynamicPriceInfo, (i11 & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) != 0 ? null : price3, (32768 & i11) != 0 ? null : str4, (65536 & i11) != 0 ? null : str5, (131072 & i11) != 0 ? null : str6, (i11 & 262144) != 0 ? true : z11, null);
    }
}
