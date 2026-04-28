package com.app.tgtg.model.remote.item.response;

import android.os.Parcel;
import android.os.Parcelable;
import b3.i;
import cg.e;
import com.app.tgtg.model.remote.item.Address;
import com.app.tgtg.model.remote.item.CateringItemInformation;
import com.app.tgtg.model.remote.item.DeliveryMethod;
import com.app.tgtg.model.remote.item.Ingredients;
import com.app.tgtg.model.remote.item.ItemCardType;
import com.app.tgtg.model.remote.item.ItemTagInfo;
import com.app.tgtg.model.remote.item.ItemTagInfo$$serializer;
import com.app.tgtg.model.remote.item.LatLngInfo;
import com.app.tgtg.model.remote.item.LocalHero;
import com.app.tgtg.model.remote.item.PickupInterval;
import com.app.tgtg.model.remote.item.PickupLocation;
import com.app.tgtg.model.remote.item.Picture;
import com.app.tgtg.model.remote.item.StoreInformation;
import com.app.tgtg.model.remote.item.StoreLegalInformation;
import com.app.tgtg.model.remote.item.StoreLocation;
import com.app.tgtg.model.remote.manufacturer.response.CateringItemProperties;
import i90.d;
import i90.g;
import i90.h;
import j4.s;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import m90.c1;
import m90.m1;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import u70.j;
import u70.l;
import u70.m;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bU\b\u0087\b\u0018\u0000 ¸\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0004¹\u0001¸\u0001Bñ\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0012\u0012\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b&\u0010'Bý\u0001\b\u0010\u0012\u0006\u0010(\u001a\u00020\u000e\u0012\u0014\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020*\u0018\u00010)\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0019\u001a\u00020\u000e\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u0006\u0010\u001d\u001a\u00020\u0012\u0012\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\b\u0010$\u001a\u0004\u0018\u00010#\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\b&\u0010.J\u0017\u00101\u001a\u00020\u00122\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J\u0011\u00103\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b3\u00104J\r\u00105\u001a\u00020\u000e¢\u0006\u0004\b5\u00106J\u001d\u0010:\u001a\u00020*2\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u00020\u000e¢\u0006\u0004\b:\u0010;J\u0010\u0010<\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b<\u0010=J\u0012\u0010>\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b>\u0010?J\u0010\u0010@\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b@\u00104J\u0010\u0010A\u001a\u00020\nHÆ\u0003¢\u0006\u0004\bA\u0010BJ\u0012\u0010C\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\bC\u0010DJ\u0010\u0010E\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\bE\u00106J\u0010\u0010F\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\bF\u0010GJ\u0010\u0010H\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\bH\u0010IJ\u0010\u0010J\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\bJ\u0010IJ\u0012\u0010K\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\bK\u0010LJ\u0012\u0010M\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bM\u00104J\u0012\u0010N\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bN\u00104J\u0012\u0010O\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bO\u00104J\u0010\u0010P\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\bP\u00106J\u0012\u0010Q\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bQ\u00104J\u0010\u0010R\u001a\u00020\u001bHÆ\u0003¢\u0006\u0004\bR\u0010SJ\u0010\u0010T\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\bT\u0010IJ\u0018\u0010U\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001eHÆ\u0003¢\u0006\u0004\bU\u0010VJ\u0012\u0010W\u001a\u0004\u0018\u00010!HÆ\u0003¢\u0006\u0004\bW\u0010XJ\u0012\u0010Y\u001a\u0004\u0018\u00010#HÆ\u0003¢\u0006\u0004\bY\u0010ZJ\u0012\u0010[\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b[\u0010LJþ\u0001\u0010\\\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0019\u001a\u00020\u000e2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u00122\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b\\\u0010]J\u0010\u0010^\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b^\u00104J\u0010\u0010_\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b_\u00106J\u001a\u0010a\u001a\u00020\u00122\b\u0010`\u001a\u0004\u0018\u00010/HÖ\u0003¢\u0006\u0004\ba\u00102J'\u0010i\u001a\u00020*2\u0006\u0010b\u001a\u00020\u00002\u0006\u0010d\u001a\u00020c2\u0006\u0010f\u001a\u00020eH\u0001¢\u0006\u0004\bg\u0010hR \u0010\u0005\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010j\u0012\u0004\bl\u0010m\u001a\u0004\bk\u0010=R*\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016@\u0016X\u0097\u000e¢\u0006\u0018\n\u0004\b\u0007\u0010n\u0012\u0004\br\u0010m\u001a\u0004\bo\u0010?\"\u0004\bp\u0010qR \u0010\t\u001a\u00020\b8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\t\u0010s\u0012\u0004\bu\u0010m\u001a\u0004\bt\u00104R \u0010\u000b\u001a\u00020\n8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010v\u0012\u0004\bx\u0010m\u001a\u0004\bw\u0010BR*\u0010\r\u001a\u0004\u0018\u00010\f8\u0016@\u0016X\u0097\u000e¢\u0006\u0018\n\u0004\b\r\u0010y\u0012\u0004\b}\u0010m\u001a\u0004\bz\u0010D\"\u0004\b{\u0010|R+\u0010\u000f\u001a\u00020\u000e8\u0016@\u0016X\u0097\u000e¢\u0006\u001b\n\u0004\b\u000f\u0010~\u0012\u0005\b\u0082\u0001\u0010m\u001a\u0004\b\u007f\u00106\"\u0006\b\u0080\u0001\u0010\u0081\u0001R-\u0010\u0011\u001a\u00020\u00108\u0016@\u0016X\u0097\u000e¢\u0006\u001d\n\u0005\b\u0011\u0010\u0083\u0001\u0012\u0005\b\u0087\u0001\u0010m\u001a\u0005\b\u0084\u0001\u0010G\"\u0006\b\u0085\u0001\u0010\u0086\u0001R-\u0010\u0013\u001a\u00020\u00128\u0016@\u0016X\u0097\u000e¢\u0006\u001d\n\u0005\b\u0013\u0010\u0088\u0001\u0012\u0005\b\u008c\u0001\u0010m\u001a\u0005\b\u0089\u0001\u0010I\"\u0006\b\u008a\u0001\u0010\u008b\u0001R-\u0010\u0014\u001a\u00020\u00128\u0016@\u0016X\u0097\u000e¢\u0006\u001d\n\u0005\b\u0014\u0010\u0088\u0001\u0012\u0005\b\u008f\u0001\u0010m\u001a\u0005\b\u008d\u0001\u0010I\"\u0006\b\u008e\u0001\u0010\u008b\u0001R/\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u001d\n\u0005\b\u0015\u0010\u0090\u0001\u0012\u0005\b\u0094\u0001\u0010m\u001a\u0005\b\u0091\u0001\u0010L\"\u0006\b\u0092\u0001\u0010\u0093\u0001R.\u0010\u0016\u001a\u0004\u0018\u00010\b8\u0016@\u0016X\u0097\u000e¢\u0006\u001c\n\u0004\b\u0016\u0010s\u0012\u0005\b\u0098\u0001\u0010m\u001a\u0005\b\u0095\u0001\u00104\"\u0006\b\u0096\u0001\u0010\u0097\u0001R.\u0010\u0017\u001a\u0004\u0018\u00010\b8\u0016@\u0016X\u0097\u000e¢\u0006\u001c\n\u0004\b\u0017\u0010s\u0012\u0005\b\u009b\u0001\u0010m\u001a\u0005\b\u0099\u0001\u00104\"\u0006\b\u009a\u0001\u0010\u0097\u0001R.\u0010\u0018\u001a\u0004\u0018\u00010\b8\u0016@\u0016X\u0097\u000e¢\u0006\u001c\n\u0004\b\u0018\u0010s\u0012\u0005\b\u009e\u0001\u0010m\u001a\u0005\b\u009c\u0001\u00104\"\u0006\b\u009d\u0001\u0010\u0097\u0001R,\u0010\u0019\u001a\u00020\u000e8\u0016@\u0016X\u0097\u000e¢\u0006\u001c\n\u0004\b\u0019\u0010~\u0012\u0005\b¡\u0001\u0010m\u001a\u0005\b\u009f\u0001\u00106\"\u0006\b \u0001\u0010\u0081\u0001R.\u0010\u001a\u001a\u0004\u0018\u00010\b8\u0016@\u0016X\u0097\u000e¢\u0006\u001c\n\u0004\b\u001a\u0010s\u0012\u0005\b¤\u0001\u0010m\u001a\u0005\b¢\u0001\u00104\"\u0006\b£\u0001\u0010\u0097\u0001R-\u0010\u001c\u001a\u00020\u001b8\u0016@\u0016X\u0097\u000e¢\u0006\u001d\n\u0005\b\u001c\u0010¥\u0001\u0012\u0005\b©\u0001\u0010m\u001a\u0005\b¦\u0001\u0010S\"\u0006\b§\u0001\u0010¨\u0001R-\u0010\u001d\u001a\u00020\u00128\u0016@\u0016X\u0097\u000e¢\u0006\u001d\n\u0005\b\u001d\u0010\u0088\u0001\u0012\u0005\b¬\u0001\u0010m\u001a\u0005\bª\u0001\u0010I\"\u0006\b«\u0001\u0010\u008b\u0001R+\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e8\u0016X\u0097\u0004¢\u0006\u0015\n\u0005\b \u0010\u00ad\u0001\u0012\u0005\b¯\u0001\u0010m\u001a\u0005\b®\u0001\u0010VR%\u0010\"\u001a\u0004\u0018\u00010!8\u0016X\u0097\u0004¢\u0006\u0015\n\u0005\b\"\u0010°\u0001\u0012\u0005\b²\u0001\u0010m\u001a\u0005\b±\u0001\u0010XR%\u0010$\u001a\u0004\u0018\u00010#8\u0016X\u0097\u0004¢\u0006\u0015\n\u0005\b$\u0010³\u0001\u0012\u0005\bµ\u0001\u0010m\u001a\u0005\b´\u0001\u0010ZR%\u0010%\u001a\u0004\u0018\u00010\u00128\u0016X\u0097\u0004¢\u0006\u0015\n\u0005\b%\u0010\u0090\u0001\u0012\u0005\b·\u0001\u0010m\u001a\u0005\b¶\u0001\u0010L¨\u0006º\u0001"}, d2 = {"Lcom/app/tgtg/model/remote/item/response/CateringItem;", "Landroid/os/Parcelable;", "Lcom/app/tgtg/model/remote/item/response/Deliverable;", "Lcom/app/tgtg/model/remote/item/response/BasicItem;", "Lcom/app/tgtg/model/remote/item/CateringItemInformation;", "information", "Lcom/app/tgtg/model/remote/item/StoreInformation;", "storeInfoOrNull", "", "displayName", "Lcom/app/tgtg/model/remote/item/PickupLocation;", "pickupLocation", "Lcom/app/tgtg/model/remote/item/PickupInterval;", "pickupIntervalOrNull", "", "itemsAvailable", "", "distance", "", "favorite", "subscribedForNotification", "inSalesWindow", "purchaseEnd", "soldOutAt", "sharingUrl", "userPurchaseLimit", "nextSalesWindowPurchaseStart", "Lcom/app/tgtg/model/remote/item/response/ItemType;", "itemType", "itemIsNew", "", "Lcom/app/tgtg/model/remote/item/ItemTagInfo;", "itemTags", "Lcom/app/tgtg/model/remote/item/ItemCardType;", "itemCardType", "Lcom/app/tgtg/model/remote/item/Ingredients;", "ingredients", "matchesFilters", "<init>", "(Lcom/app/tgtg/model/remote/item/CateringItemInformation;Lcom/app/tgtg/model/remote/item/StoreInformation;Ljava/lang/String;Lcom/app/tgtg/model/remote/item/PickupLocation;Lcom/app/tgtg/model/remote/item/PickupInterval;IDZZLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcom/app/tgtg/model/remote/item/response/ItemType;ZLjava/util/List;Lcom/app/tgtg/model/remote/item/ItemCardType;Lcom/app/tgtg/model/remote/item/Ingredients;Ljava/lang/Boolean;)V", "seen0", "Lkotlin/Function1;", "", "onFavoriteChangedListener", "Lm90/m1;", "serializationConstructorMarker", "(ILkotlin/jvm/functions/Function1;Lcom/app/tgtg/model/remote/item/CateringItemInformation;Lcom/app/tgtg/model/remote/item/StoreInformation;Ljava/lang/String;Lcom/app/tgtg/model/remote/item/PickupLocation;Lcom/app/tgtg/model/remote/item/PickupInterval;IDZZLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcom/app/tgtg/model/remote/item/response/ItemType;ZLjava/util/List;Lcom/app/tgtg/model/remote/item/ItemCardType;Lcom/app/tgtg/model/remote/item/Ingredients;Ljava/lang/Boolean;Lm90/m1;)V", "", "o", "displayedParametersAreEqual", "(Ljava/lang/Object;)Z", "getDeliveryEstimate", "()Ljava/lang/String;", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/app/tgtg/model/remote/item/CateringItemInformation;", "component2", "()Lcom/app/tgtg/model/remote/item/StoreInformation;", "component3", "component4", "()Lcom/app/tgtg/model/remote/item/PickupLocation;", "component5", "()Lcom/app/tgtg/model/remote/item/PickupInterval;", "component6", "component7", "()D", "component8", "()Z", "component9", "component10", "()Ljava/lang/Boolean;", "component11", "component12", "component13", "component14", "component15", "component16", "()Lcom/app/tgtg/model/remote/item/response/ItemType;", "component17", "component18", "()Ljava/util/List;", "component19", "()Lcom/app/tgtg/model/remote/item/ItemCardType;", "component20", "()Lcom/app/tgtg/model/remote/item/Ingredients;", "component21", "copy", "(Lcom/app/tgtg/model/remote/item/CateringItemInformation;Lcom/app/tgtg/model/remote/item/StoreInformation;Ljava/lang/String;Lcom/app/tgtg/model/remote/item/PickupLocation;Lcom/app/tgtg/model/remote/item/PickupInterval;IDZZLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcom/app/tgtg/model/remote/item/response/ItemType;ZLjava/util/List;Lcom/app/tgtg/model/remote/item/ItemCardType;Lcom/app/tgtg/model/remote/item/Ingredients;Ljava/lang/Boolean;)Lcom/app/tgtg/model/remote/item/response/CateringItem;", "toString", "hashCode", "other", "equals", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "write$Self$app", "(Lcom/app/tgtg/model/remote/item/response/CateringItem;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/app/tgtg/model/remote/item/CateringItemInformation;", "getInformation", "getInformation$annotations", "()V", "Lcom/app/tgtg/model/remote/item/StoreInformation;", "getStoreInfoOrNull", "setStoreInfoOrNull", "(Lcom/app/tgtg/model/remote/item/StoreInformation;)V", "getStoreInfoOrNull$annotations", "Ljava/lang/String;", "getDisplayName", "getDisplayName$annotations", "Lcom/app/tgtg/model/remote/item/PickupLocation;", "getPickupLocation", "getPickupLocation$annotations", "Lcom/app/tgtg/model/remote/item/PickupInterval;", "getPickupIntervalOrNull", "setPickupIntervalOrNull", "(Lcom/app/tgtg/model/remote/item/PickupInterval;)V", "getPickupIntervalOrNull$annotations", "I", "getItemsAvailable", "setItemsAvailable", "(I)V", "getItemsAvailable$annotations", "D", "getDistance", "setDistance", "(D)V", "getDistance$annotations", "Z", "getFavorite", "setFavorite", "(Z)V", "getFavorite$annotations", "getSubscribedForNotification", "setSubscribedForNotification", "getSubscribedForNotification$annotations", "Ljava/lang/Boolean;", "getInSalesWindow", "setInSalesWindow", "(Ljava/lang/Boolean;)V", "getInSalesWindow$annotations", "getPurchaseEnd", "setPurchaseEnd", "(Ljava/lang/String;)V", "getPurchaseEnd$annotations", "getSoldOutAt", "setSoldOutAt", "getSoldOutAt$annotations", "getSharingUrl", "setSharingUrl", "getSharingUrl$annotations", "getUserPurchaseLimit", "setUserPurchaseLimit", "getUserPurchaseLimit$annotations", "getNextSalesWindowPurchaseStart", "setNextSalesWindowPurchaseStart", "getNextSalesWindowPurchaseStart$annotations", "Lcom/app/tgtg/model/remote/item/response/ItemType;", "getItemType", "setItemType", "(Lcom/app/tgtg/model/remote/item/response/ItemType;)V", "getItemType$annotations", "getItemIsNew", "setItemIsNew", "getItemIsNew$annotations", "Ljava/util/List;", "getItemTags", "getItemTags$annotations", "Lcom/app/tgtg/model/remote/item/ItemCardType;", "getItemCardType", "getItemCardType$annotations", "Lcom/app/tgtg/model/remote/item/Ingredients;", "getIngredients", "getIngredients$annotations", "getMatchesFilters", "getMatchesFilters$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@g("CATERING")
public final /* data */ class CateringItem extends BasicItem implements Parcelable, Deliverable {

    @NotNull
    private static final j[] $childSerializers;

    @NotNull
    private final String displayName;
    private double distance;
    private boolean favorite;

    @Nullable
    private Boolean inSalesWindow;

    @NotNull
    private final CateringItemInformation information;

    @Nullable
    private final Ingredients ingredients;

    @Nullable
    private final ItemCardType itemCardType;
    private boolean itemIsNew;

    @Nullable
    private final List<ItemTagInfo> itemTags;

    @NotNull
    private ItemType itemType;
    private int itemsAvailable;

    @Nullable
    private final Boolean matchesFilters;

    @Nullable
    private String nextSalesWindowPurchaseStart;

    @Nullable
    private PickupInterval pickupIntervalOrNull;

    @NotNull
    private final PickupLocation pickupLocation;

    @Nullable
    private String purchaseEnd;

    @Nullable
    private String sharingUrl;

    @Nullable
    private String soldOutAt;

    @Nullable
    private StoreInformation storeInfoOrNull;
    private boolean subscribedForNotification;
    private int userPurchaseLimit;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<CateringItem> CREATOR = new Creator();

    static {
        m mVar = m.PUBLICATION;
        $childSerializers = new j[]{l.a(mVar, new e(15)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, l.a(mVar, new e(16)), null, null, null};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CateringItem(int i11, Function1 function1, CateringItemInformation cateringItemInformation, StoreInformation storeInformation, String str, PickupLocation pickupLocation, PickupInterval pickupInterval, int i12, double d3, boolean z11, boolean z12, Boolean bool, String str2, String str3, String str4, int i13, String str5, ItemType itemType, boolean z13, List list, ItemCardType itemCardType, Ingredients ingredients, Boolean bool2, m1 m1Var) {
        super(i11, function1, m1Var);
        if (34 != (i11 & 34)) {
            c1.j(i11, 34, CateringItem$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.information = cateringItemInformation;
        if ((i11 & 4) == 0) {
            this.storeInfoOrNull = new StoreInformation((String) null, (String) null, (String) null, (String) null, (String) null, (StoreLocation) null, (Picture) null, (String) null, false, (List) null, (List) null, 0.0d, (Picture) null, false, (String) null, (String) null, (String) null, (DeliveryMethod) null, (StoreLegalInformation) null, (LocalHero) null, false, (String) null, 4194303, (DefaultConstructorMarker) null);
        } else {
            this.storeInfoOrNull = storeInformation;
        }
        this.displayName = (i11 & 8) == 0 ? "" : str;
        if ((i11 & 16) == 0) {
            this.pickupLocation = new PickupLocation((Address) null, (String) null, (LatLngInfo) null, 7, (DefaultConstructorMarker) null);
        } else {
            this.pickupLocation = pickupLocation;
        }
        this.pickupIntervalOrNull = pickupInterval;
        if ((i11 & 64) == 0) {
            this.itemsAvailable = 0;
        } else {
            this.itemsAvailable = i12;
        }
        this.distance = (i11 & 128) == 0 ? 0.0d : d3;
        if ((i11 & 256) == 0) {
            this.favorite = false;
        } else {
            this.favorite = z11;
        }
        if ((i11 & 512) == 0) {
            this.subscribedForNotification = false;
        } else {
            this.subscribedForNotification = z12;
        }
        if ((i11 & 1024) == 0) {
            this.inSalesWindow = null;
        } else {
            this.inSalesWindow = bool;
        }
        if ((i11 & NewHope.SENDB_BYTES) == 0) {
            this.purchaseEnd = null;
        } else {
            this.purchaseEnd = str2;
        }
        if ((i11 & 4096) == 0) {
            this.soldOutAt = null;
        } else {
            this.soldOutAt = str3;
        }
        if ((i11 & 8192) == 0) {
            this.sharingUrl = null;
        } else {
            this.sharingUrl = str4;
        }
        if ((i11 & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) == 0) {
            this.userPurchaseLimit = 0;
        } else {
            this.userPurchaseLimit = i13;
        }
        if ((32768 & i11) == 0) {
            this.nextSalesWindowPurchaseStart = null;
        } else {
            this.nextSalesWindowPurchaseStart = str5;
        }
        this.itemType = (65536 & i11) == 0 ? ItemType.CATERING : itemType;
        if ((131072 & i11) == 0) {
            this.itemIsNew = false;
        } else {
            this.itemIsNew = z13;
        }
        if ((262144 & i11) == 0) {
            this.itemTags = null;
        } else {
            this.itemTags = list;
        }
        if ((524288 & i11) == 0) {
            this.itemCardType = null;
        } else {
            this.itemCardType = itemCardType;
        }
        if ((1048576 & i11) == 0) {
            this.ingredients = null;
        } else {
            this.ingredients = ingredients;
        }
        this.matchesFilters = (i11 & 2097152) == 0 ? Boolean.TRUE : bool2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(Reflection.getOrCreateKotlinClass(Function1.class), new Annotation[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new m90.d(ItemTagInfo$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CateringItem copy$default(CateringItem cateringItem, CateringItemInformation cateringItemInformation, StoreInformation storeInformation, String str, PickupLocation pickupLocation, PickupInterval pickupInterval, int i11, double d3, boolean z11, boolean z12, Boolean bool, String str2, String str3, String str4, int i12, String str5, ItemType itemType, boolean z13, List list, ItemCardType itemCardType, Ingredients ingredients, Boolean bool2, int i13, Object obj) {
        Boolean bool3;
        Ingredients ingredients2;
        CateringItemInformation cateringItemInformation2 = (i13 & 1) != 0 ? cateringItem.information : cateringItemInformation;
        StoreInformation storeInformation2 = (i13 & 2) != 0 ? cateringItem.storeInfoOrNull : storeInformation;
        String str6 = (i13 & 4) != 0 ? cateringItem.displayName : str;
        PickupLocation pickupLocation2 = (i13 & 8) != 0 ? cateringItem.pickupLocation : pickupLocation;
        PickupInterval pickupInterval2 = (i13 & 16) != 0 ? cateringItem.pickupIntervalOrNull : pickupInterval;
        int i14 = (i13 & 32) != 0 ? cateringItem.itemsAvailable : i11;
        double d11 = (i13 & 64) != 0 ? cateringItem.distance : d3;
        boolean z14 = (i13 & 128) != 0 ? cateringItem.favorite : z11;
        boolean z15 = (i13 & 256) != 0 ? cateringItem.subscribedForNotification : z12;
        Boolean bool4 = (i13 & 512) != 0 ? cateringItem.inSalesWindow : bool;
        String str7 = (i13 & 1024) != 0 ? cateringItem.purchaseEnd : str2;
        String str8 = (i13 & NewHope.SENDB_BYTES) != 0 ? cateringItem.soldOutAt : str3;
        String str9 = (i13 & 4096) != 0 ? cateringItem.sharingUrl : str4;
        CateringItemInformation cateringItemInformation3 = cateringItemInformation2;
        int i15 = (i13 & 8192) != 0 ? cateringItem.userPurchaseLimit : i12;
        String str10 = (i13 & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) != 0 ? cateringItem.nextSalesWindowPurchaseStart : str5;
        ItemType itemType2 = (i13 & 32768) != 0 ? cateringItem.itemType : itemType;
        boolean z16 = (i13 & 65536) != 0 ? cateringItem.itemIsNew : z13;
        List list2 = (i13 & 131072) != 0 ? cateringItem.itemTags : list;
        ItemCardType itemCardType2 = (i13 & 262144) != 0 ? cateringItem.itemCardType : itemCardType;
        Ingredients ingredients3 = (i13 & 524288) != 0 ? cateringItem.ingredients : ingredients;
        if ((i13 & 1048576) != 0) {
            ingredients2 = ingredients3;
            bool3 = cateringItem.matchesFilters;
        } else {
            bool3 = bool2;
            ingredients2 = ingredients3;
        }
        return cateringItem.copy(cateringItemInformation3, storeInformation2, str6, pickupLocation2, pickupInterval2, i14, d11, z14, z15, bool4, str7, str8, str9, i15, str10, itemType2, z16, list2, itemCardType2, ingredients2, bool3);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void write$Self$app(com.app.tgtg.model.remote.item.response.CateringItem r31, l90.b r32, kotlinx.serialization.descriptors.SerialDescriptor r33) {
        /*
            Method dump skipped, instruction units count: 553
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.tgtg.model.remote.item.response.CateringItem.write$Self$app(com.app.tgtg.model.remote.item.response.CateringItem, l90.b, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CateringItemInformation getInformation() {
        return this.information;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Boolean getInSalesWindow() {
        return this.inSalesWindow;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getPurchaseEnd() {
        return this.purchaseEnd;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getSoldOutAt() {
        return this.soldOutAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getSharingUrl() {
        return this.sharingUrl;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getUserPurchaseLimit() {
        return this.userPurchaseLimit;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getNextSalesWindowPurchaseStart() {
        return this.nextSalesWindowPurchaseStart;
    }

    @NotNull
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final ItemType getItemType() {
        return this.itemType;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final boolean getItemIsNew() {
        return this.itemIsNew;
    }

    @Nullable
    public final List<ItemTagInfo> component18() {
        return this.itemTags;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final ItemCardType getItemCardType() {
        return this.itemCardType;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final StoreInformation getStoreInfoOrNull() {
        return this.storeInfoOrNull;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final Ingredients getIngredients() {
        return this.ingredients;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final Boolean getMatchesFilters() {
        return this.matchesFilters;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final PickupLocation getPickupLocation() {
        return this.pickupLocation;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final PickupInterval getPickupIntervalOrNull() {
        return this.pickupIntervalOrNull;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getItemsAvailable() {
        return this.itemsAvailable;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final double getDistance() {
        return this.distance;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getFavorite() {
        return this.favorite;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getSubscribedForNotification() {
        return this.subscribedForNotification;
    }

    @NotNull
    public final CateringItem copy(@NotNull CateringItemInformation information, @Nullable StoreInformation storeInfoOrNull, @NotNull String displayName, @NotNull PickupLocation pickupLocation, @Nullable PickupInterval pickupIntervalOrNull, int itemsAvailable, double distance, boolean favorite, boolean subscribedForNotification, @Nullable Boolean inSalesWindow, @Nullable String purchaseEnd, @Nullable String soldOutAt, @Nullable String sharingUrl, int userPurchaseLimit, @Nullable String nextSalesWindowPurchaseStart, @NotNull ItemType itemType, boolean itemIsNew, @Nullable List<ItemTagInfo> itemTags, @Nullable ItemCardType itemCardType, @Nullable Ingredients ingredients, @Nullable Boolean matchesFilters) {
        information.getClass();
        displayName.getClass();
        pickupLocation.getClass();
        itemType.getClass();
        return new CateringItem(information, storeInfoOrNull, displayName, pickupLocation, pickupIntervalOrNull, itemsAvailable, distance, favorite, subscribedForNotification, inSalesWindow, purchaseEnd, soldOutAt, sharingUrl, userPurchaseLimit, nextSalesWindowPurchaseStart, itemType, itemIsNew, itemTags, itemCardType, ingredients, matchesFilters);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.app.tgtg.model.remote.item.response.BasicItem, mq.a
    public boolean displayedParametersAreEqual(@NotNull Object o11) {
        o11.getClass();
        if (this == o11) {
            return true;
        }
        if (!(o11 instanceof Item)) {
            return false;
        }
        Item item = (Item) o11;
        return Double.compare(item.getDistance(), getDistance()) == 0 && getItemsAvailable() == item.getItemsAvailable() && Intrinsics.areEqual(getSoldOutAt(), item.getSoldOutAt()) && Intrinsics.areEqual(getDisplayName(), item.getDisplayName());
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CateringItem)) {
            return false;
        }
        CateringItem cateringItem = (CateringItem) other;
        return Intrinsics.areEqual(this.information, cateringItem.information) && Intrinsics.areEqual(this.storeInfoOrNull, cateringItem.storeInfoOrNull) && Intrinsics.areEqual(this.displayName, cateringItem.displayName) && Intrinsics.areEqual(this.pickupLocation, cateringItem.pickupLocation) && Intrinsics.areEqual(this.pickupIntervalOrNull, cateringItem.pickupIntervalOrNull) && this.itemsAvailable == cateringItem.itemsAvailable && Double.compare(this.distance, cateringItem.distance) == 0 && this.favorite == cateringItem.favorite && this.subscribedForNotification == cateringItem.subscribedForNotification && Intrinsics.areEqual(this.inSalesWindow, cateringItem.inSalesWindow) && Intrinsics.areEqual(this.purchaseEnd, cateringItem.purchaseEnd) && Intrinsics.areEqual(this.soldOutAt, cateringItem.soldOutAt) && Intrinsics.areEqual(this.sharingUrl, cateringItem.sharingUrl) && this.userPurchaseLimit == cateringItem.userPurchaseLimit && Intrinsics.areEqual(this.nextSalesWindowPurchaseStart, cateringItem.nextSalesWindowPurchaseStart) && this.itemType == cateringItem.itemType && this.itemIsNew == cateringItem.itemIsNew && Intrinsics.areEqual(this.itemTags, cateringItem.itemTags) && Intrinsics.areEqual(this.itemCardType, cateringItem.itemCardType) && Intrinsics.areEqual(this.ingredients, cateringItem.ingredients) && Intrinsics.areEqual(this.matchesFilters, cateringItem.matchesFilters);
    }

    @Override // com.app.tgtg.model.remote.item.response.Deliverable
    @Nullable
    public String getDeliveryEstimate() {
        CateringItemProperties cateringItemProperties = getInformation().getCateringItemProperties();
        if (cateringItemProperties != null) {
            return cateringItemProperties.getEstimatedDelivery();
        }
        return null;
    }

    @Override // com.app.tgtg.model.remote.item.response.BasicItem
    @NotNull
    public String getDisplayName() {
        return this.displayName;
    }

    @Override // com.app.tgtg.model.remote.item.response.BasicItem
    public double getDistance() {
        return this.distance;
    }

    @Override // com.app.tgtg.model.remote.item.response.BasicItem
    public boolean getFavorite() {
        return this.favorite;
    }

    @Nullable
    public final Boolean getInSalesWindow() {
        return this.inSalesWindow;
    }

    @Override // com.app.tgtg.model.remote.item.response.BasicItem
    @Nullable
    public Ingredients getIngredients() {
        return this.ingredients;
    }

    @Override // com.app.tgtg.model.remote.item.response.BasicItem
    @Nullable
    public ItemCardType getItemCardType() {
        return this.itemCardType;
    }

    @Override // com.app.tgtg.model.remote.item.response.BasicItem
    public boolean getItemIsNew() {
        return this.itemIsNew;
    }

    @Override // com.app.tgtg.model.remote.item.response.BasicItem
    @Nullable
    public List<ItemTagInfo> getItemTags() {
        return this.itemTags;
    }

    @Override // com.app.tgtg.model.remote.item.response.BasicItem
    @NotNull
    public ItemType getItemType() {
        return this.itemType;
    }

    @Override // com.app.tgtg.model.remote.item.response.BasicItem
    public int getItemsAvailable() {
        return this.itemsAvailable;
    }

    @Override // com.app.tgtg.model.remote.item.response.BasicItem
    @Nullable
    public Boolean getMatchesFilters() {
        return this.matchesFilters;
    }

    @Override // com.app.tgtg.model.remote.item.response.BasicItem
    @Nullable
    public String getNextSalesWindowPurchaseStart() {
        return this.nextSalesWindowPurchaseStart;
    }

    @Override // com.app.tgtg.model.remote.item.response.BasicItem
    @Nullable
    public PickupInterval getPickupIntervalOrNull() {
        return this.pickupIntervalOrNull;
    }

    @Override // com.app.tgtg.model.remote.item.response.BasicItem
    @NotNull
    public PickupLocation getPickupLocation() {
        return this.pickupLocation;
    }

    @Override // com.app.tgtg.model.remote.item.response.BasicItem
    @Nullable
    public String getPurchaseEnd() {
        return this.purchaseEnd;
    }

    @Override // com.app.tgtg.model.remote.item.response.BasicItem
    @Nullable
    public String getSharingUrl() {
        return this.sharingUrl;
    }

    @Override // com.app.tgtg.model.remote.item.response.BasicItem
    @Nullable
    public String getSoldOutAt() {
        return this.soldOutAt;
    }

    @Override // com.app.tgtg.model.remote.item.response.BasicItem
    @Nullable
    public StoreInformation getStoreInfoOrNull() {
        return this.storeInfoOrNull;
    }

    @Override // com.app.tgtg.model.remote.item.response.BasicItem
    public boolean getSubscribedForNotification() {
        return this.subscribedForNotification;
    }

    @Override // com.app.tgtg.model.remote.item.response.BasicItem
    public int getUserPurchaseLimit() {
        return this.userPurchaseLimit;
    }

    public int hashCode() {
        int iHashCode = this.information.hashCode() * 31;
        StoreInformation storeInformation = this.storeInfoOrNull;
        int iHashCode2 = (this.pickupLocation.hashCode() + l1.b((iHashCode + (storeInformation == null ? 0 : storeInformation.hashCode())) * 31, 31, this.displayName)) * 31;
        PickupInterval pickupInterval = this.pickupIntervalOrNull;
        int iE = k.e(k.e(s.b(this.distance, k.b(this.itemsAvailable, (iHashCode2 + (pickupInterval == null ? 0 : pickupInterval.hashCode())) * 31, 31), 31), 31, this.favorite), 31, this.subscribedForNotification);
        Boolean bool = this.inSalesWindow;
        int iHashCode3 = (iE + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.purchaseEnd;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.soldOutAt;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sharingUrl;
        int iB = k.b(this.userPurchaseLimit, (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        String str4 = this.nextSalesWindowPurchaseStart;
        int iE2 = k.e((this.itemType.hashCode() + ((iB + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31, 31, this.itemIsNew);
        List<ItemTagInfo> list = this.itemTags;
        int iHashCode6 = (iE2 + (list == null ? 0 : list.hashCode())) * 31;
        ItemCardType itemCardType = this.itemCardType;
        int iHashCode7 = (iHashCode6 + (itemCardType == null ? 0 : itemCardType.hashCode())) * 31;
        Ingredients ingredients = this.ingredients;
        int iHashCode8 = (iHashCode7 + (ingredients == null ? 0 : ingredients.hashCode())) * 31;
        Boolean bool2 = this.matchesFilters;
        return iHashCode8 + (bool2 != null ? bool2.hashCode() : 0);
    }

    @Override // com.app.tgtg.model.remote.item.response.BasicItem
    public void setDistance(double d3) {
        this.distance = d3;
    }

    @Override // com.app.tgtg.model.remote.item.response.BasicItem
    public void setFavorite(boolean z11) {
        this.favorite = z11;
    }

    public final void setInSalesWindow(@Nullable Boolean bool) {
        this.inSalesWindow = bool;
    }

    @Override // com.app.tgtg.model.remote.item.response.BasicItem
    public void setItemIsNew(boolean z11) {
        this.itemIsNew = z11;
    }

    @Override // com.app.tgtg.model.remote.item.response.BasicItem
    public void setItemType(@NotNull ItemType itemType) {
        itemType.getClass();
        this.itemType = itemType;
    }

    @Override // com.app.tgtg.model.remote.item.response.BasicItem
    public void setItemsAvailable(int i11) {
        this.itemsAvailable = i11;
    }

    @Override // com.app.tgtg.model.remote.item.response.BasicItem
    public void setNextSalesWindowPurchaseStart(@Nullable String str) {
        this.nextSalesWindowPurchaseStart = str;
    }

    @Override // com.app.tgtg.model.remote.item.response.BasicItem
    public void setPickupIntervalOrNull(@Nullable PickupInterval pickupInterval) {
        this.pickupIntervalOrNull = pickupInterval;
    }

    @Override // com.app.tgtg.model.remote.item.response.BasicItem
    public void setPurchaseEnd(@Nullable String str) {
        this.purchaseEnd = str;
    }

    @Override // com.app.tgtg.model.remote.item.response.BasicItem
    public void setSharingUrl(@Nullable String str) {
        this.sharingUrl = str;
    }

    @Override // com.app.tgtg.model.remote.item.response.BasicItem
    public void setSoldOutAt(@Nullable String str) {
        this.soldOutAt = str;
    }

    @Override // com.app.tgtg.model.remote.item.response.BasicItem
    public void setStoreInfoOrNull(@Nullable StoreInformation storeInformation) {
        this.storeInfoOrNull = storeInformation;
    }

    @Override // com.app.tgtg.model.remote.item.response.BasicItem
    public void setSubscribedForNotification(boolean z11) {
        this.subscribedForNotification = z11;
    }

    @Override // com.app.tgtg.model.remote.item.response.BasicItem
    public void setUserPurchaseLimit(int i11) {
        this.userPurchaseLimit = i11;
    }

    @NotNull
    public String toString() {
        CateringItemInformation cateringItemInformation = this.information;
        StoreInformation storeInformation = this.storeInfoOrNull;
        String str = this.displayName;
        PickupLocation pickupLocation = this.pickupLocation;
        PickupInterval pickupInterval = this.pickupIntervalOrNull;
        int i11 = this.itemsAvailable;
        double d3 = this.distance;
        boolean z11 = this.favorite;
        boolean z12 = this.subscribedForNotification;
        Boolean bool = this.inSalesWindow;
        String str2 = this.purchaseEnd;
        String str3 = this.soldOutAt;
        String str4 = this.sharingUrl;
        int i12 = this.userPurchaseLimit;
        String str5 = this.nextSalesWindowPurchaseStart;
        ItemType itemType = this.itemType;
        boolean z13 = this.itemIsNew;
        List<ItemTagInfo> list = this.itemTags;
        ItemCardType itemCardType = this.itemCardType;
        Ingredients ingredients = this.ingredients;
        Boolean bool2 = this.matchesFilters;
        StringBuilder sb2 = new StringBuilder("CateringItem(information=");
        sb2.append(cateringItemInformation);
        sb2.append(", storeInfoOrNull=");
        sb2.append(storeInformation);
        sb2.append(", displayName=");
        sb2.append(str);
        sb2.append(", pickupLocation=");
        sb2.append(pickupLocation);
        sb2.append(", pickupIntervalOrNull=");
        sb2.append(pickupInterval);
        sb2.append(", itemsAvailable=");
        sb2.append(i11);
        sb2.append(", distance=");
        sb2.append(d3);
        sb2.append(", favorite=");
        sb2.append(z11);
        sb2.append(", subscribedForNotification=");
        sb2.append(z12);
        sb2.append(", inSalesWindow=");
        sb2.append(bool);
        s.A(sb2, ", purchaseEnd=", str2, ", soldOutAt=", str3);
        sb2.append(", sharingUrl=");
        sb2.append(str4);
        sb2.append(", userPurchaseLimit=");
        sb2.append(i12);
        sb2.append(", nextSalesWindowPurchaseStart=");
        sb2.append(str5);
        sb2.append(", itemType=");
        sb2.append(itemType);
        sb2.append(", itemIsNew=");
        sb2.append(z13);
        sb2.append(", itemTags=");
        sb2.append(list);
        sb2.append(", itemCardType=");
        sb2.append(itemCardType);
        sb2.append(", ingredients=");
        sb2.append(ingredients);
        sb2.append(", matchesFilters=");
        sb2.append(bool2);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        this.information.writeToParcel(dest, flags);
        StoreInformation storeInformation = this.storeInfoOrNull;
        if (storeInformation == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            storeInformation.writeToParcel(dest, flags);
        }
        dest.writeString(this.displayName);
        this.pickupLocation.writeToParcel(dest, flags);
        PickupInterval pickupInterval = this.pickupIntervalOrNull;
        if (pickupInterval == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            pickupInterval.writeToParcel(dest, flags);
        }
        dest.writeInt(this.itemsAvailable);
        dest.writeDouble(this.distance);
        dest.writeInt(this.favorite ? 1 : 0);
        dest.writeInt(this.subscribedForNotification ? 1 : 0);
        Boolean bool = this.inSalesWindow;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            i.v(dest, 1, bool);
        }
        dest.writeString(this.purchaseEnd);
        dest.writeString(this.soldOutAt);
        dest.writeString(this.sharingUrl);
        dest.writeInt(this.userPurchaseLimit);
        dest.writeString(this.nextSalesWindowPurchaseStart);
        dest.writeString(this.itemType.name());
        dest.writeInt(this.itemIsNew ? 1 : 0);
        List<ItemTagInfo> list = this.itemTags;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = i.q(dest, 1, list);
            while (itQ.hasNext()) {
                ((ItemTagInfo) itQ.next()).writeToParcel(dest, flags);
            }
        }
        ItemCardType itemCardType = this.itemCardType;
        if (itemCardType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            itemCardType.writeToParcel(dest, flags);
        }
        Ingredients ingredients = this.ingredients;
        if (ingredients == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            ingredients.writeToParcel(dest, flags);
        }
        Boolean bool2 = this.matchesFilters;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            i.v(dest, 1, bool2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/item/response/CateringItem$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/item/response/CateringItem;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return CateringItem$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CateringItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CateringItem createFromParcel(Parcel parcel) {
            boolean z11;
            Boolean boolValueOf;
            boolean z12;
            ItemType itemType;
            boolean z13;
            ArrayList arrayList;
            Boolean boolValueOf2;
            parcel.getClass();
            CateringItemInformation cateringItemInformationCreateFromParcel = CateringItemInformation.CREATOR.createFromParcel(parcel);
            StoreInformation storeInformationCreateFromParcel = parcel.readInt() == 0 ? null : StoreInformation.CREATOR.createFromParcel(parcel);
            String string = parcel.readString();
            PickupLocation pickupLocationCreateFromParcel = PickupLocation.CREATOR.createFromParcel(parcel);
            PickupInterval pickupIntervalCreateFromParcel = parcel.readInt() == 0 ? null : PickupInterval.CREATOR.createFromParcel(parcel);
            int i11 = parcel.readInt();
            double d3 = parcel.readDouble();
            boolean z14 = false;
            if (parcel.readInt() != 0) {
                z11 = false;
                z14 = true;
            } else {
                z11 = false;
            }
            boolean z15 = parcel.readInt() != 0 ? true : z11;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0 ? true : z11);
            }
            String string2 = parcel.readString();
            boolean z16 = z15;
            Boolean bool = boolValueOf;
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            int i12 = parcel.readInt();
            String string5 = parcel.readString();
            ItemType itemTypeValueOf = ItemType.valueOf(parcel.readString());
            if (parcel.readInt() != 0) {
                z12 = z16;
                itemType = itemTypeValueOf;
                z13 = true;
            } else {
                z12 = z16;
                itemType = itemTypeValueOf;
                z13 = z11;
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i13 = parcel.readInt();
                arrayList = new ArrayList(i13);
                int iC = 0;
                while (iC != i13) {
                    iC = i.c(ItemTagInfo.CREATOR, parcel, arrayList, iC, 1);
                    i13 = i13;
                    cateringItemInformationCreateFromParcel = cateringItemInformationCreateFromParcel;
                }
            }
            CateringItemInformation cateringItemInformation = cateringItemInformationCreateFromParcel;
            ItemCardType itemCardTypeCreateFromParcel = parcel.readInt() == 0 ? null : ItemCardType.CREATOR.createFromParcel(parcel);
            Ingredients ingredientsCreateFromParcel = parcel.readInt() == 0 ? null : Ingredients.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new CateringItem(cateringItemInformation, storeInformationCreateFromParcel, string, pickupLocationCreateFromParcel, pickupIntervalCreateFromParcel, i11, d3, z14, z12, bool, string2, string3, string4, i12, string5, itemType, z13, arrayList, itemCardTypeCreateFromParcel, ingredientsCreateFromParcel, boolValueOf2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CateringItem[] newArray(int i11) {
            return new CateringItem[i11];
        }
    }

    @Override // com.app.tgtg.model.remote.item.response.BasicItem
    @NotNull
    public CateringItemInformation getInformation() {
        return this.information;
    }

    @g("display_name")
    public static /* synthetic */ void getDisplayName$annotations() {
    }

    @g("distance")
    public static /* synthetic */ void getDistance$annotations() {
    }

    @g("favorite")
    public static /* synthetic */ void getFavorite$annotations() {
    }

    @g("in_sales_window")
    public static /* synthetic */ void getInSalesWindow$annotations() {
    }

    @g("item")
    public static /* synthetic */ void getInformation$annotations() {
    }

    @g("item_ingredients")
    public static /* synthetic */ void getIngredients$annotations() {
    }

    @g("item_card")
    public static /* synthetic */ void getItemCardType$annotations() {
    }

    @g("new_item")
    public static /* synthetic */ void getItemIsNew$annotations() {
    }

    @g("item_tags")
    public static /* synthetic */ void getItemTags$annotations() {
    }

    @g("item_type")
    public static /* synthetic */ void getItemType$annotations() {
    }

    @g("items_available")
    public static /* synthetic */ void getItemsAvailable$annotations() {
    }

    @g("matches_filters")
    public static /* synthetic */ void getMatchesFilters$annotations() {
    }

    @g("next_sales_window_purchase_start")
    public static /* synthetic */ void getNextSalesWindowPurchaseStart$annotations() {
    }

    @g("pickup_interval")
    public static /* synthetic */ void getPickupIntervalOrNull$annotations() {
    }

    @g("pickup_location")
    public static /* synthetic */ void getPickupLocation$annotations() {
    }

    @g("purchase_end")
    public static /* synthetic */ void getPurchaseEnd$annotations() {
    }

    @g("sharing_url")
    public static /* synthetic */ void getSharingUrl$annotations() {
    }

    @g("sold_out_at")
    public static /* synthetic */ void getSoldOutAt$annotations() {
    }

    @g("store")
    public static /* synthetic */ void getStoreInfoOrNull$annotations() {
    }

    @g("subscribed_to_notification")
    public static /* synthetic */ void getSubscribedForNotification$annotations() {
    }

    @g("user_purchase_limit")
    public static /* synthetic */ void getUserPurchaseLimit$annotations() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CateringItem(@NotNull CateringItemInformation cateringItemInformation, @Nullable StoreInformation storeInformation, @NotNull String str, @NotNull PickupLocation pickupLocation, @Nullable PickupInterval pickupInterval, int i11, double d3, boolean z11, boolean z12, @Nullable Boolean bool, @Nullable String str2, @Nullable String str3, @Nullable String str4, int i12, @Nullable String str5, @NotNull ItemType itemType, boolean z13, @Nullable List<ItemTagInfo> list, @Nullable ItemCardType itemCardType, @Nullable Ingredients ingredients, @Nullable Boolean bool2) {
        super(null);
        cateringItemInformation.getClass();
        str.getClass();
        pickupLocation.getClass();
        itemType.getClass();
        this.information = cateringItemInformation;
        this.storeInfoOrNull = storeInformation;
        this.displayName = str;
        this.pickupLocation = pickupLocation;
        this.pickupIntervalOrNull = pickupInterval;
        this.itemsAvailable = i11;
        this.distance = d3;
        this.favorite = z11;
        this.subscribedForNotification = z12;
        this.inSalesWindow = bool;
        this.purchaseEnd = str2;
        this.soldOutAt = str3;
        this.sharingUrl = str4;
        this.userPurchaseLimit = i12;
        this.nextSalesWindowPurchaseStart = str5;
        this.itemType = itemType;
        this.itemIsNew = z13;
        this.itemTags = list;
        this.itemCardType = itemCardType;
        this.ingredients = ingredients;
        this.matchesFilters = bool2;
    }

    public /* synthetic */ CateringItem(CateringItemInformation cateringItemInformation, StoreInformation storeInformation, String str, PickupLocation pickupLocation, PickupInterval pickupInterval, int i11, double d3, boolean z11, boolean z12, Boolean bool, String str2, String str3, String str4, int i12, String str5, ItemType itemType, boolean z13, List list, ItemCardType itemCardType, Ingredients ingredients, Boolean bool2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(cateringItemInformation, (i13 & 2) != 0 ? new StoreInformation((String) null, (String) null, (String) null, (String) null, (String) null, (StoreLocation) null, (Picture) null, (String) null, false, (List) null, (List) null, 0.0d, (Picture) null, false, (String) null, (String) null, (String) null, (DeliveryMethod) null, (StoreLegalInformation) null, (LocalHero) null, false, (String) null, 4194303, (DefaultConstructorMarker) null) : storeInformation, (i13 & 4) != 0 ? "" : str, (i13 & 8) != 0 ? new PickupLocation((Address) null, (String) null, (LatLngInfo) null, 7, (DefaultConstructorMarker) null) : pickupLocation, pickupInterval, (i13 & 32) != 0 ? 0 : i11, (i13 & 64) != 0 ? 0.0d : d3, (i13 & 128) != 0 ? false : z11, (i13 & 256) != 0 ? false : z12, (i13 & 512) != 0 ? null : bool, (i13 & 1024) != 0 ? null : str2, (i13 & NewHope.SENDB_BYTES) != 0 ? null : str3, (i13 & 4096) != 0 ? null : str4, (i13 & 8192) != 0 ? 0 : i12, (i13 & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) != 0 ? null : str5, (32768 & i13) != 0 ? ItemType.CATERING : itemType, (65536 & i13) != 0 ? false : z13, (131072 & i13) != 0 ? null : list, (262144 & i13) != 0 ? null : itemCardType, (524288 & i13) != 0 ? null : ingredients, (i13 & 1048576) != 0 ? Boolean.TRUE : bool2);
    }
}
