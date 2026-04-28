package com.app.tgtg.model.remote.item.response;

import android.os.Parcel;
import android.os.Parcelable;
import b3.i;
import cg.e;
import com.app.tgtg.model.remote.item.Address;
import com.app.tgtg.model.remote.item.Ingredients;
import com.app.tgtg.model.remote.item.ItemCardType;
import com.app.tgtg.model.remote.item.ItemSpecialReward;
import com.app.tgtg.model.remote.item.ItemTagInfo;
import com.app.tgtg.model.remote.item.ItemTagInfo$$serializer;
import com.app.tgtg.model.remote.item.LatLngInfo;
import com.app.tgtg.model.remote.item.MagicBagItemInformation;
import com.app.tgtg.model.remote.item.PickupInterval;
import com.app.tgtg.model.remote.item.PickupLocation;
import com.app.tgtg.model.remote.item.StoreInformation;
import i90.d;
import i90.g;
import i90.h;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
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
import u70.j;
import u70.l;
import u70.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b[\b\u0087\b\u0018\u0000 Ä\u00012\u00020\u00012\u00020\u0002:\u0004Å\u0001Ä\u0001B\u0095\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\f\u0012\b\b\u0002\u0010\u0017\u001a\u00020\f\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0019\u001a\u00020\n\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\f\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b)\u0010*B\u0099\u0002\b\u0010\u0012\u0006\u0010+\u001a\u00020\n\u0012\u0014\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020-\u0018\u00010,\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0016\u001a\u00020\f\u0012\u0006\u0010\u0017\u001a\u00020\f\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0019\u001a\u00020\n\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u0006\u0010\u001d\u001a\u00020\f\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f\u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\b\u0010%\u001a\u0004\u0018\u00010$\u0012\b\u0010'\u001a\u0004\u0018\u00010&\u0012\b\u0010(\u001a\u0004\u0018\u00010\f\u0012\b\u00100\u001a\u0004\u0018\u00010/¢\u0006\u0004\b)\u00101J\u001a\u00104\u001a\u00020\f2\b\u00103\u001a\u0004\u0018\u000102H\u0096\u0002¢\u0006\u0004\b4\u00105J\u0017\u00107\u001a\u00020\f2\u0006\u00106\u001a\u000202H\u0016¢\u0006\u0004\b7\u00105J\u000f\u00108\u001a\u00020\nH\u0016¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u0003H\u0016¢\u0006\u0004\b:\u0010;J\r\u0010<\u001a\u00020\n¢\u0006\u0004\b<\u00109J\u001d\u0010@\u001a\u00020-2\u0006\u0010>\u001a\u00020=2\u0006\u0010?\u001a\u00020\n¢\u0006\u0004\b@\u0010AJ\u0010\u0010B\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\bB\u0010;J\u0012\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bC\u0010;J\u0010\u0010D\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\bD\u0010EJ\u0010\u0010F\u001a\u00020\bHÆ\u0003¢\u0006\u0004\bF\u0010GJ\u0010\u0010H\u001a\u00020\nHÆ\u0003¢\u0006\u0004\bH\u00109J\u0010\u0010I\u001a\u00020\fHÆ\u0003¢\u0006\u0004\bI\u0010JJ\u0012\u0010K\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\bK\u0010LJ\u0010\u0010M\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\bM\u0010NJ\u0012\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bO\u0010;J\u0012\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bP\u0010;J\u0012\u0010Q\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\bQ\u0010RJ\u0010\u0010S\u001a\u00020\fHÆ\u0003¢\u0006\u0004\bS\u0010JJ\u0010\u0010T\u001a\u00020\fHÆ\u0003¢\u0006\u0004\bT\u0010JJ\u0012\u0010U\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bU\u0010;J\u0010\u0010V\u001a\u00020\nHÆ\u0003¢\u0006\u0004\bV\u00109J\u0012\u0010W\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bW\u0010;J\u0010\u0010X\u001a\u00020\u001bHÆ\u0003¢\u0006\u0004\bX\u0010YJ\u0010\u0010Z\u001a\u00020\fHÆ\u0003¢\u0006\u0004\bZ\u0010JJ\u0012\u0010[\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b[\u0010;J\u0018\u0010\\\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001fHÆ\u0003¢\u0006\u0004\b\\\u0010]J\u0012\u0010^\u001a\u0004\u0018\u00010\"HÆ\u0003¢\u0006\u0004\b^\u0010_J\u0012\u0010`\u001a\u0004\u0018\u00010$HÆ\u0003¢\u0006\u0004\b`\u0010aJ\u0012\u0010b\u001a\u0004\u0018\u00010&HÆ\u0003¢\u0006\u0004\bb\u0010cJ\u0012\u0010d\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\bd\u0010eJ \u0002\u0010f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0016\u001a\u00020\f2\b\b\u0002\u0010\u0017\u001a\u00020\f2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0019\u001a\u00020\n2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\f2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\bf\u0010gJ'\u0010o\u001a\u00020-2\u0006\u0010h\u001a\u00020\u00002\u0006\u0010j\u001a\u00020i2\u0006\u0010l\u001a\u00020kH\u0001¢\u0006\u0004\bm\u0010nR \u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010p\u0012\u0004\br\u0010s\u001a\u0004\bq\u0010;R*\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010p\u0012\u0004\bw\u0010s\u001a\u0004\bt\u0010;\"\u0004\bu\u0010vR(\u0010\u0007\u001a\u00020\u00068\u0016@\u0016X\u0097\u000e¢\u0006\u0018\n\u0004\b\u0007\u0010x\u0012\u0004\b|\u0010s\u001a\u0004\by\u0010E\"\u0004\bz\u0010{R \u0010\t\u001a\u00020\b8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\t\u0010}\u0012\u0004\b\u007f\u0010s\u001a\u0004\b~\u0010GR-\u0010\u000b\u001a\u00020\n8\u0016@\u0016X\u0097\u000e¢\u0006\u001d\n\u0005\b\u000b\u0010\u0080\u0001\u0012\u0005\b\u0084\u0001\u0010s\u001a\u0005\b\u0081\u0001\u00109\"\u0006\b\u0082\u0001\u0010\u0083\u0001R-\u0010\r\u001a\u00020\f8\u0016@\u0016X\u0097\u000e¢\u0006\u001d\n\u0005\b\r\u0010\u0085\u0001\u0012\u0005\b\u0089\u0001\u0010s\u001a\u0005\b\u0086\u0001\u0010J\"\u0006\b\u0087\u0001\u0010\u0088\u0001R/\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0016@\u0016X\u0097\u000e¢\u0006\u001d\n\u0005\b\u000f\u0010\u008a\u0001\u0012\u0005\b\u008e\u0001\u0010s\u001a\u0005\b\u008b\u0001\u0010L\"\u0006\b\u008c\u0001\u0010\u008d\u0001R#\u0010\u0011\u001a\u00020\u00108\u0016X\u0097\u0004¢\u0006\u0015\n\u0005\b\u0011\u0010\u008f\u0001\u0012\u0005\b\u0091\u0001\u0010s\u001a\u0005\b\u0090\u0001\u0010NR-\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u001b\n\u0004\b\u0012\u0010p\u0012\u0005\b\u0094\u0001\u0010s\u001a\u0005\b\u0092\u0001\u0010;\"\u0005\b\u0093\u0001\u0010vR-\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u001b\n\u0004\b\u0013\u0010p\u0012\u0005\b\u0097\u0001\u0010s\u001a\u0005\b\u0095\u0001\u0010;\"\u0005\b\u0096\u0001\u0010vR/\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0016@\u0016X\u0097\u000e¢\u0006\u001d\n\u0005\b\u0015\u0010\u0098\u0001\u0012\u0005\b\u009c\u0001\u0010s\u001a\u0005\b\u0099\u0001\u0010R\"\u0006\b\u009a\u0001\u0010\u009b\u0001R-\u0010\u0016\u001a\u00020\f8\u0016@\u0016X\u0097\u000e¢\u0006\u001d\n\u0005\b\u0016\u0010\u0085\u0001\u0012\u0005\b\u009f\u0001\u0010s\u001a\u0005\b\u009d\u0001\u0010J\"\u0006\b\u009e\u0001\u0010\u0088\u0001R-\u0010\u0017\u001a\u00020\f8\u0016@\u0016X\u0097\u000e¢\u0006\u001d\n\u0005\b\u0017\u0010\u0085\u0001\u0012\u0005\b¢\u0001\u0010s\u001a\u0005\b \u0001\u0010J\"\u0006\b¡\u0001\u0010\u0088\u0001R-\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u001b\n\u0004\b\u0018\u0010p\u0012\u0005\b¥\u0001\u0010s\u001a\u0005\b£\u0001\u0010;\"\u0005\b¤\u0001\u0010vR-\u0010\u0019\u001a\u00020\n8\u0016@\u0016X\u0097\u000e¢\u0006\u001d\n\u0005\b\u0019\u0010\u0080\u0001\u0012\u0005\b¨\u0001\u0010s\u001a\u0005\b¦\u0001\u00109\"\u0006\b§\u0001\u0010\u0083\u0001R-\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u001b\n\u0004\b\u001a\u0010p\u0012\u0005\b«\u0001\u0010s\u001a\u0005\b©\u0001\u0010;\"\u0005\bª\u0001\u0010vR-\u0010\u001c\u001a\u00020\u001b8\u0016@\u0016X\u0097\u000e¢\u0006\u001d\n\u0005\b\u001c\u0010¬\u0001\u0012\u0005\b°\u0001\u0010s\u001a\u0005\b\u00ad\u0001\u0010Y\"\u0006\b®\u0001\u0010¯\u0001R,\u0010\u001d\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u001c\n\u0005\b\u001d\u0010\u0085\u0001\u0012\u0005\b²\u0001\u0010s\u001a\u0004\b\u001d\u0010J\"\u0006\b±\u0001\u0010\u0088\u0001R$\u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b\u001e\u0010p\u0012\u0005\b´\u0001\u0010s\u001a\u0005\b³\u0001\u0010;R+\u0010!\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f8\u0016X\u0097\u0004¢\u0006\u0015\n\u0005\b!\u0010µ\u0001\u0012\u0005\b·\u0001\u0010s\u001a\u0005\b¶\u0001\u0010]R%\u0010#\u001a\u0004\u0018\u00010\"8\u0016X\u0097\u0004¢\u0006\u0015\n\u0005\b#\u0010¸\u0001\u0012\u0005\bº\u0001\u0010s\u001a\u0005\b¹\u0001\u0010_R%\u0010%\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b%\u0010»\u0001\u0012\u0005\b½\u0001\u0010s\u001a\u0005\b¼\u0001\u0010aR%\u0010'\u001a\u0004\u0018\u00010&8\u0016X\u0097\u0004¢\u0006\u0015\n\u0005\b'\u0010¾\u0001\u0012\u0005\bÀ\u0001\u0010s\u001a\u0005\b¿\u0001\u0010cR%\u0010(\u001a\u0004\u0018\u00010\f8\u0016X\u0097\u0004¢\u0006\u0015\n\u0005\b(\u0010Á\u0001\u0012\u0005\bÃ\u0001\u0010s\u001a\u0005\bÂ\u0001\u0010e¨\u0006Æ\u0001"}, d2 = {"Lcom/app/tgtg/model/remote/item/response/Item;", "Lmq/a;", "Lcom/app/tgtg/model/remote/item/response/BasicItem;", "", "displayName", "displayDescription", "", "distance", "Lcom/app/tgtg/model/remote/item/MagicBagItemInformation;", "information", "", "itemsAvailable", "", "itemIsNew", "Lcom/app/tgtg/model/remote/item/PickupInterval;", "pickupIntervalOrNull", "Lcom/app/tgtg/model/remote/item/PickupLocation;", "pickupLocation", "purchaseEnd", "soldOutAt", "Lcom/app/tgtg/model/remote/item/StoreInformation;", "storeInfoOrNull", "favorite", "subscribedForNotification", "sharingUrl", "userPurchaseLimit", "nextSalesWindowPurchaseStart", "Lcom/app/tgtg/model/remote/item/response/ItemType;", "itemType", "isSelected", "reservationBlockedUntil", "", "Lcom/app/tgtg/model/remote/item/ItemTagInfo;", "itemTags", "Lcom/app/tgtg/model/remote/item/ItemCardType;", "itemCardType", "Lcom/app/tgtg/model/remote/item/ItemSpecialReward;", "itemSpecialReward", "Lcom/app/tgtg/model/remote/item/Ingredients;", "ingredients", "matchesFilters", "<init>", "(Ljava/lang/String;Ljava/lang/String;DLcom/app/tgtg/model/remote/item/MagicBagItemInformation;IZLcom/app/tgtg/model/remote/item/PickupInterval;Lcom/app/tgtg/model/remote/item/PickupLocation;Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/item/StoreInformation;ZZLjava/lang/String;ILjava/lang/String;Lcom/app/tgtg/model/remote/item/response/ItemType;ZLjava/lang/String;Ljava/util/List;Lcom/app/tgtg/model/remote/item/ItemCardType;Lcom/app/tgtg/model/remote/item/ItemSpecialReward;Lcom/app/tgtg/model/remote/item/Ingredients;Ljava/lang/Boolean;)V", "seen0", "Lkotlin/Function1;", "", "onFavoriteChangedListener", "Lm90/m1;", "serializationConstructorMarker", "(ILkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;DLcom/app/tgtg/model/remote/item/MagicBagItemInformation;IZLcom/app/tgtg/model/remote/item/PickupInterval;Lcom/app/tgtg/model/remote/item/PickupLocation;Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/item/StoreInformation;ZZLjava/lang/String;ILjava/lang/String;Lcom/app/tgtg/model/remote/item/response/ItemType;ZLjava/lang/String;Ljava/util/List;Lcom/app/tgtg/model/remote/item/ItemCardType;Lcom/app/tgtg/model/remote/item/ItemSpecialReward;Lcom/app/tgtg/model/remote/item/Ingredients;Ljava/lang/Boolean;Lm90/m1;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "o", "displayedParametersAreEqual", "hashCode", "()I", "toString", "()Ljava/lang/String;", "describeContents", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "component2", "component3", "()D", "component4", "()Lcom/app/tgtg/model/remote/item/MagicBagItemInformation;", "component5", "component6", "()Z", "component7", "()Lcom/app/tgtg/model/remote/item/PickupInterval;", "component8", "()Lcom/app/tgtg/model/remote/item/PickupLocation;", "component9", "component10", "component11", "()Lcom/app/tgtg/model/remote/item/StoreInformation;", "component12", "component13", "component14", "component15", "component16", "component17", "()Lcom/app/tgtg/model/remote/item/response/ItemType;", "component18", "component19", "component20", "()Ljava/util/List;", "component21", "()Lcom/app/tgtg/model/remote/item/ItemCardType;", "component22", "()Lcom/app/tgtg/model/remote/item/ItemSpecialReward;", "component23", "()Lcom/app/tgtg/model/remote/item/Ingredients;", "component24", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/String;DLcom/app/tgtg/model/remote/item/MagicBagItemInformation;IZLcom/app/tgtg/model/remote/item/PickupInterval;Lcom/app/tgtg/model/remote/item/PickupLocation;Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/item/StoreInformation;ZZLjava/lang/String;ILjava/lang/String;Lcom/app/tgtg/model/remote/item/response/ItemType;ZLjava/lang/String;Ljava/util/List;Lcom/app/tgtg/model/remote/item/ItemCardType;Lcom/app/tgtg/model/remote/item/ItemSpecialReward;Lcom/app/tgtg/model/remote/item/Ingredients;Ljava/lang/Boolean;)Lcom/app/tgtg/model/remote/item/response/Item;", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "write$Self$app", "(Lcom/app/tgtg/model/remote/item/response/Item;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getDisplayName", "getDisplayName$annotations", "()V", "getDisplayDescription", "setDisplayDescription", "(Ljava/lang/String;)V", "getDisplayDescription$annotations", "D", "getDistance", "setDistance", "(D)V", "getDistance$annotations", "Lcom/app/tgtg/model/remote/item/MagicBagItemInformation;", "getInformation", "getInformation$annotations", "I", "getItemsAvailable", "setItemsAvailable", "(I)V", "getItemsAvailable$annotations", "Z", "getItemIsNew", "setItemIsNew", "(Z)V", "getItemIsNew$annotations", "Lcom/app/tgtg/model/remote/item/PickupInterval;", "getPickupIntervalOrNull", "setPickupIntervalOrNull", "(Lcom/app/tgtg/model/remote/item/PickupInterval;)V", "getPickupIntervalOrNull$annotations", "Lcom/app/tgtg/model/remote/item/PickupLocation;", "getPickupLocation", "getPickupLocation$annotations", "getPurchaseEnd", "setPurchaseEnd", "getPurchaseEnd$annotations", "getSoldOutAt", "setSoldOutAt", "getSoldOutAt$annotations", "Lcom/app/tgtg/model/remote/item/StoreInformation;", "getStoreInfoOrNull", "setStoreInfoOrNull", "(Lcom/app/tgtg/model/remote/item/StoreInformation;)V", "getStoreInfoOrNull$annotations", "getFavorite", "setFavorite", "getFavorite$annotations", "getSubscribedForNotification", "setSubscribedForNotification", "getSubscribedForNotification$annotations", "getSharingUrl", "setSharingUrl", "getSharingUrl$annotations", "getUserPurchaseLimit", "setUserPurchaseLimit", "getUserPurchaseLimit$annotations", "getNextSalesWindowPurchaseStart", "setNextSalesWindowPurchaseStart", "getNextSalesWindowPurchaseStart$annotations", "Lcom/app/tgtg/model/remote/item/response/ItemType;", "getItemType", "setItemType", "(Lcom/app/tgtg/model/remote/item/response/ItemType;)V", "getItemType$annotations", "setSelected", "isSelected$annotations", "getReservationBlockedUntil", "getReservationBlockedUntil$annotations", "Ljava/util/List;", "getItemTags", "getItemTags$annotations", "Lcom/app/tgtg/model/remote/item/ItemCardType;", "getItemCardType", "getItemCardType$annotations", "Lcom/app/tgtg/model/remote/item/ItemSpecialReward;", "getItemSpecialReward", "getItemSpecialReward$annotations", "Lcom/app/tgtg/model/remote/item/Ingredients;", "getIngredients", "getIngredients$annotations", "Ljava/lang/Boolean;", "getMatchesFilters", "getMatchesFilters$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@g("MAGIC_BAG")
public final /* data */ class Item extends BasicItem {

    @NotNull
    private static final j[] $childSerializers;

    @Nullable
    private String displayDescription;

    @NotNull
    private final String displayName;
    private double distance;
    private boolean favorite;

    @NotNull
    private final MagicBagItemInformation information;

    @Nullable
    private final Ingredients ingredients;
    private boolean isSelected;

    @Nullable
    private final ItemCardType itemCardType;
    private boolean itemIsNew;

    @Nullable
    private final ItemSpecialReward itemSpecialReward;

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
    private final String reservationBlockedUntil;

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
    public static final Parcelable.Creator<Item> CREATOR = new Creator();

    static {
        m mVar = m.PUBLICATION;
        $childSerializers = new j[]{l.a(mVar, new e(26)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, l.a(mVar, new e(27)), null, null, null, null};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Item(int i11, Function1 function1, String str, String str2, double d3, MagicBagItemInformation magicBagItemInformation, int i12, boolean z11, PickupInterval pickupInterval, PickupLocation pickupLocation, String str3, String str4, StoreInformation storeInformation, boolean z12, boolean z13, String str5, int i13, String str6, ItemType itemType, boolean z14, String str7, List list, ItemCardType itemCardType, ItemSpecialReward itemSpecialReward, Ingredients ingredients, Boolean bool, m1 m1Var) {
        super(i11, function1, m1Var);
        if (16 != (i11 & 16)) {
            c1.j(i11, 16, Item$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i11 & 2) == 0) {
            this.displayName = "";
        } else {
            this.displayName = str;
        }
        if ((i11 & 4) == 0) {
            this.displayDescription = "";
        } else {
            this.displayDescription = str2;
        }
        if ((i11 & 8) == 0) {
            this.distance = 0.0d;
        } else {
            this.distance = d3;
        }
        this.information = magicBagItemInformation;
        if ((i11 & 32) == 0) {
            this.itemsAvailable = 0;
        } else {
            this.itemsAvailable = i12;
        }
        if ((i11 & 64) == 0) {
            this.itemIsNew = false;
        } else {
            this.itemIsNew = z11;
        }
        if ((i11 & 128) == 0) {
            this.pickupIntervalOrNull = null;
        } else {
            this.pickupIntervalOrNull = pickupInterval;
        }
        if ((i11 & 256) == 0) {
            this.pickupLocation = new PickupLocation((Address) null, (String) null, (LatLngInfo) null, 7, (DefaultConstructorMarker) null);
        } else {
            this.pickupLocation = pickupLocation;
        }
        if ((i11 & 512) == 0) {
            this.purchaseEnd = null;
        } else {
            this.purchaseEnd = str3;
        }
        if ((i11 & 1024) == 0) {
            this.soldOutAt = null;
        } else {
            this.soldOutAt = str4;
        }
        if ((i11 & NewHope.SENDB_BYTES) == 0) {
            this.storeInfoOrNull = null;
        } else {
            this.storeInfoOrNull = storeInformation;
        }
        if ((i11 & 4096) == 0) {
            this.favorite = false;
        } else {
            this.favorite = z12;
        }
        if ((i11 & 8192) == 0) {
            this.subscribedForNotification = false;
        } else {
            this.subscribedForNotification = z13;
        }
        if ((i11 & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) == 0) {
            this.sharingUrl = null;
        } else {
            this.sharingUrl = str5;
        }
        if ((32768 & i11) == 0) {
            this.userPurchaseLimit = 0;
        } else {
            this.userPurchaseLimit = i13;
        }
        if ((65536 & i11) == 0) {
            this.nextSalesWindowPurchaseStart = null;
        } else {
            this.nextSalesWindowPurchaseStart = str6;
        }
        this.itemType = (131072 & i11) == 0 ? ItemType.MAGIC_BAG : itemType;
        if ((262144 & i11) == 0) {
            this.isSelected = false;
        } else {
            this.isSelected = z14;
        }
        if ((524288 & i11) == 0) {
            this.reservationBlockedUntil = null;
        } else {
            this.reservationBlockedUntil = str7;
        }
        if ((1048576 & i11) == 0) {
            this.itemTags = null;
        } else {
            this.itemTags = list;
        }
        if ((2097152 & i11) == 0) {
            this.itemCardType = null;
        } else {
            this.itemCardType = itemCardType;
        }
        if ((4194304 & i11) == 0) {
            this.itemSpecialReward = null;
        } else {
            this.itemSpecialReward = itemSpecialReward;
        }
        if ((8388608 & i11) == 0) {
            this.ingredients = null;
        } else {
            this.ingredients = ingredients;
        }
        this.matchesFilters = (i11 & 16777216) == 0 ? Boolean.TRUE : bool;
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
    public static /* synthetic */ Item copy$default(Item item, String str, String str2, double d3, MagicBagItemInformation magicBagItemInformation, int i11, boolean z11, PickupInterval pickupInterval, PickupLocation pickupLocation, String str3, String str4, StoreInformation storeInformation, boolean z12, boolean z13, String str5, int i12, String str6, ItemType itemType, boolean z14, String str7, List list, ItemCardType itemCardType, ItemSpecialReward itemSpecialReward, Ingredients ingredients, Boolean bool, int i13, Object obj) {
        Boolean bool2;
        Ingredients ingredients2;
        String str8 = (i13 & 1) != 0 ? item.displayName : str;
        String str9 = (i13 & 2) != 0 ? item.displayDescription : str2;
        double d11 = (i13 & 4) != 0 ? item.distance : d3;
        MagicBagItemInformation magicBagItemInformation2 = (i13 & 8) != 0 ? item.information : magicBagItemInformation;
        int i14 = (i13 & 16) != 0 ? item.itemsAvailable : i11;
        boolean z15 = (i13 & 32) != 0 ? item.itemIsNew : z11;
        PickupInterval pickupInterval2 = (i13 & 64) != 0 ? item.pickupIntervalOrNull : pickupInterval;
        PickupLocation pickupLocation2 = (i13 & 128) != 0 ? item.pickupLocation : pickupLocation;
        String str10 = (i13 & 256) != 0 ? item.purchaseEnd : str3;
        String str11 = (i13 & 512) != 0 ? item.soldOutAt : str4;
        StoreInformation storeInformation2 = (i13 & 1024) != 0 ? item.storeInfoOrNull : storeInformation;
        boolean z16 = (i13 & NewHope.SENDB_BYTES) != 0 ? item.favorite : z12;
        boolean z17 = (i13 & 4096) != 0 ? item.subscribedForNotification : z13;
        String str12 = str8;
        String str13 = (i13 & 8192) != 0 ? item.sharingUrl : str5;
        int i15 = (i13 & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) != 0 ? item.userPurchaseLimit : i12;
        String str14 = (i13 & 32768) != 0 ? item.nextSalesWindowPurchaseStart : str6;
        ItemType itemType2 = (i13 & 65536) != 0 ? item.itemType : itemType;
        boolean z18 = (i13 & 131072) != 0 ? item.isSelected : z14;
        String str15 = (i13 & 262144) != 0 ? item.reservationBlockedUntil : str7;
        List list2 = (i13 & 524288) != 0 ? item.itemTags : list;
        ItemCardType itemCardType2 = (i13 & 1048576) != 0 ? item.itemCardType : itemCardType;
        ItemSpecialReward itemSpecialReward2 = (i13 & 2097152) != 0 ? item.itemSpecialReward : itemSpecialReward;
        Ingredients ingredients3 = (i13 & 4194304) != 0 ? item.ingredients : ingredients;
        if ((i13 & 8388608) != 0) {
            ingredients2 = ingredients3;
            bool2 = item.matchesFilters;
        } else {
            bool2 = bool;
            ingredients2 = ingredients3;
        }
        return item.copy(str12, str9, d11, magicBagItemInformation2, i14, z15, pickupInterval2, pickupLocation2, str10, str11, storeInformation2, z16, z17, str13, i15, str14, itemType2, z18, str15, list2, itemCardType2, itemSpecialReward2, ingredients2, bool2);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void write$Self$app(com.app.tgtg.model.remote.item.response.Item r8, l90.b r9, kotlinx.serialization.descriptors.SerialDescriptor r10) {
        /*
            Method dump skipped, instruction units count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.tgtg.model.remote.item.response.Item.write$Self$app(com.app.tgtg.model.remote.item.response.Item, l90.b, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getSoldOutAt() {
        return this.soldOutAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final StoreInformation getStoreInfoOrNull() {
        return this.storeInfoOrNull;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getFavorite() {
        return this.favorite;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getSubscribedForNotification() {
        return this.subscribedForNotification;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getSharingUrl() {
        return this.sharingUrl;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final int getUserPurchaseLimit() {
        return this.userPurchaseLimit;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getNextSalesWindowPurchaseStart() {
        return this.nextSalesWindowPurchaseStart;
    }

    @NotNull
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final ItemType getItemType() {
        return this.itemType;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getReservationBlockedUntil() {
        return this.reservationBlockedUntil;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDisplayDescription() {
        return this.displayDescription;
    }

    @Nullable
    public final List<ItemTagInfo> component20() {
        return this.itemTags;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final ItemCardType getItemCardType() {
        return this.itemCardType;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final ItemSpecialReward getItemSpecialReward() {
        return this.itemSpecialReward;
    }

    @Nullable
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final Ingredients getIngredients() {
        return this.ingredients;
    }

    @Nullable
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final Boolean getMatchesFilters() {
        return this.matchesFilters;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getDistance() {
        return this.distance;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final MagicBagItemInformation getInformation() {
        return this.information;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getItemsAvailable() {
        return this.itemsAvailable;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getItemIsNew() {
        return this.itemIsNew;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final PickupInterval getPickupIntervalOrNull() {
        return this.pickupIntervalOrNull;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final PickupLocation getPickupLocation() {
        return this.pickupLocation;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getPurchaseEnd() {
        return this.purchaseEnd;
    }

    @NotNull
    public final Item copy(@NotNull String displayName, @Nullable String displayDescription, double distance, @NotNull MagicBagItemInformation information, int itemsAvailable, boolean itemIsNew, @Nullable PickupInterval pickupIntervalOrNull, @NotNull PickupLocation pickupLocation, @Nullable String purchaseEnd, @Nullable String soldOutAt, @Nullable StoreInformation storeInfoOrNull, boolean favorite, boolean subscribedForNotification, @Nullable String sharingUrl, int userPurchaseLimit, @Nullable String nextSalesWindowPurchaseStart, @NotNull ItemType itemType, boolean isSelected, @Nullable String reservationBlockedUntil, @Nullable List<ItemTagInfo> itemTags, @Nullable ItemCardType itemCardType, @Nullable ItemSpecialReward itemSpecialReward, @Nullable Ingredients ingredients, @Nullable Boolean matchesFilters) {
        displayName.getClass();
        information.getClass();
        pickupLocation.getClass();
        itemType.getClass();
        return new Item(displayName, displayDescription, distance, information, itemsAvailable, itemIsNew, pickupIntervalOrNull, pickupLocation, purchaseEnd, soldOutAt, storeInfoOrNull, favorite, subscribedForNotification, sharingUrl, userPurchaseLimit, nextSalesWindowPurchaseStart, itemType, isSelected, reservationBlockedUntil, itemTags, itemCardType, itemSpecialReward, ingredients, matchesFilters);
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
        return Double.compare(item.getDistance(), getDistance()) == 0 && getItemsAvailable() == item.getItemsAvailable() && getInformation().displayedParametersAreEqual(item.getInformation()) && getItemIsNew() == item.getItemIsNew() && Intrinsics.areEqual(getPickupIntervalOrNull(), item.getPickupIntervalOrNull()) && Intrinsics.areEqual(getSoldOutAt(), item.getSoldOutAt()) && Intrinsics.areEqual(getDisplayName(), item.getDisplayName()) && Intrinsics.areEqual(this.displayDescription, item.displayDescription);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Item)) {
            return false;
        }
        Item item = (Item) other;
        return Double.compare(item.getDistance(), getDistance()) == 0 && getItemsAvailable() == item.getItemsAvailable() && getFavorite() == item.getFavorite() && Intrinsics.areEqual(getDisplayName(), item.getDisplayName()) && Intrinsics.areEqual(this.displayDescription, item.displayDescription) && Intrinsics.areEqual(getInformation(), item.getInformation()) && getItemIsNew() == item.getItemIsNew() && Intrinsics.areEqual(getPickupIntervalOrNull(), item.getPickupIntervalOrNull()) && Intrinsics.areEqual(getPickupLocation(), item.getPickupLocation()) && Intrinsics.areEqual(getPurchaseEnd(), item.getPurchaseEnd()) && Intrinsics.areEqual(getSoldOutAt(), item.getSoldOutAt()) && Intrinsics.areEqual(mv.d.m(this), mv.d.m(item));
    }

    @Nullable
    public final String getDisplayDescription() {
        return this.displayDescription;
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

    @Nullable
    public final ItemSpecialReward getItemSpecialReward() {
        return this.itemSpecialReward;
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

    @Nullable
    public final String getReservationBlockedUntil() {
        return this.reservationBlockedUntil;
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
        return Objects.hash(Double.valueOf(getDistance()), getInformation(), Integer.valueOf(getItemsAvailable()), getPickupIntervalOrNull(), getPickupLocation(), getPurchaseEnd(), getSoldOutAt(), mv.d.m(this), Boolean.valueOf(getFavorite()));
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setDisplayDescription(@Nullable String str) {
        this.displayDescription = str;
    }

    @Override // com.app.tgtg.model.remote.item.response.BasicItem
    public void setDistance(double d3) {
        this.distance = d3;
    }

    @Override // com.app.tgtg.model.remote.item.response.BasicItem
    public void setFavorite(boolean z11) {
        this.favorite = z11;
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

    public final void setSelected(boolean z11) {
        this.isSelected = z11;
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
        String storeName;
        if (getStoreInfoOrNull() == null) {
            storeName = "EmptyItem";
        } else {
            StoreInformation storeInfoOrNull = getStoreInfoOrNull();
            storeInfoOrNull.getClass();
            storeName = storeInfoOrNull.getStoreName();
        }
        return storeName == null ? "" : storeName;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.displayName);
        dest.writeString(this.displayDescription);
        dest.writeDouble(this.distance);
        this.information.writeToParcel(dest, flags);
        dest.writeInt(this.itemsAvailable);
        dest.writeInt(this.itemIsNew ? 1 : 0);
        PickupInterval pickupInterval = this.pickupIntervalOrNull;
        if (pickupInterval == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            pickupInterval.writeToParcel(dest, flags);
        }
        this.pickupLocation.writeToParcel(dest, flags);
        dest.writeString(this.purchaseEnd);
        dest.writeString(this.soldOutAt);
        StoreInformation storeInformation = this.storeInfoOrNull;
        if (storeInformation == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            storeInformation.writeToParcel(dest, flags);
        }
        dest.writeInt(this.favorite ? 1 : 0);
        dest.writeInt(this.subscribedForNotification ? 1 : 0);
        dest.writeString(this.sharingUrl);
        dest.writeInt(this.userPurchaseLimit);
        dest.writeString(this.nextSalesWindowPurchaseStart);
        dest.writeString(this.itemType.name());
        dest.writeString(this.reservationBlockedUntil);
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
        ItemSpecialReward itemSpecialReward = this.itemSpecialReward;
        if (itemSpecialReward == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            itemSpecialReward.writeToParcel(dest, flags);
        }
        Ingredients ingredients = this.ingredients;
        if (ingredients == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            ingredients.writeToParcel(dest, flags);
        }
        Boolean bool = this.matchesFilters;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            i.v(dest, 1, bool);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/item/response/Item$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/item/response/Item;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return Item$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Item> {
        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r25v2, types: [java.lang.Boolean] */
        /* JADX WARN: Type inference failed for: r2v1 */
        /* JADX WARN: Type inference failed for: r2v11 */
        /* JADX WARN: Type inference failed for: r2v2, types: [int] */
        @Override // android.os.Parcelable.Creator
        public final Item createFromParcel(Parcel parcel) {
            boolean z11;
            ArrayList arrayList;
            boolean z12;
            String str;
            ArrayList arrayList2;
            String str2;
            Object objValueOf;
            parcel.getClass();
            String string = parcel.readString();
            String string2 = parcel.readString();
            double d3 = parcel.readDouble();
            MagicBagItemInformation magicBagItemInformationCreateFromParcel = MagicBagItemInformation.CREATOR.createFromParcel(parcel);
            int i11 = parcel.readInt();
            boolean z13 = parcel.readInt() != 0;
            PickupInterval pickupIntervalCreateFromParcel = parcel.readInt() == 0 ? null : PickupInterval.CREATOR.createFromParcel(parcel);
            PickupLocation pickupLocationCreateFromParcel = PickupLocation.CREATOR.createFromParcel(parcel);
            boolean z14 = false;
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            StoreInformation storeInformationCreateFromParcel = parcel.readInt() == 0 ? null : StoreInformation.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                z11 = false;
                z14 = true;
            } else {
                z11 = false;
            }
            if (parcel.readInt() != 0) {
                arrayList = null;
                z12 = true;
            } else {
                arrayList = null;
                z12 = z11;
            }
            String string5 = parcel.readString();
            boolean z15 = z11;
            int i12 = parcel.readInt();
            ArrayList arrayList3 = arrayList;
            String string6 = parcel.readString();
            ItemType itemTypeValueOf = ItemType.valueOf(parcel.readString());
            String string7 = parcel.readString();
            if (parcel.readInt() == 0) {
                str = string;
                str2 = string2;
                arrayList2 = arrayList3;
            } else {
                int i13 = parcel.readInt();
                str = string;
                arrayList2 = new ArrayList(i13);
                str2 = string2;
                ?? C = z15;
                while (C != i13) {
                    d3 = d3;
                    C = i.c(ItemTagInfo.CREATOR, parcel, arrayList2, C, 1);
                }
            }
            double d11 = d3;
            ItemCardType itemCardType = (ItemCardType) (parcel.readInt() == 0 ? arrayList3 : ItemCardType.CREATOR.createFromParcel(parcel));
            ItemSpecialReward itemSpecialReward = (ItemSpecialReward) (parcel.readInt() == 0 ? arrayList3 : ItemSpecialReward.CREATOR.createFromParcel(parcel));
            Ingredients ingredients = (Ingredients) (parcel.readInt() == 0 ? arrayList3 : Ingredients.CREATOR.createFromParcel(parcel));
            if (parcel.readInt() == 0) {
                objValueOf = arrayList3;
            } else {
                if (parcel.readInt() != 0) {
                    z15 = true;
                }
                objValueOf = Boolean.valueOf(z15);
            }
            return new Item(str, str2, d11, magicBagItemInformationCreateFromParcel, i11, z13, pickupIntervalCreateFromParcel, pickupLocationCreateFromParcel, string3, string4, storeInformationCreateFromParcel, z14, z12, string5, i12, string6, itemTypeValueOf, false, string7, arrayList2, itemCardType, itemSpecialReward, ingredients, objValueOf, 131072, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Item[] newArray(int i11) {
            return new Item[i11];
        }
    }

    @Override // com.app.tgtg.model.remote.item.response.BasicItem
    @NotNull
    public MagicBagItemInformation getInformation() {
        return this.information;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Item(@NotNull String str, @Nullable String str2, double d3, @NotNull MagicBagItemInformation magicBagItemInformation, int i11, boolean z11, @Nullable PickupInterval pickupInterval, @NotNull PickupLocation pickupLocation, @Nullable String str3, @Nullable String str4, @Nullable StoreInformation storeInformation, boolean z12, boolean z13, @Nullable String str5, int i12, @Nullable String str6, @NotNull ItemType itemType, boolean z14, @Nullable String str7, @Nullable List<ItemTagInfo> list, @Nullable ItemCardType itemCardType, @Nullable ItemSpecialReward itemSpecialReward, @Nullable Ingredients ingredients, @Nullable Boolean bool) {
        super(null);
        str.getClass();
        magicBagItemInformation.getClass();
        pickupLocation.getClass();
        itemType.getClass();
        this.displayName = str;
        this.displayDescription = str2;
        this.distance = d3;
        this.information = magicBagItemInformation;
        this.itemsAvailable = i11;
        this.itemIsNew = z11;
        this.pickupIntervalOrNull = pickupInterval;
        this.pickupLocation = pickupLocation;
        this.purchaseEnd = str3;
        this.soldOutAt = str4;
        this.storeInfoOrNull = storeInformation;
        this.favorite = z12;
        this.subscribedForNotification = z13;
        this.sharingUrl = str5;
        this.userPurchaseLimit = i12;
        this.nextSalesWindowPurchaseStart = str6;
        this.itemType = itemType;
        this.isSelected = z14;
        this.reservationBlockedUntil = str7;
        this.itemTags = list;
        this.itemCardType = itemCardType;
        this.itemSpecialReward = itemSpecialReward;
        this.ingredients = ingredients;
        this.matchesFilters = bool;
    }

    @g("display_description")
    public static /* synthetic */ void getDisplayDescription$annotations() {
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

    @g("item_special_reward")
    public static /* synthetic */ void getItemSpecialReward$annotations() {
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

    @g("reservation_blocked_until")
    public static /* synthetic */ void getReservationBlockedUntil$annotations() {
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

    public static /* synthetic */ void isSelected$annotations() {
    }

    public /* synthetic */ Item(String str, String str2, double d3, MagicBagItemInformation magicBagItemInformation, int i11, boolean z11, PickupInterval pickupInterval, PickupLocation pickupLocation, String str3, String str4, StoreInformation storeInformation, boolean z12, boolean z13, String str5, int i12, String str6, ItemType itemType, boolean z14, String str7, List list, ItemCardType itemCardType, ItemSpecialReward itemSpecialReward, Ingredients ingredients, Boolean bool, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? 0.0d : d3, magicBagItemInformation, (i13 & 16) != 0 ? 0 : i11, (i13 & 32) != 0 ? false : z11, (i13 & 64) != 0 ? null : pickupInterval, (i13 & 128) != 0 ? new PickupLocation((Address) null, (String) null, (LatLngInfo) null, 7, (DefaultConstructorMarker) null) : pickupLocation, (i13 & 256) != 0 ? null : str3, (i13 & 512) != 0 ? null : str4, (i13 & 1024) != 0 ? null : storeInformation, (i13 & NewHope.SENDB_BYTES) != 0 ? false : z12, (i13 & 4096) != 0 ? false : z13, (i13 & 8192) != 0 ? null : str5, (i13 & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) != 0 ? 0 : i12, (32768 & i13) != 0 ? null : str6, (65536 & i13) != 0 ? ItemType.MAGIC_BAG : itemType, (131072 & i13) != 0 ? false : z14, (262144 & i13) != 0 ? null : str7, (524288 & i13) != 0 ? null : list, (1048576 & i13) != 0 ? null : itemCardType, (2097152 & i13) != 0 ? null : itemSpecialReward, (4194304 & i13) != 0 ? null : ingredients, (i13 & 8388608) != 0 ? Boolean.TRUE : bool);
    }
}
