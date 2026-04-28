package com.app.tgtg.model.remote.item;

import android.os.Parcel;
import android.os.Parcelable;
import b3.i;
import com.app.tgtg.model.remote.StoreId;
import com.app.tgtg.model.remote.StoreId$$serializer;
import com.app.tgtg.model.remote.item.response.BasicItem;
import cu.a;
import e0.f;
import i90.g;
import i90.h;
import j4.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.d;
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
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\"\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bX\b\u0087\b\u0018\u0000 µ\u00012\u00020\u0001:\u0004¶\u0001µ\u0001B\u0093\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\b\b\u0002\u0010\"\u001a\u00020\u000e\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b$\u0010%Bû\u0001\b\u0010\u0012\u0006\u0010'\u001a\u00020&\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0018\u001a\u00020\u000e\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\u0006\u0010\"\u001a\u00020\u000e\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b$\u0010*J\r\u0010+\u001a\u00020&¢\u0006\u0004\b+\u0010,J\u001d\u00101\u001a\u0002002\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020&¢\u0006\u0004\b1\u00102J\u0012\u00105\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b3\u00104J\u0012\u00106\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b6\u00104J\u0012\u00107\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b7\u00104J\u0012\u00108\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b8\u00104J\u0012\u00109\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b9\u00104J\u0012\u0010:\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b:\u00104J\u0010\u0010;\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b;\u0010<J\u0018\u0010=\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b=\u0010>J\u0018\u0010?\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b?\u0010>J\u0010\u0010@\u001a\u00020\u0015HÆ\u0003¢\u0006\u0004\b@\u0010AJ\u0010\u0010B\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\bB\u0010<J\u0012\u0010C\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bC\u00104J\u0012\u0010D\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bD\u00104J\u0012\u0010E\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bE\u00104J\u0012\u0010F\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0004\bF\u0010GJ\u0012\u0010H\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0004\bH\u0010IJ\u0012\u0010J\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0004\bJ\u0010KJ\u0010\u0010L\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\bL\u0010<J\u0012\u0010M\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bM\u00104J\u009c\u0002\u0010P\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00102\b\b\u0002\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u000e2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\b\b\u0002\u0010\"\u001a\u00020\u000e2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\bN\u0010OJ\u0010\u0010Q\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\bQ\u00104J\u0010\u0010R\u001a\u00020&HÖ\u0001¢\u0006\u0004\bR\u0010,J\u001a\u0010U\u001a\u00020\u000e2\b\u0010T\u001a\u0004\u0018\u00010SHÖ\u0003¢\u0006\u0004\bU\u0010VJ\u0012\u0010W\u001a\u0004\u0018\u00010\tHÂ\u0003¢\u0006\u0004\bW\u0010XJ\u0012\u0010Y\u001a\u0004\u0018\u00010\u000bHÂ\u0003¢\u0006\u0004\bY\u0010ZJ\u0012\u0010[\u001a\u0004\u0018\u00010\u000bHÂ\u0003¢\u0006\u0004\b[\u0010ZJ'\u0010c\u001a\u0002002\u0006\u0010\\\u001a\u00020\u00002\u0006\u0010^\u001a\u00020]2\u0006\u0010`\u001a\u00020_H\u0001¢\u0006\u0004\ba\u0010bR*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010d\u0012\u0004\bh\u0010i\u001a\u0004\be\u00104\"\u0004\bf\u0010gR*\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010d\u0012\u0004\bl\u0010i\u001a\u0004\bj\u00104\"\u0004\bk\u0010gR*\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0006\u0010d\u0012\u0004\bo\u0010i\u001a\u0004\bm\u00104\"\u0004\bn\u0010gR*\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0007\u0010d\u0012\u0004\br\u0010i\u001a\u0004\bp\u00104\"\u0004\bq\u0010gR*\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\b\u0010d\u0012\u0004\bu\u0010i\u001a\u0004\bs\u00104\"\u0004\bt\u0010gR\u001e\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\n\u0010v\u0012\u0004\bw\u0010iR\u001e\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\f\u0010x\u0012\u0004\by\u0010iR*\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\r\u0010d\u0012\u0004\b|\u0010i\u001a\u0004\bz\u00104\"\u0004\b{\u0010gR*\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u001a\n\u0004\b\u000f\u0010}\u0012\u0005\b\u0081\u0001\u0010i\u001a\u0004\b~\u0010<\"\u0005\b\u007f\u0010\u0080\u0001R5\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u001d\n\u0005\b\u0012\u0010\u0082\u0001\u0012\u0005\b\u0086\u0001\u0010i\u001a\u0005\b\u0083\u0001\u0010>\"\u0006\b\u0084\u0001\u0010\u0085\u0001R5\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u001d\n\u0005\b\u0014\u0010\u0082\u0001\u0012\u0005\b\u0089\u0001\u0010i\u001a\u0005\b\u0087\u0001\u0010>\"\u0006\b\u0088\u0001\u0010\u0085\u0001R-\u0010\u0016\u001a\u00020\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u001d\n\u0005\b\u0016\u0010\u008a\u0001\u0012\u0005\b\u008e\u0001\u0010i\u001a\u0005\b\u008b\u0001\u0010A\"\u0006\b\u008c\u0001\u0010\u008d\u0001R\u001f\u0010\u0017\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\r\n\u0004\b\u0017\u0010x\u0012\u0005\b\u008f\u0001\u0010iR+\u0010\u0018\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u001b\n\u0004\b\u0018\u0010}\u0012\u0005\b\u0091\u0001\u0010i\u001a\u0004\b\u0018\u0010<\"\u0006\b\u0090\u0001\u0010\u0080\u0001R-\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u001b\n\u0004\b\u0019\u0010d\u0012\u0005\b\u0094\u0001\u0010i\u001a\u0005\b\u0092\u0001\u00104\"\u0005\b\u0093\u0001\u0010gR-\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u001b\n\u0004\b\u001a\u0010d\u0012\u0005\b\u0097\u0001\u0010i\u001a\u0005\b\u0095\u0001\u00104\"\u0005\b\u0096\u0001\u0010gR-\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u001b\n\u0004\b\u001b\u0010d\u0012\u0005\b\u009a\u0001\u0010i\u001a\u0005\b\u0098\u0001\u00104\"\u0005\b\u0099\u0001\u0010gR/\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u001d\n\u0005\b\u001d\u0010\u009b\u0001\u0012\u0005\b\u009f\u0001\u0010i\u001a\u0005\b\u009c\u0001\u0010G\"\u0006\b\u009d\u0001\u0010\u009e\u0001R/\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u001d\n\u0005\b\u001f\u0010 \u0001\u0012\u0005\b¤\u0001\u0010i\u001a\u0005\b¡\u0001\u0010I\"\u0006\b¢\u0001\u0010£\u0001R/\u0010!\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0087\u000e¢\u0006\u001d\n\u0005\b!\u0010¥\u0001\u0012\u0005\b©\u0001\u0010i\u001a\u0005\b¦\u0001\u0010K\"\u0006\b§\u0001\u0010¨\u0001R+\u0010\"\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u001b\n\u0004\b\"\u0010}\u0012\u0005\bª\u0001\u0010i\u001a\u0004\b\"\u0010<\"\u0006\b§\u0001\u0010\u0080\u0001R$\u0010#\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b#\u0010d\u0012\u0005\b¬\u0001\u0010i\u001a\u0005\b«\u0001\u00104R\u0013\u0010®\u0001\u001a\u00020\t8F¢\u0006\u0007\u001a\u0005\b\u00ad\u0001\u0010XR\u0013\u0010°\u0001\u001a\u00020\u000b8F¢\u0006\u0007\u001a\u0005\b¯\u0001\u0010ZR\u0013\u0010²\u0001\u001a\u00020\u000b8F¢\u0006\u0007\u001a\u0005\b±\u0001\u0010ZR\u0015\u0010´\u0001\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0007\u001a\u0005\b³\u0001\u00104¨\u0006·\u0001"}, d2 = {"Lcom/app/tgtg/model/remote/item/StoreInformation;", "Landroid/os/Parcelable;", "Lcom/app/tgtg/model/remote/StoreId;", "storeId", "", "storeName", "branch", "taxIdentifier", "website", "Lcom/app/tgtg/model/remote/item/StoreLocation;", "_storeLocation", "Lcom/app/tgtg/model/remote/item/Picture;", "_logoPicture", "storeTimeZone", "", "hidden", "", "Lcom/app/tgtg/model/remote/item/response/BasicItem;", "items", "Lcom/app/tgtg/model/remote/item/Milestone;", "milestones", "", "distance", "_coverImage", "isManufacturer", "description", "email", "phoneNumber", "Lcom/app/tgtg/model/remote/item/DeliveryMethod;", "deliveryMethod", "Lcom/app/tgtg/model/remote/item/StoreLegalInformation;", "storeLegalInformation", "Lcom/app/tgtg/model/remote/item/LocalHero;", "localHero", "isLocalHero", "directions", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/item/StoreLocation;Lcom/app/tgtg/model/remote/item/Picture;Ljava/lang/String;ZLjava/util/List;Ljava/util/List;DLcom/app/tgtg/model/remote/item/Picture;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/item/DeliveryMethod;Lcom/app/tgtg/model/remote/item/StoreLegalInformation;Lcom/app/tgtg/model/remote/item/LocalHero;ZLjava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/item/StoreLocation;Lcom/app/tgtg/model/remote/item/Picture;Ljava/lang/String;ZLjava/util/List;Ljava/util/List;DLcom/app/tgtg/model/remote/item/Picture;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/item/DeliveryMethod;Lcom/app/tgtg/model/remote/item/StoreLegalInformation;Lcom/app/tgtg/model/remote/item/LocalHero;ZLjava/lang/String;Lm90/m1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1-7QsYvu8", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component8", "component9", "()Z", "component10", "()Ljava/util/List;", "component11", "component12", "()D", "component14", "component15", "component16", "component17", "component18", "()Lcom/app/tgtg/model/remote/item/DeliveryMethod;", "component19", "()Lcom/app/tgtg/model/remote/item/StoreLegalInformation;", "component20", "()Lcom/app/tgtg/model/remote/item/LocalHero;", "component21", "component22", "copy-7qE-lHQ", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/item/StoreLocation;Lcom/app/tgtg/model/remote/item/Picture;Ljava/lang/String;ZLjava/util/List;Ljava/util/List;DLcom/app/tgtg/model/remote/item/Picture;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/item/DeliveryMethod;Lcom/app/tgtg/model/remote/item/StoreLegalInformation;Lcom/app/tgtg/model/remote/item/LocalHero;ZLjava/lang/String;)Lcom/app/tgtg/model/remote/item/StoreInformation;", "copy", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "component6", "()Lcom/app/tgtg/model/remote/item/StoreLocation;", "component7", "()Lcom/app/tgtg/model/remote/item/Picture;", "component13", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "write$Self$app", "(Lcom/app/tgtg/model/remote/item/StoreInformation;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getStoreId-7QsYvu8", "setStoreId-A-HFjaE", "(Ljava/lang/String;)V", "getStoreId-7QsYvu8$annotations", "()V", "getStoreName", "setStoreName", "getStoreName$annotations", "getBranch", "setBranch", "getBranch$annotations", "getTaxIdentifier", "setTaxIdentifier", "getTaxIdentifier$annotations", "getWebsite", "setWebsite", "getWebsite$annotations", "Lcom/app/tgtg/model/remote/item/StoreLocation;", "get_storeLocation$annotations", "Lcom/app/tgtg/model/remote/item/Picture;", "get_logoPicture$annotations", "getStoreTimeZone", "setStoreTimeZone", "getStoreTimeZone$annotations", "Z", "getHidden", "setHidden", "(Z)V", "getHidden$annotations", "Ljava/util/List;", "getItems", "setItems", "(Ljava/util/List;)V", "getItems$annotations", "getMilestones", "setMilestones", "getMilestones$annotations", "D", "getDistance", "setDistance", "(D)V", "getDistance$annotations", "get_coverImage$annotations", "setManufacturer", "isManufacturer$annotations", "getDescription", "setDescription", "getDescription$annotations", "getEmail", "setEmail", "getEmail$annotations", "getPhoneNumber", "setPhoneNumber", "getPhoneNumber$annotations", "Lcom/app/tgtg/model/remote/item/DeliveryMethod;", "getDeliveryMethod", "setDeliveryMethod", "(Lcom/app/tgtg/model/remote/item/DeliveryMethod;)V", "getDeliveryMethod$annotations", "Lcom/app/tgtg/model/remote/item/StoreLegalInformation;", "getStoreLegalInformation", "setStoreLegalInformation", "(Lcom/app/tgtg/model/remote/item/StoreLegalInformation;)V", "getStoreLegalInformation$annotations", "Lcom/app/tgtg/model/remote/item/LocalHero;", "getLocalHero", "setLocalHero", "(Lcom/app/tgtg/model/remote/item/LocalHero;)V", "getLocalHero$annotations", "isLocalHero$annotations", "getDirections", "getDirections$annotations", "getStoreLocation", "storeLocation", "getLogoPicture", "logoPicture", "getCoverImage", "coverImage", "getStoreNameAndBranch", "storeNameAndBranch", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class StoreInformation implements Parcelable {

    @NotNull
    private static final j[] $childSerializers;

    @Nullable
    private Picture _coverImage;

    @Nullable
    private Picture _logoPicture;

    @Nullable
    private StoreLocation _storeLocation;

    @Nullable
    private String branch;

    @Nullable
    private DeliveryMethod deliveryMethod;

    @Nullable
    private String description;

    @Nullable
    private final String directions;
    private double distance;

    @Nullable
    private String email;
    private boolean hidden;
    private boolean isLocalHero;
    private boolean isManufacturer;

    @Nullable
    private List<? extends BasicItem> items;

    @Nullable
    private LocalHero localHero;

    @Nullable
    private List<Milestone> milestones;

    @Nullable
    private String phoneNumber;

    @Nullable
    private String storeId;

    @Nullable
    private StoreLegalInformation storeLegalInformation;

    @Nullable
    private String storeName;

    @Nullable
    private String storeTimeZone;

    @Nullable
    private String taxIdentifier;

    @Nullable
    private String website;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<StoreInformation> CREATOR = new Creator();

    static {
        m mVar = m.PUBLICATION;
        $childSerializers = new j[]{null, null, null, null, null, null, null, null, null, l.a(mVar, new a(8)), l.a(mVar, new a(9)), null, null, null, null, null, null, null, null, null, null, null};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ StoreInformation(String str, String str2, String str3, String str4, String str5, StoreLocation storeLocation, Picture picture, String str6, boolean z11, List list, List list2, double d3, Picture picture2, boolean z12, String str7, String str8, String str9, DeliveryMethod deliveryMethod, StoreLegalInformation storeLegalInformation, LocalHero localHero, boolean z13, String str10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        String str11 = (i11 & 1) != 0 ? null : str;
        String str12 = (i11 & 2) != 0 ? null : str2;
        String str13 = (i11 & 4) != 0 ? null : str3;
        String str14 = (i11 & 8) != 0 ? null : str4;
        String str15 = (i11 & 16) != 0 ? null : str5;
        StoreLocation storeLocation2 = (i11 & 32) != 0 ? null : storeLocation;
        Picture picture3 = (i11 & 64) != 0 ? null : picture;
        String str16 = (i11 & 128) != 0 ? null : str6;
        boolean z14 = (i11 & 256) != 0 ? false : z11;
        List list3 = (i11 & 512) != 0 ? null : list;
        List list4 = (i11 & 1024) != 0 ? null : list2;
        double d11 = (i11 & NewHope.SENDB_BYTES) != 0 ? 0.0d : d3;
        Picture picture4 = (i11 & 4096) != 0 ? null : picture2;
        boolean z15 = (i11 & 8192) != 0 ? false : z12;
        String str17 = str11;
        String str18 = (i11 & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) != 0 ? null : str7;
        String str19 = (i11 & 32768) != 0 ? null : str8;
        String str20 = (i11 & 65536) != 0 ? null : str9;
        DeliveryMethod deliveryMethod2 = (i11 & 131072) != 0 ? null : deliveryMethod;
        StoreLegalInformation storeLegalInformation2 = (i11 & 262144) != 0 ? null : storeLegalInformation;
        LocalHero localHero2 = (i11 & 524288) != 0 ? null : localHero;
        boolean z16 = (i11 & 1048576) != 0 ? false : z13;
        Picture picture5 = picture4;
        String str21 = str12;
        String str22 = str13;
        String str23 = str14;
        String str24 = str15;
        StoreLocation storeLocation3 = storeLocation2;
        Picture picture6 = picture3;
        String str25 = str16;
        boolean z17 = z14;
        boolean z18 = z15;
        List list5 = list3;
        List list6 = list4;
        double d12 = d11;
        this(str17, str21, str22, str23, str24, storeLocation3, picture6, str25, z17, list5, list6, d12, picture5, z18, str18, str19, str20, deliveryMethod2, storeLegalInformation2, localHero2, z16, (i11 & 2097152) != 0 ? null : str10, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(BasicItem.INSTANCE.serializer(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new d(Milestone$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    private final Picture get_coverImage() {
        return this._coverImage;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    private final StoreLocation get_storeLocation() {
        return this._storeLocation;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    private final Picture get_logoPicture() {
        return this._logoPicture;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-7qE-lHQ$default, reason: not valid java name */
    public static /* synthetic */ StoreInformation m366copy7qElHQ$default(StoreInformation storeInformation, String str, String str2, String str3, String str4, String str5, StoreLocation storeLocation, Picture picture, String str6, boolean z11, List list, List list2, double d3, Picture picture2, boolean z12, String str7, String str8, String str9, DeliveryMethod deliveryMethod, StoreLegalInformation storeLegalInformation, LocalHero localHero, boolean z13, String str10, int i11, Object obj) {
        String str11;
        boolean z14;
        String str12 = (i11 & 1) != 0 ? storeInformation.storeId : str;
        String str13 = (i11 & 2) != 0 ? storeInformation.storeName : str2;
        String str14 = (i11 & 4) != 0 ? storeInformation.branch : str3;
        String str15 = (i11 & 8) != 0 ? storeInformation.taxIdentifier : str4;
        String str16 = (i11 & 16) != 0 ? storeInformation.website : str5;
        StoreLocation storeLocation2 = (i11 & 32) != 0 ? storeInformation._storeLocation : storeLocation;
        Picture picture3 = (i11 & 64) != 0 ? storeInformation._logoPicture : picture;
        String str17 = (i11 & 128) != 0 ? storeInformation.storeTimeZone : str6;
        boolean z15 = (i11 & 256) != 0 ? storeInformation.hidden : z11;
        List list3 = (i11 & 512) != 0 ? storeInformation.items : list;
        List list4 = (i11 & 1024) != 0 ? storeInformation.milestones : list2;
        double d11 = (i11 & NewHope.SENDB_BYTES) != 0 ? storeInformation.distance : d3;
        Picture picture4 = (i11 & 4096) != 0 ? storeInformation._coverImage : picture2;
        String str18 = str12;
        boolean z16 = (i11 & 8192) != 0 ? storeInformation.isManufacturer : z12;
        String str19 = (i11 & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) != 0 ? storeInformation.description : str7;
        String str20 = (i11 & 32768) != 0 ? storeInformation.email : str8;
        String str21 = (i11 & 65536) != 0 ? storeInformation.phoneNumber : str9;
        DeliveryMethod deliveryMethod2 = (i11 & 131072) != 0 ? storeInformation.deliveryMethod : deliveryMethod;
        StoreLegalInformation storeLegalInformation2 = (i11 & 262144) != 0 ? storeInformation.storeLegalInformation : storeLegalInformation;
        LocalHero localHero2 = (i11 & 524288) != 0 ? storeInformation.localHero : localHero;
        boolean z17 = (i11 & 1048576) != 0 ? storeInformation.isLocalHero : z13;
        if ((i11 & 2097152) != 0) {
            z14 = z17;
            str11 = storeInformation.directions;
        } else {
            str11 = str10;
            z14 = z17;
        }
        return storeInformation.m369copy7qElHQ(str18, str13, str14, str15, str16, storeLocation2, picture3, str17, z15, list3, list4, d11, picture4, z16, str19, str20, str21, deliveryMethod2, storeLegalInformation2, localHero2, z14, str11);
    }

    public static final /* synthetic */ void write$Self$app(StoreInformation self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        if (output.C(serialDesc) || self.storeId != null) {
            StoreId$$serializer storeId$$serializer = StoreId$$serializer.INSTANCE;
            String str = self.storeId;
            output.r(serialDesc, 0, storeId$$serializer, str != null ? StoreId.m269boximpl(str) : null);
        }
        if (output.C(serialDesc) || self.storeName != null) {
            output.r(serialDesc, 1, r1.f29848a, self.storeName);
        }
        if (output.C(serialDesc) || self.branch != null) {
            output.r(serialDesc, 2, r1.f29848a, self.branch);
        }
        if (output.C(serialDesc) || self.taxIdentifier != null) {
            output.r(serialDesc, 3, r1.f29848a, self.taxIdentifier);
        }
        if (output.C(serialDesc) || self.website != null) {
            output.r(serialDesc, 4, r1.f29848a, self.website);
        }
        if (output.C(serialDesc) || self._storeLocation != null) {
            output.r(serialDesc, 5, StoreLocation$$serializer.INSTANCE, self._storeLocation);
        }
        if (output.C(serialDesc) || self._logoPicture != null) {
            output.r(serialDesc, 6, Picture$$serializer.INSTANCE, self._logoPicture);
        }
        if (output.C(serialDesc) || self.storeTimeZone != null) {
            output.r(serialDesc, 7, r1.f29848a, self.storeTimeZone);
        }
        if (output.C(serialDesc) || self.hidden) {
            output.p(serialDesc, 8, self.hidden);
        }
        if (output.C(serialDesc) || self.items != null) {
            output.r(serialDesc, 9, (KSerializer) jVarArr[9].getValue(), self.items);
        }
        if (output.C(serialDesc) || self.milestones != null) {
            output.r(serialDesc, 10, (KSerializer) jVarArr[10].getValue(), self.milestones);
        }
        if (output.C(serialDesc) || Double.compare(self.distance, 0.0d) != 0) {
            output.z(serialDesc, 11, self.distance);
        }
        if (output.C(serialDesc) || self._coverImage != null) {
            output.r(serialDesc, 12, Picture$$serializer.INSTANCE, self._coverImage);
        }
        if (output.C(serialDesc) || self.isManufacturer) {
            output.p(serialDesc, 13, self.isManufacturer);
        }
        if (output.C(serialDesc) || self.description != null) {
            output.r(serialDesc, 14, r1.f29848a, self.description);
        }
        if (output.C(serialDesc) || self.email != null) {
            output.r(serialDesc, 15, r1.f29848a, self.email);
        }
        if (output.C(serialDesc) || self.phoneNumber != null) {
            output.r(serialDesc, 16, r1.f29848a, self.phoneNumber);
        }
        if (output.C(serialDesc) || self.deliveryMethod != null) {
            output.r(serialDesc, 17, DeliveryMethodSerializer.INSTANCE, self.deliveryMethod);
        }
        if (output.C(serialDesc) || self.storeLegalInformation != null) {
            output.r(serialDesc, 18, StoreLegalInformation$$serializer.INSTANCE, self.storeLegalInformation);
        }
        if (output.C(serialDesc) || self.localHero != null) {
            output.r(serialDesc, 19, LocalHero$$serializer.INSTANCE, self.localHero);
        }
        if (output.C(serialDesc) || self.isLocalHero) {
            output.p(serialDesc, 20, self.isLocalHero);
        }
        if (!output.C(serialDesc) && self.directions == null) {
            return;
        }
        output.r(serialDesc, 21, r1.f29848a, self.directions);
    }

    @Nullable
    /* JADX INFO: renamed from: component1-7QsYvu8, reason: not valid java name and from getter */
    public final String getStoreId() {
        return this.storeId;
    }

    @Nullable
    public final List<BasicItem> component10() {
        return this.items;
    }

    @Nullable
    public final List<Milestone> component11() {
        return this.milestones;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final double getDistance() {
        return this.distance;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final boolean getIsManufacturer() {
        return this.isManufacturer;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final DeliveryMethod getDeliveryMethod() {
        return this.deliveryMethod;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final StoreLegalInformation getStoreLegalInformation() {
        return this.storeLegalInformation;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStoreName() {
        return this.storeName;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final LocalHero getLocalHero() {
        return this.localHero;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final boolean getIsLocalHero() {
        return this.isLocalHero;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getDirections() {
        return this.directions;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBranch() {
        return this.branch;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTaxIdentifier() {
        return this.taxIdentifier;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getWebsite() {
        return this.website;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getStoreTimeZone() {
        return this.storeTimeZone;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getHidden() {
        return this.hidden;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-7qE-lHQ, reason: not valid java name */
    public final StoreInformation m369copy7qElHQ(@Nullable String storeId, @Nullable String storeName, @Nullable String branch, @Nullable String taxIdentifier, @Nullable String website, @Nullable StoreLocation _storeLocation, @Nullable Picture _logoPicture, @Nullable String storeTimeZone, boolean hidden, @Nullable List<? extends BasicItem> items, @Nullable List<Milestone> milestones, double distance, @Nullable Picture _coverImage, boolean isManufacturer, @Nullable String description, @Nullable String email, @Nullable String phoneNumber, @Nullable DeliveryMethod deliveryMethod, @Nullable StoreLegalInformation storeLegalInformation, @Nullable LocalHero localHero, boolean isLocalHero, @Nullable String directions) {
        return new StoreInformation(storeId, storeName, branch, taxIdentifier, website, _storeLocation, _logoPicture, storeTimeZone, hidden, items, milestones, distance, _coverImage, isManufacturer, description, email, phoneNumber, deliveryMethod, storeLegalInformation, localHero, isLocalHero, directions, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.tgtg.model.remote.item.StoreInformation.equals(java.lang.Object):boolean");
    }

    @Nullable
    public final String getBranch() {
        return this.branch;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final Picture getCoverImage() {
        if (this._coverImage == null) {
            this._coverImage = new Picture((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }
        Picture picture = this._coverImage;
        picture.getClass();
        return picture;
    }

    @Nullable
    public final DeliveryMethod getDeliveryMethod() {
        return this.deliveryMethod;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final String getDirections() {
        return this.directions;
    }

    public final double getDistance() {
        return this.distance;
    }

    @Nullable
    public final String getEmail() {
        return this.email;
    }

    public final boolean getHidden() {
        return this.hidden;
    }

    @Nullable
    public final List<BasicItem> getItems() {
        return this.items;
    }

    @Nullable
    public final LocalHero getLocalHero() {
        return this.localHero;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final Picture getLogoPicture() {
        if (this._logoPicture == null) {
            this._logoPicture = new Picture((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }
        Picture picture = this._logoPicture;
        picture.getClass();
        return picture;
    }

    @Nullable
    public final List<Milestone> getMilestones() {
        return this.milestones;
    }

    @Nullable
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    @Nullable
    /* JADX INFO: renamed from: getStoreId-7QsYvu8, reason: not valid java name */
    public final String m370getStoreId7QsYvu8() {
        return this.storeId;
    }

    @Nullable
    public final StoreLegalInformation getStoreLegalInformation() {
        return this.storeLegalInformation;
    }

    @NotNull
    public final StoreLocation getStoreLocation() {
        if (this._storeLocation == null) {
            this._storeLocation = new StoreLocation((Address) null, (String) null, (LatLngInfo) null, 7, (DefaultConstructorMarker) null);
        }
        StoreLocation storeLocation = this._storeLocation;
        storeLocation.getClass();
        return storeLocation;
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
        String str2 = this.branch;
        return (str2 == null || StringsKt.H(str2)) ? this.storeName : k.m(this.storeName, " - ", this.branch);
    }

    @Nullable
    public final String getStoreTimeZone() {
        return this.storeTimeZone;
    }

    @Nullable
    public final String getTaxIdentifier() {
        return this.taxIdentifier;
    }

    @Nullable
    public final String getWebsite() {
        return this.website;
    }

    public int hashCode() {
        String str = this.storeId;
        int iM274hashCodeimpl = (str == null ? 0 : StoreId.m274hashCodeimpl(str)) * 31;
        String str2 = this.storeName;
        int iHashCode = (iM274hashCodeimpl + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.branch;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.taxIdentifier;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.website;
        int iHashCode4 = (iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        StoreLocation storeLocation = this._storeLocation;
        int iHashCode5 = (iHashCode4 + (storeLocation == null ? 0 : storeLocation.hashCode())) * 31;
        Picture picture = this._logoPicture;
        int iHashCode6 = (iHashCode5 + (picture == null ? 0 : picture.hashCode())) * 31;
        String str6 = this.storeTimeZone;
        int iE = k.e((iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.hidden);
        List<? extends BasicItem> list = this.items;
        int iHashCode7 = (iE + (list == null ? 0 : list.hashCode())) * 31;
        List<Milestone> list2 = this.milestones;
        int iB = s.b(this.distance, (iHashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31, 31);
        Picture picture2 = this._coverImage;
        int iE2 = k.e((iB + (picture2 == null ? 0 : picture2.hashCode())) * 31, 31, this.isManufacturer);
        String str7 = this.description;
        int iHashCode8 = (iE2 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.email;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.phoneNumber;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        DeliveryMethod deliveryMethod = this.deliveryMethod;
        int iHashCode11 = (iHashCode10 + (deliveryMethod == null ? 0 : deliveryMethod.hashCode())) * 31;
        StoreLegalInformation storeLegalInformation = this.storeLegalInformation;
        int iHashCode12 = (iHashCode11 + (storeLegalInformation == null ? 0 : storeLegalInformation.hashCode())) * 31;
        LocalHero localHero = this.localHero;
        int iE3 = k.e((iHashCode12 + (localHero == null ? 0 : localHero.hashCode())) * 31, 31, this.isLocalHero);
        String str10 = this.directions;
        return iE3 + (str10 != null ? str10.hashCode() : 0);
    }

    public final boolean isLocalHero() {
        return this.isLocalHero;
    }

    public final boolean isManufacturer() {
        return this.isManufacturer;
    }

    public final void setBranch(@Nullable String str) {
        this.branch = str;
    }

    public final void setDeliveryMethod(@Nullable DeliveryMethod deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }

    public final void setDescription(@Nullable String str) {
        this.description = str;
    }

    public final void setDistance(double d3) {
        this.distance = d3;
    }

    public final void setEmail(@Nullable String str) {
        this.email = str;
    }

    public final void setHidden(boolean z11) {
        this.hidden = z11;
    }

    public final void setItems(@Nullable List<? extends BasicItem> list) {
        this.items = list;
    }

    public final void setLocalHero(@Nullable LocalHero localHero) {
        this.localHero = localHero;
    }

    public final void setManufacturer(boolean z11) {
        this.isManufacturer = z11;
    }

    public final void setMilestones(@Nullable List<Milestone> list) {
        this.milestones = list;
    }

    public final void setPhoneNumber(@Nullable String str) {
        this.phoneNumber = str;
    }

    /* JADX INFO: renamed from: setStoreId-A-HFjaE, reason: not valid java name */
    public final void m371setStoreIdAHFjaE(@Nullable String str) {
        this.storeId = str;
    }

    public final void setStoreLegalInformation(@Nullable StoreLegalInformation storeLegalInformation) {
        this.storeLegalInformation = storeLegalInformation;
    }

    public final void setStoreName(@Nullable String str) {
        this.storeName = str;
    }

    public final void setStoreTimeZone(@Nullable String str) {
        this.storeTimeZone = str;
    }

    public final void setTaxIdentifier(@Nullable String str) {
        this.taxIdentifier = str;
    }

    public final void setWebsite(@Nullable String str) {
        this.website = str;
    }

    @NotNull
    public String toString() {
        String str = this.storeId;
        String strM275toStringimpl = str == null ? com.adyen.checkout.components.core.Address.ADDRESS_NULL_PLACEHOLDER : StoreId.m275toStringimpl(str);
        String str2 = this.storeName;
        String str3 = this.branch;
        String str4 = this.taxIdentifier;
        String str5 = this.website;
        StoreLocation storeLocation = this._storeLocation;
        Picture picture = this._logoPicture;
        String str6 = this.storeTimeZone;
        boolean z11 = this.hidden;
        List<? extends BasicItem> list = this.items;
        List<Milestone> list2 = this.milestones;
        double d3 = this.distance;
        Picture picture2 = this._coverImage;
        boolean z12 = this.isManufacturer;
        String str7 = this.description;
        String str8 = this.email;
        String str9 = this.phoneNumber;
        DeliveryMethod deliveryMethod = this.deliveryMethod;
        StoreLegalInformation storeLegalInformation = this.storeLegalInformation;
        LocalHero localHero = this.localHero;
        boolean z13 = this.isLocalHero;
        String str10 = this.directions;
        StringBuilder sbT = f.t("StoreInformation(storeId=", strM275toStringimpl, ", storeName=", str2, ", branch=");
        s.A(sbT, str3, ", taxIdentifier=", str4, ", website=");
        sbT.append(str5);
        sbT.append(", _storeLocation=");
        sbT.append(storeLocation);
        sbT.append(", _logoPicture=");
        sbT.append(picture);
        sbT.append(", storeTimeZone=");
        sbT.append(str6);
        sbT.append(", hidden=");
        sbT.append(z11);
        sbT.append(", items=");
        sbT.append(list);
        sbT.append(", milestones=");
        sbT.append(list2);
        sbT.append(", distance=");
        sbT.append(d3);
        sbT.append(", _coverImage=");
        sbT.append(picture2);
        sbT.append(", isManufacturer=");
        sbT.append(z12);
        s.A(sbT, ", description=", str7, ", email=", str8);
        sbT.append(", phoneNumber=");
        sbT.append(str9);
        sbT.append(", deliveryMethod=");
        sbT.append(deliveryMethod);
        sbT.append(", storeLegalInformation=");
        sbT.append(storeLegalInformation);
        sbT.append(", localHero=");
        sbT.append(localHero);
        sbT.append(", isLocalHero=");
        sbT.append(z13);
        sbT.append(", directions=");
        sbT.append(str10);
        sbT.append(")");
        return sbT.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        String str = this.storeId;
        if (str == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            StoreId.m276writeToParcelimpl(str, dest, flags);
        }
        dest.writeString(this.storeName);
        dest.writeString(this.branch);
        dest.writeString(this.taxIdentifier);
        dest.writeString(this.website);
        StoreLocation storeLocation = this._storeLocation;
        if (storeLocation == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            storeLocation.writeToParcel(dest, flags);
        }
        Picture picture = this._logoPicture;
        if (picture == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            picture.writeToParcel(dest, flags);
        }
        dest.writeString(this.storeTimeZone);
        dest.writeInt(this.hidden ? 1 : 0);
        List<? extends BasicItem> list = this.items;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = i.q(dest, 1, list);
            while (itQ.hasNext()) {
                dest.writeParcelable((Parcelable) itQ.next(), flags);
            }
        }
        List<Milestone> list2 = this.milestones;
        if (list2 == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ2 = i.q(dest, 1, list2);
            while (itQ2.hasNext()) {
                ((Milestone) itQ2.next()).writeToParcel(dest, flags);
            }
        }
        dest.writeDouble(this.distance);
        Picture picture2 = this._coverImage;
        if (picture2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            picture2.writeToParcel(dest, flags);
        }
        dest.writeInt(this.isManufacturer ? 1 : 0);
        dest.writeString(this.description);
        dest.writeString(this.email);
        dest.writeString(this.phoneNumber);
        DeliveryMethod deliveryMethod = this.deliveryMethod;
        if (deliveryMethod == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(deliveryMethod.name());
        }
        StoreLegalInformation storeLegalInformation = this.storeLegalInformation;
        if (storeLegalInformation == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            storeLegalInformation.writeToParcel(dest, flags);
        }
        LocalHero localHero = this.localHero;
        if (localHero == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            localHero.writeToParcel(dest, flags);
        }
        dest.writeInt(this.isLocalHero ? 1 : 0);
        dest.writeString(this.directions);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/item/StoreInformation$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/item/StoreInformation;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return StoreInformation$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public final void setLocalHero(boolean z11) {
        this.isLocalHero = z11;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<StoreInformation> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StoreInformation createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            parcel.getClass();
            StoreId storeIdCreateFromParcel = parcel.readInt() == 0 ? null : StoreId.CREATOR.createFromParcel(parcel);
            String strM277unboximpl = storeIdCreateFromParcel != null ? storeIdCreateFromParcel.m277unboximpl() : null;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            StoreLocation storeLocationCreateFromParcel = parcel.readInt() == 0 ? null : StoreLocation.CREATOR.createFromParcel(parcel);
            Picture pictureCreateFromParcel = parcel.readInt() == 0 ? null : Picture.CREATOR.createFromParcel(parcel);
            String string5 = parcel.readString();
            boolean z11 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList3.add(parcel.readParcelable(StoreInformation.class.getClassLoader()));
                }
                arrayList = arrayList3;
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                int iC = 0;
                while (iC != i13) {
                    iC = i.c(Milestone.CREATOR, parcel, arrayList2, iC, 1);
                }
            }
            return new StoreInformation(strM277unboximpl, string, string2, string3, string4, storeLocationCreateFromParcel, pictureCreateFromParcel, string5, z11, arrayList, arrayList2, parcel.readDouble(), parcel.readInt() == 0 ? null : Picture.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : DeliveryMethod.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : StoreLegalInformation.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : LocalHero.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readString(), null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StoreInformation[] newArray(int i11) {
            return new StoreInformation[i11];
        }
    }

    @g("branch")
    public static /* synthetic */ void getBranch$annotations() {
    }

    @g("delivery_method")
    public static /* synthetic */ void getDeliveryMethod$annotations() {
    }

    @g("description")
    public static /* synthetic */ void getDescription$annotations() {
    }

    @g("directions")
    public static /* synthetic */ void getDirections$annotations() {
    }

    @g("distance")
    public static /* synthetic */ void getDistance$annotations() {
    }

    @g("email")
    public static /* synthetic */ void getEmail$annotations() {
    }

    @g("hidden")
    public static /* synthetic */ void getHidden$annotations() {
    }

    @g("items")
    public static /* synthetic */ void getItems$annotations() {
    }

    @g("local_hero")
    public static /* synthetic */ void getLocalHero$annotations() {
    }

    @g("milestones")
    public static /* synthetic */ void getMilestones$annotations() {
    }

    @g("phone_number")
    public static /* synthetic */ void getPhoneNumber$annotations() {
    }

    @g("store_id")
    /* JADX INFO: renamed from: getStoreId-7QsYvu8$annotations, reason: not valid java name */
    public static /* synthetic */ void m367getStoreId7QsYvu8$annotations() {
    }

    @g("store_legal_information")
    public static /* synthetic */ void getStoreLegalInformation$annotations() {
    }

    @g("store_name")
    public static /* synthetic */ void getStoreName$annotations() {
    }

    @g("store_time_zone")
    public static /* synthetic */ void getStoreTimeZone$annotations() {
    }

    @g("tax_identifier")
    public static /* synthetic */ void getTaxIdentifier$annotations() {
    }

    @g("website")
    public static /* synthetic */ void getWebsite$annotations() {
    }

    @g("cover_picture")
    private static /* synthetic */ void get_coverImage$annotations() {
    }

    @g("logo_picture")
    private static /* synthetic */ void get_logoPicture$annotations() {
    }

    @g("store_location")
    private static /* synthetic */ void get_storeLocation$annotations() {
    }

    @g("is_local_hero")
    public static /* synthetic */ void isLocalHero$annotations() {
    }

    @g("is_manufacturer")
    public static /* synthetic */ void isManufacturer$annotations() {
    }

    public /* synthetic */ StoreInformation(String str, String str2, String str3, String str4, String str5, StoreLocation storeLocation, Picture picture, String str6, boolean z11, List list, List list2, double d3, Picture picture2, boolean z12, String str7, String str8, String str9, DeliveryMethod deliveryMethod, StoreLegalInformation storeLegalInformation, LocalHero localHero, boolean z13, String str10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, storeLocation, picture, str6, z11, list, list2, d3, picture2, z12, str7, str8, str9, deliveryMethod, storeLegalInformation, localHero, z13, str10);
    }

    private /* synthetic */ StoreInformation(int i11, String str, String str2, String str3, String str4, String str5, StoreLocation storeLocation, Picture picture, String str6, boolean z11, List list, List list2, double d3, Picture picture2, boolean z12, String str7, String str8, String str9, DeliveryMethod deliveryMethod, StoreLegalInformation storeLegalInformation, LocalHero localHero, boolean z13, String str10, m1 m1Var) {
        if ((i11 & 1) == 0) {
            this.storeId = null;
        } else {
            this.storeId = str;
        }
        if ((i11 & 2) == 0) {
            this.storeName = null;
        } else {
            this.storeName = str2;
        }
        if ((i11 & 4) == 0) {
            this.branch = null;
        } else {
            this.branch = str3;
        }
        if ((i11 & 8) == 0) {
            this.taxIdentifier = null;
        } else {
            this.taxIdentifier = str4;
        }
        if ((i11 & 16) == 0) {
            this.website = null;
        } else {
            this.website = str5;
        }
        if ((i11 & 32) == 0) {
            this._storeLocation = null;
        } else {
            this._storeLocation = storeLocation;
        }
        if ((i11 & 64) == 0) {
            this._logoPicture = null;
        } else {
            this._logoPicture = picture;
        }
        if ((i11 & 128) == 0) {
            this.storeTimeZone = null;
        } else {
            this.storeTimeZone = str6;
        }
        if ((i11 & 256) == 0) {
            this.hidden = false;
        } else {
            this.hidden = z11;
        }
        if ((i11 & 512) == 0) {
            this.items = null;
        } else {
            this.items = list;
        }
        if ((i11 & 1024) == 0) {
            this.milestones = null;
        } else {
            this.milestones = list2;
        }
        this.distance = (i11 & NewHope.SENDB_BYTES) == 0 ? 0.0d : d3;
        if ((i11 & 4096) == 0) {
            this._coverImage = null;
        } else {
            this._coverImage = picture2;
        }
        if ((i11 & 8192) == 0) {
            this.isManufacturer = false;
        } else {
            this.isManufacturer = z12;
        }
        if ((i11 & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) == 0) {
            this.description = null;
        } else {
            this.description = str7;
        }
        if ((32768 & i11) == 0) {
            this.email = null;
        } else {
            this.email = str8;
        }
        if ((65536 & i11) == 0) {
            this.phoneNumber = null;
        } else {
            this.phoneNumber = str9;
        }
        if ((131072 & i11) == 0) {
            this.deliveryMethod = null;
        } else {
            this.deliveryMethod = deliveryMethod;
        }
        if ((262144 & i11) == 0) {
            this.storeLegalInformation = null;
        } else {
            this.storeLegalInformation = storeLegalInformation;
        }
        if ((524288 & i11) == 0) {
            this.localHero = null;
        } else {
            this.localHero = localHero;
        }
        if ((1048576 & i11) == 0) {
            this.isLocalHero = false;
        } else {
            this.isLocalHero = z13;
        }
        if ((i11 & 2097152) == 0) {
            this.directions = null;
        } else {
            this.directions = str10;
        }
    }

    private StoreInformation(String str, String str2, String str3, String str4, String str5, StoreLocation storeLocation, Picture picture, String str6, boolean z11, List<? extends BasicItem> list, List<Milestone> list2, double d3, Picture picture2, boolean z12, String str7, String str8, String str9, DeliveryMethod deliveryMethod, StoreLegalInformation storeLegalInformation, LocalHero localHero, boolean z13, String str10) {
        this.storeId = str;
        this.storeName = str2;
        this.branch = str3;
        this.taxIdentifier = str4;
        this.website = str5;
        this._storeLocation = storeLocation;
        this._logoPicture = picture;
        this.storeTimeZone = str6;
        this.hidden = z11;
        this.items = list;
        this.milestones = list2;
        this.distance = d3;
        this._coverImage = picture2;
        this.isManufacturer = z12;
        this.description = str7;
        this.email = str8;
        this.phoneNumber = str9;
        this.deliveryMethod = deliveryMethod;
        this.storeLegalInformation = storeLegalInformation;
        this.localHero = localHero;
        this.isLocalHero = z13;
        this.directions = str10;
    }

    public /* synthetic */ StoreInformation(int i11, String str, String str2, String str3, String str4, String str5, StoreLocation storeLocation, Picture picture, String str6, boolean z11, List list, List list2, double d3, Picture picture2, boolean z12, String str7, String str8, String str9, DeliveryMethod deliveryMethod, StoreLegalInformation storeLegalInformation, LocalHero localHero, boolean z13, String str10, m1 m1Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, str, str2, str3, str4, str5, storeLocation, picture, str6, z11, list, list2, d3, picture2, z12, str7, str8, str9, deliveryMethod, storeLegalInformation, localHero, z13, str10, m1Var);
    }
}
