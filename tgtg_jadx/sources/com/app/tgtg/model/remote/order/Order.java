package com.app.tgtg.model.remote.order;

import android.os.Parcel;
import android.os.Parcelable;
import b3.i;
import com.adyen.checkout.components.core.Address;
import com.app.tgtg.model.remote.ItemId;
import com.app.tgtg.model.remote.ItemId$$serializer;
import com.app.tgtg.model.remote.OrderId;
import com.app.tgtg.model.remote.OrderId$$serializer;
import com.app.tgtg.model.remote.StoreId;
import com.app.tgtg.model.remote.StoreId$$serializer;
import com.app.tgtg.model.remote.UserId;
import com.app.tgtg.model.remote.UserId$$serializer;
import com.app.tgtg.model.remote.item.ItemCategory;
import com.app.tgtg.model.remote.item.ItemCategorySerializer;
import com.app.tgtg.model.remote.item.PickupInterval;
import com.app.tgtg.model.remote.item.PickupInterval$$serializer;
import com.app.tgtg.model.remote.item.Picture;
import com.app.tgtg.model.remote.item.Picture$$serializer;
import com.app.tgtg.model.remote.item.StoreLocation;
import com.app.tgtg.model.remote.item.StoreLocation$$serializer;
import com.app.tgtg.model.remote.item.response.CancellingEntity;
import com.app.tgtg.model.remote.item.response.CancellingEntitySerializer;
import com.app.tgtg.model.remote.item.response.PackagingOptions;
import com.app.tgtg.model.remote.item.response.PaymentState;
import com.app.tgtg.model.remote.item.response.PaymentStateEnumSerializer;
import com.app.tgtg.model.remote.payment.Price;
import com.app.tgtg.model.remote.payment.Price$$serializer;
import com.app.tgtg.model.remote.payment.SpecificationLine;
import com.app.tgtg.model.remote.payment.SpecificationLine$$serializer;
import com.braze.support.DateTimeUtils;
import hw.f;
import i90.h;
import iu.a;
import j4.s;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.d;
import m90.g;
import m90.l0;
import m90.m1;
import m90.r1;
import m90.v;
import mv.p0;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import u70.j;
import u70.l;
import u70.m;
import w2.l1;
import zendesk.messaging.android.internal.conversationscreen.TimeConstants;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000ã\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\bX\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0003\b«\u0001\n\u0002\u0010\t\n\u0002\b\b\b\u0087\b\u0018\u0000 û\u00022\u00020\u0001:\u0004ü\u0002û\u0002Bù\u0004\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\u0006\u0010\u001b\u001a\u00020\u0019\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001c\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010#\u001a\u00020\"\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010&\u001a\u00020%\u0012\b\u0010'\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010)\u001a\u00020\u0002\u0012\b\b\u0002\u0010*\u001a\u00020\u0007\u0012\b\b\u0002\u0010+\u001a\u00020\u0007\u0012\u0006\u0010-\u001a\u00020,\u0012\b\b\u0002\u0010.\u001a\u00020\u0007\u0012\b\u00100\u001a\u0004\u0018\u00010/\u0012\b\u00101\u001a\u0004\u0018\u00010\u0002\u0012\b\u00102\u001a\u0004\u0018\u00010\u0002\u0012\b\u00103\u001a\u0004\u0018\u00010\u0002\u0012\b\u00104\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u00105\u001a\u00020\u001c\u0012\b\u00107\u001a\u0004\u0018\u000106\u0012\b\u00109\u001a\u0004\u0018\u000108\u0012\b\b\u0002\u0010:\u001a\u00020\u0007\u0012\b\b\u0002\u0010;\u001a\u00020\u0007\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010=\u001a\u00020\u0007\u0012\b\b\u0002\u0010>\u001a\u00020\u0007\u0012\b\b\u0002\u0010?\u001a\u00020\u001c\u0012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010A\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010C\u001a\u0004\u0018\u00010B\u0012\b\b\u0002\u0010D\u001a\u00020\u0007\u0012\b\b\u0002\u0010E\u001a\u00020\u0007\u0012\b\b\u0002\u0010F\u001a\u00020\u0007\u0012\b\u0010G\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010H\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010J\u001a\u0004\u0018\u00010I\u0012\b\u0010K\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010L\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010M\u001a\u00020\u0007\u0012\u000e\u0010P\u001a\n\u0012\u0004\u0012\u00020O\u0018\u00010N\u0012\u000e\u0010R\u001a\n\u0012\u0004\u0012\u00020Q\u0018\u00010N\u0012\b\u0010S\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010U\u001a\u0004\u0018\u00010T¢\u0006\u0004\bV\u0010WBù\u0004\b\u0010\u0012\u0006\u0010X\u001a\u00020\u001c\u0012\u0006\u0010Y\u001a\u00020\u001c\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0019\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010&\u001a\u0004\u0018\u00010%\u0012\b\u0010'\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010*\u001a\u00020\u0007\u0012\u0006\u0010+\u001a\u00020\u0007\u0012\b\u0010-\u001a\u0004\u0018\u00010,\u0012\u0006\u0010.\u001a\u00020\u0007\u0012\b\u00100\u001a\u0004\u0018\u00010/\u0012\b\u00101\u001a\u0004\u0018\u00010\u0002\u0012\b\u00102\u001a\u0004\u0018\u00010\u0002\u0012\b\u00103\u001a\u0004\u0018\u00010\u0002\u0012\b\u00104\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u00105\u001a\u00020\u001c\u0012\b\u00107\u001a\u0004\u0018\u000106\u0012\b\u00109\u001a\u0004\u0018\u000108\u0012\u0006\u0010:\u001a\u00020\u0007\u0012\u0006\u0010;\u001a\u00020\u0007\u0012\b\u0010<\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010=\u001a\u00020\u0007\u0012\u0006\u0010>\u001a\u00020\u0007\u0012\u0006\u0010?\u001a\u00020\u001c\u0012\b\u0010@\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010A\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010C\u001a\u0004\u0018\u00010B\u0012\u0006\u0010D\u001a\u00020\u0007\u0012\u0006\u0010E\u001a\u00020\u0007\u0012\u0006\u0010F\u001a\u00020\u0007\u0012\b\u0010G\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010H\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010J\u001a\u0004\u0018\u00010I\u0012\b\u0010K\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010L\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010M\u001a\u00020\u0007\u0012\u000e\u0010P\u001a\n\u0012\u0004\u0012\u00020O\u0018\u00010N\u0012\u000e\u0010R\u001a\n\u0012\u0004\u0012\u00020Q\u0018\u00010N\u0012\b\u0010S\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010U\u001a\u0004\u0018\u00010T\u0012\b\u0010[\u001a\u0004\u0018\u00010Z¢\u0006\u0004\bV\u0010\\J\r\u0010]\u001a\u00020\u0002¢\u0006\u0004\b]\u0010^J\r\u0010_\u001a\u00020\u0007¢\u0006\u0004\b_\u0010`J\r\u0010a\u001a\u00020\u0007¢\u0006\u0004\ba\u0010`J\r\u0010b\u001a\u00020\u0007¢\u0006\u0004\bb\u0010`J\u000f\u0010c\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\bc\u0010^J\r\u0010d\u001a\u00020\u001c¢\u0006\u0004\bd\u0010eJ\u001d\u0010j\u001a\u00020i2\u0006\u0010g\u001a\u00020f2\u0006\u0010h\u001a\u00020\u001c¢\u0006\u0004\bj\u0010kJ\u0012\u0010l\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bl\u0010^J\u0012\u0010m\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bm\u0010^J\u0012\u0010n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bn\u0010^J\u0012\u0010o\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bo\u0010^J\u0010\u0010p\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\bp\u0010`J\u0010\u0010q\u001a\u00020\tHÆ\u0003¢\u0006\u0004\bq\u0010rJ\u0010\u0010s\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\bs\u0010`J\u0010\u0010t\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\bt\u0010`J\u0012\u0010u\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bu\u0010^J\u0012\u0010v\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\bv\u0010wJ\u0012\u0010x\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\bx\u0010wJ\u0012\u0010z\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\by\u0010^J\u0012\u0010{\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b{\u0010^J\u0012\u0010|\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b|\u0010}J\u0012\u0010~\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\b~\u0010\u007fJ\u0014\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0005\b\u0080\u0001\u0010^J\u0015\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\u0013\u0010\u0083\u0001\u001a\u00020\u0019HÆ\u0003¢\u0006\u0006\b\u0083\u0001\u0010\u0082\u0001J\u0012\u0010\u0084\u0001\u001a\u00020\u001cHÆ\u0003¢\u0006\u0005\b\u0084\u0001\u0010eJ\u0015\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\u0012\u0010\u0088\u0001\u001a\u00020\u001fHÆ\u0003¢\u0006\u0005\b\u0087\u0001\u0010^J\u0014\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0005\b\u0089\u0001\u0010}J\u0013\u0010\u008a\u0001\u001a\u00020\"HÆ\u0003¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J\u0014\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0005\b\u008c\u0001\u0010^J\u0012\u0010\u008e\u0001\u001a\u00020%HÆ\u0003¢\u0006\u0005\b\u008d\u0001\u0010^J\u0014\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0005\b\u008f\u0001\u0010wJ\u0014\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0005\b\u0090\u0001\u0010^J\u0012\u0010\u0091\u0001\u001a\u00020\u0002HÆ\u0003¢\u0006\u0005\b\u0091\u0001\u0010^J\u0012\u0010\u0092\u0001\u001a\u00020\u0007HÆ\u0003¢\u0006\u0005\b\u0092\u0001\u0010`J\u0012\u0010\u0093\u0001\u001a\u00020\u0007HÆ\u0003¢\u0006\u0005\b\u0093\u0001\u0010`J\u0013\u0010\u0094\u0001\u001a\u00020,HÆ\u0003¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J\u0012\u0010\u0096\u0001\u001a\u00020\u0007HÆ\u0003¢\u0006\u0005\b\u0096\u0001\u0010`J\u0015\u0010\u0097\u0001\u001a\u0004\u0018\u00010/HÆ\u0003¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001J\u0014\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0005\b\u0099\u0001\u0010^J\u0014\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0005\b\u009a\u0001\u0010^J\u0014\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0005\b\u009b\u0001\u0010^J\u0014\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0005\b\u009c\u0001\u0010^J\u0012\u0010\u009d\u0001\u001a\u00020\u001cHÆ\u0003¢\u0006\u0005\b\u009d\u0001\u0010eJ\u0015\u0010\u009e\u0001\u001a\u0004\u0018\u000106HÆ\u0003¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J\u0015\u0010 \u0001\u001a\u0004\u0018\u000108HÆ\u0003¢\u0006\u0006\b \u0001\u0010¡\u0001J\u0012\u0010¢\u0001\u001a\u00020\u0007HÆ\u0003¢\u0006\u0005\b¢\u0001\u0010`J\u0012\u0010£\u0001\u001a\u00020\u0007HÆ\u0003¢\u0006\u0005\b£\u0001\u0010`J\u0015\u0010¤\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0006\b¤\u0001\u0010¥\u0001J\u0012\u0010¦\u0001\u001a\u00020\u0007HÆ\u0003¢\u0006\u0005\b¦\u0001\u0010`J\u0012\u0010§\u0001\u001a\u00020\u0007HÆ\u0003¢\u0006\u0005\b§\u0001\u0010`J\u0012\u0010¨\u0001\u001a\u00020\u001cHÆ\u0003¢\u0006\u0005\b¨\u0001\u0010eJ\u0015\u0010©\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0006\b©\u0001\u0010¥\u0001J\u0014\u0010ª\u0001\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0005\bª\u0001\u0010^J\u0014\u0010¬\u0001\u001a\u0004\u0018\u00010BHÆ\u0003¢\u0006\u0005\b«\u0001\u0010^J\u0012\u0010\u00ad\u0001\u001a\u00020\u0007HÆ\u0003¢\u0006\u0005\b\u00ad\u0001\u0010`J\u0012\u0010®\u0001\u001a\u00020\u0007HÆ\u0003¢\u0006\u0005\b®\u0001\u0010`J\u0012\u0010¯\u0001\u001a\u00020\u0007HÆ\u0003¢\u0006\u0005\b¯\u0001\u0010`J\u0015\u0010°\u0001\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0006\b°\u0001\u0010\u0082\u0001J\u0015\u0010±\u0001\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0006\b±\u0001\u0010\u0082\u0001J\u0015\u0010²\u0001\u001a\u0004\u0018\u00010IHÆ\u0003¢\u0006\u0006\b²\u0001\u0010³\u0001J\u0015\u0010´\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0006\b´\u0001\u0010¥\u0001J\u0015\u0010µ\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0006\bµ\u0001\u0010¥\u0001J\u0012\u0010¶\u0001\u001a\u00020\u0007HÆ\u0003¢\u0006\u0005\b¶\u0001\u0010`J\u001b\u0010·\u0001\u001a\n\u0012\u0004\u0012\u00020O\u0018\u00010NHÆ\u0003¢\u0006\u0006\b·\u0001\u0010¸\u0001J\u001b\u0010¹\u0001\u001a\n\u0012\u0004\u0012\u00020Q\u0018\u00010NHÆ\u0003¢\u0006\u0006\b¹\u0001\u0010¸\u0001J\u0015\u0010º\u0001\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0006\bº\u0001\u0010\u0082\u0001J\u0015\u0010»\u0001\u001a\u0004\u0018\u00010THÆ\u0003¢\u0006\u0006\b»\u0001\u0010¼\u0001J×\u0005\u0010¿\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010#\u001a\u00020\"2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010&\u001a\u00020%2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010)\u001a\u00020\u00022\b\b\u0002\u0010*\u001a\u00020\u00072\b\b\u0002\u0010+\u001a\u00020\u00072\b\b\u0002\u0010-\u001a\u00020,2\b\b\u0002\u0010.\u001a\u00020\u00072\n\b\u0002\u00100\u001a\u0004\u0018\u00010/2\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u00105\u001a\u00020\u001c2\n\b\u0002\u00107\u001a\u0004\u0018\u0001062\n\b\u0002\u00109\u001a\u0004\u0018\u0001082\b\b\u0002\u0010:\u001a\u00020\u00072\b\b\u0002\u0010;\u001a\u00020\u00072\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010=\u001a\u00020\u00072\b\b\u0002\u0010>\u001a\u00020\u00072\b\b\u0002\u0010?\u001a\u00020\u001c2\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010C\u001a\u0004\u0018\u00010B2\b\b\u0002\u0010D\u001a\u00020\u00072\b\b\u0002\u0010E\u001a\u00020\u00072\b\b\u0002\u0010F\u001a\u00020\u00072\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010J\u001a\u0004\u0018\u00010I2\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010M\u001a\u00020\u00072\u0010\b\u0002\u0010P\u001a\n\u0012\u0004\u0012\u00020O\u0018\u00010N2\u0010\b\u0002\u0010R\u001a\n\u0012\u0004\u0012\u00020Q\u0018\u00010N2\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010U\u001a\u0004\u0018\u00010THÆ\u0001¢\u0006\u0006\b½\u0001\u0010¾\u0001J\u0012\u0010À\u0001\u001a\u00020\u0002HÖ\u0001¢\u0006\u0005\bÀ\u0001\u0010^J\u0012\u0010Á\u0001\u001a\u00020\u001cHÖ\u0001¢\u0006\u0005\bÁ\u0001\u0010eJ\u001f\u0010Ä\u0001\u001a\u00020\u00072\n\u0010Ã\u0001\u001a\u0005\u0018\u00010Â\u0001HÖ\u0003¢\u0006\u0006\bÄ\u0001\u0010Å\u0001J/\u0010Í\u0001\u001a\u00020i2\u0007\u0010Æ\u0001\u001a\u00020\u00002\b\u0010È\u0001\u001a\u00030Ç\u00012\b\u0010Ê\u0001\u001a\u00030É\u0001H\u0001¢\u0006\u0006\bË\u0001\u0010Ì\u0001R0\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u001e\n\u0005\b\u0003\u0010Î\u0001\u0012\u0006\bÒ\u0001\u0010Ó\u0001\u001a\u0005\bÏ\u0001\u0010^\"\u0006\bÐ\u0001\u0010Ñ\u0001R&\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u0004\u0010Î\u0001\u0012\u0006\bÕ\u0001\u0010Ó\u0001\u001a\u0005\bÔ\u0001\u0010^R&\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u0005\u0010Î\u0001\u0012\u0006\b×\u0001\u0010Ó\u0001\u001a\u0005\bÖ\u0001\u0010^R&\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u0006\u0010Î\u0001\u0012\u0006\bÙ\u0001\u0010Ó\u0001\u001a\u0005\bØ\u0001\u0010^R$\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\b\u0010Ú\u0001\u0012\u0006\bÜ\u0001\u0010Ó\u0001\u001a\u0005\bÛ\u0001\u0010`R$\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\n\u0010Ý\u0001\u0012\u0006\bß\u0001\u0010Ó\u0001\u001a\u0005\bÞ\u0001\u0010rR-\u0010\u000b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u001d\n\u0005\b\u000b\u0010Ú\u0001\u0012\u0006\bâ\u0001\u0010Ó\u0001\u001a\u0004\b\u000b\u0010`\"\u0006\bà\u0001\u0010á\u0001R$\u0010\f\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\f\u0010Ú\u0001\u0012\u0006\bä\u0001\u0010Ó\u0001\u001a\u0005\bã\u0001\u0010`R&\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\r\u0010Î\u0001\u0012\u0006\bæ\u0001\u0010Ó\u0001\u001a\u0005\bå\u0001\u0010^R0\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u001e\n\u0005\b\u000f\u0010ç\u0001\u0012\u0006\bë\u0001\u0010Ó\u0001\u001a\u0005\bè\u0001\u0010w\"\u0006\bé\u0001\u0010ê\u0001R0\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u001e\n\u0005\b\u0010\u0010ç\u0001\u0012\u0006\bî\u0001\u0010Ó\u0001\u001a\u0005\bì\u0001\u0010w\"\u0006\bí\u0001\u0010ê\u0001R&\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u0012\u0010Î\u0001\u0012\u0006\bð\u0001\u0010Ó\u0001\u001a\u0005\bï\u0001\u0010^R&\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u0013\u0010Î\u0001\u0012\u0006\bò\u0001\u0010Ó\u0001\u001a\u0005\bñ\u0001\u0010^R0\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u001e\n\u0005\b\u0015\u0010ó\u0001\u0012\u0006\b÷\u0001\u0010Ó\u0001\u001a\u0005\bô\u0001\u0010}\"\u0006\bõ\u0001\u0010ö\u0001R0\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u001e\n\u0005\b\u0017\u0010ø\u0001\u0012\u0006\bü\u0001\u0010Ó\u0001\u001a\u0005\bù\u0001\u0010\u007f\"\u0006\bú\u0001\u0010û\u0001R0\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u001e\n\u0005\b\u0018\u0010Î\u0001\u0012\u0006\bÿ\u0001\u0010Ó\u0001\u001a\u0005\bý\u0001\u0010^\"\u0006\bþ\u0001\u0010Ñ\u0001R1\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u001f\n\u0005\b\u001a\u0010\u0080\u0002\u0012\u0006\b\u0084\u0002\u0010Ó\u0001\u001a\u0006\b\u0081\u0002\u0010\u0082\u0001\"\u0006\b\u0082\u0002\u0010\u0083\u0002R%\u0010\u001b\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\u0017\n\u0005\b\u001b\u0010\u0080\u0002\u0012\u0006\b\u0086\u0002\u0010Ó\u0001\u001a\u0006\b\u0085\u0002\u0010\u0082\u0001R$\u0010\u001d\u001a\u00020\u001c8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u001d\u0010\u0087\u0002\u0012\u0006\b\u0089\u0002\u0010Ó\u0001\u001a\u0005\b\u0088\u0002\u0010eR1\u0010\u001e\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u001f\n\u0005\b\u001e\u0010\u008a\u0002\u0012\u0006\b\u008e\u0002\u0010Ó\u0001\u001a\u0006\b\u008b\u0002\u0010\u0086\u0001\"\u0006\b\u008c\u0002\u0010\u008d\u0002R$\u0010 \u001a\u00020\u001f8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b \u0010Î\u0001\u0012\u0006\b\u0090\u0002\u0010Ó\u0001\u001a\u0005\b\u008f\u0002\u0010^R0\u0010!\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u001e\n\u0005\b!\u0010ó\u0001\u0012\u0006\b\u0093\u0002\u0010Ó\u0001\u001a\u0005\b\u0091\u0002\u0010}\"\u0006\b\u0092\u0002\u0010ö\u0001R/\u0010#\u001a\u00020\"8\u0006@\u0006X\u0087\u000e¢\u0006\u001f\n\u0005\b#\u0010\u0094\u0002\u0012\u0006\b\u0098\u0002\u0010Ó\u0001\u001a\u0006\b\u0095\u0002\u0010\u008b\u0001\"\u0006\b\u0096\u0002\u0010\u0097\u0002R0\u0010$\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u001e\n\u0005\b$\u0010Î\u0001\u0012\u0006\b\u009b\u0002\u0010Ó\u0001\u001a\u0005\b\u0099\u0002\u0010^\"\u0006\b\u009a\u0002\u0010Ñ\u0001R$\u0010&\u001a\u00020%8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b&\u0010Î\u0001\u0012\u0006\b\u009d\u0002\u0010Ó\u0001\u001a\u0005\b\u009c\u0002\u0010^R0\u0010'\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u001e\n\u0005\b'\u0010ç\u0001\u0012\u0006\b \u0002\u0010Ó\u0001\u001a\u0005\b\u009e\u0002\u0010w\"\u0006\b\u009f\u0002\u0010ê\u0001R0\u0010(\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u001e\n\u0005\b(\u0010Î\u0001\u0012\u0006\b£\u0002\u0010Ó\u0001\u001a\u0005\b¡\u0002\u0010^\"\u0006\b¢\u0002\u0010Ñ\u0001R$\u0010)\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b)\u0010Î\u0001\u0012\u0006\b¥\u0002\u0010Ó\u0001\u001a\u0005\b¤\u0002\u0010^R#\u0010*\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b*\u0010Ú\u0001\u0012\u0006\b¦\u0002\u0010Ó\u0001\u001a\u0004\b*\u0010`R$\u0010+\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b+\u0010Ú\u0001\u0012\u0006\b¨\u0002\u0010Ó\u0001\u001a\u0005\b§\u0002\u0010`R%\u0010-\u001a\u00020,8\u0006X\u0087\u0004¢\u0006\u0017\n\u0005\b-\u0010©\u0002\u0012\u0006\b«\u0002\u0010Ó\u0001\u001a\u0006\bª\u0002\u0010\u0095\u0001R.\u0010.\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u001e\n\u0005\b.\u0010Ú\u0001\u0012\u0006\b®\u0002\u0010Ó\u0001\u001a\u0005\b¬\u0002\u0010`\"\u0006\b\u00ad\u0002\u0010á\u0001R1\u00100\u001a\u0004\u0018\u00010/8\u0006@\u0006X\u0087\u000e¢\u0006\u001f\n\u0005\b0\u0010¯\u0002\u0012\u0006\b³\u0002\u0010Ó\u0001\u001a\u0006\b°\u0002\u0010\u0098\u0001\"\u0006\b±\u0002\u0010²\u0002R&\u00101\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b1\u0010Î\u0001\u0012\u0006\bµ\u0002\u0010Ó\u0001\u001a\u0005\b´\u0002\u0010^R&\u00102\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b2\u0010Î\u0001\u0012\u0006\b·\u0002\u0010Ó\u0001\u001a\u0005\b¶\u0002\u0010^R&\u00103\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b3\u0010Î\u0001\u0012\u0006\b¹\u0002\u0010Ó\u0001\u001a\u0005\b¸\u0002\u0010^R&\u00104\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b4\u0010Î\u0001\u0012\u0006\b»\u0002\u0010Ó\u0001\u001a\u0005\bº\u0002\u0010^R$\u00105\u001a\u00020\u001c8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b5\u0010\u0087\u0002\u0012\u0006\b½\u0002\u0010Ó\u0001\u001a\u0005\b¼\u0002\u0010eR'\u00107\u001a\u0004\u0018\u0001068\u0006X\u0087\u0004¢\u0006\u0017\n\u0005\b7\u0010¾\u0002\u0012\u0006\bÀ\u0002\u0010Ó\u0001\u001a\u0006\b¿\u0002\u0010\u009f\u0001R'\u00109\u001a\u0004\u0018\u0001088\u0006X\u0087\u0004¢\u0006\u0017\n\u0005\b9\u0010Á\u0002\u0012\u0006\bÃ\u0002\u0010Ó\u0001\u001a\u0006\bÂ\u0002\u0010¡\u0001R#\u0010:\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b:\u0010Ú\u0001\u0012\u0006\bÄ\u0002\u0010Ó\u0001\u001a\u0004\b:\u0010`R#\u0010;\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b;\u0010Ú\u0001\u0012\u0006\bÅ\u0002\u0010Ó\u0001\u001a\u0004\b;\u0010`R)\u0010<\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b<\u0010Æ\u0002\u001a\u0006\bÇ\u0002\u0010¥\u0001\"\u0006\bÈ\u0002\u0010É\u0002R&\u0010=\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b=\u0010Ú\u0001\u001a\u0005\bÊ\u0002\u0010`\"\u0006\bË\u0002\u0010á\u0001R&\u0010>\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b>\u0010Ú\u0001\u001a\u0005\bÌ\u0002\u0010`\"\u0006\bÍ\u0002\u0010á\u0001R&\u0010?\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b?\u0010\u0087\u0002\u001a\u0005\bÎ\u0002\u0010e\"\u0006\bÏ\u0002\u0010Ð\u0002R'\u0010@\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0017\n\u0005\b@\u0010Æ\u0002\u0012\u0006\bÒ\u0002\u0010Ó\u0001\u001a\u0006\bÑ\u0002\u0010¥\u0001R&\u0010A\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\bA\u0010Î\u0001\u0012\u0006\bÔ\u0002\u0010Ó\u0001\u001a\u0005\bÓ\u0002\u0010^R&\u0010C\u001a\u0004\u0018\u00010B8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\bC\u0010Î\u0001\u0012\u0006\bÖ\u0002\u0010Ó\u0001\u001a\u0005\bÕ\u0002\u0010^R#\u0010D\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\bD\u0010Ú\u0001\u0012\u0006\b×\u0002\u0010Ó\u0001\u001a\u0004\bD\u0010`R#\u0010E\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\bE\u0010Ú\u0001\u0012\u0006\bØ\u0002\u0010Ó\u0001\u001a\u0004\bE\u0010`R$\u0010F\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\bF\u0010Ú\u0001\u0012\u0006\bÚ\u0002\u0010Ó\u0001\u001a\u0005\bÙ\u0002\u0010`R'\u0010G\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\u0017\n\u0005\bG\u0010\u0080\u0002\u0012\u0006\bÜ\u0002\u0010Ó\u0001\u001a\u0006\bÛ\u0002\u0010\u0082\u0001R'\u0010H\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\u0017\n\u0005\bH\u0010\u0080\u0002\u0012\u0006\bÞ\u0002\u0010Ó\u0001\u001a\u0006\bÝ\u0002\u0010\u0082\u0001R'\u0010J\u001a\u0004\u0018\u00010I8\u0006X\u0087\u0004¢\u0006\u0017\n\u0005\bJ\u0010ß\u0002\u0012\u0006\bá\u0002\u0010Ó\u0001\u001a\u0006\bà\u0002\u0010³\u0001R0\u0010K\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u001e\n\u0005\bK\u0010Æ\u0002\u0012\u0006\bã\u0002\u0010Ó\u0001\u001a\u0005\bK\u0010¥\u0001\"\u0006\bâ\u0002\u0010É\u0002R0\u0010L\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u001e\n\u0005\bL\u0010Æ\u0002\u0012\u0006\bå\u0002\u0010Ó\u0001\u001a\u0005\bL\u0010¥\u0001\"\u0006\bä\u0002\u0010É\u0002R#\u0010M\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\bM\u0010Ú\u0001\u0012\u0006\bæ\u0002\u0010Ó\u0001\u001a\u0004\bM\u0010`R7\u0010P\u001a\n\u0012\u0004\u0012\u00020O\u0018\u00010N8\u0006@\u0006X\u0087\u000e¢\u0006\u001f\n\u0005\bP\u0010ç\u0002\u0012\u0006\bë\u0002\u0010Ó\u0001\u001a\u0006\bè\u0002\u0010¸\u0001\"\u0006\bé\u0002\u0010ê\u0002R-\u0010R\u001a\n\u0012\u0004\u0012\u00020Q\u0018\u00010N8\u0006X\u0087\u0004¢\u0006\u0017\n\u0005\bR\u0010ç\u0002\u0012\u0006\bí\u0002\u0010Ó\u0001\u001a\u0006\bì\u0002\u0010¸\u0001R'\u0010S\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\u0017\n\u0005\bS\u0010\u0080\u0002\u0012\u0006\bï\u0002\u0010Ó\u0001\u001a\u0006\bî\u0002\u0010\u0082\u0001R'\u0010U\u001a\u0004\u0018\u00010T8\u0006X\u0087\u0004¢\u0006\u0017\n\u0005\bU\u0010ð\u0002\u0012\u0006\bò\u0002\u0010Ó\u0001\u001a\u0006\bñ\u0002\u0010¼\u0001R\u0015\u0010ô\u0002\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0007\u001a\u0005\bó\u0002\u0010^R\u0015\u0010ø\u0002\u001a\u00030õ\u00028F¢\u0006\b\u001a\u0006\bö\u0002\u0010÷\u0002R\u0015\u0010ú\u0002\u001a\u00030õ\u00028F¢\u0006\b\u001a\u0006\bù\u0002\u0010÷\u0002¨\u0006ý\u0002"}, d2 = {"Lcom/app/tgtg/model/remote/order/Order;", "Landroid/os/Parcelable;", "", "cancelUntil", "confirmationEmail", "foodHandlingInstruction", "buffetHandlingInstruction", "", "canUserSupplyPackaging", "Lcom/app/tgtg/model/remote/item/response/PackagingOptions;", "packagingOption", "isRated", "canBeRated", "itemCollectionInfo", "Lcom/app/tgtg/model/remote/item/Picture;", "itemCoverImage", "itemLogo", "Lcom/app/tgtg/model/remote/ItemId;", "itemId", "itemName", "Lcom/app/tgtg/model/remote/item/PickupInterval;", "pickupInterval", "Lcom/app/tgtg/model/remote/item/StoreLocation;", "pickupLocation", "storeTimeZone", "Lcom/app/tgtg/model/remote/payment/Price;", "price", "totalPrice", "", "quantity", "overallRating", "Lcom/app/tgtg/model/remote/OrderId;", "orderId", "redeemInterval", "Lcom/app/tgtg/model/remote/order/OrderState;", "state", "storeBranch", "Lcom/app/tgtg/model/remote/StoreId;", "storeId", "storeLogo", "storeName", "timeOfPurchase", "isBuffet", "canShowBestBeforeExplainer", "Lcom/app/tgtg/model/remote/order/OrderType;", "orderType", "pickupWindowChanged", "Lcom/app/tgtg/model/remote/order/AdditionalOrderInformation;", "additionalOrderInformation", "paymentMethodDisplayName", "cancelledOrRefundedAtUtc", "redeemedAtUtc", "supportReqCreatedAtUtc", "expectedBankDays", "Lcom/app/tgtg/model/remote/item/response/PaymentState;", "paymentState", "Lcom/app/tgtg/model/remote/item/response/CancellingEntity;", "cancellingEntity", "isSupportAvailable", "isExcludedFromExpenseRating", "needsSync", "hasCollectionTimeChanged", "hasCollectionStateChanged", "calendarEventId", "hasDynamicPrice", "invitationId", "Lcom/app/tgtg/model/remote/UserId;", "redeemingUserId", "isDonation", "isEligibleForReward", "hasMultiplePayments", "totalPricePaidWithExternalProvider", "totalPricePaidWithVoucher", "Lcom/app/tgtg/model/remote/item/ItemCategory;", "itemCategory", "isFavorite", "isMultiItem", "isEdible", "", "Lcom/app/tgtg/model/remote/order/OrderItem;", "orderItems", "Lcom/app/tgtg/model/remote/payment/SpecificationLine;", "specificationLines", "totalPricePaidForDelivery", "", "discountAppliedPercentage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/app/tgtg/model/remote/item/response/PackagingOptions;ZZLjava/lang/String;Lcom/app/tgtg/model/remote/item/Picture;Lcom/app/tgtg/model/remote/item/Picture;Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/item/PickupInterval;Lcom/app/tgtg/model/remote/item/StoreLocation;Ljava/lang/String;Lcom/app/tgtg/model/remote/payment/Price;Lcom/app/tgtg/model/remote/payment/Price;ILjava/lang/Integer;Ljava/lang/String;Lcom/app/tgtg/model/remote/item/PickupInterval;Lcom/app/tgtg/model/remote/order/OrderState;Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/item/Picture;Ljava/lang/String;Ljava/lang/String;ZZLcom/app/tgtg/model/remote/order/OrderType;ZLcom/app/tgtg/model/remote/order/AdditionalOrderInformation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/app/tgtg/model/remote/item/response/PaymentState;Lcom/app/tgtg/model/remote/item/response/CancellingEntity;ZZLjava/lang/Boolean;ZZILjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;ZZZLcom/app/tgtg/model/remote/payment/Price;Lcom/app/tgtg/model/remote/payment/Price;Lcom/app/tgtg/model/remote/item/ItemCategory;Ljava/lang/Boolean;Ljava/lang/Boolean;ZLjava/util/List;Ljava/util/List;Lcom/app/tgtg/model/remote/payment/Price;Ljava/lang/Double;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "seen0", "seen1", "Lm90/m1;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/app/tgtg/model/remote/item/response/PackagingOptions;ZZLjava/lang/String;Lcom/app/tgtg/model/remote/item/Picture;Lcom/app/tgtg/model/remote/item/Picture;Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/item/PickupInterval;Lcom/app/tgtg/model/remote/item/StoreLocation;Ljava/lang/String;Lcom/app/tgtg/model/remote/payment/Price;Lcom/app/tgtg/model/remote/payment/Price;ILjava/lang/Integer;Ljava/lang/String;Lcom/app/tgtg/model/remote/item/PickupInterval;Lcom/app/tgtg/model/remote/order/OrderState;Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/item/Picture;Ljava/lang/String;Ljava/lang/String;ZZLcom/app/tgtg/model/remote/order/OrderType;ZLcom/app/tgtg/model/remote/order/AdditionalOrderInformation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/app/tgtg/model/remote/item/response/PaymentState;Lcom/app/tgtg/model/remote/item/response/CancellingEntity;ZZLjava/lang/Boolean;ZZILjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;ZZZLcom/app/tgtg/model/remote/payment/Price;Lcom/app/tgtg/model/remote/payment/Price;Lcom/app/tgtg/model/remote/item/ItemCategory;Ljava/lang/Boolean;Ljava/lang/Boolean;ZLjava/util/List;Ljava/util/List;Lcom/app/tgtg/model/remote/payment/Price;Ljava/lang/Double;Lm90/m1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "orderTypeMappedToItemTypeForTracking", "()Ljava/lang/String;", "canCancel", "()Z", "isFlashSales", "isCharity", "getItemOrStoreLogoUrl", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "component2", "component3", "component4", "component5", "component6", "()Lcom/app/tgtg/model/remote/item/response/PackagingOptions;", "component7", "component8", "component9", "component10", "()Lcom/app/tgtg/model/remote/item/Picture;", "component11", "component12-RWxzYZM", "component12", "component13", "component14", "()Lcom/app/tgtg/model/remote/item/PickupInterval;", "component15", "()Lcom/app/tgtg/model/remote/item/StoreLocation;", "component16", "component17", "()Lcom/app/tgtg/model/remote/payment/Price;", "component18", "component19", "component20", "()Ljava/lang/Integer;", "component21-reIZeYA", "component21", "component22", "component23", "()Lcom/app/tgtg/model/remote/order/OrderState;", "component24", "component25-Q2NXY1A", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "()Lcom/app/tgtg/model/remote/order/OrderType;", "component32", "component33", "()Lcom/app/tgtg/model/remote/order/AdditionalOrderInformation;", "component34", "component35", "component36", "component37", "component38", "component39", "()Lcom/app/tgtg/model/remote/item/response/PaymentState;", "component40", "()Lcom/app/tgtg/model/remote/item/response/CancellingEntity;", "component41", "component42", "component43", "()Ljava/lang/Boolean;", "component44", "component45", "component46", "component47", "component48", "component49-4FZwupo", "component49", "component50", "component51", "component52", "component53", "component54", "component55", "()Lcom/app/tgtg/model/remote/item/ItemCategory;", "component56", "component57", "component58", "component59", "()Ljava/util/List;", "component60", "component61", "component62", "()Ljava/lang/Double;", "copy-T5PkTcg", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/app/tgtg/model/remote/item/response/PackagingOptions;ZZLjava/lang/String;Lcom/app/tgtg/model/remote/item/Picture;Lcom/app/tgtg/model/remote/item/Picture;Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/item/PickupInterval;Lcom/app/tgtg/model/remote/item/StoreLocation;Ljava/lang/String;Lcom/app/tgtg/model/remote/payment/Price;Lcom/app/tgtg/model/remote/payment/Price;ILjava/lang/Integer;Ljava/lang/String;Lcom/app/tgtg/model/remote/item/PickupInterval;Lcom/app/tgtg/model/remote/order/OrderState;Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/item/Picture;Ljava/lang/String;Ljava/lang/String;ZZLcom/app/tgtg/model/remote/order/OrderType;ZLcom/app/tgtg/model/remote/order/AdditionalOrderInformation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/app/tgtg/model/remote/item/response/PaymentState;Lcom/app/tgtg/model/remote/item/response/CancellingEntity;ZZLjava/lang/Boolean;ZZILjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;ZZZLcom/app/tgtg/model/remote/payment/Price;Lcom/app/tgtg/model/remote/payment/Price;Lcom/app/tgtg/model/remote/item/ItemCategory;Ljava/lang/Boolean;Ljava/lang/Boolean;ZLjava/util/List;Ljava/util/List;Lcom/app/tgtg/model/remote/payment/Price;Ljava/lang/Double;)Lcom/app/tgtg/model/remote/order/Order;", "copy", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "write$Self$app", "(Lcom/app/tgtg/model/remote/order/Order;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getCancelUntil", "setCancelUntil", "(Ljava/lang/String;)V", "getCancelUntil$annotations", "()V", "getConfirmationEmail", "getConfirmationEmail$annotations", "getFoodHandlingInstruction", "getFoodHandlingInstruction$annotations", "getBuffetHandlingInstruction", "getBuffetHandlingInstruction$annotations", "Z", "getCanUserSupplyPackaging", "getCanUserSupplyPackaging$annotations", "Lcom/app/tgtg/model/remote/item/response/PackagingOptions;", "getPackagingOption", "getPackagingOption$annotations", "setRated", "(Z)V", "isRated$annotations", "getCanBeRated", "getCanBeRated$annotations", "getItemCollectionInfo", "getItemCollectionInfo$annotations", "Lcom/app/tgtg/model/remote/item/Picture;", "getItemCoverImage", "setItemCoverImage", "(Lcom/app/tgtg/model/remote/item/Picture;)V", "getItemCoverImage$annotations", "getItemLogo", "setItemLogo", "getItemLogo$annotations", "getItemId-RWxzYZM", "getItemId-RWxzYZM$annotations", "getItemName", "getItemName$annotations", "Lcom/app/tgtg/model/remote/item/PickupInterval;", "getPickupInterval", "setPickupInterval", "(Lcom/app/tgtg/model/remote/item/PickupInterval;)V", "getPickupInterval$annotations", "Lcom/app/tgtg/model/remote/item/StoreLocation;", "getPickupLocation", "setPickupLocation", "(Lcom/app/tgtg/model/remote/item/StoreLocation;)V", "getPickupLocation$annotations", "getStoreTimeZone", "setStoreTimeZone", "getStoreTimeZone$annotations", "Lcom/app/tgtg/model/remote/payment/Price;", "getPrice", "setPrice", "(Lcom/app/tgtg/model/remote/payment/Price;)V", "getPrice$annotations", "getTotalPrice", "getTotalPrice$annotations", "I", "getQuantity", "getQuantity$annotations", "Ljava/lang/Integer;", "getOverallRating", "setOverallRating", "(Ljava/lang/Integer;)V", "getOverallRating$annotations", "getOrderId-reIZeYA", "getOrderId-reIZeYA$annotations", "getRedeemInterval", "setRedeemInterval", "getRedeemInterval$annotations", "Lcom/app/tgtg/model/remote/order/OrderState;", "getState", "setState", "(Lcom/app/tgtg/model/remote/order/OrderState;)V", "getState$annotations", "getStoreBranch", "setStoreBranch", "getStoreBranch$annotations", "getStoreId-Q2NXY1A", "getStoreId-Q2NXY1A$annotations", "getStoreLogo", "setStoreLogo", "getStoreLogo$annotations", "getStoreName", "setStoreName", "getStoreName$annotations", "getTimeOfPurchase", "getTimeOfPurchase$annotations", "isBuffet$annotations", "getCanShowBestBeforeExplainer", "getCanShowBestBeforeExplainer$annotations", "Lcom/app/tgtg/model/remote/order/OrderType;", "getOrderType", "getOrderType$annotations", "getPickupWindowChanged", "setPickupWindowChanged", "getPickupWindowChanged$annotations", "Lcom/app/tgtg/model/remote/order/AdditionalOrderInformation;", "getAdditionalOrderInformation", "setAdditionalOrderInformation", "(Lcom/app/tgtg/model/remote/order/AdditionalOrderInformation;)V", "getAdditionalOrderInformation$annotations", "getPaymentMethodDisplayName", "getPaymentMethodDisplayName$annotations", "getCancelledOrRefundedAtUtc", "getCancelledOrRefundedAtUtc$annotations", "getRedeemedAtUtc", "getRedeemedAtUtc$annotations", "getSupportReqCreatedAtUtc", "getSupportReqCreatedAtUtc$annotations", "getExpectedBankDays", "getExpectedBankDays$annotations", "Lcom/app/tgtg/model/remote/item/response/PaymentState;", "getPaymentState", "getPaymentState$annotations", "Lcom/app/tgtg/model/remote/item/response/CancellingEntity;", "getCancellingEntity", "getCancellingEntity$annotations", "isSupportAvailable$annotations", "isExcludedFromExpenseRating$annotations", "Ljava/lang/Boolean;", "getNeedsSync", "setNeedsSync", "(Ljava/lang/Boolean;)V", "getHasCollectionTimeChanged", "setHasCollectionTimeChanged", "getHasCollectionStateChanged", "setHasCollectionStateChanged", "getCalendarEventId", "setCalendarEventId", "(I)V", "getHasDynamicPrice", "getHasDynamicPrice$annotations", "getInvitationId", "getInvitationId$annotations", "getRedeemingUserId-4FZwupo", "getRedeemingUserId-4FZwupo$annotations", "isDonation$annotations", "isEligibleForReward$annotations", "getHasMultiplePayments", "getHasMultiplePayments$annotations", "getTotalPricePaidWithExternalProvider", "getTotalPricePaidWithExternalProvider$annotations", "getTotalPricePaidWithVoucher", "getTotalPricePaidWithVoucher$annotations", "Lcom/app/tgtg/model/remote/item/ItemCategory;", "getItemCategory", "getItemCategory$annotations", "setFavorite", "isFavorite$annotations", "setMultiItem", "isMultiItem$annotations", "isEdible$annotations", "Ljava/util/List;", "getOrderItems", "setOrderItems", "(Ljava/util/List;)V", "getOrderItems$annotations", "getSpecificationLines", "getSpecificationLines$annotations", "getTotalPricePaidForDelivery", "getTotalPricePaidForDelivery$annotations", "Ljava/lang/Double;", "getDiscountAppliedPercentage", "getDiscountAppliedPercentage$annotations", "getStoreNameAndBranch", "storeNameAndBranch", "", "getTimeLeftToCollectWithGracePeriod", "()J", "timeLeftToCollectWithGracePeriod", "getTimeLeftToCollect", "timeLeftToCollect", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class Order implements Parcelable {

    @NotNull
    private static final j[] $childSerializers;

    @Nullable
    private AdditionalOrderInformation additionalOrderInformation;

    @Nullable
    private final String buffetHandlingInstruction;
    private int calendarEventId;
    private final boolean canBeRated;
    private final boolean canShowBestBeforeExplainer;
    private final boolean canUserSupplyPackaging;

    @Nullable
    private String cancelUntil;

    @Nullable
    private final String cancelledOrRefundedAtUtc;

    @Nullable
    private final CancellingEntity cancellingEntity;

    @Nullable
    private final String confirmationEmail;

    @Nullable
    private final Double discountAppliedPercentage;
    private final int expectedBankDays;

    @Nullable
    private final String foodHandlingInstruction;
    private boolean hasCollectionStateChanged;
    private boolean hasCollectionTimeChanged;

    @Nullable
    private final Boolean hasDynamicPrice;
    private final boolean hasMultiplePayments;

    @Nullable
    private final String invitationId;
    private final boolean isBuffet;
    private final boolean isDonation;
    private final boolean isEdible;
    private final boolean isEligibleForReward;
    private final boolean isExcludedFromExpenseRating;

    @Nullable
    private Boolean isFavorite;

    @Nullable
    private Boolean isMultiItem;
    private boolean isRated;
    private final boolean isSupportAvailable;

    @Nullable
    private final ItemCategory itemCategory;

    @Nullable
    private final String itemCollectionInfo;

    @Nullable
    private Picture itemCoverImage;

    @Nullable
    private final String itemId;

    @Nullable
    private Picture itemLogo;

    @Nullable
    private final String itemName;

    @Nullable
    private Boolean needsSync;

    @NotNull
    private final String orderId;

    @Nullable
    private List<OrderItem> orderItems;

    @NotNull
    private final OrderType orderType;

    @Nullable
    private Integer overallRating;

    @NotNull
    private final PackagingOptions packagingOption;

    @Nullable
    private final String paymentMethodDisplayName;

    @Nullable
    private final PaymentState paymentState;

    @Nullable
    private PickupInterval pickupInterval;

    @Nullable
    private StoreLocation pickupLocation;
    private boolean pickupWindowChanged;

    @Nullable
    private Price price;
    private final int quantity;

    @Nullable
    private PickupInterval redeemInterval;

    @Nullable
    private final String redeemedAtUtc;

    @Nullable
    private final String redeemingUserId;

    @Nullable
    private final List<SpecificationLine> specificationLines;

    @NotNull
    private OrderState state;

    @Nullable
    private String storeBranch;

    @NotNull
    private final String storeId;

    @Nullable
    private Picture storeLogo;

    @Nullable
    private String storeName;

    @Nullable
    private String storeTimeZone;

    @Nullable
    private final String supportReqCreatedAtUtc;

    @NotNull
    private final String timeOfPurchase;

    @NotNull
    private final Price totalPrice;

    @Nullable
    private final Price totalPricePaidForDelivery;

    @Nullable
    private final Price totalPricePaidWithExternalProvider;

    @Nullable
    private final Price totalPricePaidWithVoucher;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<Order> CREATOR = new Creator();

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OrderType.values().length];
            try {
                iArr[OrderType.MAGICBAG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderType.MANUFACTURER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OrderType.CHARITY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OrderType.FLASH_SALES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OrderType.CATERING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[OrderType.TABLE_RESERVATION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        m mVar = m.PUBLICATION;
        $childSerializers = new j[]{null, null, null, null, null, l.a(mVar, new f(28)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, l.a(mVar, new f(29)), l.a(mVar, new a(0)), null, null};
    }

    private Order(int i11, int i12, String str, String str2, String str3, String str4, boolean z11, PackagingOptions packagingOptions, boolean z12, boolean z13, String str5, Picture picture, Picture picture2, String str6, String str7, PickupInterval pickupInterval, StoreLocation storeLocation, String str8, Price price, Price price2, int i13, Integer num, String str9, PickupInterval pickupInterval2, OrderState orderState, String str10, String str11, Picture picture3, String str12, String str13, boolean z14, boolean z15, OrderType orderType, boolean z16, AdditionalOrderInformation additionalOrderInformation, String str14, String str15, String str16, String str17, int i14, PaymentState paymentState, CancellingEntity cancellingEntity, boolean z17, boolean z18, Boolean bool, boolean z19, boolean z21, int i15, Boolean bool2, String str18, String str19, boolean z22, boolean z23, boolean z24, Price price3, Price price4, ItemCategory itemCategory, Boolean bool3, Boolean bool4, boolean z25, List list, List list2, Price price5, Double d3, m1 m1Var) {
        if ((1342177038 != (i11 & 1342177038)) || (502366431 != (i12 & 502366431))) {
            int[] iArr = {i11, i12};
            int[] iArr2 = {1342177038, 502366431};
            SerialDescriptor descriptor = Order$$serializer.INSTANCE.getDescriptor();
            descriptor.getClass();
            ArrayList arrayList = new ArrayList();
            for (int i16 = 0; i16 < 2; i16++) {
                int i17 = iArr2[i16] & (~iArr[i16]);
                if (i17 != 0) {
                    for (int i18 = 0; i18 < 32; i18++) {
                        if ((i17 & 1) != 0) {
                            arrayList.add(descriptor.f((i16 * 32) + i18));
                        }
                        i17 >>>= 1;
                    }
                }
            }
            throw new MissingFieldException(descriptor.a(), arrayList);
        }
        if ((i11 & 1) == 0) {
            this.cancelUntil = null;
        } else {
            this.cancelUntil = str;
        }
        this.confirmationEmail = str2;
        this.foodHandlingInstruction = str3;
        this.buffetHandlingInstruction = str4;
        if ((i11 & 16) == 0) {
            this.canUserSupplyPackaging = false;
        } else {
            this.canUserSupplyPackaging = z11;
        }
        if ((i11 & 32) == 0) {
            this.packagingOption = PackagingOptions.UNKNOWN;
        } else {
            this.packagingOption = packagingOptions;
        }
        if ((i11 & 64) == 0) {
            this.isRated = false;
        } else {
            this.isRated = z12;
        }
        if ((i11 & 128) == 0) {
            this.canBeRated = false;
        } else {
            this.canBeRated = z13;
        }
        this.itemCollectionInfo = str5;
        this.itemCoverImage = picture;
        this.itemLogo = picture2;
        this.itemId = str6;
        this.itemName = str7;
        this.pickupInterval = pickupInterval;
        this.pickupLocation = storeLocation;
        this.storeTimeZone = str8;
        this.price = price;
        this.totalPrice = price2;
        this.quantity = i13;
        this.overallRating = num;
        this.orderId = str9;
        this.redeemInterval = pickupInterval2;
        this.state = orderState;
        this.storeBranch = str10;
        this.storeId = str11;
        this.storeLogo = picture3;
        this.storeName = str12;
        this.timeOfPurchase = str13;
        if ((268435456 & i11) == 0) {
            this.isBuffet = false;
        } else {
            this.isBuffet = z14;
        }
        if ((i11 & 536870912) == 0) {
            this.canShowBestBeforeExplainer = false;
        } else {
            this.canShowBestBeforeExplainer = z15;
        }
        this.orderType = orderType;
        if ((i11 & Integer.MIN_VALUE) == 0) {
            this.pickupWindowChanged = false;
        } else {
            this.pickupWindowChanged = z16;
        }
        this.additionalOrderInformation = additionalOrderInformation;
        this.paymentMethodDisplayName = str14;
        this.cancelledOrRefundedAtUtc = str15;
        this.redeemedAtUtc = str16;
        this.supportReqCreatedAtUtc = str17;
        if ((i12 & 32) == 0) {
            this.expectedBankDays = 0;
        } else {
            this.expectedBankDays = i14;
        }
        this.paymentState = paymentState;
        this.cancellingEntity = cancellingEntity;
        if ((i12 & 256) == 0) {
            this.isSupportAvailable = false;
        } else {
            this.isSupportAvailable = z17;
        }
        if ((i12 & 512) == 0) {
            this.isExcludedFromExpenseRating = false;
        } else {
            this.isExcludedFromExpenseRating = z18;
        }
        this.needsSync = (i12 & 1024) == 0 ? Boolean.FALSE : bool;
        if ((i12 & NewHope.SENDB_BYTES) == 0) {
            this.hasCollectionTimeChanged = false;
        } else {
            this.hasCollectionTimeChanged = z19;
        }
        if ((i12 & 4096) == 0) {
            this.hasCollectionStateChanged = false;
        } else {
            this.hasCollectionStateChanged = z21;
        }
        if ((i12 & 8192) == 0) {
            this.calendarEventId = 0;
        } else {
            this.calendarEventId = i15;
        }
        this.hasDynamicPrice = (i12 & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) == 0 ? Boolean.FALSE : bool2;
        this.invitationId = str18;
        this.redeemingUserId = str19;
        if ((131072 & i12) == 0) {
            this.isDonation = false;
        } else {
            this.isDonation = z22;
        }
        if ((262144 & i12) == 0) {
            this.isEligibleForReward = false;
        } else {
            this.isEligibleForReward = z23;
        }
        if ((524288 & i12) == 0) {
            this.hasMultiplePayments = false;
        } else {
            this.hasMultiplePayments = z24;
        }
        this.totalPricePaidWithExternalProvider = price3;
        this.totalPricePaidWithVoucher = price4;
        this.itemCategory = itemCategory;
        this.isFavorite = bool3;
        this.isMultiItem = bool4;
        if ((33554432 & i12) == 0) {
            this.isEdible = true;
        } else {
            this.isEdible = z25;
        }
        this.orderItems = list;
        this.specificationLines = list2;
        this.totalPricePaidForDelivery = price5;
        if ((i12 & 536870912) == 0) {
            this.discountAppliedPercentage = null;
        } else {
            this.discountAppliedPercentage = d3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer _childSerializers$_anonymous_() {
        PackagingOptions[] packagingOptionsArrValues = PackagingOptions.values();
        packagingOptionsArrValues.getClass();
        return new i90.a("com.app.tgtg.model.remote.item.response.PackagingOptions", (Enum[]) packagingOptionsArrValues);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new d(OrderItem$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new d(SpecificationLine$$serializer.INSTANCE, 0);
    }

    public static final /* synthetic */ void write$Self$app(Order self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        if (output.C(serialDesc) || self.cancelUntil != null) {
            output.r(serialDesc, 0, r1.f29848a, self.cancelUntil);
        }
        r1 r1Var = r1.f29848a;
        output.r(serialDesc, 1, r1Var, self.confirmationEmail);
        output.r(serialDesc, 2, r1Var, self.foodHandlingInstruction);
        output.r(serialDesc, 3, r1Var, self.buffetHandlingInstruction);
        if (output.C(serialDesc) || self.canUserSupplyPackaging) {
            output.p(serialDesc, 4, self.canUserSupplyPackaging);
        }
        if (output.C(serialDesc) || self.packagingOption != PackagingOptions.UNKNOWN) {
            output.i(serialDesc, 5, (KSerializer) jVarArr[5].getValue(), self.packagingOption);
        }
        if (output.C(serialDesc) || self.isRated) {
            output.p(serialDesc, 6, self.isRated);
        }
        if (output.C(serialDesc) || self.canBeRated) {
            output.p(serialDesc, 7, self.canBeRated);
        }
        output.r(serialDesc, 8, r1Var, self.itemCollectionInfo);
        Picture$$serializer picture$$serializer = Picture$$serializer.INSTANCE;
        output.r(serialDesc, 9, picture$$serializer, self.itemCoverImage);
        output.r(serialDesc, 10, picture$$serializer, self.itemLogo);
        ItemId$$serializer itemId$$serializer = ItemId$$serializer.INSTANCE;
        String str = self.itemId;
        output.r(serialDesc, 11, itemId$$serializer, str != null ? ItemId.m197boximpl(str) : null);
        output.r(serialDesc, 12, r1Var, self.itemName);
        PickupInterval$$serializer pickupInterval$$serializer = PickupInterval$$serializer.INSTANCE;
        output.r(serialDesc, 13, pickupInterval$$serializer, self.pickupInterval);
        output.r(serialDesc, 14, StoreLocation$$serializer.INSTANCE, self.pickupLocation);
        output.r(serialDesc, 15, r1Var, self.storeTimeZone);
        Price$$serializer price$$serializer = Price$$serializer.INSTANCE;
        output.r(serialDesc, 16, price$$serializer, self.price);
        output.i(serialDesc, 17, price$$serializer, self.totalPrice);
        output.m(18, self.quantity, serialDesc);
        output.r(serialDesc, 19, l0.f29821a, self.overallRating);
        output.i(serialDesc, 20, OrderId$$serializer.INSTANCE, OrderId.m209boximpl(self.orderId));
        output.r(serialDesc, 21, pickupInterval$$serializer, self.redeemInterval);
        output.i(serialDesc, 22, OrderStateSerializer.INSTANCE, self.state);
        output.r(serialDesc, 23, r1Var, self.storeBranch);
        output.i(serialDesc, 24, StoreId$$serializer.INSTANCE, StoreId.m269boximpl(self.storeId));
        output.r(serialDesc, 25, picture$$serializer, self.storeLogo);
        output.r(serialDesc, 26, r1Var, self.storeName);
        output.q(serialDesc, 27, self.timeOfPurchase);
        if (output.C(serialDesc) || self.isBuffet) {
            output.p(serialDesc, 28, self.isBuffet);
        }
        if (output.C(serialDesc) || self.canShowBestBeforeExplainer) {
            output.p(serialDesc, 29, self.canShowBestBeforeExplainer);
        }
        output.i(serialDesc, 30, OrderTypeSerializer.INSTANCE, self.orderType);
        if (output.C(serialDesc) || self.pickupWindowChanged) {
            output.p(serialDesc, 31, self.pickupWindowChanged);
        }
        output.r(serialDesc, 32, AdditionalOrderInformation$$serializer.INSTANCE, self.additionalOrderInformation);
        output.r(serialDesc, 33, r1Var, self.paymentMethodDisplayName);
        output.r(serialDesc, 34, r1Var, self.cancelledOrRefundedAtUtc);
        output.r(serialDesc, 35, r1Var, self.redeemedAtUtc);
        output.r(serialDesc, 36, r1Var, self.supportReqCreatedAtUtc);
        if (output.C(serialDesc) || self.expectedBankDays != 0) {
            output.m(37, self.expectedBankDays, serialDesc);
        }
        output.r(serialDesc, 38, PaymentStateEnumSerializer.INSTANCE, self.paymentState);
        output.r(serialDesc, 39, CancellingEntitySerializer.INSTANCE, self.cancellingEntity);
        if (output.C(serialDesc) || self.isSupportAvailable) {
            output.p(serialDesc, 40, self.isSupportAvailable);
        }
        if (output.C(serialDesc) || self.isExcludedFromExpenseRating) {
            output.p(serialDesc, 41, self.isExcludedFromExpenseRating);
        }
        if (output.C(serialDesc) || !Intrinsics.areEqual(self.needsSync, Boolean.FALSE)) {
            output.r(serialDesc, 42, g.f29797a, self.needsSync);
        }
        if (output.C(serialDesc) || self.hasCollectionTimeChanged) {
            output.p(serialDesc, 43, self.hasCollectionTimeChanged);
        }
        if (output.C(serialDesc) || self.hasCollectionStateChanged) {
            output.p(serialDesc, 44, self.hasCollectionStateChanged);
        }
        if (output.C(serialDesc) || self.calendarEventId != 0) {
            output.m(45, self.calendarEventId, serialDesc);
        }
        if (output.C(serialDesc) || !Intrinsics.areEqual(self.hasDynamicPrice, Boolean.FALSE)) {
            output.r(serialDesc, 46, g.f29797a, self.hasDynamicPrice);
        }
        output.r(serialDesc, 47, r1Var, self.invitationId);
        UserId$$serializer userId$$serializer = UserId$$serializer.INSTANCE;
        String str2 = self.redeemingUserId;
        output.r(serialDesc, 48, userId$$serializer, str2 != null ? UserId.m286boximpl(str2) : null);
        if (output.C(serialDesc) || self.isDonation) {
            output.p(serialDesc, 49, self.isDonation);
        }
        if (output.C(serialDesc) || self.isEligibleForReward) {
            output.p(serialDesc, 50, self.isEligibleForReward);
        }
        if (output.C(serialDesc) || self.hasMultiplePayments) {
            output.p(serialDesc, 51, self.hasMultiplePayments);
        }
        output.r(serialDesc, 52, price$$serializer, self.totalPricePaidWithExternalProvider);
        output.r(serialDesc, 53, price$$serializer, self.totalPricePaidWithVoucher);
        output.r(serialDesc, 54, ItemCategorySerializer.INSTANCE, self.itemCategory);
        g gVar = g.f29797a;
        output.r(serialDesc, 55, gVar, self.isFavorite);
        output.r(serialDesc, 56, gVar, self.isMultiItem);
        if (output.C(serialDesc) || !self.isEdible) {
            output.p(serialDesc, 57, self.isEdible);
        }
        output.r(serialDesc, 58, (KSerializer) jVarArr[58].getValue(), self.orderItems);
        output.r(serialDesc, 59, (KSerializer) jVarArr[59].getValue(), self.specificationLines);
        output.r(serialDesc, 60, price$$serializer, self.totalPricePaidForDelivery);
        if (!output.C(serialDesc) && self.discountAppliedPercentage == null) {
            return;
        }
        output.r(serialDesc, 61, v.f29868a, self.discountAppliedPercentage);
    }

    public final boolean canCancel() {
        OrderState orderState;
        String str = this.cancelUntil;
        if (str == null || !((orderState = this.state) == OrderState.ACTIVE || orderState == OrderState.COLLECTION_OFFERED || orderState == OrderState.COLLECTION_DELEGATED)) {
            return false;
        }
        return p0.h(str) > System.currentTimeMillis() || this.pickupWindowChanged;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCancelUntil() {
        return this.cancelUntil;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Picture getItemCoverImage() {
        return this.itemCoverImage;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Picture getItemLogo() {
        return this.itemLogo;
    }

    @Nullable
    /* JADX INFO: renamed from: component12-RWxzYZM, reason: not valid java name and from getter */
    public final String getItemId() {
        return this.itemId;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getItemName() {
        return this.itemName;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final PickupInterval getPickupInterval() {
        return this.pickupInterval;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final StoreLocation getPickupLocation() {
        return this.pickupLocation;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getStoreTimeZone() {
        return this.storeTimeZone;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Price getPrice() {
        return this.price;
    }

    @NotNull
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Price getTotalPrice() {
        return this.totalPrice;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final int getQuantity() {
        return this.quantity;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getConfirmationEmail() {
        return this.confirmationEmail;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final Integer getOverallRating() {
        return this.overallRating;
    }

    @NotNull
    /* JADX INFO: renamed from: component21-reIZeYA, reason: not valid java name and from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final PickupInterval getRedeemInterval() {
        return this.redeemInterval;
    }

    @NotNull
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final OrderState getState() {
        return this.state;
    }

    @Nullable
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getStoreBranch() {
        return this.storeBranch;
    }

    @NotNull
    /* JADX INFO: renamed from: component25-Q2NXY1A, reason: not valid java name and from getter */
    public final String getStoreId() {
        return this.storeId;
    }

    @Nullable
    /* JADX INFO: renamed from: component26, reason: from getter */
    public final Picture getStoreLogo() {
        return this.storeLogo;
    }

    @Nullable
    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getStoreName() {
        return this.storeName;
    }

    @NotNull
    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getTimeOfPurchase() {
        return this.timeOfPurchase;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final boolean getIsBuffet() {
        return this.isBuffet;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFoodHandlingInstruction() {
        return this.foodHandlingInstruction;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final boolean getCanShowBestBeforeExplainer() {
        return this.canShowBestBeforeExplainer;
    }

    @NotNull
    /* JADX INFO: renamed from: component31, reason: from getter */
    public final OrderType getOrderType() {
        return this.orderType;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final boolean getPickupWindowChanged() {
        return this.pickupWindowChanged;
    }

    @Nullable
    /* JADX INFO: renamed from: component33, reason: from getter */
    public final AdditionalOrderInformation getAdditionalOrderInformation() {
        return this.additionalOrderInformation;
    }

    @Nullable
    /* JADX INFO: renamed from: component34, reason: from getter */
    public final String getPaymentMethodDisplayName() {
        return this.paymentMethodDisplayName;
    }

    @Nullable
    /* JADX INFO: renamed from: component35, reason: from getter */
    public final String getCancelledOrRefundedAtUtc() {
        return this.cancelledOrRefundedAtUtc;
    }

    @Nullable
    /* JADX INFO: renamed from: component36, reason: from getter */
    public final String getRedeemedAtUtc() {
        return this.redeemedAtUtc;
    }

    @Nullable
    /* JADX INFO: renamed from: component37, reason: from getter */
    public final String getSupportReqCreatedAtUtc() {
        return this.supportReqCreatedAtUtc;
    }

    /* JADX INFO: renamed from: component38, reason: from getter */
    public final int getExpectedBankDays() {
        return this.expectedBankDays;
    }

    @Nullable
    /* JADX INFO: renamed from: component39, reason: from getter */
    public final PaymentState getPaymentState() {
        return this.paymentState;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBuffetHandlingInstruction() {
        return this.buffetHandlingInstruction;
    }

    @Nullable
    /* JADX INFO: renamed from: component40, reason: from getter */
    public final CancellingEntity getCancellingEntity() {
        return this.cancellingEntity;
    }

    /* JADX INFO: renamed from: component41, reason: from getter */
    public final boolean getIsSupportAvailable() {
        return this.isSupportAvailable;
    }

    /* JADX INFO: renamed from: component42, reason: from getter */
    public final boolean getIsExcludedFromExpenseRating() {
        return this.isExcludedFromExpenseRating;
    }

    @Nullable
    /* JADX INFO: renamed from: component43, reason: from getter */
    public final Boolean getNeedsSync() {
        return this.needsSync;
    }

    /* JADX INFO: renamed from: component44, reason: from getter */
    public final boolean getHasCollectionTimeChanged() {
        return this.hasCollectionTimeChanged;
    }

    /* JADX INFO: renamed from: component45, reason: from getter */
    public final boolean getHasCollectionStateChanged() {
        return this.hasCollectionStateChanged;
    }

    /* JADX INFO: renamed from: component46, reason: from getter */
    public final int getCalendarEventId() {
        return this.calendarEventId;
    }

    @Nullable
    /* JADX INFO: renamed from: component47, reason: from getter */
    public final Boolean getHasDynamicPrice() {
        return this.hasDynamicPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component48, reason: from getter */
    public final String getInvitationId() {
        return this.invitationId;
    }

    @Nullable
    /* JADX INFO: renamed from: component49-4FZwupo, reason: not valid java name and from getter */
    public final String getRedeemingUserId() {
        return this.redeemingUserId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getCanUserSupplyPackaging() {
        return this.canUserSupplyPackaging;
    }

    /* JADX INFO: renamed from: component50, reason: from getter */
    public final boolean getIsDonation() {
        return this.isDonation;
    }

    /* JADX INFO: renamed from: component51, reason: from getter */
    public final boolean getIsEligibleForReward() {
        return this.isEligibleForReward;
    }

    /* JADX INFO: renamed from: component52, reason: from getter */
    public final boolean getHasMultiplePayments() {
        return this.hasMultiplePayments;
    }

    @Nullable
    /* JADX INFO: renamed from: component53, reason: from getter */
    public final Price getTotalPricePaidWithExternalProvider() {
        return this.totalPricePaidWithExternalProvider;
    }

    @Nullable
    /* JADX INFO: renamed from: component54, reason: from getter */
    public final Price getTotalPricePaidWithVoucher() {
        return this.totalPricePaidWithVoucher;
    }

    @Nullable
    /* JADX INFO: renamed from: component55, reason: from getter */
    public final ItemCategory getItemCategory() {
        return this.itemCategory;
    }

    @Nullable
    /* JADX INFO: renamed from: component56, reason: from getter */
    public final Boolean getIsFavorite() {
        return this.isFavorite;
    }

    @Nullable
    /* JADX INFO: renamed from: component57, reason: from getter */
    public final Boolean getIsMultiItem() {
        return this.isMultiItem;
    }

    /* JADX INFO: renamed from: component58, reason: from getter */
    public final boolean getIsEdible() {
        return this.isEdible;
    }

    @Nullable
    public final List<OrderItem> component59() {
        return this.orderItems;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final PackagingOptions getPackagingOption() {
        return this.packagingOption;
    }

    @Nullable
    public final List<SpecificationLine> component60() {
        return this.specificationLines;
    }

    @Nullable
    /* JADX INFO: renamed from: component61, reason: from getter */
    public final Price getTotalPricePaidForDelivery() {
        return this.totalPricePaidForDelivery;
    }

    @Nullable
    /* JADX INFO: renamed from: component62, reason: from getter */
    public final Double getDiscountAppliedPercentage() {
        return this.discountAppliedPercentage;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsRated() {
        return this.isRated;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getCanBeRated() {
        return this.canBeRated;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getItemCollectionInfo() {
        return this.itemCollectionInfo;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-T5PkTcg, reason: not valid java name */
    public final Order m427copyT5PkTcg(@Nullable String cancelUntil, @Nullable String confirmationEmail, @Nullable String foodHandlingInstruction, @Nullable String buffetHandlingInstruction, boolean canUserSupplyPackaging, @NotNull PackagingOptions packagingOption, boolean isRated, boolean canBeRated, @Nullable String itemCollectionInfo, @Nullable Picture itemCoverImage, @Nullable Picture itemLogo, @Nullable String itemId, @Nullable String itemName, @Nullable PickupInterval pickupInterval, @Nullable StoreLocation pickupLocation, @Nullable String storeTimeZone, @Nullable Price price, @NotNull Price totalPrice, int quantity, @Nullable Integer overallRating, @NotNull String orderId, @Nullable PickupInterval redeemInterval, @NotNull OrderState state, @Nullable String storeBranch, @NotNull String storeId, @Nullable Picture storeLogo, @Nullable String storeName, @NotNull String timeOfPurchase, boolean isBuffet, boolean canShowBestBeforeExplainer, @NotNull OrderType orderType, boolean pickupWindowChanged, @Nullable AdditionalOrderInformation additionalOrderInformation, @Nullable String paymentMethodDisplayName, @Nullable String cancelledOrRefundedAtUtc, @Nullable String redeemedAtUtc, @Nullable String supportReqCreatedAtUtc, int expectedBankDays, @Nullable PaymentState paymentState, @Nullable CancellingEntity cancellingEntity, boolean isSupportAvailable, boolean isExcludedFromExpenseRating, @Nullable Boolean needsSync, boolean hasCollectionTimeChanged, boolean hasCollectionStateChanged, int calendarEventId, @Nullable Boolean hasDynamicPrice, @Nullable String invitationId, @Nullable String redeemingUserId, boolean isDonation, boolean isEligibleForReward, boolean hasMultiplePayments, @Nullable Price totalPricePaidWithExternalProvider, @Nullable Price totalPricePaidWithVoucher, @Nullable ItemCategory itemCategory, @Nullable Boolean isFavorite, @Nullable Boolean isMultiItem, boolean isEdible, @Nullable List<OrderItem> orderItems, @Nullable List<SpecificationLine> specificationLines, @Nullable Price totalPricePaidForDelivery, @Nullable Double discountAppliedPercentage) {
        packagingOption.getClass();
        totalPrice.getClass();
        orderId.getClass();
        state.getClass();
        storeId.getClass();
        timeOfPurchase.getClass();
        orderType.getClass();
        return new Order(cancelUntil, confirmationEmail, foodHandlingInstruction, buffetHandlingInstruction, canUserSupplyPackaging, packagingOption, isRated, canBeRated, itemCollectionInfo, itemCoverImage, itemLogo, itemId, itemName, pickupInterval, pickupLocation, storeTimeZone, price, totalPrice, quantity, overallRating, orderId, redeemInterval, state, storeBranch, storeId, storeLogo, storeName, timeOfPurchase, isBuffet, canShowBestBeforeExplainer, orderType, pickupWindowChanged, additionalOrderInformation, paymentMethodDisplayName, cancelledOrRefundedAtUtc, redeemedAtUtc, supportReqCreatedAtUtc, expectedBankDays, paymentState, cancellingEntity, isSupportAvailable, isExcludedFromExpenseRating, needsSync, hasCollectionTimeChanged, hasCollectionStateChanged, calendarEventId, hasDynamicPrice, invitationId, redeemingUserId, isDonation, isEligibleForReward, hasMultiplePayments, totalPricePaidWithExternalProvider, totalPricePaidWithVoucher, itemCategory, isFavorite, isMultiItem, isEdible, orderItems, specificationLines, totalPricePaidForDelivery, discountAppliedPercentage, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:163:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
        /*
            Method dump skipped, instruction units count: 625
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.tgtg.model.remote.order.Order.equals(java.lang.Object):boolean");
    }

    @Nullable
    public final AdditionalOrderInformation getAdditionalOrderInformation() {
        return this.additionalOrderInformation;
    }

    @Nullable
    public final String getBuffetHandlingInstruction() {
        return this.buffetHandlingInstruction;
    }

    public final int getCalendarEventId() {
        return this.calendarEventId;
    }

    public final boolean getCanBeRated() {
        return this.canBeRated;
    }

    public final boolean getCanShowBestBeforeExplainer() {
        return this.canShowBestBeforeExplainer;
    }

    public final boolean getCanUserSupplyPackaging() {
        return this.canUserSupplyPackaging;
    }

    @Nullable
    public final String getCancelUntil() {
        return this.cancelUntil;
    }

    @Nullable
    public final String getCancelledOrRefundedAtUtc() {
        return this.cancelledOrRefundedAtUtc;
    }

    @Nullable
    public final CancellingEntity getCancellingEntity() {
        return this.cancellingEntity;
    }

    @Nullable
    public final String getConfirmationEmail() {
        return this.confirmationEmail;
    }

    @Nullable
    public final Double getDiscountAppliedPercentage() {
        return this.discountAppliedPercentage;
    }

    public final int getExpectedBankDays() {
        return this.expectedBankDays;
    }

    @Nullable
    public final String getFoodHandlingInstruction() {
        return this.foodHandlingInstruction;
    }

    public final boolean getHasCollectionStateChanged() {
        return this.hasCollectionStateChanged;
    }

    public final boolean getHasCollectionTimeChanged() {
        return this.hasCollectionTimeChanged;
    }

    @Nullable
    public final Boolean getHasDynamicPrice() {
        return this.hasDynamicPrice;
    }

    public final boolean getHasMultiplePayments() {
        return this.hasMultiplePayments;
    }

    @Nullable
    public final String getInvitationId() {
        return this.invitationId;
    }

    @Nullable
    public final ItemCategory getItemCategory() {
        return this.itemCategory;
    }

    @Nullable
    public final String getItemCollectionInfo() {
        return this.itemCollectionInfo;
    }

    @Nullable
    public final Picture getItemCoverImage() {
        return this.itemCoverImage;
    }

    @Nullable
    /* JADX INFO: renamed from: getItemId-RWxzYZM, reason: not valid java name */
    public final String m428getItemIdRWxzYZM() {
        return this.itemId;
    }

    @Nullable
    public final Picture getItemLogo() {
        return this.itemLogo;
    }

    @Nullable
    public final String getItemName() {
        return this.itemName;
    }

    @Nullable
    public final String getItemOrStoreLogoUrl() {
        String currentUrl;
        Picture picture = this.itemLogo;
        if (picture != null && (currentUrl = picture.getCurrentUrl()) != null) {
            return currentUrl;
        }
        Picture picture2 = this.storeLogo;
        if (picture2 != null) {
            return picture2.getCurrentUrl();
        }
        return null;
    }

    @Nullable
    public final Boolean getNeedsSync() {
        return this.needsSync;
    }

    @NotNull
    /* JADX INFO: renamed from: getOrderId-reIZeYA, reason: not valid java name */
    public final String m429getOrderIdreIZeYA() {
        return this.orderId;
    }

    @Nullable
    public final List<OrderItem> getOrderItems() {
        return this.orderItems;
    }

    @NotNull
    public final OrderType getOrderType() {
        return this.orderType;
    }

    @Nullable
    public final Integer getOverallRating() {
        return this.overallRating;
    }

    @NotNull
    public final PackagingOptions getPackagingOption() {
        return this.packagingOption;
    }

    @Nullable
    public final String getPaymentMethodDisplayName() {
        return this.paymentMethodDisplayName;
    }

    @Nullable
    public final PaymentState getPaymentState() {
        return this.paymentState;
    }

    @Nullable
    public final PickupInterval getPickupInterval() {
        return this.pickupInterval;
    }

    @Nullable
    public final StoreLocation getPickupLocation() {
        return this.pickupLocation;
    }

    public final boolean getPickupWindowChanged() {
        return this.pickupWindowChanged;
    }

    @Nullable
    public final Price getPrice() {
        return this.price;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    @Nullable
    public final PickupInterval getRedeemInterval() {
        return this.redeemInterval;
    }

    @Nullable
    public final String getRedeemedAtUtc() {
        return this.redeemedAtUtc;
    }

    @Nullable
    /* JADX INFO: renamed from: getRedeemingUserId-4FZwupo, reason: not valid java name */
    public final String m430getRedeemingUserId4FZwupo() {
        return this.redeemingUserId;
    }

    @Nullable
    public final List<SpecificationLine> getSpecificationLines() {
        return this.specificationLines;
    }

    @NotNull
    public final OrderState getState() {
        return this.state;
    }

    @Nullable
    public final String getStoreBranch() {
        return this.storeBranch;
    }

    @NotNull
    /* JADX INFO: renamed from: getStoreId-Q2NXY1A, reason: not valid java name */
    public final String m431getStoreIdQ2NXY1A() {
        return this.storeId;
    }

    @Nullable
    public final Picture getStoreLogo() {
        return this.storeLogo;
    }

    @Nullable
    public final String getStoreName() {
        return this.storeName;
    }

    @Nullable
    public final String getStoreNameAndBranch() {
        String str = this.storeName;
        if (str == null || StringsKt.H(str)) {
            return null;
        }
        String str2 = this.storeBranch;
        return (str2 == null || StringsKt.H(str2)) ? this.storeName : k.m(this.storeName, " - ", this.storeBranch);
    }

    @Nullable
    public final String getStoreTimeZone() {
        return this.storeTimeZone;
    }

    @Nullable
    public final String getSupportReqCreatedAtUtc() {
        return this.supportReqCreatedAtUtc;
    }

    public final long getTimeLeftToCollect() {
        PickupInterval pickupInterval = this.pickupInterval;
        String intervalEnd = pickupInterval != null ? pickupInterval.getIntervalEnd() : null;
        if (intervalEnd == null) {
            intervalEnd = "";
        }
        Date dateI = p0.I(intervalEnd);
        if (dateI != null) {
            return dateI.getTime() - DateTimeUtils.nowInMilliseconds();
        }
        return 0L;
    }

    public final long getTimeLeftToCollectWithGracePeriod() {
        PickupInterval pickupInterval = this.pickupInterval;
        String intervalEnd = pickupInterval != null ? pickupInterval.getIntervalEnd() : null;
        if (intervalEnd == null) {
            intervalEnd = "";
        }
        Date dateI = p0.I(intervalEnd);
        if (dateI != null) {
            return (dateI.getTime() + TimeConstants.FIFTEEN_MINUTES_DIFFERENCE) - DateTimeUtils.nowInMilliseconds();
        }
        return 0L;
    }

    @NotNull
    public final String getTimeOfPurchase() {
        return this.timeOfPurchase;
    }

    @NotNull
    public final Price getTotalPrice() {
        return this.totalPrice;
    }

    @Nullable
    public final Price getTotalPricePaidForDelivery() {
        return this.totalPricePaidForDelivery;
    }

    @Nullable
    public final Price getTotalPricePaidWithExternalProvider() {
        return this.totalPricePaidWithExternalProvider;
    }

    @Nullable
    public final Price getTotalPricePaidWithVoucher() {
        return this.totalPricePaidWithVoucher;
    }

    public int hashCode() {
        String str = this.cancelUntil;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.confirmationEmail;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.foodHandlingInstruction;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.buffetHandlingInstruction;
        int iE = k.e(k.e((this.packagingOption.hashCode() + k.e((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.canUserSupplyPackaging)) * 31, 31, this.isRated), 31, this.canBeRated);
        String str5 = this.itemCollectionInfo;
        int iHashCode4 = (iE + (str5 == null ? 0 : str5.hashCode())) * 31;
        Picture picture = this.itemCoverImage;
        int iHashCode5 = (iHashCode4 + (picture == null ? 0 : picture.hashCode())) * 31;
        Picture picture2 = this.itemLogo;
        int iHashCode6 = (iHashCode5 + (picture2 == null ? 0 : picture2.hashCode())) * 31;
        String str6 = this.itemId;
        int iM202hashCodeimpl = (iHashCode6 + (str6 == null ? 0 : ItemId.m202hashCodeimpl(str6))) * 31;
        String str7 = this.itemName;
        int iHashCode7 = (iM202hashCodeimpl + (str7 == null ? 0 : str7.hashCode())) * 31;
        PickupInterval pickupInterval = this.pickupInterval;
        int iHashCode8 = (iHashCode7 + (pickupInterval == null ? 0 : pickupInterval.hashCode())) * 31;
        StoreLocation storeLocation = this.pickupLocation;
        int iHashCode9 = (iHashCode8 + (storeLocation == null ? 0 : storeLocation.hashCode())) * 31;
        String str8 = this.storeTimeZone;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Price price = this.price;
        int iB = k.b(this.quantity, (this.totalPrice.hashCode() + ((iHashCode10 + (price == null ? 0 : price.hashCode())) * 31)) * 31, 31);
        Integer num = this.overallRating;
        int iM214hashCodeimpl = (OrderId.m214hashCodeimpl(this.orderId) + ((iB + (num == null ? 0 : num.hashCode())) * 31)) * 31;
        PickupInterval pickupInterval2 = this.redeemInterval;
        int iHashCode11 = (this.state.hashCode() + ((iM214hashCodeimpl + (pickupInterval2 == null ? 0 : pickupInterval2.hashCode())) * 31)) * 31;
        String str9 = this.storeBranch;
        int iM274hashCodeimpl = (StoreId.m274hashCodeimpl(this.storeId) + ((iHashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31)) * 31;
        Picture picture3 = this.storeLogo;
        int iHashCode12 = (iM274hashCodeimpl + (picture3 == null ? 0 : picture3.hashCode())) * 31;
        String str10 = this.storeName;
        int iE2 = k.e((this.orderType.hashCode() + k.e(k.e(l1.b((iHashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31, 31, this.timeOfPurchase), 31, this.isBuffet), 31, this.canShowBestBeforeExplainer)) * 31, 31, this.pickupWindowChanged);
        AdditionalOrderInformation additionalOrderInformation = this.additionalOrderInformation;
        int iHashCode13 = (iE2 + (additionalOrderInformation == null ? 0 : additionalOrderInformation.hashCode())) * 31;
        String str11 = this.paymentMethodDisplayName;
        int iHashCode14 = (iHashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.cancelledOrRefundedAtUtc;
        int iHashCode15 = (iHashCode14 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.redeemedAtUtc;
        int iHashCode16 = (iHashCode15 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.supportReqCreatedAtUtc;
        int iB2 = k.b(this.expectedBankDays, (iHashCode16 + (str14 == null ? 0 : str14.hashCode())) * 31, 31);
        PaymentState paymentState = this.paymentState;
        int iHashCode17 = (iB2 + (paymentState == null ? 0 : paymentState.hashCode())) * 31;
        CancellingEntity cancellingEntity = this.cancellingEntity;
        int iE3 = k.e(k.e((iHashCode17 + (cancellingEntity == null ? 0 : cancellingEntity.hashCode())) * 31, 31, this.isSupportAvailable), 31, this.isExcludedFromExpenseRating);
        Boolean bool = this.needsSync;
        int iB3 = k.b(this.calendarEventId, k.e(k.e((iE3 + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.hasCollectionTimeChanged), 31, this.hasCollectionStateChanged), 31);
        Boolean bool2 = this.hasDynamicPrice;
        int iHashCode18 = (iB3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str15 = this.invitationId;
        int iHashCode19 = (iHashCode18 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.redeemingUserId;
        int iE4 = k.e(k.e(k.e((iHashCode19 + (str16 == null ? 0 : UserId.m291hashCodeimpl(str16))) * 31, 31, this.isDonation), 31, this.isEligibleForReward), 31, this.hasMultiplePayments);
        Price price2 = this.totalPricePaidWithExternalProvider;
        int iHashCode20 = (iE4 + (price2 == null ? 0 : price2.hashCode())) * 31;
        Price price3 = this.totalPricePaidWithVoucher;
        int iHashCode21 = (iHashCode20 + (price3 == null ? 0 : price3.hashCode())) * 31;
        ItemCategory itemCategory = this.itemCategory;
        int iHashCode22 = (iHashCode21 + (itemCategory == null ? 0 : itemCategory.hashCode())) * 31;
        Boolean bool3 = this.isFavorite;
        int iHashCode23 = (iHashCode22 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.isMultiItem;
        int iE5 = k.e((iHashCode23 + (bool4 == null ? 0 : bool4.hashCode())) * 31, 31, this.isEdible);
        List<OrderItem> list = this.orderItems;
        int iHashCode24 = (iE5 + (list == null ? 0 : list.hashCode())) * 31;
        List<SpecificationLine> list2 = this.specificationLines;
        int iHashCode25 = (iHashCode24 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Price price4 = this.totalPricePaidForDelivery;
        int iHashCode26 = (iHashCode25 + (price4 == null ? 0 : price4.hashCode())) * 31;
        Double d3 = this.discountAppliedPercentage;
        return iHashCode26 + (d3 != null ? d3.hashCode() : 0);
    }

    public final boolean isBuffet() {
        return this.isBuffet;
    }

    public final boolean isCharity() {
        return this.orderType == OrderType.CHARITY;
    }

    public final boolean isDonation() {
        return this.isDonation;
    }

    public final boolean isEdible() {
        return this.isEdible;
    }

    public final boolean isEligibleForReward() {
        return this.isEligibleForReward;
    }

    public final boolean isExcludedFromExpenseRating() {
        return this.isExcludedFromExpenseRating;
    }

    @Nullable
    public final Boolean isFavorite() {
        return this.isFavorite;
    }

    public final boolean isFlashSales() {
        return this.orderType == OrderType.FLASH_SALES;
    }

    @Nullable
    public final Boolean isMultiItem() {
        return this.isMultiItem;
    }

    public final boolean isRated() {
        return this.isRated;
    }

    public final boolean isSupportAvailable() {
        return this.isSupportAvailable;
    }

    @NotNull
    public final String orderTypeMappedToItemTypeForTracking() {
        switch (WhenMappings.$EnumSwitchMapping$0[this.orderType.ordinal()]) {
            case 1:
                return "MAGIC_BAG";
            case 2:
                return "MANUFACTURER";
            case 3:
                return "CHARITY";
            case 4:
                return "FLASH_SALES";
            case 5:
                return "CATERING";
            case 6:
                return "TABLE_RESERVATION";
            default:
                return "UNKNOWN";
        }
    }

    public final void setAdditionalOrderInformation(@Nullable AdditionalOrderInformation additionalOrderInformation) {
        this.additionalOrderInformation = additionalOrderInformation;
    }

    public final void setCalendarEventId(int i11) {
        this.calendarEventId = i11;
    }

    public final void setCancelUntil(@Nullable String str) {
        this.cancelUntil = str;
    }

    public final void setFavorite(@Nullable Boolean bool) {
        this.isFavorite = bool;
    }

    public final void setHasCollectionStateChanged(boolean z11) {
        this.hasCollectionStateChanged = z11;
    }

    public final void setHasCollectionTimeChanged(boolean z11) {
        this.hasCollectionTimeChanged = z11;
    }

    public final void setItemCoverImage(@Nullable Picture picture) {
        this.itemCoverImage = picture;
    }

    public final void setItemLogo(@Nullable Picture picture) {
        this.itemLogo = picture;
    }

    public final void setMultiItem(@Nullable Boolean bool) {
        this.isMultiItem = bool;
    }

    public final void setNeedsSync(@Nullable Boolean bool) {
        this.needsSync = bool;
    }

    public final void setOrderItems(@Nullable List<OrderItem> list) {
        this.orderItems = list;
    }

    public final void setOverallRating(@Nullable Integer num) {
        this.overallRating = num;
    }

    public final void setPickupInterval(@Nullable PickupInterval pickupInterval) {
        this.pickupInterval = pickupInterval;
    }

    public final void setPickupLocation(@Nullable StoreLocation storeLocation) {
        this.pickupLocation = storeLocation;
    }

    public final void setPickupWindowChanged(boolean z11) {
        this.pickupWindowChanged = z11;
    }

    public final void setPrice(@Nullable Price price) {
        this.price = price;
    }

    public final void setRated(boolean z11) {
        this.isRated = z11;
    }

    public final void setRedeemInterval(@Nullable PickupInterval pickupInterval) {
        this.redeemInterval = pickupInterval;
    }

    public final void setState(@NotNull OrderState orderState) {
        orderState.getClass();
        this.state = orderState;
    }

    public final void setStoreBranch(@Nullable String str) {
        this.storeBranch = str;
    }

    public final void setStoreLogo(@Nullable Picture picture) {
        this.storeLogo = picture;
    }

    public final void setStoreName(@Nullable String str) {
        this.storeName = str;
    }

    public final void setStoreTimeZone(@Nullable String str) {
        this.storeTimeZone = str;
    }

    @NotNull
    public String toString() {
        String str = this.cancelUntil;
        String str2 = this.confirmationEmail;
        String str3 = this.foodHandlingInstruction;
        String str4 = this.buffetHandlingInstruction;
        boolean z11 = this.canUserSupplyPackaging;
        PackagingOptions packagingOptions = this.packagingOption;
        boolean z12 = this.isRated;
        boolean z13 = this.canBeRated;
        String str5 = this.itemCollectionInfo;
        Picture picture = this.itemCoverImage;
        Picture picture2 = this.itemLogo;
        String str6 = this.itemId;
        String strM203toStringimpl = str6 == null ? Address.ADDRESS_NULL_PLACEHOLDER : ItemId.m203toStringimpl(str6);
        String str7 = this.itemName;
        PickupInterval pickupInterval = this.pickupInterval;
        String strM292toStringimpl = Address.ADDRESS_NULL_PLACEHOLDER;
        StoreLocation storeLocation = this.pickupLocation;
        String str8 = this.storeTimeZone;
        Price price = this.price;
        Price price2 = this.totalPrice;
        int i11 = this.quantity;
        Integer num = this.overallRating;
        String strM215toStringimpl = OrderId.m215toStringimpl(this.orderId);
        PickupInterval pickupInterval2 = this.redeemInterval;
        OrderState orderState = this.state;
        String str9 = this.storeBranch;
        String strM275toStringimpl = StoreId.m275toStringimpl(this.storeId);
        Picture picture3 = this.storeLogo;
        String str10 = this.storeName;
        String str11 = this.timeOfPurchase;
        boolean z14 = this.isBuffet;
        boolean z15 = this.canShowBestBeforeExplainer;
        OrderType orderType = this.orderType;
        boolean z16 = this.pickupWindowChanged;
        AdditionalOrderInformation additionalOrderInformation = this.additionalOrderInformation;
        String str12 = this.paymentMethodDisplayName;
        String str13 = this.cancelledOrRefundedAtUtc;
        String str14 = this.redeemedAtUtc;
        String str15 = this.supportReqCreatedAtUtc;
        int i12 = this.expectedBankDays;
        PaymentState paymentState = this.paymentState;
        CancellingEntity cancellingEntity = this.cancellingEntity;
        boolean z17 = this.isSupportAvailable;
        boolean z18 = this.isExcludedFromExpenseRating;
        Boolean bool = this.needsSync;
        boolean z19 = this.hasCollectionTimeChanged;
        boolean z21 = this.hasCollectionStateChanged;
        int i13 = this.calendarEventId;
        Boolean bool2 = this.hasDynamicPrice;
        String str16 = this.invitationId;
        String str17 = this.redeemingUserId;
        if (str17 != null) {
            strM292toStringimpl = UserId.m292toStringimpl(str17);
        }
        boolean z22 = this.isDonation;
        boolean z23 = this.isEligibleForReward;
        boolean z24 = this.hasMultiplePayments;
        Price price3 = this.totalPricePaidWithExternalProvider;
        Price price4 = this.totalPricePaidWithVoucher;
        ItemCategory itemCategory = this.itemCategory;
        Boolean bool3 = this.isFavorite;
        Boolean bool4 = this.isMultiItem;
        boolean z25 = this.isEdible;
        List<OrderItem> list = this.orderItems;
        List<SpecificationLine> list2 = this.specificationLines;
        Price price5 = this.totalPricePaidForDelivery;
        Double d3 = this.discountAppliedPercentage;
        StringBuilder sbT = e0.f.t("Order(cancelUntil=", str, ", confirmationEmail=", str2, ", foodHandlingInstruction=");
        s.A(sbT, str3, ", buffetHandlingInstruction=", str4, ", canUserSupplyPackaging=");
        sbT.append(z11);
        sbT.append(", packagingOption=");
        sbT.append(packagingOptions);
        sbT.append(", isRated=");
        i.C(sbT, z12, ", canBeRated=", z13, ", itemCollectionInfo=");
        sbT.append(str5);
        sbT.append(", itemCoverImage=");
        sbT.append(picture);
        sbT.append(", itemLogo=");
        sbT.append(picture2);
        sbT.append(", itemId=");
        sbT.append(strM203toStringimpl);
        sbT.append(", itemName=");
        sbT.append(str7);
        sbT.append(", pickupInterval=");
        sbT.append(pickupInterval);
        sbT.append(", pickupLocation=");
        sbT.append(storeLocation);
        sbT.append(", storeTimeZone=");
        sbT.append(str8);
        sbT.append(", price=");
        sbT.append(price);
        sbT.append(", totalPrice=");
        sbT.append(price2);
        sbT.append(", quantity=");
        sbT.append(i11);
        sbT.append(", overallRating=");
        sbT.append(num);
        sbT.append(", orderId=");
        sbT.append(strM215toStringimpl);
        sbT.append(", redeemInterval=");
        sbT.append(pickupInterval2);
        sbT.append(", state=");
        sbT.append(orderState);
        sbT.append(", storeBranch=");
        sbT.append(str9);
        sbT.append(", storeId=");
        sbT.append(strM275toStringimpl);
        sbT.append(", storeLogo=");
        sbT.append(picture3);
        sbT.append(", storeName=");
        s.A(sbT, str10, ", timeOfPurchase=", str11, ", isBuffet=");
        i.C(sbT, z14, ", canShowBestBeforeExplainer=", z15, ", orderType=");
        sbT.append(orderType);
        sbT.append(", pickupWindowChanged=");
        sbT.append(z16);
        sbT.append(", additionalOrderInformation=");
        sbT.append(additionalOrderInformation);
        sbT.append(", paymentMethodDisplayName=");
        sbT.append(str12);
        sbT.append(", cancelledOrRefundedAtUtc=");
        s.A(sbT, str13, ", redeemedAtUtc=", str14, ", supportReqCreatedAtUtc=");
        sbT.append(str15);
        sbT.append(", expectedBankDays=");
        sbT.append(i12);
        sbT.append(", paymentState=");
        sbT.append(paymentState);
        sbT.append(", cancellingEntity=");
        sbT.append(cancellingEntity);
        sbT.append(", isSupportAvailable=");
        i.C(sbT, z17, ", isExcludedFromExpenseRating=", z18, ", needsSync=");
        sbT.append(bool);
        sbT.append(", hasCollectionTimeChanged=");
        sbT.append(z19);
        sbT.append(", hasCollectionStateChanged=");
        sbT.append(z21);
        sbT.append(", calendarEventId=");
        sbT.append(i13);
        sbT.append(", hasDynamicPrice=");
        sbT.append(bool2);
        sbT.append(", invitationId=");
        sbT.append(str16);
        sbT.append(", redeemingUserId=");
        k.z(sbT, strM292toStringimpl, ", isDonation=", z22, ", isEligibleForReward=");
        i.C(sbT, z23, ", hasMultiplePayments=", z24, ", totalPricePaidWithExternalProvider=");
        sbT.append(price3);
        sbT.append(", totalPricePaidWithVoucher=");
        sbT.append(price4);
        sbT.append(", itemCategory=");
        sbT.append(itemCategory);
        sbT.append(", isFavorite=");
        sbT.append(bool3);
        sbT.append(", isMultiItem=");
        sbT.append(bool4);
        sbT.append(", isEdible=");
        sbT.append(z25);
        sbT.append(", orderItems=");
        sbT.append(list);
        sbT.append(", specificationLines=");
        sbT.append(list2);
        sbT.append(", totalPricePaidForDelivery=");
        sbT.append(price5);
        sbT.append(", discountAppliedPercentage=");
        sbT.append(d3);
        sbT.append(")");
        return sbT.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.cancelUntil);
        dest.writeString(this.confirmationEmail);
        dest.writeString(this.foodHandlingInstruction);
        dest.writeString(this.buffetHandlingInstruction);
        dest.writeInt(this.canUserSupplyPackaging ? 1 : 0);
        dest.writeString(this.packagingOption.name());
        dest.writeInt(this.isRated ? 1 : 0);
        dest.writeInt(this.canBeRated ? 1 : 0);
        dest.writeString(this.itemCollectionInfo);
        Picture picture = this.itemCoverImage;
        if (picture == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            picture.writeToParcel(dest, flags);
        }
        Picture picture2 = this.itemLogo;
        if (picture2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            picture2.writeToParcel(dest, flags);
        }
        String str = this.itemId;
        if (str == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            ItemId.m204writeToParcelimpl(str, dest, flags);
        }
        dest.writeString(this.itemName);
        PickupInterval pickupInterval = this.pickupInterval;
        if (pickupInterval == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            pickupInterval.writeToParcel(dest, flags);
        }
        StoreLocation storeLocation = this.pickupLocation;
        if (storeLocation == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            storeLocation.writeToParcel(dest, flags);
        }
        dest.writeString(this.storeTimeZone);
        Price price = this.price;
        if (price == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            price.writeToParcel(dest, flags);
        }
        this.totalPrice.writeToParcel(dest, flags);
        dest.writeInt(this.quantity);
        Integer num = this.overallRating;
        if (num == null) {
            dest.writeInt(0);
        } else {
            i.w(dest, 1, num);
        }
        OrderId.m216writeToParcelimpl(this.orderId, dest, flags);
        PickupInterval pickupInterval2 = this.redeemInterval;
        if (pickupInterval2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            pickupInterval2.writeToParcel(dest, flags);
        }
        dest.writeString(this.state.name());
        dest.writeString(this.storeBranch);
        StoreId.m276writeToParcelimpl(this.storeId, dest, flags);
        Picture picture3 = this.storeLogo;
        if (picture3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            picture3.writeToParcel(dest, flags);
        }
        dest.writeString(this.storeName);
        dest.writeString(this.timeOfPurchase);
        dest.writeInt(this.isBuffet ? 1 : 0);
        dest.writeInt(this.canShowBestBeforeExplainer ? 1 : 0);
        dest.writeString(this.orderType.name());
        dest.writeInt(this.pickupWindowChanged ? 1 : 0);
        AdditionalOrderInformation additionalOrderInformation = this.additionalOrderInformation;
        if (additionalOrderInformation == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            additionalOrderInformation.writeToParcel(dest, flags);
        }
        dest.writeString(this.paymentMethodDisplayName);
        dest.writeString(this.cancelledOrRefundedAtUtc);
        dest.writeString(this.redeemedAtUtc);
        dest.writeString(this.supportReqCreatedAtUtc);
        dest.writeInt(this.expectedBankDays);
        PaymentState paymentState = this.paymentState;
        if (paymentState == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(paymentState.name());
        }
        CancellingEntity cancellingEntity = this.cancellingEntity;
        if (cancellingEntity == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(cancellingEntity.name());
        }
        dest.writeInt(this.isSupportAvailable ? 1 : 0);
        dest.writeInt(this.isExcludedFromExpenseRating ? 1 : 0);
        Boolean bool = this.needsSync;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            i.v(dest, 1, bool);
        }
        dest.writeInt(this.hasCollectionTimeChanged ? 1 : 0);
        dest.writeInt(this.hasCollectionStateChanged ? 1 : 0);
        dest.writeInt(this.calendarEventId);
        Boolean bool2 = this.hasDynamicPrice;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            i.v(dest, 1, bool2);
        }
        dest.writeString(this.invitationId);
        String str2 = this.redeemingUserId;
        if (str2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            UserId.m293writeToParcelimpl(str2, dest, flags);
        }
        dest.writeInt(this.isDonation ? 1 : 0);
        dest.writeInt(this.isEligibleForReward ? 1 : 0);
        dest.writeInt(this.hasMultiplePayments ? 1 : 0);
        Price price2 = this.totalPricePaidWithExternalProvider;
        if (price2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            price2.writeToParcel(dest, flags);
        }
        Price price3 = this.totalPricePaidWithVoucher;
        if (price3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            price3.writeToParcel(dest, flags);
        }
        ItemCategory itemCategory = this.itemCategory;
        if (itemCategory == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(itemCategory.name());
        }
        Boolean bool3 = this.isFavorite;
        if (bool3 == null) {
            dest.writeInt(0);
        } else {
            i.v(dest, 1, bool3);
        }
        Boolean bool4 = this.isMultiItem;
        if (bool4 == null) {
            dest.writeInt(0);
        } else {
            i.v(dest, 1, bool4);
        }
        dest.writeInt(this.isEdible ? 1 : 0);
        List<OrderItem> list = this.orderItems;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = i.q(dest, 1, list);
            while (itQ.hasNext()) {
                ((OrderItem) itQ.next()).writeToParcel(dest, flags);
            }
        }
        List<SpecificationLine> list2 = this.specificationLines;
        if (list2 == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ2 = i.q(dest, 1, list2);
            while (itQ2.hasNext()) {
                ((SpecificationLine) itQ2.next()).writeToParcel(dest, flags);
            }
        }
        Price price4 = this.totalPricePaidForDelivery;
        if (price4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            price4.writeToParcel(dest, flags);
        }
        Double d3 = this.discountAppliedPercentage;
        if (d3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d3.doubleValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/order/Order$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/order/Order;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return Order$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Order> {
        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v29, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r2v30 */
        /* JADX WARN: Type inference failed for: r2v31 */
        /* JADX WARN: Type inference failed for: r2v33 */
        /* JADX WARN: Type inference failed for: r2v34 */
        /* JADX WARN: Type inference failed for: r2v38 */
        /* JADX WARN: Type inference failed for: r2v44 */
        /* JADX WARN: Type inference failed for: r39v1 */
        /* JADX WARN: Type inference failed for: r39v2, types: [com.app.tgtg.model.remote.item.response.PaymentState] */
        /* JADX WARN: Type inference failed for: r39v3 */
        /* JADX WARN: Type inference failed for: r3v1 */
        /* JADX WARN: Type inference failed for: r3v2, types: [int] */
        /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r3v5 */
        /* JADX WARN: Type inference failed for: r3v7 */
        /* JADX WARN: Type inference failed for: r3v8 */
        /* JADX WARN: Type inference failed for: r40v1 */
        /* JADX WARN: Type inference failed for: r40v2, types: [com.app.tgtg.model.remote.item.response.CancellingEntity] */
        /* JADX WARN: Type inference failed for: r40v3 */
        /* JADX WARN: Type inference failed for: r43v4 */
        /* JADX WARN: Type inference failed for: r43v5, types: [java.lang.Boolean] */
        /* JADX WARN: Type inference failed for: r43v6 */
        /* JADX WARN: Type inference failed for: r47v7 */
        /* JADX WARN: Type inference failed for: r47v8, types: [java.lang.Boolean] */
        /* JADX WARN: Type inference failed for: r47v9 */
        /* JADX WARN: Type inference failed for: r49v3, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r4v5 */
        /* JADX WARN: Type inference failed for: r4v6, types: [int] */
        /* JADX WARN: Type inference failed for: r4v9 */
        /* JADX WARN: Type inference failed for: r55v3 */
        /* JADX WARN: Type inference failed for: r55v4, types: [com.app.tgtg.model.remote.item.ItemCategory] */
        /* JADX WARN: Type inference failed for: r55v5 */
        /* JADX WARN: Type inference failed for: r56v3, types: [java.lang.Boolean] */
        /* JADX WARN: Type inference failed for: r57v4, types: [java.lang.Boolean] */
        /* JADX WARN: Type inference failed for: r60v7, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r62v3, types: [java.lang.Double] */
        /* JADX WARN: Type inference failed for: r65v1 */
        /* JADX WARN: Type inference failed for: r65v2, types: [java.util.List] */
        @Override // android.os.Parcelable.Creator
        public final Order createFromParcel(Parcel parcel) {
            PackagingOptions packagingOptions;
            boolean z11;
            String strM205unboximpl;
            Integer num;
            String str;
            Object objCreateFromParcel;
            String str2;
            Object objCreateFromParcel2;
            String str3;
            Object objCreateFromParcel3;
            Price price;
            PickupInterval pickupInterval;
            boolean z12;
            String str4;
            boolean z13;
            String str5;
            Object objCreateFromParcel4;
            Price price2;
            boolean z14;
            boolean z15;
            Object objValueOf;
            String str6;
            ?? r402;
            boolean z16;
            Price price3;
            boolean z17;
            boolean z18;
            Object objValueOf2;
            String str7;
            Object objCreateFromParcel5;
            boolean z19;
            Object obj;
            ?? r39;
            ?? r43;
            ?? r47;
            boolean z21;
            String str8;
            boolean z22;
            Object objValueOf3;
            Object objValueOf4;
            Object obj2;
            ?? r55;
            boolean z23;
            Price price4;
            Object obj3;
            ?? arrayList;
            String str9;
            ?? arrayList2;
            parcel.getClass();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            boolean z24 = parcel.readInt() != 0;
            PackagingOptions packagingOptionsValueOf = PackagingOptions.valueOf(parcel.readString());
            boolean z25 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                packagingOptions = packagingOptionsValueOf;
                z11 = true;
            } else {
                packagingOptions = packagingOptionsValueOf;
                z11 = false;
            }
            boolean z26 = z25;
            String string5 = parcel.readString();
            Picture pictureCreateFromParcel = parcel.readInt() == 0 ? null : Picture.CREATOR.createFromParcel(parcel);
            Picture pictureCreateFromParcel2 = parcel.readInt() == 0 ? null : Picture.CREATOR.createFromParcel(parcel);
            ItemId itemIdCreateFromParcel = parcel.readInt() == 0 ? null : ItemId.CREATOR.createFromParcel(parcel);
            if (itemIdCreateFromParcel != null) {
                strM205unboximpl = itemIdCreateFromParcel.m205unboximpl();
                num = null;
            } else {
                strM205unboximpl = null;
                num = null;
            }
            String string6 = parcel.readString();
            PickupInterval pickupInterval2 = (PickupInterval) (parcel.readInt() == 0 ? num : PickupInterval.CREATOR.createFromParcel(parcel));
            StoreLocation storeLocation = (StoreLocation) (parcel.readInt() == 0 ? num : StoreLocation.CREATOR.createFromParcel(parcel));
            Integer num2 = num;
            String string7 = parcel.readString();
            if (parcel.readInt() == 0) {
                str = string;
                objCreateFromParcel = num2;
            } else {
                str = string;
                objCreateFromParcel = Price.CREATOR.createFromParcel(parcel);
            }
            Price price5 = (Price) objCreateFromParcel;
            Parcelable.Creator<Price> creator = Price.CREATOR;
            Price priceCreateFromParcel = creator.createFromParcel(parcel);
            int i11 = parcel.readInt();
            Integer numValueOf = parcel.readInt() == 0 ? num2 : Integer.valueOf(parcel.readInt());
            String strM217unboximpl = OrderId.CREATOR.createFromParcel(parcel).m217unboximpl();
            if (parcel.readInt() == 0) {
                str2 = strM217unboximpl;
                objCreateFromParcel2 = num2;
            } else {
                str2 = strM217unboximpl;
                objCreateFromParcel2 = PickupInterval.CREATOR.createFromParcel(parcel);
            }
            PickupInterval pickupInterval3 = (PickupInterval) objCreateFromParcel2;
            OrderState orderStateValueOf = OrderState.valueOf(parcel.readString());
            String str10 = str;
            Integer num3 = numValueOf;
            String string8 = parcel.readString();
            String strM277unboximpl = StoreId.CREATOR.createFromParcel(parcel).m277unboximpl();
            if (parcel.readInt() == 0) {
                str3 = strM277unboximpl;
                objCreateFromParcel3 = num2;
            } else {
                str3 = strM277unboximpl;
                objCreateFromParcel3 = Picture.CREATOR.createFromParcel(parcel);
            }
            Picture picture = (Picture) objCreateFromParcel3;
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            if (parcel.readInt() != 0) {
                price = priceCreateFromParcel;
                pickupInterval = pickupInterval3;
                z12 = true;
            } else {
                price = priceCreateFromParcel;
                pickupInterval = pickupInterval3;
                z12 = false;
            }
            String str11 = str2;
            String str12 = str3;
            boolean z27 = parcel.readInt() != 0;
            OrderType orderTypeValueOf = OrderType.valueOf(parcel.readString());
            if (parcel.readInt() != 0) {
                str4 = str10;
                z13 = true;
            } else {
                str4 = str10;
                z13 = false;
            }
            if (parcel.readInt() == 0) {
                str5 = string2;
                objCreateFromParcel4 = num2;
            } else {
                str5 = string2;
                objCreateFromParcel4 = AdditionalOrderInformation.CREATOR.createFromParcel(parcel);
            }
            AdditionalOrderInformation additionalOrderInformation = (AdditionalOrderInformation) objCreateFromParcel4;
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String str13 = str4;
            String string13 = parcel.readString();
            Price price6 = price;
            String str14 = str5;
            String string14 = parcel.readString();
            boolean z28 = false;
            int i12 = parcel.readInt();
            Object objValueOf5 = parcel.readInt() == 0 ? num2 : PaymentState.valueOf(parcel.readString());
            Object objValueOf6 = parcel.readInt() == 0 ? num2 : CancellingEntity.valueOf(parcel.readString());
            if (parcel.readInt() != 0) {
                price2 = price6;
                z14 = true;
            } else {
                price2 = price6;
                z14 = false;
            }
            if (parcel.readInt() != 0) {
                z15 = false;
                z28 = true;
            } else {
                z15 = false;
            }
            if (parcel.readInt() == 0) {
                objValueOf = num2;
            } else {
                objValueOf = Boolean.valueOf(parcel.readInt() != 0 ? true : z15);
            }
            if (parcel.readInt() != 0) {
                str6 = str13;
                r402 = objValueOf6;
                z16 = true;
            } else {
                str6 = str13;
                r402 = objValueOf6;
                z16 = z15;
            }
            if (parcel.readInt() != 0) {
                price3 = price2;
                z18 = z15;
                z17 = true;
            } else {
                price3 = price2;
                z17 = z15;
                z18 = z17;
            }
            int i13 = parcel.readInt();
            if (parcel.readInt() == 0) {
                objValueOf2 = num2;
            } else {
                objValueOf2 = Boolean.valueOf(parcel.readInt() != 0 ? true : z18);
            }
            String str15 = str6;
            String string15 = parcel.readString();
            if (parcel.readInt() == 0) {
                str7 = str14;
                objCreateFromParcel5 = num2;
            } else {
                str7 = str14;
                objCreateFromParcel5 = UserId.CREATOR.createFromParcel(parcel);
            }
            UserId userId = (UserId) objCreateFromParcel5;
            Object objM294unboximpl = userId != null ? userId.m294unboximpl() : num2;
            if (parcel.readInt() != 0) {
                z19 = z18;
                z18 = true;
            } else {
                z19 = z18;
            }
            if (parcel.readInt() != 0) {
                obj = num2;
                r39 = objValueOf5;
                r43 = objValueOf;
                r47 = objValueOf2;
                z21 = true;
            } else {
                obj = num2;
                r39 = objValueOf5;
                r43 = objValueOf;
                r47 = objValueOf2;
                z21 = z19;
            }
            if (parcel.readInt() != 0) {
                str8 = str15;
                z22 = true;
            } else {
                str8 = str15;
                z22 = z19;
            }
            Price price7 = (Price) (parcel.readInt() == 0 ? obj : creator.createFromParcel(parcel));
            Price price8 = (Price) (parcel.readInt() == 0 ? obj : creator.createFromParcel(parcel));
            Object objValueOf7 = parcel.readInt() == 0 ? obj : ItemCategory.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                objValueOf3 = obj;
            } else {
                objValueOf3 = Boolean.valueOf(parcel.readInt() != 0 ? true : z19);
            }
            if (parcel.readInt() == 0) {
                objValueOf4 = obj;
            } else {
                objValueOf4 = Boolean.valueOf(parcel.readInt() != 0 ? true : z19);
            }
            if (parcel.readInt() != 0) {
                obj2 = obj;
                r55 = objValueOf7;
                z23 = true;
            } else {
                obj2 = obj;
                r55 = objValueOf7;
                z23 = z19;
            }
            if (parcel.readInt() == 0) {
                price4 = price8;
                obj3 = objM294unboximpl;
                str9 = string3;
                arrayList = obj2;
            } else {
                price4 = price8;
                int i14 = parcel.readInt();
                obj3 = objM294unboximpl;
                arrayList = new ArrayList(i14);
                str9 = string3;
                ?? C = z19;
                while (C != i14) {
                    i14 = i14;
                    string4 = string4;
                    C = i.c(OrderItem.CREATOR, parcel, arrayList, C, 1);
                }
            }
            String str16 = string4;
            if (parcel.readInt() == 0) {
                arrayList2 = obj2;
            } else {
                int i15 = parcel.readInt();
                arrayList2 = new ArrayList(i15);
                ?? C2 = z19;
                arrayList = arrayList;
                while (C2 != i15) {
                    i15 = i15;
                    arrayList = arrayList;
                    C2 = i.c(SpecificationLine.CREATOR, parcel, arrayList2, C2, 1);
                }
            }
            return new Order(str8, str7, str9, str16, z24, packagingOptions, z26, z11, string5, pictureCreateFromParcel, pictureCreateFromParcel2, strM205unboximpl, string6, pickupInterval2, storeLocation, string7, price5, price3, i11, num3, str11, pickupInterval, orderStateValueOf, string8, str12, picture, string9, string10, z12, z27, orderTypeValueOf, z13, additionalOrderInformation, string11, string12, string13, string14, i12, r39, r402, z14, z28, r43, z16, z17, i13, r47, string15, obj3, z18, z21, z22, price7, price4, r55, objValueOf3, objValueOf4, z23, arrayList, arrayList2, (Price) (parcel.readInt() == 0 ? obj2 : Price.CREATOR.createFromParcel(parcel)), parcel.readInt() == 0 ? obj2 : Double.valueOf(parcel.readDouble()), null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Order[] newArray(int i11) {
            return new Order[i11];
        }
    }

    public /* synthetic */ Order(String str, String str2, String str3, String str4, boolean z11, PackagingOptions packagingOptions, boolean z12, boolean z13, String str5, Picture picture, Picture picture2, String str6, String str7, PickupInterval pickupInterval, StoreLocation storeLocation, String str8, Price price, Price price2, int i11, Integer num, String str9, PickupInterval pickupInterval2, OrderState orderState, String str10, String str11, Picture picture3, String str12, String str13, boolean z14, boolean z15, OrderType orderType, boolean z16, AdditionalOrderInformation additionalOrderInformation, String str14, String str15, String str16, String str17, int i12, PaymentState paymentState, CancellingEntity cancellingEntity, boolean z17, boolean z18, Boolean bool, boolean z19, boolean z21, int i13, Boolean bool2, String str18, String str19, boolean z22, boolean z23, boolean z24, Price price3, Price price4, ItemCategory itemCategory, Boolean bool3, Boolean bool4, boolean z25, List list, List list2, Price price5, Double d3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, z11, packagingOptions, z12, z13, str5, picture, picture2, str6, str7, pickupInterval, storeLocation, str8, price, price2, i11, num, str9, pickupInterval2, orderState, str10, str11, picture3, str12, str13, z14, z15, orderType, z16, additionalOrderInformation, str14, str15, str16, str17, i12, paymentState, cancellingEntity, z17, z18, bool, z19, z21, i13, bool2, str18, str19, z22, z23, z24, price3, price4, itemCategory, bool3, bool4, z25, list, list2, price5, d3);
    }

    public /* synthetic */ Order(int i11, int i12, String str, String str2, String str3, String str4, boolean z11, PackagingOptions packagingOptions, boolean z12, boolean z13, String str5, Picture picture, Picture picture2, String str6, String str7, PickupInterval pickupInterval, StoreLocation storeLocation, String str8, Price price, Price price2, int i13, Integer num, String str9, PickupInterval pickupInterval2, OrderState orderState, String str10, String str11, Picture picture3, String str12, String str13, boolean z14, boolean z15, OrderType orderType, boolean z16, AdditionalOrderInformation additionalOrderInformation, String str14, String str15, String str16, String str17, int i14, PaymentState paymentState, CancellingEntity cancellingEntity, boolean z17, boolean z18, Boolean bool, boolean z19, boolean z21, int i15, Boolean bool2, String str18, String str19, boolean z22, boolean z23, boolean z24, Price price3, Price price4, ItemCategory itemCategory, Boolean bool3, Boolean bool4, boolean z25, List list, List list2, Price price5, Double d3, m1 m1Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, i12, str, str2, str3, str4, z11, packagingOptions, z12, z13, str5, picture, picture2, str6, str7, pickupInterval, storeLocation, str8, price, price2, i13, num, str9, pickupInterval2, orderState, str10, str11, picture3, str12, str13, z14, z15, orderType, z16, additionalOrderInformation, str14, str15, str16, str17, i14, paymentState, cancellingEntity, z17, z18, bool, z19, z21, i15, bool2, str18, str19, z22, z23, z24, price3, price4, itemCategory, bool3, bool4, z25, list, list2, price5, d3, m1Var);
    }

    private Order(String str, String str2, String str3, String str4, boolean z11, PackagingOptions packagingOptions, boolean z12, boolean z13, String str5, Picture picture, Picture picture2, String str6, String str7, PickupInterval pickupInterval, StoreLocation storeLocation, String str8, Price price, Price price2, int i11, Integer num, String str9, PickupInterval pickupInterval2, OrderState orderState, String str10, String str11, Picture picture3, String str12, String str13, boolean z14, boolean z15, OrderType orderType, boolean z16, AdditionalOrderInformation additionalOrderInformation, String str14, String str15, String str16, String str17, int i12, PaymentState paymentState, CancellingEntity cancellingEntity, boolean z17, boolean z18, Boolean bool, boolean z19, boolean z21, int i13, Boolean bool2, String str18, String str19, boolean z22, boolean z23, boolean z24, Price price3, Price price4, ItemCategory itemCategory, Boolean bool3, Boolean bool4, boolean z25, List<OrderItem> list, List<SpecificationLine> list2, Price price5, Double d3) {
        packagingOptions.getClass();
        price2.getClass();
        str9.getClass();
        orderState.getClass();
        str11.getClass();
        str13.getClass();
        orderType.getClass();
        this.cancelUntil = str;
        this.confirmationEmail = str2;
        this.foodHandlingInstruction = str3;
        this.buffetHandlingInstruction = str4;
        this.canUserSupplyPackaging = z11;
        this.packagingOption = packagingOptions;
        this.isRated = z12;
        this.canBeRated = z13;
        this.itemCollectionInfo = str5;
        this.itemCoverImage = picture;
        this.itemLogo = picture2;
        this.itemId = str6;
        this.itemName = str7;
        this.pickupInterval = pickupInterval;
        this.pickupLocation = storeLocation;
        this.storeTimeZone = str8;
        this.price = price;
        this.totalPrice = price2;
        this.quantity = i11;
        this.overallRating = num;
        this.orderId = str9;
        this.redeemInterval = pickupInterval2;
        this.state = orderState;
        this.storeBranch = str10;
        this.storeId = str11;
        this.storeLogo = picture3;
        this.storeName = str12;
        this.timeOfPurchase = str13;
        this.isBuffet = z14;
        this.canShowBestBeforeExplainer = z15;
        this.orderType = orderType;
        this.pickupWindowChanged = z16;
        this.additionalOrderInformation = additionalOrderInformation;
        this.paymentMethodDisplayName = str14;
        this.cancelledOrRefundedAtUtc = str15;
        this.redeemedAtUtc = str16;
        this.supportReqCreatedAtUtc = str17;
        this.expectedBankDays = i12;
        this.paymentState = paymentState;
        this.cancellingEntity = cancellingEntity;
        this.isSupportAvailable = z17;
        this.isExcludedFromExpenseRating = z18;
        this.needsSync = bool;
        this.hasCollectionTimeChanged = z19;
        this.hasCollectionStateChanged = z21;
        this.calendarEventId = i13;
        this.hasDynamicPrice = bool2;
        this.invitationId = str18;
        this.redeemingUserId = str19;
        this.isDonation = z22;
        this.isEligibleForReward = z23;
        this.hasMultiplePayments = z24;
        this.totalPricePaidWithExternalProvider = price3;
        this.totalPricePaidWithVoucher = price4;
        this.itemCategory = itemCategory;
        this.isFavorite = bool3;
        this.isMultiItem = bool4;
        this.isEdible = z25;
        this.orderItems = list;
        this.specificationLines = list2;
        this.totalPricePaidForDelivery = price5;
        this.discountAppliedPercentage = d3;
    }

    @i90.g("additional_order_details")
    public static /* synthetic */ void getAdditionalOrderInformation$annotations() {
    }

    @i90.g("buffet_instructions")
    public static /* synthetic */ void getBuffetHandlingInstruction$annotations() {
    }

    @i90.g("can_be_rated")
    public static /* synthetic */ void getCanBeRated$annotations() {
    }

    @i90.g("can_show_best_before_explainer")
    public static /* synthetic */ void getCanShowBestBeforeExplainer$annotations() {
    }

    @i90.g("can_user_supply_packaging")
    public static /* synthetic */ void getCanUserSupplyPackaging$annotations() {
    }

    @i90.g("cancel_until")
    public static /* synthetic */ void getCancelUntil$annotations() {
    }

    @i90.g("cancelled_or_refunded_at_utc")
    public static /* synthetic */ void getCancelledOrRefundedAtUtc$annotations() {
    }

    @i90.g("cancelling_entity")
    public static /* synthetic */ void getCancellingEntity$annotations() {
    }

    @i90.g("confirmation_email_sent_to")
    public static /* synthetic */ void getConfirmationEmail$annotations() {
    }

    @i90.g("discount_applied_percentage")
    public static /* synthetic */ void getDiscountAppliedPercentage$annotations() {
    }

    @i90.g("expected_bank_processing_days")
    public static /* synthetic */ void getExpectedBankDays$annotations() {
    }

    @i90.g("food_handling_instructions")
    public static /* synthetic */ void getFoodHandlingInstruction$annotations() {
    }

    @i90.g("has_dynamic_price")
    public static /* synthetic */ void getHasDynamicPrice$annotations() {
    }

    @i90.g("has_multiple_payments")
    public static /* synthetic */ void getHasMultiplePayments$annotations() {
    }

    @i90.g("invitation_id")
    public static /* synthetic */ void getInvitationId$annotations() {
    }

    @i90.g("item_category")
    public static /* synthetic */ void getItemCategory$annotations() {
    }

    @i90.g("item_collection_info")
    public static /* synthetic */ void getItemCollectionInfo$annotations() {
    }

    @i90.g("item_cover_image")
    public static /* synthetic */ void getItemCoverImage$annotations() {
    }

    @i90.g("item_id")
    /* JADX INFO: renamed from: getItemId-RWxzYZM$annotations, reason: not valid java name */
    public static /* synthetic */ void m419getItemIdRWxzYZM$annotations() {
    }

    @i90.g("item_logo")
    public static /* synthetic */ void getItemLogo$annotations() {
    }

    @i90.g("item_name")
    public static /* synthetic */ void getItemName$annotations() {
    }

    @i90.g("order_id")
    /* JADX INFO: renamed from: getOrderId-reIZeYA$annotations, reason: not valid java name */
    public static /* synthetic */ void m420getOrderIdreIZeYA$annotations() {
    }

    @i90.g("order_items")
    public static /* synthetic */ void getOrderItems$annotations() {
    }

    @i90.g("order_type")
    public static /* synthetic */ void getOrderType$annotations() {
    }

    @i90.g("overall_rating")
    public static /* synthetic */ void getOverallRating$annotations() {
    }

    @i90.g("packaging_option")
    public static /* synthetic */ void getPackagingOption$annotations() {
    }

    @i90.g("payment_method_display_name")
    public static /* synthetic */ void getPaymentMethodDisplayName$annotations() {
    }

    @i90.g("payment_state")
    public static /* synthetic */ void getPaymentState$annotations() {
    }

    @i90.g("pickup_interval")
    public static /* synthetic */ void getPickupInterval$annotations() {
    }

    @i90.g("pickup_location")
    public static /* synthetic */ void getPickupLocation$annotations() {
    }

    @i90.g("pickup_window_changed")
    public static /* synthetic */ void getPickupWindowChanged$annotations() {
    }

    @i90.g("price")
    public static /* synthetic */ void getPrice$annotations() {
    }

    @i90.g("quantity")
    public static /* synthetic */ void getQuantity$annotations() {
    }

    @i90.g("redeem_interval")
    public static /* synthetic */ void getRedeemInterval$annotations() {
    }

    @i90.g("redeemed_at_utc")
    public static /* synthetic */ void getRedeemedAtUtc$annotations() {
    }

    @i90.g("redeeming_user_id")
    /* JADX INFO: renamed from: getRedeemingUserId-4FZwupo$annotations, reason: not valid java name */
    public static /* synthetic */ void m421getRedeemingUserId4FZwupo$annotations() {
    }

    @i90.g("specification_lines")
    public static /* synthetic */ void getSpecificationLines$annotations() {
    }

    @i90.g("state")
    public static /* synthetic */ void getState$annotations() {
    }

    @i90.g("store_branch")
    public static /* synthetic */ void getStoreBranch$annotations() {
    }

    @i90.g("store_id")
    /* JADX INFO: renamed from: getStoreId-Q2NXY1A$annotations, reason: not valid java name */
    public static /* synthetic */ void m422getStoreIdQ2NXY1A$annotations() {
    }

    @i90.g("store_logo")
    public static /* synthetic */ void getStoreLogo$annotations() {
    }

    @i90.g("store_name")
    public static /* synthetic */ void getStoreName$annotations() {
    }

    @i90.g("store_time_zone")
    public static /* synthetic */ void getStoreTimeZone$annotations() {
    }

    @i90.g("support_request_created_at_utc")
    public static /* synthetic */ void getSupportReqCreatedAtUtc$annotations() {
    }

    @i90.g("time_of_purchase")
    public static /* synthetic */ void getTimeOfPurchase$annotations() {
    }

    @i90.g("total_price")
    public static /* synthetic */ void getTotalPrice$annotations() {
    }

    @i90.g("total_price_paid_for_delivery")
    public static /* synthetic */ void getTotalPricePaidForDelivery$annotations() {
    }

    @i90.g("total_price_paid_with_external_provider")
    public static /* synthetic */ void getTotalPricePaidWithExternalProvider$annotations() {
    }

    @i90.g("total_price_paid_with_voucher")
    public static /* synthetic */ void getTotalPricePaidWithVoucher$annotations() {
    }

    @i90.g("is_buffet")
    public static /* synthetic */ void isBuffet$annotations() {
    }

    @i90.g("is_donation")
    public static /* synthetic */ void isDonation$annotations() {
    }

    @i90.g("is_edible")
    public static /* synthetic */ void isEdible$annotations() {
    }

    @i90.g("is_eligible_for_reward")
    public static /* synthetic */ void isEligibleForReward$annotations() {
    }

    @i90.g("should_be_excluded_from_expense_rating")
    public static /* synthetic */ void isExcludedFromExpenseRating$annotations() {
    }

    @i90.g("is_favorite")
    public static /* synthetic */ void isFavorite$annotations() {
    }

    @i90.g("is_multi_item")
    public static /* synthetic */ void isMultiItem$annotations() {
    }

    @i90.g("is_rated")
    public static /* synthetic */ void isRated$annotations() {
    }

    @i90.g("is_support_available")
    public static /* synthetic */ void isSupportAvailable$annotations() {
    }

    public /* synthetic */ Order(String str, String str2, String str3, String str4, boolean z11, PackagingOptions packagingOptions, boolean z12, boolean z13, String str5, Picture picture, Picture picture2, String str6, String str7, PickupInterval pickupInterval, StoreLocation storeLocation, String str8, Price price, Price price2, int i11, Integer num, String str9, PickupInterval pickupInterval2, OrderState orderState, String str10, String str11, Picture picture3, String str12, String str13, boolean z14, boolean z15, OrderType orderType, boolean z16, AdditionalOrderInformation additionalOrderInformation, String str14, String str15, String str16, String str17, int i12, PaymentState paymentState, CancellingEntity cancellingEntity, boolean z17, boolean z18, Boolean bool, boolean z19, boolean z21, int i13, Boolean bool2, String str18, String str19, boolean z22, boolean z23, boolean z24, Price price3, Price price4, ItemCategory itemCategory, Boolean bool3, Boolean bool4, boolean z25, List list, List list2, Price price5, Double d3, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? null : str, str2, str3, str4, (i14 & 16) != 0 ? false : z11, (i14 & 32) != 0 ? PackagingOptions.UNKNOWN : packagingOptions, (i14 & 64) != 0 ? false : z12, (i14 & 128) != 0 ? false : z13, str5, picture, picture2, str6, str7, pickupInterval, storeLocation, str8, price, price2, i11, num, str9, pickupInterval2, orderState, str10, str11, picture3, str12, str13, (268435456 & i14) != 0 ? false : z14, (i14 & 536870912) != 0 ? false : z15, orderType, (i14 & Integer.MIN_VALUE) != 0 ? false : z16, additionalOrderInformation, str14, str15, str16, str17, (i15 & 32) != 0 ? 0 : i12, paymentState, cancellingEntity, (i15 & 256) != 0 ? false : z17, (i15 & 512) != 0 ? false : z18, (i15 & 1024) != 0 ? Boolean.FALSE : bool, (i15 & NewHope.SENDB_BYTES) != 0 ? false : z19, (i15 & 4096) != 0 ? false : z21, (i15 & 8192) != 0 ? 0 : i13, (i15 & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) != 0 ? Boolean.FALSE : bool2, str18, str19, (131072 & i15) != 0 ? false : z22, (262144 & i15) != 0 ? false : z23, (524288 & i15) != 0 ? false : z24, price3, price4, itemCategory, bool3, bool4, (33554432 & i15) != 0 ? true : z25, list, list2, price5, (i15 & 536870912) != 0 ? null : d3, null);
    }
}
