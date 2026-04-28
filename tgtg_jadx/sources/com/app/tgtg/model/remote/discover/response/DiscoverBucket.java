package com.app.tgtg.model.remote.discover.response;

import android.os.Parcel;
import android.os.Parcelable;
import au.a;
import b3.i;
import com.app.tgtg.model.remote.item.AppliedFilter;
import com.app.tgtg.model.remote.item.AppliedFilter$$serializer;
import com.app.tgtg.model.remote.item.QuickFilter;
import com.app.tgtg.model.remote.item.QuickFilter$$serializer;
import com.app.tgtg.model.remote.item.StoreInformation;
import com.app.tgtg.model.remote.item.StoreInformation$$serializer;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.item.response.Item;
import com.app.tgtg.model.remote.item.response.Item$$serializer;
import com.app.tgtg.model.remote.order.Order;
import com.app.tgtg.model.remote.order.Order$$serializer;
import com.app.tgtg.model.remote.profile.response.LoyaltyCardDetails;
import com.app.tgtg.model.remote.profile.response.LoyaltyCardDetails$$serializer;
import i90.g;
import i90.h;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.m1;
import m90.r1;
import nq.d;
import org.bouncycastle.i18n.MessageBundle;
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
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bi\b\u0007\u0018\u0000 ¡\u00012\u00020\u00012\u00020\u0002:\u0004¢\u0001¡\u0001B\u0085\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u001c\b\u0002\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u000b\u0018\u0001`\f\u0012\u001c\b\u0002\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u000e\u0018\u0001`\f\u0012\u001c\b\u0002\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u0000\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u0000\u0018\u0001`\f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u001f\u001a\u00020\u0003\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\u001c\b\u0002\u0010\"\u001a\u0016\u0012\u0004\u0012\u00020!\u0018\u00010\nj\n\u0012\u0004\u0012\u00020!\u0018\u0001`\f\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b(\u0010)BÁ\u0002\b\u0010\u0012\u0006\u0010+\u001a\u00020*\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\n\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\n\u0012\b\u0010$\u001a\u0004\u0018\u00010#\u0012\b\u0010&\u001a\u0004\u0018\u00010%\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\b(\u0010.J\r\u0010/\u001a\u00020*¢\u0006\u0004\b/\u00100J\u001d\u00105\u001a\u0002042\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u00020*¢\u0006\u0004\b5\u00106J'\u0010>\u001a\u0002042\u0006\u00107\u001a\u00020\u00002\u0006\u00109\u001a\u0002082\u0006\u0010;\u001a\u00020:H\u0001¢\u0006\u0004\b<\u0010=R(\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0004\u0010?\u0012\u0004\bD\u0010E\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR(\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010?\u0012\u0004\bH\u0010E\u001a\u0004\bF\u0010A\"\u0004\bG\u0010CR(\u0010\u0006\u001a\u00020\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u0018\n\u0004\b\u0006\u0010?\u0012\u0004\bK\u0010E\u001a\u0004\bI\u0010A\"\u0004\bJ\u0010CR*\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0007\u0010?\u0012\u0004\bN\u0010E\u001a\u0004\bL\u0010A\"\u0004\bM\u0010CR*\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\b\u0010?\u0012\u0004\bQ\u0010E\u001a\u0004\bO\u0010A\"\u0004\bP\u0010CR*\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\t\u0010?\u0012\u0004\bT\u0010E\u001a\u0004\bR\u0010A\"\u0004\bS\u0010CR<\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u000b\u0018\u0001`\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\r\u0010U\u0012\u0004\bZ\u0010E\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR<\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u000e\u0018\u0001`\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u000f\u0010U\u0012\u0004\b]\u0010E\u001a\u0004\b[\u0010W\"\u0004\b\\\u0010YR<\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u0000\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u0000\u0018\u0001`\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0010\u0010U\u0012\u0004\b`\u0010E\u001a\u0004\b^\u0010W\"\u0004\b_\u0010YR*\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0011\u0010?\u0012\u0004\bc\u0010E\u001a\u0004\ba\u0010A\"\u0004\bb\u0010CR*\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0012\u0010?\u0012\u0004\bf\u0010E\u001a\u0004\bd\u0010A\"\u0004\be\u0010CR*\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0013\u0010?\u0012\u0004\bi\u0010E\u001a\u0004\bg\u0010A\"\u0004\bh\u0010CR*\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0015\u0010j\u0012\u0004\bo\u0010E\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR*\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0016\u0010?\u0012\u0004\br\u0010E\u001a\u0004\bp\u0010A\"\u0004\bq\u0010CR*\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0017\u0010?\u0012\u0004\bu\u0010E\u001a\u0004\bs\u0010A\"\u0004\bt\u0010CR*\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0019\u0010v\u0012\u0004\b{\u0010E\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR*\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u001a\u0010?\u0012\u0004\b~\u0010E\u001a\u0004\b|\u0010A\"\u0004\b}\u0010CR,\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u001a\n\u0004\b\u001b\u0010?\u0012\u0005\b\u0081\u0001\u0010E\u001a\u0004\b\u007f\u0010A\"\u0005\b\u0080\u0001\u0010CR-\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u001b\n\u0004\b\u001c\u0010?\u0012\u0005\b\u0084\u0001\u0010E\u001a\u0005\b\u0082\u0001\u0010A\"\u0005\b\u0083\u0001\u0010CR-\u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u001b\n\u0004\b\u001d\u0010?\u0012\u0005\b\u0087\u0001\u0010E\u001a\u0005\b\u0085\u0001\u0010A\"\u0005\b\u0086\u0001\u0010CR-\u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u001b\n\u0004\b\u001e\u0010?\u0012\u0005\b\u008a\u0001\u0010E\u001a\u0005\b\u0088\u0001\u0010A\"\u0005\b\u0089\u0001\u0010CR+\u0010\u001f\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u001b\n\u0004\b\u001f\u0010?\u0012\u0005\b\u008d\u0001\u0010E\u001a\u0005\b\u008b\u0001\u0010A\"\u0005\b\u008c\u0001\u0010CR-\u0010 \u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u001b\n\u0004\b \u0010?\u0012\u0005\b\u0090\u0001\u0010E\u001a\u0005\b\u008e\u0001\u0010A\"\u0005\b\u008f\u0001\u0010CR?\u0010\"\u001a\u0016\u0012\u0004\u0012\u00020!\u0018\u00010\nj\n\u0012\u0004\u0012\u00020!\u0018\u0001`\f8\u0006@\u0006X\u0087\u000e¢\u0006\u001b\n\u0004\b\"\u0010U\u0012\u0005\b\u0093\u0001\u0010E\u001a\u0005\b\u0091\u0001\u0010W\"\u0005\b\u0092\u0001\u0010YR0\u0010$\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0087\u000e¢\u0006\u001e\n\u0005\b$\u0010\u0094\u0001\u0012\u0005\b\u0099\u0001\u0010E\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001\"\u0006\b\u0097\u0001\u0010\u0098\u0001R&\u0010&\u001a\u0004\u0018\u00010%8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b&\u0010\u009a\u0001\u0012\u0005\b\u009d\u0001\u0010E\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R-\u0010'\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u001b\n\u0004\b'\u0010?\u0012\u0005\b \u0001\u0010E\u001a\u0005\b\u009e\u0001\u0010A\"\u0005\b\u009f\u0001\u0010C¨\u0006£\u0001"}, d2 = {"Lcom/app/tgtg/model/remote/discover/response/DiscoverBucket;", "Lnq/d;", "Landroid/os/Parcelable;", "", "bucketType", "displayType", MessageBundle.TITLE_ENTRY, "description", "subtitle", "secondaryDescription", "Ljava/util/ArrayList;", "Lcom/app/tgtg/model/remote/item/response/BasicItem;", "Lkotlin/collections/ArrayList;", "items", "Lcom/app/tgtg/model/remote/item/StoreInformation;", "stores", "actions", "subtext", "button", "spacer", "Lcom/app/tgtg/model/remote/item/response/Item;", "donation", "jobContext", "jobHeadline", "Lcom/app/tgtg/model/remote/order/Order;", "ratingOrder", "ratingCollectedOn", "ratingQuestion", "socialTitle", "socialDescription", "socialButton", "fillerType", "iconUrl", "Lcom/app/tgtg/model/remote/item/QuickFilter;", "quickFilters", "Lcom/app/tgtg/model/remote/item/AppliedFilter;", "appliedFilters", "Lcom/app/tgtg/model/remote/profile/response/LoyaltyCardDetails;", "loyaltyCardDetails", "tag", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/item/response/Item;Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/order/Order;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Lcom/app/tgtg/model/remote/item/AppliedFilter;Lcom/app/tgtg/model/remote/profile/response/LoyaltyCardDetails;Ljava/lang/String;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/item/response/Item;Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/order/Order;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Lcom/app/tgtg/model/remote/item/AppliedFilter;Lcom/app/tgtg/model/remote/profile/response/LoyaltyCardDetails;Ljava/lang/String;Lm90/m1;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "write$Self$app", "(Lcom/app/tgtg/model/remote/discover/response/DiscoverBucket;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getBucketType", "()Ljava/lang/String;", "setBucketType", "(Ljava/lang/String;)V", "getBucketType$annotations", "()V", "getDisplayType", "setDisplayType", "getDisplayType$annotations", "getTitle", "setTitle", "getTitle$annotations", "getDescription", "setDescription", "getDescription$annotations", "getSubtitle", "setSubtitle", "getSubtitle$annotations", "getSecondaryDescription", "setSecondaryDescription", "getSecondaryDescription$annotations", "Ljava/util/ArrayList;", "getItems", "()Ljava/util/ArrayList;", "setItems", "(Ljava/util/ArrayList;)V", "getItems$annotations", "getStores", "setStores", "getStores$annotations", "getActions", "setActions", "getActions$annotations", "getSubtext", "setSubtext", "getSubtext$annotations", "getButton", "setButton", "getButton$annotations", "getSpacer", "setSpacer", "getSpacer$annotations", "Lcom/app/tgtg/model/remote/item/response/Item;", "getDonation", "()Lcom/app/tgtg/model/remote/item/response/Item;", "setDonation", "(Lcom/app/tgtg/model/remote/item/response/Item;)V", "getDonation$annotations", "getJobContext", "setJobContext", "getJobContext$annotations", "getJobHeadline", "setJobHeadline", "getJobHeadline$annotations", "Lcom/app/tgtg/model/remote/order/Order;", "getRatingOrder", "()Lcom/app/tgtg/model/remote/order/Order;", "setRatingOrder", "(Lcom/app/tgtg/model/remote/order/Order;)V", "getRatingOrder$annotations", "getRatingCollectedOn", "setRatingCollectedOn", "getRatingCollectedOn$annotations", "getRatingQuestion", "setRatingQuestion", "getRatingQuestion$annotations", "getSocialTitle", "setSocialTitle", "getSocialTitle$annotations", "getSocialDescription", "setSocialDescription", "getSocialDescription$annotations", "getSocialButton", "setSocialButton", "getSocialButton$annotations", "getFillerType", "setFillerType", "getFillerType$annotations", "getIconUrl", "setIconUrl", "getIconUrl$annotations", "getQuickFilters", "setQuickFilters", "getQuickFilters$annotations", "Lcom/app/tgtg/model/remote/item/AppliedFilter;", "getAppliedFilters", "()Lcom/app/tgtg/model/remote/item/AppliedFilter;", "setAppliedFilters", "(Lcom/app/tgtg/model/remote/item/AppliedFilter;)V", "getAppliedFilters$annotations", "Lcom/app/tgtg/model/remote/profile/response/LoyaltyCardDetails;", "getLoyaltyCardDetails", "()Lcom/app/tgtg/model/remote/profile/response/LoyaltyCardDetails;", "getLoyaltyCardDetails$annotations", "getTag", "setTag", "getTag$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DiscoverBucket extends d implements Parcelable {

    @NotNull
    private static final j[] $childSerializers;

    @Nullable
    private ArrayList<DiscoverBucket> actions;

    @Nullable
    private AppliedFilter appliedFilters;

    @NotNull
    private String bucketType;

    @Nullable
    private String button;

    @Nullable
    private String description;

    @NotNull
    private String displayType;

    @Nullable
    private Item donation;

    @NotNull
    private String fillerType;

    @Nullable
    private String iconUrl;

    @Nullable
    private ArrayList<BasicItem> items;

    @Nullable
    private String jobContext;

    @Nullable
    private String jobHeadline;

    @Nullable
    private final LoyaltyCardDetails loyaltyCardDetails;

    @Nullable
    private ArrayList<QuickFilter> quickFilters;

    @Nullable
    private String ratingCollectedOn;

    @Nullable
    private Order ratingOrder;

    @Nullable
    private String ratingQuestion;

    @Nullable
    private String secondaryDescription;

    @Nullable
    private String socialButton;

    @Nullable
    private String socialDescription;

    @Nullable
    private String socialTitle;

    @Nullable
    private String spacer;

    @Nullable
    private ArrayList<StoreInformation> stores;

    @Nullable
    private String subtext;

    @Nullable
    private String subtitle;

    @Nullable
    private String tag;

    @NotNull
    private String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<DiscoverBucket> CREATOR = new Creator();

    static {
        m mVar = m.PUBLICATION;
        $childSerializers = new j[]{null, null, null, null, null, null, l.a(mVar, new atd.g.d(27)), l.a(mVar, new atd.g.d(28)), l.a(mVar, new atd.g.d(29)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, l.a(mVar, new a(0)), null, null, null};
    }

    public /* synthetic */ DiscoverBucket(int i11, String str, String str2, String str3, String str4, String str5, String str6, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str7, String str8, String str9, Item item, String str10, String str11, Order order, String str12, String str13, String str14, String str15, String str16, String str17, String str18, ArrayList arrayList4, AppliedFilter appliedFilter, LoyaltyCardDetails loyaltyCardDetails, String str19, m1 m1Var) {
        if (2097155 != (i11 & 2097155)) {
            c1.j(i11, 2097155, DiscoverBucket$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.bucketType = str;
        this.displayType = str2;
        if ((i11 & 4) == 0) {
            this.title = "";
        } else {
            this.title = str3;
        }
        if ((i11 & 8) == 0) {
            this.description = null;
        } else {
            this.description = str4;
        }
        if ((i11 & 16) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = str5;
        }
        if ((i11 & 32) == 0) {
            this.secondaryDescription = null;
        } else {
            this.secondaryDescription = str6;
        }
        if ((i11 & 64) == 0) {
            this.items = null;
        } else {
            this.items = arrayList;
        }
        if ((i11 & 128) == 0) {
            this.stores = null;
        } else {
            this.stores = arrayList2;
        }
        if ((i11 & 256) == 0) {
            this.actions = null;
        } else {
            this.actions = arrayList3;
        }
        if ((i11 & 512) == 0) {
            this.subtext = null;
        } else {
            this.subtext = str7;
        }
        if ((i11 & 1024) == 0) {
            this.button = null;
        } else {
            this.button = str8;
        }
        if ((i11 & NewHope.SENDB_BYTES) == 0) {
            this.spacer = null;
        } else {
            this.spacer = str9;
        }
        if ((i11 & 4096) == 0) {
            this.donation = null;
        } else {
            this.donation = item;
        }
        if ((i11 & 8192) == 0) {
            this.jobContext = null;
        } else {
            this.jobContext = str10;
        }
        if ((i11 & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) == 0) {
            this.jobHeadline = null;
        } else {
            this.jobHeadline = str11;
        }
        if ((32768 & i11) == 0) {
            this.ratingOrder = null;
        } else {
            this.ratingOrder = order;
        }
        if ((65536 & i11) == 0) {
            this.ratingCollectedOn = null;
        } else {
            this.ratingCollectedOn = str12;
        }
        if ((131072 & i11) == 0) {
            this.ratingQuestion = null;
        } else {
            this.ratingQuestion = str13;
        }
        if ((262144 & i11) == 0) {
            this.socialTitle = null;
        } else {
            this.socialTitle = str14;
        }
        if ((524288 & i11) == 0) {
            this.socialDescription = null;
        } else {
            this.socialDescription = str15;
        }
        if ((1048576 & i11) == 0) {
            this.socialButton = null;
        } else {
            this.socialButton = str16;
        }
        this.fillerType = str17;
        if ((4194304 & i11) == 0) {
            this.iconUrl = null;
        } else {
            this.iconUrl = str18;
        }
        if ((8388608 & i11) == 0) {
            this.quickFilters = null;
        } else {
            this.quickFilters = arrayList4;
        }
        if ((16777216 & i11) == 0) {
            this.appliedFilters = null;
        } else {
            this.appliedFilters = appliedFilter;
        }
        if ((33554432 & i11) == 0) {
            this.loyaltyCardDetails = null;
        } else {
            this.loyaltyCardDetails = loyaltyCardDetails;
        }
        if ((i11 & 67108864) == 0) {
            this.tag = null;
        } else {
            this.tag = str19;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new m90.d(BasicItem.INSTANCE.serializer(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new m90.d(StoreInformation$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new m90.d(DiscoverBucket$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$2() {
        return new m90.d(QuickFilter$$serializer.INSTANCE, 0);
    }

    public static final /* synthetic */ void write$Self$app(DiscoverBucket self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        output.q(serialDesc, 0, self.bucketType);
        output.q(serialDesc, 1, self.displayType);
        if (output.C(serialDesc) || !Intrinsics.areEqual(self.getTitle(), "")) {
            output.q(serialDesc, 2, self.getTitle());
        }
        if (output.C(serialDesc) || self.description != null) {
            output.r(serialDesc, 3, r1.f29848a, self.description);
        }
        if (output.C(serialDesc) || self.subtitle != null) {
            output.r(serialDesc, 4, r1.f29848a, self.subtitle);
        }
        if (output.C(serialDesc) || self.secondaryDescription != null) {
            output.r(serialDesc, 5, r1.f29848a, self.secondaryDescription);
        }
        if (output.C(serialDesc) || self.items != null) {
            output.r(serialDesc, 6, (KSerializer) jVarArr[6].getValue(), self.items);
        }
        if (output.C(serialDesc) || self.stores != null) {
            output.r(serialDesc, 7, (KSerializer) jVarArr[7].getValue(), self.stores);
        }
        if (output.C(serialDesc) || self.actions != null) {
            output.r(serialDesc, 8, (KSerializer) jVarArr[8].getValue(), self.actions);
        }
        if (output.C(serialDesc) || self.subtext != null) {
            output.r(serialDesc, 9, r1.f29848a, self.subtext);
        }
        if (output.C(serialDesc) || self.button != null) {
            output.r(serialDesc, 10, r1.f29848a, self.button);
        }
        if (output.C(serialDesc) || self.spacer != null) {
            output.r(serialDesc, 11, r1.f29848a, self.spacer);
        }
        if (output.C(serialDesc) || self.donation != null) {
            output.r(serialDesc, 12, Item$$serializer.INSTANCE, self.donation);
        }
        if (output.C(serialDesc) || self.jobContext != null) {
            output.r(serialDesc, 13, r1.f29848a, self.jobContext);
        }
        if (output.C(serialDesc) || self.jobHeadline != null) {
            output.r(serialDesc, 14, r1.f29848a, self.jobHeadline);
        }
        if (output.C(serialDesc) || self.ratingOrder != null) {
            output.r(serialDesc, 15, Order$$serializer.INSTANCE, self.ratingOrder);
        }
        if (output.C(serialDesc) || self.ratingCollectedOn != null) {
            output.r(serialDesc, 16, r1.f29848a, self.ratingCollectedOn);
        }
        if (output.C(serialDesc) || self.ratingQuestion != null) {
            output.r(serialDesc, 17, r1.f29848a, self.ratingQuestion);
        }
        if (output.C(serialDesc) || self.socialTitle != null) {
            output.r(serialDesc, 18, r1.f29848a, self.socialTitle);
        }
        if (output.C(serialDesc) || self.socialDescription != null) {
            output.r(serialDesc, 19, r1.f29848a, self.socialDescription);
        }
        if (output.C(serialDesc) || self.socialButton != null) {
            output.r(serialDesc, 20, r1.f29848a, self.socialButton);
        }
        output.q(serialDesc, 21, self.fillerType);
        if (output.C(serialDesc) || self.iconUrl != null) {
            output.r(serialDesc, 22, r1.f29848a, self.iconUrl);
        }
        if (output.C(serialDesc) || self.quickFilters != null) {
            output.r(serialDesc, 23, (KSerializer) jVarArr[23].getValue(), self.quickFilters);
        }
        if (output.C(serialDesc) || self.appliedFilters != null) {
            output.r(serialDesc, 24, AppliedFilter$$serializer.INSTANCE, self.appliedFilters);
        }
        if (output.C(serialDesc) || self.loyaltyCardDetails != null) {
            output.r(serialDesc, 25, LoyaltyCardDetails$$serializer.INSTANCE, self.loyaltyCardDetails);
        }
        if (!output.C(serialDesc) && self.tag == null) {
            return;
        }
        output.r(serialDesc, 26, r1.f29848a, self.tag);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Nullable
    public final ArrayList<DiscoverBucket> getActions() {
        return this.actions;
    }

    @Nullable
    public final AppliedFilter getAppliedFilters() {
        return this.appliedFilters;
    }

    @NotNull
    public final String getBucketType() {
        return this.bucketType;
    }

    @Nullable
    public final String getButton() {
        return this.button;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final String getDisplayType() {
        return this.displayType;
    }

    @Nullable
    public final Item getDonation() {
        return this.donation;
    }

    @NotNull
    public final String getFillerType() {
        return this.fillerType;
    }

    @Nullable
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    public final ArrayList<BasicItem> getItems() {
        return this.items;
    }

    @Nullable
    public final String getJobContext() {
        return this.jobContext;
    }

    @Nullable
    public final String getJobHeadline() {
        return this.jobHeadline;
    }

    @Nullable
    public final LoyaltyCardDetails getLoyaltyCardDetails() {
        return this.loyaltyCardDetails;
    }

    @Nullable
    public final ArrayList<QuickFilter> getQuickFilters() {
        return this.quickFilters;
    }

    @Nullable
    public final String getRatingCollectedOn() {
        return this.ratingCollectedOn;
    }

    @Nullable
    public final Order getRatingOrder() {
        return this.ratingOrder;
    }

    @Nullable
    public final String getRatingQuestion() {
        return this.ratingQuestion;
    }

    @Nullable
    public final String getSecondaryDescription() {
        return this.secondaryDescription;
    }

    @Nullable
    public final String getSocialButton() {
        return this.socialButton;
    }

    @Nullable
    public final String getSocialDescription() {
        return this.socialDescription;
    }

    @Nullable
    public final String getSocialTitle() {
        return this.socialTitle;
    }

    @Nullable
    public final String getSpacer() {
        return this.spacer;
    }

    @Nullable
    public final ArrayList<StoreInformation> getStores() {
        return this.stores;
    }

    @Nullable
    public final String getSubtext() {
        return this.subtext;
    }

    @Nullable
    public final String getSubtitle() {
        return this.subtitle;
    }

    @Nullable
    public final String getTag() {
        return this.tag;
    }

    @Override // nq.d
    @NotNull
    public String getTitle() {
        return this.title;
    }

    public final void setActions(@Nullable ArrayList<DiscoverBucket> arrayList) {
        this.actions = arrayList;
    }

    public final void setAppliedFilters(@Nullable AppliedFilter appliedFilter) {
        this.appliedFilters = appliedFilter;
    }

    public final void setBucketType(@NotNull String str) {
        str.getClass();
        this.bucketType = str;
    }

    public final void setButton(@Nullable String str) {
        this.button = str;
    }

    public final void setDescription(@Nullable String str) {
        this.description = str;
    }

    public final void setDisplayType(@NotNull String str) {
        str.getClass();
        this.displayType = str;
    }

    public final void setDonation(@Nullable Item item) {
        this.donation = item;
    }

    public final void setFillerType(@NotNull String str) {
        str.getClass();
        this.fillerType = str;
    }

    public final void setIconUrl(@Nullable String str) {
        this.iconUrl = str;
    }

    public final void setItems(@Nullable ArrayList<BasicItem> arrayList) {
        this.items = arrayList;
    }

    public final void setJobContext(@Nullable String str) {
        this.jobContext = str;
    }

    public final void setJobHeadline(@Nullable String str) {
        this.jobHeadline = str;
    }

    public final void setQuickFilters(@Nullable ArrayList<QuickFilter> arrayList) {
        this.quickFilters = arrayList;
    }

    public final void setRatingCollectedOn(@Nullable String str) {
        this.ratingCollectedOn = str;
    }

    public final void setRatingOrder(@Nullable Order order) {
        this.ratingOrder = order;
    }

    public final void setRatingQuestion(@Nullable String str) {
        this.ratingQuestion = str;
    }

    public final void setSecondaryDescription(@Nullable String str) {
        this.secondaryDescription = str;
    }

    public final void setSocialButton(@Nullable String str) {
        this.socialButton = str;
    }

    public final void setSocialDescription(@Nullable String str) {
        this.socialDescription = str;
    }

    public final void setSocialTitle(@Nullable String str) {
        this.socialTitle = str;
    }

    public final void setSpacer(@Nullable String str) {
        this.spacer = str;
    }

    public final void setStores(@Nullable ArrayList<StoreInformation> arrayList) {
        this.stores = arrayList;
    }

    public final void setSubtext(@Nullable String str) {
        this.subtext = str;
    }

    public final void setSubtitle(@Nullable String str) {
        this.subtitle = str;
    }

    public final void setTag(@Nullable String str) {
        this.tag = str;
    }

    public void setTitle(@NotNull String str) {
        str.getClass();
        this.title = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.bucketType);
        dest.writeString(this.displayType);
        dest.writeString(this.title);
        dest.writeString(this.description);
        dest.writeString(this.subtitle);
        dest.writeString(this.secondaryDescription);
        ArrayList<BasicItem> arrayList = this.items;
        if (arrayList == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(arrayList.size());
            Iterator<BasicItem> it = arrayList.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
        }
        ArrayList<StoreInformation> arrayList2 = this.stores;
        if (arrayList2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(arrayList2.size());
            Iterator<StoreInformation> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(dest, flags);
            }
        }
        ArrayList<DiscoverBucket> arrayList3 = this.actions;
        if (arrayList3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(arrayList3.size());
            Iterator<DiscoverBucket> it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                it3.next().writeToParcel(dest, flags);
            }
        }
        dest.writeString(this.subtext);
        dest.writeString(this.button);
        dest.writeString(this.spacer);
        Item item = this.donation;
        if (item == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            item.writeToParcel(dest, flags);
        }
        dest.writeString(this.jobContext);
        dest.writeString(this.jobHeadline);
        Order order = this.ratingOrder;
        if (order == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            order.writeToParcel(dest, flags);
        }
        dest.writeString(this.ratingCollectedOn);
        dest.writeString(this.ratingQuestion);
        dest.writeString(this.socialTitle);
        dest.writeString(this.socialDescription);
        dest.writeString(this.socialButton);
        dest.writeString(this.fillerType);
        dest.writeString(this.iconUrl);
        ArrayList<QuickFilter> arrayList4 = this.quickFilters;
        if (arrayList4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(arrayList4.size());
            Iterator<QuickFilter> it4 = arrayList4.iterator();
            while (it4.hasNext()) {
                it4.next().writeToParcel(dest, flags);
            }
        }
        AppliedFilter appliedFilter = this.appliedFilters;
        if (appliedFilter == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            appliedFilter.writeToParcel(dest, flags);
        }
        LoyaltyCardDetails loyaltyCardDetails = this.loyaltyCardDetails;
        if (loyaltyCardDetails == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            loyaltyCardDetails.writeToParcel(dest, flags);
        }
        dest.writeString(this.tag);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/discover/response/DiscoverBucket$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/discover/response/DiscoverBucket;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return DiscoverBucket$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public DiscoverBucket(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable ArrayList<BasicItem> arrayList, @Nullable ArrayList<StoreInformation> arrayList2, @Nullable ArrayList<DiscoverBucket> arrayList3, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable Item item, @Nullable String str10, @Nullable String str11, @Nullable Order order, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @NotNull String str17, @Nullable String str18, @Nullable ArrayList<QuickFilter> arrayList4, @Nullable AppliedFilter appliedFilter, @Nullable LoyaltyCardDetails loyaltyCardDetails, @Nullable String str19) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str17.getClass();
        this.bucketType = str;
        this.displayType = str2;
        this.title = str3;
        this.description = str4;
        this.subtitle = str5;
        this.secondaryDescription = str6;
        this.items = arrayList;
        this.stores = arrayList2;
        this.actions = arrayList3;
        this.subtext = str7;
        this.button = str8;
        this.spacer = str9;
        this.donation = item;
        this.jobContext = str10;
        this.jobHeadline = str11;
        this.ratingOrder = order;
        this.ratingCollectedOn = str12;
        this.ratingQuestion = str13;
        this.socialTitle = str14;
        this.socialDescription = str15;
        this.socialButton = str16;
        this.fillerType = str17;
        this.iconUrl = str18;
        this.quickFilters = arrayList4;
        this.appliedFilters = appliedFilter;
        this.loyaltyCardDetails = loyaltyCardDetails;
        this.tag = str19;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DiscoverBucket> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DiscoverBucket createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            String str;
            String str2;
            String str3;
            ArrayList arrayList4;
            parcel.getClass();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList5.add(parcel.readParcelable(DiscoverBucket.class.getClassLoader()));
                }
                arrayList = arrayList5;
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                int iC = 0;
                while (iC != i13) {
                    iC = i.c(StoreInformation.CREATOR, parcel, arrayList2, iC, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i14 = parcel.readInt();
                arrayList3 = new ArrayList(i14);
                int iC2 = 0;
                while (iC2 != i14) {
                    iC2 = i.c(DiscoverBucket.CREATOR, parcel, arrayList3, iC2, 1);
                }
            }
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            ArrayList arrayList6 = arrayList2;
            String string9 = parcel.readString();
            Item itemCreateFromParcel = parcel.readInt() == 0 ? null : Item.CREATOR.createFromParcel(parcel);
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            Order orderCreateFromParcel = parcel.readInt() == 0 ? null : Order.CREATOR.createFromParcel(parcel);
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            String string15 = parcel.readString();
            String string16 = parcel.readString();
            String string17 = parcel.readString();
            String string18 = parcel.readString();
            if (parcel.readInt() == 0) {
                str = string;
                str2 = string2;
                str3 = string3;
                arrayList4 = null;
            } else {
                str = string;
                int i15 = parcel.readInt();
                str2 = string2;
                ArrayList arrayList7 = new ArrayList(i15);
                str3 = string3;
                int iC3 = 0;
                while (iC3 != i15) {
                    iC3 = i.c(QuickFilter.CREATOR, parcel, arrayList7, iC3, 1);
                    i15 = i15;
                    string4 = string4;
                }
                arrayList4 = arrayList7;
            }
            return new DiscoverBucket(str, str2, str3, string4, string5, string6, arrayList, arrayList6, arrayList3, string7, string8, string9, itemCreateFromParcel, string10, string11, orderCreateFromParcel, string12, string13, string14, string15, string16, string17, string18, arrayList4, parcel.readInt() == 0 ? null : AppliedFilter.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : LoyaltyCardDetails.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DiscoverBucket[] newArray(int i11) {
            return new DiscoverBucket[i11];
        }
    }

    @g("actions")
    public static /* synthetic */ void getActions$annotations() {
    }

    @g("applied_filters")
    public static /* synthetic */ void getAppliedFilters$annotations() {
    }

    @g("bucket_type")
    public static /* synthetic */ void getBucketType$annotations() {
    }

    @g("button")
    public static /* synthetic */ void getButton$annotations() {
    }

    @g("description")
    public static /* synthetic */ void getDescription$annotations() {
    }

    @g("display_type")
    public static /* synthetic */ void getDisplayType$annotations() {
    }

    @g("donation")
    public static /* synthetic */ void getDonation$annotations() {
    }

    @g("filler_type")
    public static /* synthetic */ void getFillerType$annotations() {
    }

    @g("icon_url")
    public static /* synthetic */ void getIconUrl$annotations() {
    }

    @g("items")
    public static /* synthetic */ void getItems$annotations() {
    }

    @g("context")
    public static /* synthetic */ void getJobContext$annotations() {
    }

    @g("headline")
    public static /* synthetic */ void getJobHeadline$annotations() {
    }

    @g("loyalty_card_details")
    public static /* synthetic */ void getLoyaltyCardDetails$annotations() {
    }

    @g("filters")
    public static /* synthetic */ void getQuickFilters$annotations() {
    }

    @g("collected_on")
    public static /* synthetic */ void getRatingCollectedOn$annotations() {
    }

    @g("order")
    public static /* synthetic */ void getRatingOrder$annotations() {
    }

    @g("question")
    public static /* synthetic */ void getRatingQuestion$annotations() {
    }

    @g("secondary_description")
    public static /* synthetic */ void getSecondaryDescription$annotations() {
    }

    @g("social_button")
    public static /* synthetic */ void getSocialButton$annotations() {
    }

    @g("social_description")
    public static /* synthetic */ void getSocialDescription$annotations() {
    }

    @g("social_title")
    public static /* synthetic */ void getSocialTitle$annotations() {
    }

    @g("spacer")
    public static /* synthetic */ void getSpacer$annotations() {
    }

    @g("stores")
    public static /* synthetic */ void getStores$annotations() {
    }

    @g("subtext")
    public static /* synthetic */ void getSubtext$annotations() {
    }

    @g("subtitle")
    public static /* synthetic */ void getSubtitle$annotations() {
    }

    @g("tag")
    public static /* synthetic */ void getTag$annotations() {
    }

    @g(MessageBundle.TITLE_ENTRY)
    public static /* synthetic */ void getTitle$annotations() {
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ DiscoverBucket(java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.util.ArrayList r37, java.util.ArrayList r38, java.util.ArrayList r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, com.app.tgtg.model.remote.item.response.Item r43, java.lang.String r44, java.lang.String r45, com.app.tgtg.model.remote.order.Order r46, java.lang.String r47, java.lang.String r48, java.lang.String r49, java.lang.String r50, java.lang.String r51, java.lang.String r52, java.lang.String r53, java.util.ArrayList r54, com.app.tgtg.model.remote.item.AppliedFilter r55, com.app.tgtg.model.remote.profile.response.LoyaltyCardDetails r56, java.lang.String r57, int r58, kotlin.jvm.internal.DefaultConstructorMarker r59) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.tgtg.model.remote.discover.response.DiscoverBucket.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, java.lang.String, java.lang.String, java.lang.String, com.app.tgtg.model.remote.item.response.Item, java.lang.String, java.lang.String, com.app.tgtg.model.remote.order.Order, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList, com.app.tgtg.model.remote.item.AppliedFilter, com.app.tgtg.model.remote.profile.response.LoyaltyCardDetails, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
