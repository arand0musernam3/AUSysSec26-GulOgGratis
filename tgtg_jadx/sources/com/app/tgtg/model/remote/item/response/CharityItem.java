package com.app.tgtg.model.remote.item.response;

import android.os.Parcel;
import android.os.Parcelable;
import b3.i;
import cg.e;
import com.app.tgtg.model.remote.item.Address;
import com.app.tgtg.model.remote.item.CharityItemInformation;
import com.app.tgtg.model.remote.item.Ingredients;
import com.app.tgtg.model.remote.item.ItemCardType;
import com.app.tgtg.model.remote.item.ItemTagInfo;
import com.app.tgtg.model.remote.item.ItemTagInfo$$serializer;
import com.app.tgtg.model.remote.item.LatLngInfo;
import com.app.tgtg.model.remote.item.PickupInterval;
import com.app.tgtg.model.remote.item.PickupLocation;
import com.app.tgtg.model.remote.item.StoreInformation;
import e0.f;
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

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bZ\b\u0087\b\u0018\u0000 À\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0004Á\u0001À\u0001B\u0089\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\r\u0012\b\b\u0002\u0010\u0018\u001a\u00020\r\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c\u0012\b\b\u0002\u0010\u001e\u001a\u00020\r\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 \u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b(\u0010)B\u008f\u0002\b\u0010\u0012\u0006\u0010*\u001a\u00020\u000b\u0012\u0014\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020,\u0018\u00010+\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0017\u001a\u00020\r\u0012\u0006\u0010\u0018\u001a\u00020\r\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u001a\u001a\u00020\u000b\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0006\u0010\u001e\u001a\u00020\r\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 \u0012\b\u0010$\u001a\u0004\u0018\u00010#\u0012\b\u0010&\u001a\u0004\u0018\u00010%\u0012\b\u0010'\u001a\u0004\u0018\u00010\r\u0012\b\u0010/\u001a\u0004\u0018\u00010.¢\u0006\u0004\b(\u00100J\u0017\u00103\u001a\u00020\r2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\r\u00105\u001a\u00020\u000b¢\u0006\u0004\b5\u00106J\u001d\u0010:\u001a\u00020,2\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u00020\u000b¢\u0006\u0004\b:\u0010;J\u0010\u0010<\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b<\u0010=J\u0012\u0010>\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b>\u0010=J\u0010\u0010?\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b?\u0010@J\u0010\u0010A\u001a\u00020\tHÆ\u0003¢\u0006\u0004\bA\u0010BJ\u0010\u0010C\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\bC\u00106J\u0010\u0010D\u001a\u00020\rHÆ\u0003¢\u0006\u0004\bD\u0010EJ\u0012\u0010F\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\bF\u0010GJ\u0010\u0010H\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\bH\u0010IJ\u0012\u0010J\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bJ\u0010=J\u0012\u0010K\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bK\u0010=J\u0012\u0010L\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\bL\u0010MJ\u0010\u0010N\u001a\u00020\rHÆ\u0003¢\u0006\u0004\bN\u0010EJ\u0010\u0010O\u001a\u00020\rHÆ\u0003¢\u0006\u0004\bO\u0010EJ\u0012\u0010P\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bP\u0010=J\u0010\u0010Q\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\bQ\u00106J\u0012\u0010R\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bR\u0010=J\u0010\u0010S\u001a\u00020\u001cHÆ\u0003¢\u0006\u0004\bS\u0010TJ\u0010\u0010U\u001a\u00020\rHÆ\u0003¢\u0006\u0004\bU\u0010EJ\u0012\u0010V\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bV\u0010=J\u0018\u0010W\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 HÆ\u0003¢\u0006\u0004\bW\u0010XJ\u0012\u0010Y\u001a\u0004\u0018\u00010#HÆ\u0003¢\u0006\u0004\bY\u0010ZJ\u0012\u0010[\u001a\u0004\u0018\u00010%HÆ\u0003¢\u0006\u0004\b[\u0010\\J\u0012\u0010]\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b]\u0010^J\u0094\u0002\u0010_\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0017\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\r2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u000b2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\r2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b_\u0010`J\u0010\u0010a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\ba\u0010=J\u0010\u0010b\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\bb\u00106J\u001a\u0010d\u001a\u00020\r2\b\u0010c\u001a\u0004\u0018\u000101HÖ\u0003¢\u0006\u0004\bd\u00104J'\u0010l\u001a\u00020,2\u0006\u0010e\u001a\u00020\u00002\u0006\u0010g\u001a\u00020f2\u0006\u0010i\u001a\u00020hH\u0001¢\u0006\u0004\bj\u0010kR \u0010\u0005\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010m\u0012\u0004\bo\u0010p\u001a\u0004\bn\u0010=R*\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0006\u0010m\u0012\u0004\bt\u0010p\u001a\u0004\bq\u0010=\"\u0004\br\u0010sR(\u0010\b\u001a\u00020\u00078\u0016@\u0016X\u0097\u000e¢\u0006\u0018\n\u0004\b\b\u0010u\u0012\u0004\by\u0010p\u001a\u0004\bv\u0010@\"\u0004\bw\u0010xR(\u0010\n\u001a\u00020\t8\u0016@\u0016X\u0097\u000e¢\u0006\u0018\n\u0004\b\n\u0010z\u0012\u0004\b~\u0010p\u001a\u0004\b{\u0010B\"\u0004\b|\u0010}R,\u0010\f\u001a\u00020\u000b8\u0016@\u0016X\u0097\u000e¢\u0006\u001c\n\u0004\b\f\u0010\u007f\u0012\u0005\b\u0083\u0001\u0010p\u001a\u0005\b\u0080\u0001\u00106\"\u0006\b\u0081\u0001\u0010\u0082\u0001R-\u0010\u000e\u001a\u00020\r8\u0016@\u0016X\u0097\u000e¢\u0006\u001d\n\u0005\b\u000e\u0010\u0084\u0001\u0012\u0005\b\u0088\u0001\u0010p\u001a\u0005\b\u0085\u0001\u0010E\"\u0006\b\u0086\u0001\u0010\u0087\u0001R/\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0016@\u0016X\u0097\u000e¢\u0006\u001d\n\u0005\b\u0010\u0010\u0089\u0001\u0012\u0005\b\u008d\u0001\u0010p\u001a\u0005\b\u008a\u0001\u0010G\"\u0006\b\u008b\u0001\u0010\u008c\u0001R#\u0010\u0012\u001a\u00020\u00118\u0016X\u0097\u0004¢\u0006\u0015\n\u0005\b\u0012\u0010\u008e\u0001\u0012\u0005\b\u0090\u0001\u0010p\u001a\u0005\b\u008f\u0001\u0010IR-\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0097\u000e¢\u0006\u001b\n\u0004\b\u0013\u0010m\u0012\u0005\b\u0093\u0001\u0010p\u001a\u0005\b\u0091\u0001\u0010=\"\u0005\b\u0092\u0001\u0010sR-\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0097\u000e¢\u0006\u001b\n\u0004\b\u0014\u0010m\u0012\u0005\b\u0096\u0001\u0010p\u001a\u0005\b\u0094\u0001\u0010=\"\u0005\b\u0095\u0001\u0010sR/\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0016@\u0016X\u0097\u000e¢\u0006\u001d\n\u0005\b\u0016\u0010\u0097\u0001\u0012\u0005\b\u009b\u0001\u0010p\u001a\u0005\b\u0098\u0001\u0010M\"\u0006\b\u0099\u0001\u0010\u009a\u0001R-\u0010\u0017\u001a\u00020\r8\u0016@\u0016X\u0097\u000e¢\u0006\u001d\n\u0005\b\u0017\u0010\u0084\u0001\u0012\u0005\b\u009e\u0001\u0010p\u001a\u0005\b\u009c\u0001\u0010E\"\u0006\b\u009d\u0001\u0010\u0087\u0001R-\u0010\u0018\u001a\u00020\r8\u0016@\u0016X\u0097\u000e¢\u0006\u001d\n\u0005\b\u0018\u0010\u0084\u0001\u0012\u0005\b¡\u0001\u0010p\u001a\u0005\b\u009f\u0001\u0010E\"\u0006\b \u0001\u0010\u0087\u0001R-\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0097\u000e¢\u0006\u001b\n\u0004\b\u0019\u0010m\u0012\u0005\b¤\u0001\u0010p\u001a\u0005\b¢\u0001\u0010=\"\u0005\b£\u0001\u0010sR,\u0010\u001a\u001a\u00020\u000b8\u0016@\u0016X\u0097\u000e¢\u0006\u001c\n\u0004\b\u001a\u0010\u007f\u0012\u0005\b§\u0001\u0010p\u001a\u0005\b¥\u0001\u00106\"\u0006\b¦\u0001\u0010\u0082\u0001R-\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0097\u000e¢\u0006\u001b\n\u0004\b\u001b\u0010m\u0012\u0005\bª\u0001\u0010p\u001a\u0005\b¨\u0001\u0010=\"\u0005\b©\u0001\u0010sR-\u0010\u001d\u001a\u00020\u001c8\u0016@\u0016X\u0097\u000e¢\u0006\u001d\n\u0005\b\u001d\u0010«\u0001\u0012\u0005\b¯\u0001\u0010p\u001a\u0005\b¬\u0001\u0010T\"\u0006\b\u00ad\u0001\u0010®\u0001R,\u0010\u001e\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u001c\n\u0005\b\u001e\u0010\u0084\u0001\u0012\u0005\b±\u0001\u0010p\u001a\u0004\b\u001e\u0010E\"\u0006\b°\u0001\u0010\u0087\u0001R$\u0010\u001f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b\u001f\u0010m\u0012\u0005\b³\u0001\u0010p\u001a\u0005\b²\u0001\u0010=R+\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 8\u0016X\u0097\u0004¢\u0006\u0015\n\u0005\b\"\u0010´\u0001\u0012\u0005\b¶\u0001\u0010p\u001a\u0005\bµ\u0001\u0010XR%\u0010$\u001a\u0004\u0018\u00010#8\u0016X\u0097\u0004¢\u0006\u0015\n\u0005\b$\u0010·\u0001\u0012\u0005\b¹\u0001\u0010p\u001a\u0005\b¸\u0001\u0010ZR%\u0010&\u001a\u0004\u0018\u00010%8\u0016X\u0097\u0004¢\u0006\u0015\n\u0005\b&\u0010º\u0001\u0012\u0005\b¼\u0001\u0010p\u001a\u0005\b»\u0001\u0010\\R%\u0010'\u001a\u0004\u0018\u00010\r8\u0016X\u0097\u0004¢\u0006\u0015\n\u0005\b'\u0010½\u0001\u0012\u0005\b¿\u0001\u0010p\u001a\u0005\b¾\u0001\u0010^¨\u0006Â\u0001"}, d2 = {"Lcom/app/tgtg/model/remote/item/response/CharityItem;", "Landroid/os/Parcelable;", "Lmq/a;", "Lcom/app/tgtg/model/remote/item/response/BasicItem;", "", "displayName", "displayDescription", "", "distance", "Lcom/app/tgtg/model/remote/item/CharityItemInformation;", "information", "", "itemsAvailable", "", "itemIsNew", "Lcom/app/tgtg/model/remote/item/PickupInterval;", "pickupIntervalOrNull", "Lcom/app/tgtg/model/remote/item/PickupLocation;", "pickupLocation", "purchaseEnd", "soldOutAt", "Lcom/app/tgtg/model/remote/item/StoreInformation;", "storeInfoOrNull", "favorite", "subscribedForNotification", "sharingUrl", "userPurchaseLimit", "nextSalesWindowPurchaseStart", "Lcom/app/tgtg/model/remote/item/response/ItemType;", "itemType", "isSelected", "reservationBlockedUntil", "", "Lcom/app/tgtg/model/remote/item/ItemTagInfo;", "itemTags", "Lcom/app/tgtg/model/remote/item/ItemCardType;", "itemCardType", "Lcom/app/tgtg/model/remote/item/Ingredients;", "ingredients", "matchesFilters", "<init>", "(Ljava/lang/String;Ljava/lang/String;DLcom/app/tgtg/model/remote/item/CharityItemInformation;IZLcom/app/tgtg/model/remote/item/PickupInterval;Lcom/app/tgtg/model/remote/item/PickupLocation;Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/item/StoreInformation;ZZLjava/lang/String;ILjava/lang/String;Lcom/app/tgtg/model/remote/item/response/ItemType;ZLjava/lang/String;Ljava/util/List;Lcom/app/tgtg/model/remote/item/ItemCardType;Lcom/app/tgtg/model/remote/item/Ingredients;Ljava/lang/Boolean;)V", "seen0", "Lkotlin/Function1;", "", "onFavoriteChangedListener", "Lm90/m1;", "serializationConstructorMarker", "(ILkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;DLcom/app/tgtg/model/remote/item/CharityItemInformation;IZLcom/app/tgtg/model/remote/item/PickupInterval;Lcom/app/tgtg/model/remote/item/PickupLocation;Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/item/StoreInformation;ZZLjava/lang/String;ILjava/lang/String;Lcom/app/tgtg/model/remote/item/response/ItemType;ZLjava/lang/String;Ljava/util/List;Lcom/app/tgtg/model/remote/item/ItemCardType;Lcom/app/tgtg/model/remote/item/Ingredients;Ljava/lang/Boolean;Lm90/m1;)V", "", "o", "displayedParametersAreEqual", "(Ljava/lang/Object;)Z", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()D", "component4", "()Lcom/app/tgtg/model/remote/item/CharityItemInformation;", "component5", "component6", "()Z", "component7", "()Lcom/app/tgtg/model/remote/item/PickupInterval;", "component8", "()Lcom/app/tgtg/model/remote/item/PickupLocation;", "component9", "component10", "component11", "()Lcom/app/tgtg/model/remote/item/StoreInformation;", "component12", "component13", "component14", "component15", "component16", "component17", "()Lcom/app/tgtg/model/remote/item/response/ItemType;", "component18", "component19", "component20", "()Ljava/util/List;", "component21", "()Lcom/app/tgtg/model/remote/item/ItemCardType;", "component22", "()Lcom/app/tgtg/model/remote/item/Ingredients;", "component23", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/String;DLcom/app/tgtg/model/remote/item/CharityItemInformation;IZLcom/app/tgtg/model/remote/item/PickupInterval;Lcom/app/tgtg/model/remote/item/PickupLocation;Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/item/StoreInformation;ZZLjava/lang/String;ILjava/lang/String;Lcom/app/tgtg/model/remote/item/response/ItemType;ZLjava/lang/String;Ljava/util/List;Lcom/app/tgtg/model/remote/item/ItemCardType;Lcom/app/tgtg/model/remote/item/Ingredients;Ljava/lang/Boolean;)Lcom/app/tgtg/model/remote/item/response/CharityItem;", "toString", "hashCode", "other", "equals", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "write$Self$app", "(Lcom/app/tgtg/model/remote/item/response/CharityItem;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getDisplayName", "getDisplayName$annotations", "()V", "getDisplayDescription", "setDisplayDescription", "(Ljava/lang/String;)V", "getDisplayDescription$annotations", "D", "getDistance", "setDistance", "(D)V", "getDistance$annotations", "Lcom/app/tgtg/model/remote/item/CharityItemInformation;", "getInformation", "setInformation", "(Lcom/app/tgtg/model/remote/item/CharityItemInformation;)V", "getInformation$annotations", "I", "getItemsAvailable", "setItemsAvailable", "(I)V", "getItemsAvailable$annotations", "Z", "getItemIsNew", "setItemIsNew", "(Z)V", "getItemIsNew$annotations", "Lcom/app/tgtg/model/remote/item/PickupInterval;", "getPickupIntervalOrNull", "setPickupIntervalOrNull", "(Lcom/app/tgtg/model/remote/item/PickupInterval;)V", "getPickupIntervalOrNull$annotations", "Lcom/app/tgtg/model/remote/item/PickupLocation;", "getPickupLocation", "getPickupLocation$annotations", "getPurchaseEnd", "setPurchaseEnd", "getPurchaseEnd$annotations", "getSoldOutAt", "setSoldOutAt", "getSoldOutAt$annotations", "Lcom/app/tgtg/model/remote/item/StoreInformation;", "getStoreInfoOrNull", "setStoreInfoOrNull", "(Lcom/app/tgtg/model/remote/item/StoreInformation;)V", "getStoreInfoOrNull$annotations", "getFavorite", "setFavorite", "getFavorite$annotations", "getSubscribedForNotification", "setSubscribedForNotification", "getSubscribedForNotification$annotations", "getSharingUrl", "setSharingUrl", "getSharingUrl$annotations", "getUserPurchaseLimit", "setUserPurchaseLimit", "getUserPurchaseLimit$annotations", "getNextSalesWindowPurchaseStart", "setNextSalesWindowPurchaseStart", "getNextSalesWindowPurchaseStart$annotations", "Lcom/app/tgtg/model/remote/item/response/ItemType;", "getItemType", "setItemType", "(Lcom/app/tgtg/model/remote/item/response/ItemType;)V", "getItemType$annotations", "setSelected", "isSelected$annotations", "getReservationBlockedUntil", "getReservationBlockedUntil$annotations", "Ljava/util/List;", "getItemTags", "getItemTags$annotations", "Lcom/app/tgtg/model/remote/item/ItemCardType;", "getItemCardType", "getItemCardType$annotations", "Lcom/app/tgtg/model/remote/item/Ingredients;", "getIngredients", "getIngredients$annotations", "Ljava/lang/Boolean;", "getMatchesFilters", "getMatchesFilters$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@g("CHARITY")
public final /* data */ class CharityItem extends BasicItem implements Parcelable {

    @NotNull
    private static final j[] $childSerializers;

    @Nullable
    private String displayDescription;

    @NotNull
    private final String displayName;
    private double distance;
    private boolean favorite;

    @NotNull
    private CharityItemInformation information;

    @Nullable
    private final Ingredients ingredients;
    private boolean isSelected;

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
    public static final Parcelable.Creator<CharityItem> CREATOR = new Creator();

    static {
        m mVar = m.PUBLICATION;
        $childSerializers = new j[]{l.a(mVar, new e(17)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, l.a(mVar, new e(18)), null, null, null};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CharityItem(int i11, Function1 function1, String str, String str2, double d3, CharityItemInformation charityItemInformation, int i12, boolean z11, PickupInterval pickupInterval, PickupLocation pickupLocation, String str3, String str4, StoreInformation storeInformation, boolean z12, boolean z13, String str5, int i13, String str6, ItemType itemType, boolean z14, String str7, List list, ItemCardType itemCardType, Ingredients ingredients, Boolean bool, m1 m1Var) {
        super(i11, function1, m1Var);
        if (16 != (i11 & 16)) {
            c1.j(i11, 16, CharityItem$$serializer.INSTANCE.getDescriptor());
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
        this.information = charityItemInformation;
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
        this.itemType = (131072 & i11) == 0 ? ItemType.CHARITY : itemType;
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
            this.ingredients = null;
        } else {
            this.ingredients = ingredients;
        }
        this.matchesFilters = (i11 & 8388608) == 0 ? Boolean.TRUE : bool;
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
    public static /* synthetic */ CharityItem copy$default(CharityItem charityItem, String str, String str2, double d3, CharityItemInformation charityItemInformation, int i11, boolean z11, PickupInterval pickupInterval, PickupLocation pickupLocation, String str3, String str4, StoreInformation storeInformation, boolean z12, boolean z13, String str5, int i12, String str6, ItemType itemType, boolean z14, String str7, List list, ItemCardType itemCardType, Ingredients ingredients, Boolean bool, int i13, Object obj) {
        Boolean bool2;
        Ingredients ingredients2;
        String str8 = (i13 & 1) != 0 ? charityItem.displayName : str;
        String str9 = (i13 & 2) != 0 ? charityItem.displayDescription : str2;
        double d11 = (i13 & 4) != 0 ? charityItem.distance : d3;
        CharityItemInformation charityItemInformation2 = (i13 & 8) != 0 ? charityItem.information : charityItemInformation;
        int i14 = (i13 & 16) != 0 ? charityItem.itemsAvailable : i11;
        boolean z15 = (i13 & 32) != 0 ? charityItem.itemIsNew : z11;
        PickupInterval pickupInterval2 = (i13 & 64) != 0 ? charityItem.pickupIntervalOrNull : pickupInterval;
        PickupLocation pickupLocation2 = (i13 & 128) != 0 ? charityItem.pickupLocation : pickupLocation;
        String str10 = (i13 & 256) != 0 ? charityItem.purchaseEnd : str3;
        String str11 = (i13 & 512) != 0 ? charityItem.soldOutAt : str4;
        StoreInformation storeInformation2 = (i13 & 1024) != 0 ? charityItem.storeInfoOrNull : storeInformation;
        boolean z16 = (i13 & NewHope.SENDB_BYTES) != 0 ? charityItem.favorite : z12;
        boolean z17 = (i13 & 4096) != 0 ? charityItem.subscribedForNotification : z13;
        String str12 = str8;
        String str13 = (i13 & 8192) != 0 ? charityItem.sharingUrl : str5;
        int i15 = (i13 & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) != 0 ? charityItem.userPurchaseLimit : i12;
        String str14 = (i13 & 32768) != 0 ? charityItem.nextSalesWindowPurchaseStart : str6;
        ItemType itemType2 = (i13 & 65536) != 0 ? charityItem.itemType : itemType;
        boolean z18 = (i13 & 131072) != 0 ? charityItem.isSelected : z14;
        String str15 = (i13 & 262144) != 0 ? charityItem.reservationBlockedUntil : str7;
        List list2 = (i13 & 524288) != 0 ? charityItem.itemTags : list;
        ItemCardType itemCardType2 = (i13 & 1048576) != 0 ? charityItem.itemCardType : itemCardType;
        Ingredients ingredients3 = (i13 & 2097152) != 0 ? charityItem.ingredients : ingredients;
        if ((i13 & 4194304) != 0) {
            ingredients2 = ingredients3;
            bool2 = charityItem.matchesFilters;
        } else {
            bool2 = bool;
            ingredients2 = ingredients3;
        }
        return charityItem.copy(str12, str9, d11, charityItemInformation2, i14, z15, pickupInterval2, pickupLocation2, str10, str11, storeInformation2, z16, z17, str13, i15, str14, itemType2, z18, str15, list2, itemCardType2, ingredients2, bool2);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void write$Self$app(com.app.tgtg.model.remote.item.response.CharityItem r8, l90.b r9, kotlinx.serialization.descriptors.SerialDescriptor r10) {
        /*
            Method dump skipped, instruction units count: 554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.tgtg.model.remote.item.response.CharityItem.write$Self$app(com.app.tgtg.model.remote.item.response.CharityItem, l90.b, kotlinx.serialization.descriptors.SerialDescriptor):void");
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
    public final Ingredients getIngredients() {
        return this.ingredients;
    }

    @Nullable
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final Boolean getMatchesFilters() {
        return this.matchesFilters;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getDistance() {
        return this.distance;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final CharityItemInformation getInformation() {
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
    public final CharityItem copy(@NotNull String displayName, @Nullable String displayDescription, double distance, @NotNull CharityItemInformation information, int itemsAvailable, boolean itemIsNew, @Nullable PickupInterval pickupIntervalOrNull, @NotNull PickupLocation pickupLocation, @Nullable String purchaseEnd, @Nullable String soldOutAt, @Nullable StoreInformation storeInfoOrNull, boolean favorite, boolean subscribedForNotification, @Nullable String sharingUrl, int userPurchaseLimit, @Nullable String nextSalesWindowPurchaseStart, @NotNull ItemType itemType, boolean isSelected, @Nullable String reservationBlockedUntil, @Nullable List<ItemTagInfo> itemTags, @Nullable ItemCardType itemCardType, @Nullable Ingredients ingredients, @Nullable Boolean matchesFilters) {
        displayName.getClass();
        information.getClass();
        pickupLocation.getClass();
        itemType.getClass();
        return new CharityItem(displayName, displayDescription, distance, information, itemsAvailable, itemIsNew, pickupIntervalOrNull, pickupLocation, purchaseEnd, soldOutAt, storeInfoOrNull, favorite, subscribedForNotification, sharingUrl, userPurchaseLimit, nextSalesWindowPurchaseStart, itemType, isSelected, reservationBlockedUntil, itemTags, itemCardType, ingredients, matchesFilters);
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
        return Double.compare(item.getDistance(), getDistance()) == 0 && getItemsAvailable() == item.getItemsAvailable() && getInformation().displayedParametersAreEqual(item.getInformation()) && getItemIsNew() == item.getItemIsNew() && Intrinsics.areEqual(getPickupIntervalOrNull(), item.getPickupIntervalOrNull()) && Intrinsics.areEqual(getSoldOutAt(), item.getSoldOutAt()) && Intrinsics.areEqual(getDisplayName(), item.getDisplayName()) && Intrinsics.areEqual(this.displayDescription, item.getDisplayDescription());
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CharityItem)) {
            return false;
        }
        CharityItem charityItem = (CharityItem) other;
        return Intrinsics.areEqual(this.displayName, charityItem.displayName) && Intrinsics.areEqual(this.displayDescription, charityItem.displayDescription) && Double.compare(this.distance, charityItem.distance) == 0 && Intrinsics.areEqual(this.information, charityItem.information) && this.itemsAvailable == charityItem.itemsAvailable && this.itemIsNew == charityItem.itemIsNew && Intrinsics.areEqual(this.pickupIntervalOrNull, charityItem.pickupIntervalOrNull) && Intrinsics.areEqual(this.pickupLocation, charityItem.pickupLocation) && Intrinsics.areEqual(this.purchaseEnd, charityItem.purchaseEnd) && Intrinsics.areEqual(this.soldOutAt, charityItem.soldOutAt) && Intrinsics.areEqual(this.storeInfoOrNull, charityItem.storeInfoOrNull) && this.favorite == charityItem.favorite && this.subscribedForNotification == charityItem.subscribedForNotification && Intrinsics.areEqual(this.sharingUrl, charityItem.sharingUrl) && this.userPurchaseLimit == charityItem.userPurchaseLimit && Intrinsics.areEqual(this.nextSalesWindowPurchaseStart, charityItem.nextSalesWindowPurchaseStart) && this.itemType == charityItem.itemType && this.isSelected == charityItem.isSelected && Intrinsics.areEqual(this.reservationBlockedUntil, charityItem.reservationBlockedUntil) && Intrinsics.areEqual(this.itemTags, charityItem.itemTags) && Intrinsics.areEqual(this.itemCardType, charityItem.itemCardType) && Intrinsics.areEqual(this.ingredients, charityItem.ingredients) && Intrinsics.areEqual(this.matchesFilters, charityItem.matchesFilters);
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
        int iHashCode = this.displayName.hashCode() * 31;
        String str = this.displayDescription;
        int iE = k.e(k.b(this.itemsAvailable, (this.information.hashCode() + s.b(this.distance, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31)) * 31, 31), 31, this.itemIsNew);
        PickupInterval pickupInterval = this.pickupIntervalOrNull;
        int iHashCode2 = (this.pickupLocation.hashCode() + ((iE + (pickupInterval == null ? 0 : pickupInterval.hashCode())) * 31)) * 31;
        String str2 = this.purchaseEnd;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.soldOutAt;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        StoreInformation storeInformation = this.storeInfoOrNull;
        int iE2 = k.e(k.e((iHashCode4 + (storeInformation == null ? 0 : storeInformation.hashCode())) * 31, 31, this.favorite), 31, this.subscribedForNotification);
        String str4 = this.sharingUrl;
        int iB = k.b(this.userPurchaseLimit, (iE2 + (str4 == null ? 0 : str4.hashCode())) * 31, 31);
        String str5 = this.nextSalesWindowPurchaseStart;
        int iE3 = k.e((this.itemType.hashCode() + ((iB + (str5 == null ? 0 : str5.hashCode())) * 31)) * 31, 31, this.isSelected);
        String str6 = this.reservationBlockedUntil;
        int iHashCode5 = (iE3 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List<ItemTagInfo> list = this.itemTags;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        ItemCardType itemCardType = this.itemCardType;
        int iHashCode7 = (iHashCode6 + (itemCardType == null ? 0 : itemCardType.hashCode())) * 31;
        Ingredients ingredients = this.ingredients;
        int iHashCode8 = (iHashCode7 + (ingredients == null ? 0 : ingredients.hashCode())) * 31;
        Boolean bool = this.matchesFilters;
        return iHashCode8 + (bool != null ? bool.hashCode() : 0);
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

    public void setInformation(@NotNull CharityItemInformation charityItemInformation) {
        charityItemInformation.getClass();
        this.information = charityItemInformation;
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
        String str = this.displayName;
        String str2 = this.displayDescription;
        double d3 = this.distance;
        CharityItemInformation charityItemInformation = this.information;
        int i11 = this.itemsAvailable;
        boolean z11 = this.itemIsNew;
        PickupInterval pickupInterval = this.pickupIntervalOrNull;
        PickupLocation pickupLocation = this.pickupLocation;
        String str3 = this.purchaseEnd;
        String str4 = this.soldOutAt;
        StoreInformation storeInformation = this.storeInfoOrNull;
        boolean z12 = this.favorite;
        boolean z13 = this.subscribedForNotification;
        String str5 = this.sharingUrl;
        int i12 = this.userPurchaseLimit;
        String str6 = this.nextSalesWindowPurchaseStart;
        ItemType itemType = this.itemType;
        boolean z14 = this.isSelected;
        String str7 = this.reservationBlockedUntil;
        List<ItemTagInfo> list = this.itemTags;
        ItemCardType itemCardType = this.itemCardType;
        Ingredients ingredients = this.ingredients;
        Boolean bool = this.matchesFilters;
        StringBuilder sbT = f.t("CharityItem(displayName=", str, ", displayDescription=", str2, ", distance=");
        sbT.append(d3);
        sbT.append(", information=");
        sbT.append(charityItemInformation);
        sbT.append(", itemsAvailable=");
        sbT.append(i11);
        sbT.append(", itemIsNew=");
        sbT.append(z11);
        sbT.append(", pickupIntervalOrNull=");
        sbT.append(pickupInterval);
        sbT.append(", pickupLocation=");
        sbT.append(pickupLocation);
        s.A(sbT, ", purchaseEnd=", str3, ", soldOutAt=", str4);
        sbT.append(", storeInfoOrNull=");
        sbT.append(storeInformation);
        sbT.append(", favorite=");
        sbT.append(z12);
        sbT.append(", subscribedForNotification=");
        sbT.append(z13);
        sbT.append(", sharingUrl=");
        sbT.append(str5);
        sbT.append(", userPurchaseLimit=");
        sbT.append(i12);
        sbT.append(", nextSalesWindowPurchaseStart=");
        sbT.append(str6);
        sbT.append(", itemType=");
        sbT.append(itemType);
        sbT.append(", isSelected=");
        sbT.append(z14);
        sbT.append(", reservationBlockedUntil=");
        sbT.append(str7);
        sbT.append(", itemTags=");
        sbT.append(list);
        sbT.append(", itemCardType=");
        sbT.append(itemCardType);
        sbT.append(", ingredients=");
        sbT.append(ingredients);
        sbT.append(", matchesFilters=");
        sbT.append(bool);
        sbT.append(")");
        return sbT.toString();
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
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/item/response/CharityItem$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/item/response/CharityItem;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return CharityItem$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CharityItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r24v2, types: [java.lang.Boolean] */
        /* JADX WARN: Type inference failed for: r2v1 */
        /* JADX WARN: Type inference failed for: r2v11 */
        /* JADX WARN: Type inference failed for: r2v2, types: [int] */
        @Override // android.os.Parcelable.Creator
        public final CharityItem createFromParcel(Parcel parcel) {
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
            CharityItemInformation charityItemInformationCreateFromParcel = CharityItemInformation.CREATOR.createFromParcel(parcel);
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
            Ingredients ingredients = (Ingredients) (parcel.readInt() == 0 ? arrayList3 : Ingredients.CREATOR.createFromParcel(parcel));
            if (parcel.readInt() == 0) {
                objValueOf = arrayList3;
            } else {
                if (parcel.readInt() != 0) {
                    z15 = true;
                }
                objValueOf = Boolean.valueOf(z15);
            }
            return new CharityItem(str, str2, d11, charityItemInformationCreateFromParcel, i11, z13, pickupIntervalCreateFromParcel, pickupLocationCreateFromParcel, string3, string4, storeInformationCreateFromParcel, z14, z12, string5, i12, string6, itemTypeValueOf, false, string7, arrayList2, itemCardType, ingredients, objValueOf, 131072, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CharityItem[] newArray(int i11) {
            return new CharityItem[i11];
        }
    }

    @Override // com.app.tgtg.model.remote.item.response.BasicItem
    @NotNull
    public CharityItemInformation getInformation() {
        return this.information;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CharityItem(@NotNull String str, @Nullable String str2, double d3, @NotNull CharityItemInformation charityItemInformation, int i11, boolean z11, @Nullable PickupInterval pickupInterval, @NotNull PickupLocation pickupLocation, @Nullable String str3, @Nullable String str4, @Nullable StoreInformation storeInformation, boolean z12, boolean z13, @Nullable String str5, int i12, @Nullable String str6, @NotNull ItemType itemType, boolean z14, @Nullable String str7, @Nullable List<ItemTagInfo> list, @Nullable ItemCardType itemCardType, @Nullable Ingredients ingredients, @Nullable Boolean bool) {
        super(null);
        str.getClass();
        charityItemInformation.getClass();
        pickupLocation.getClass();
        itemType.getClass();
        this.displayName = str;
        this.displayDescription = str2;
        this.distance = d3;
        this.information = charityItemInformation;
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

    public /* synthetic */ CharityItem(String str, String str2, double d3, CharityItemInformation charityItemInformation, int i11, boolean z11, PickupInterval pickupInterval, PickupLocation pickupLocation, String str3, String str4, StoreInformation storeInformation, boolean z12, boolean z13, String str5, int i12, String str6, ItemType itemType, boolean z14, String str7, List list, ItemCardType itemCardType, Ingredients ingredients, Boolean bool, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? 0.0d : d3, charityItemInformation, (i13 & 16) != 0 ? 0 : i11, (i13 & 32) != 0 ? false : z11, (i13 & 64) != 0 ? null : pickupInterval, (i13 & 128) != 0 ? new PickupLocation((Address) null, (String) null, (LatLngInfo) null, 7, (DefaultConstructorMarker) null) : pickupLocation, (i13 & 256) != 0 ? null : str3, (i13 & 512) != 0 ? null : str4, (i13 & 1024) != 0 ? null : storeInformation, (i13 & NewHope.SENDB_BYTES) != 0 ? false : z12, (i13 & 4096) != 0 ? false : z13, (i13 & 8192) != 0 ? null : str5, (i13 & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) != 0 ? 0 : i12, (32768 & i13) != 0 ? null : str6, (65536 & i13) != 0 ? ItemType.CHARITY : itemType, (131072 & i13) != 0 ? false : z14, (262144 & i13) != 0 ? null : str7, (524288 & i13) != 0 ? null : list, (1048576 & i13) != 0 ? null : itemCardType, (2097152 & i13) != 0 ? null : ingredients, (i13 & 4194304) != 0 ? Boolean.TRUE : bool);
    }
}
