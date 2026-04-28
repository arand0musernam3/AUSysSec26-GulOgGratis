package com.app.tgtg.model.remote;

import android.os.Parcel;
import android.os.Parcelable;
import b3.i;
import com.app.tgtg.model.remote.item.LatLngInfo;
import com.app.tgtg.model.remote.item.LatLngInfo$$serializer;
import com.app.tgtg.model.remote.user.response.C2CReferralResponse;
import com.app.tgtg.model.remote.user.response.C2CReferralResponse$$serializer;
import com.app.tgtg.model.remote.user.response.charity.CharityUserDetails;
import com.app.tgtg.model.remote.user.response.charity.CharityUserDetails$$serializer;
import com.braze.Constants;
import gh.f;
import i90.g;
import i90.h;
import j4.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.d;
import m90.l0;
import m90.m1;
import m90.r1;
import mv.r0;
import n90.c;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import u70.j;
import u70.l;
import u70.m;
import w2.g0;
import wt.a;
import y9.w;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000§\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\bB\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0003\b©\u0001\b\u0087\b\u0018\u0000 Ä\u00022\u00020\u0001:\u0004Ä\u0002Å\u0002BÇ\u0004\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001d\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0014\u0012\b\b\u0002\u0010 \u001a\u00020\u0014\u0012\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!\u0012\u0010\b\u0002\u0010%\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010!\u0012\b\b\u0002\u0010&\u001a\u00020\u0014\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010(\u001a\u00020\u0014\u0012\u0010\b\u0002\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010)\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010/\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u000101\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u00105\u001a\u000204\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u00107\u001a\u00020\u0014\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u000108\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010;\u001a\u00020\u0014\u0012\b\b\u0002\u0010<\u001a\u00020\u0014\u0012\b\b\u0002\u0010=\u001a\u00020\u0014\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010>\u0012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010A\u001a\u00020\u0014¢\u0006\u0004\bB\u0010CB\u0087\u0004\b\u0010\u0012\u0006\u0010D\u001a\u00020\u001d\u0012\u0006\u0010E\u001a\u00020\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0014\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0014\u0012\u0006\u0010\u001c\u001a\u00020\u0014\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010\u001f\u001a\u00020\u0014\u0012\u0006\u0010 \u001a\u00020\u0014\u0012\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!\u0012\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010!\u0012\u0006\u0010&\u001a\u00020\u0014\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010(\u001a\u00020\u0014\u0012\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010)\u0012\b\u0010+\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010-\u001a\u0004\u0018\u00010,\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0002\u0012\b\u00100\u001a\u0004\u0018\u00010/\u0012\b\u00102\u001a\u0004\u0018\u000101\u0012\b\u00103\u001a\u0004\u0018\u00010\u0002\u0012\b\u00105\u001a\u0004\u0018\u000104\u0012\b\u00106\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u00107\u001a\u00020\u0014\u0012\b\u00109\u001a\u0004\u0018\u000108\u0012\b\u0010:\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010;\u001a\u00020\u0014\u0012\u0006\u0010<\u001a\u00020\u0014\u0012\u0006\u0010=\u001a\u00020\u0014\u0012\b\u0010?\u001a\u0004\u0018\u00010>\u0012\b\u0010@\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010A\u001a\u00020\u0014\u0012\b\u0010G\u001a\u0004\u0018\u00010F¢\u0006\u0004\bB\u0010HJ\r\u0010I\u001a\u00020\u0002¢\u0006\u0004\bI\u0010JJ\r\u0010L\u001a\u00020K¢\u0006\u0004\bL\u0010MJ\r\u0010N\u001a\u00020\u001d¢\u0006\u0004\bN\u0010OJ\u001d\u0010T\u001a\u00020S2\u0006\u0010Q\u001a\u00020P2\u0006\u0010R\u001a\u00020\u001d¢\u0006\u0004\bT\u0010UJ\u0012\u0010V\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bV\u0010JJ\u0012\u0010W\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bW\u0010JJ\u0012\u0010X\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bX\u0010JJ\u0012\u0010Y\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bY\u0010JJ\u0012\u0010Z\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bZ\u0010JJ\u0012\u0010[\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b[\u0010JJ\u0012\u0010\\\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\\\u0010JJ\u0012\u0010]\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b]\u0010JJ\u0012\u0010^\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b^\u0010JJ\u0012\u0010_\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b_\u0010JJ\u0012\u0010`\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b`\u0010JJ\u0010\u0010a\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\ba\u0010bJ\u0010\u0010c\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\bc\u0010bJ\u0012\u0010d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bd\u0010JJ\u0012\u0010e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\be\u0010JJ\u0012\u0010f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bf\u0010JJ\u0010\u0010g\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\bg\u0010hJ\u0010\u0010i\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\bi\u0010hJ\u0010\u0010j\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\bj\u0010hJ\u0010\u0010k\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\bk\u0010hJ\u0012\u0010l\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bl\u0010JJ\u0010\u0010m\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\bm\u0010hJ\u0010\u0010n\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\bn\u0010hJ\u0010\u0010o\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\bo\u0010hJ\u0010\u0010p\u001a\u00020\u001dHÆ\u0003¢\u0006\u0004\bp\u0010OJ\u0010\u0010q\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\bq\u0010hJ\u0010\u0010r\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\br\u0010hJ\u0016\u0010s\u001a\b\u0012\u0004\u0012\u00020\"0!HÆ\u0003¢\u0006\u0004\bs\u0010tJ\u0018\u0010u\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010!HÆ\u0003¢\u0006\u0004\bu\u0010tJ\u0010\u0010v\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\bv\u0010hJ\u0012\u0010w\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bw\u0010JJ\u0010\u0010x\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\bx\u0010hJ\u0018\u0010y\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010)HÆ\u0003¢\u0006\u0004\by\u0010tJ\u0012\u0010z\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0004\bz\u0010{J\u0012\u0010|\u001a\u0004\u0018\u00010,HÆ\u0003¢\u0006\u0004\b|\u0010}J\u0012\u0010~\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b~\u0010JJ\u0013\u0010\u007f\u001a\u0004\u0018\u00010/HÆ\u0003¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u0015\u0010\u0081\u0001\u001a\u0004\u0018\u000101HÆ\u0003¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\u0014\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0005\b\u0083\u0001\u0010JJ\u0013\u0010\u0084\u0001\u001a\u000204HÆ\u0003¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u0014\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0005\b\u0086\u0001\u0010JJ\u0012\u0010\u0087\u0001\u001a\u00020\u0014HÆ\u0003¢\u0006\u0005\b\u0087\u0001\u0010hJ\u0015\u0010\u0088\u0001\u001a\u0004\u0018\u000108HÆ\u0003¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u0014\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0005\b\u008a\u0001\u0010JJ\u0012\u0010\u008b\u0001\u001a\u00020\u0014HÆ\u0003¢\u0006\u0005\b\u008b\u0001\u0010hJ\u0012\u0010\u008c\u0001\u001a\u00020\u0014HÆ\u0003¢\u0006\u0005\b\u008c\u0001\u0010hJ\u0012\u0010\u008d\u0001\u001a\u00020\u0014HÆ\u0003¢\u0006\u0005\b\u008d\u0001\u0010hJ\u0015\u0010\u008e\u0001\u001a\u0004\u0018\u00010>HÆ\u0003¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J\u0014\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0005\b\u0090\u0001\u0010JJ\u0012\u0010\u0091\u0001\u001a\u00020\u0014HÆ\u0003¢\u0006\u0005\b\u0091\u0001\u0010hJÓ\u0004\u0010\u0092\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u00142\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00142\b\b\u0002\u0010\u001b\u001a\u00020\u00142\b\b\u0002\u0010\u001c\u001a\u00020\u00142\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u00142\b\b\u0002\u0010 \u001a\u00020\u00142\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!2\u0010\b\u0002\u0010%\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010!2\b\b\u0002\u0010&\u001a\u00020\u00142\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010(\u001a\u00020\u00142\u0010\b\u0002\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010)2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u00100\u001a\u0004\u0018\u00010/2\n\b\u0002\u00102\u001a\u0004\u0018\u0001012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u00105\u001a\u0002042\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u00107\u001a\u00020\u00142\n\b\u0002\u00109\u001a\u0004\u0018\u0001082\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010;\u001a\u00020\u00142\b\b\u0002\u0010<\u001a\u00020\u00142\b\b\u0002\u0010=\u001a\u00020\u00142\n\b\u0002\u0010?\u001a\u0004\u0018\u00010>2\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010A\u001a\u00020\u0014HÆ\u0001¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J\u0012\u0010\u0094\u0001\u001a\u00020\u0002HÖ\u0001¢\u0006\u0005\b\u0094\u0001\u0010JJ\u0012\u0010\u0095\u0001\u001a\u00020\u001dHÖ\u0001¢\u0006\u0005\b\u0095\u0001\u0010OJ\u001f\u0010\u0098\u0001\u001a\u00020\u00142\n\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0096\u0001HÖ\u0003¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J/\u0010¡\u0001\u001a\u00020S2\u0007\u0010\u009a\u0001\u001a\u00020\u00002\b\u0010\u009c\u0001\u001a\u00030\u009b\u00012\b\u0010\u009e\u0001\u001a\u00030\u009d\u0001H\u0001¢\u0006\u0006\b\u009f\u0001\u0010 \u0001R0\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u001e\n\u0005\b\u0003\u0010¢\u0001\u0012\u0006\b¦\u0001\u0010§\u0001\u001a\u0005\b£\u0001\u0010J\"\u0006\b¤\u0001\u0010¥\u0001R0\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u001e\n\u0005\b\u0004\u0010¢\u0001\u0012\u0006\bª\u0001\u0010§\u0001\u001a\u0005\b¨\u0001\u0010J\"\u0006\b©\u0001\u0010¥\u0001R0\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u001e\n\u0005\b\u0005\u0010¢\u0001\u0012\u0006\b\u00ad\u0001\u0010§\u0001\u001a\u0005\b«\u0001\u0010J\"\u0006\b¬\u0001\u0010¥\u0001R0\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u001e\n\u0005\b\u0006\u0010¢\u0001\u0012\u0006\b°\u0001\u0010§\u0001\u001a\u0005\b®\u0001\u0010J\"\u0006\b¯\u0001\u0010¥\u0001R0\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u001e\n\u0005\b\u0007\u0010¢\u0001\u0012\u0006\b³\u0001\u0010§\u0001\u001a\u0005\b±\u0001\u0010J\"\u0006\b²\u0001\u0010¥\u0001R0\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u001e\n\u0005\b\b\u0010¢\u0001\u0012\u0006\b¶\u0001\u0010§\u0001\u001a\u0005\b´\u0001\u0010J\"\u0006\bµ\u0001\u0010¥\u0001R0\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u001e\n\u0005\b\t\u0010¢\u0001\u0012\u0006\b¹\u0001\u0010§\u0001\u001a\u0005\b·\u0001\u0010J\"\u0006\b¸\u0001\u0010¥\u0001R0\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u001e\n\u0005\b\n\u0010¢\u0001\u0012\u0006\b¼\u0001\u0010§\u0001\u001a\u0005\bº\u0001\u0010J\"\u0006\b»\u0001\u0010¥\u0001R0\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u001e\n\u0005\b\u000b\u0010¢\u0001\u0012\u0006\b¿\u0001\u0010§\u0001\u001a\u0005\b½\u0001\u0010J\"\u0006\b¾\u0001\u0010¥\u0001R&\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\f\u0010¢\u0001\u0012\u0006\bÁ\u0001\u0010§\u0001\u001a\u0005\bÀ\u0001\u0010JR&\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\r\u0010¢\u0001\u0012\u0006\bÃ\u0001\u0010§\u0001\u001a\u0005\bÂ\u0001\u0010JR.\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u001e\n\u0005\b\u000f\u0010Ä\u0001\u0012\u0006\bÈ\u0001\u0010§\u0001\u001a\u0005\bÅ\u0001\u0010b\"\u0006\bÆ\u0001\u0010Ç\u0001R.\u0010\u0010\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u001e\n\u0005\b\u0010\u0010Ä\u0001\u0012\u0006\bË\u0001\u0010§\u0001\u001a\u0005\bÉ\u0001\u0010b\"\u0006\bÊ\u0001\u0010Ç\u0001R0\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u001e\n\u0005\b\u0011\u0010¢\u0001\u0012\u0006\bÎ\u0001\u0010§\u0001\u001a\u0005\bÌ\u0001\u0010J\"\u0006\bÍ\u0001\u0010¥\u0001R0\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u001e\n\u0005\b\u0012\u0010¢\u0001\u0012\u0006\bÑ\u0001\u0010§\u0001\u001a\u0005\bÏ\u0001\u0010J\"\u0006\bÐ\u0001\u0010¥\u0001R0\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u001e\n\u0005\b\u0013\u0010¢\u0001\u0012\u0006\bÔ\u0001\u0010§\u0001\u001a\u0005\bÒ\u0001\u0010J\"\u0006\bÓ\u0001\u0010¥\u0001R.\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u001e\n\u0005\b\u0015\u0010Õ\u0001\u0012\u0006\bÙ\u0001\u0010§\u0001\u001a\u0005\bÖ\u0001\u0010h\"\u0006\b×\u0001\u0010Ø\u0001R.\u0010\u0016\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u001e\n\u0005\b\u0016\u0010Õ\u0001\u0012\u0006\bÜ\u0001\u0010§\u0001\u001a\u0005\bÚ\u0001\u0010h\"\u0006\bÛ\u0001\u0010Ø\u0001R.\u0010\u0017\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u001e\n\u0005\b\u0017\u0010Õ\u0001\u0012\u0006\bß\u0001\u0010§\u0001\u001a\u0005\bÝ\u0001\u0010h\"\u0006\bÞ\u0001\u0010Ø\u0001R.\u0010\u0018\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u001e\n\u0005\b\u0018\u0010Õ\u0001\u0012\u0006\bâ\u0001\u0010§\u0001\u001a\u0005\bà\u0001\u0010h\"\u0006\bá\u0001\u0010Ø\u0001R0\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u001e\n\u0005\b\u0019\u0010¢\u0001\u0012\u0006\bå\u0001\u0010§\u0001\u001a\u0005\bã\u0001\u0010J\"\u0006\bä\u0001\u0010¥\u0001R.\u0010\u001a\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u001e\n\u0005\b\u001a\u0010Õ\u0001\u0012\u0006\bè\u0001\u0010§\u0001\u001a\u0005\bæ\u0001\u0010h\"\u0006\bç\u0001\u0010Ø\u0001R$\u0010\u001b\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u001b\u0010Õ\u0001\u0012\u0006\bê\u0001\u0010§\u0001\u001a\u0005\bé\u0001\u0010hR.\u0010\u001c\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u001e\n\u0005\b\u001c\u0010Õ\u0001\u0012\u0006\bí\u0001\u0010§\u0001\u001a\u0005\bë\u0001\u0010h\"\u0006\bì\u0001\u0010Ø\u0001R.\u0010\u001e\u001a\u00020\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u001e\n\u0005\b\u001e\u0010î\u0001\u0012\u0006\bò\u0001\u0010§\u0001\u001a\u0005\bï\u0001\u0010O\"\u0006\bð\u0001\u0010ñ\u0001R.\u0010\u001f\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u001e\n\u0005\b\u001f\u0010Õ\u0001\u0012\u0006\bõ\u0001\u0010§\u0001\u001a\u0005\bó\u0001\u0010h\"\u0006\bô\u0001\u0010Ø\u0001R.\u0010 \u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u001e\n\u0005\b \u0010Õ\u0001\u0012\u0006\bø\u0001\u0010§\u0001\u001a\u0005\bö\u0001\u0010h\"\u0006\b÷\u0001\u0010Ø\u0001R4\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0006@\u0006X\u0087\u000e¢\u0006\u001e\n\u0005\b#\u0010ù\u0001\u0012\u0006\bý\u0001\u0010§\u0001\u001a\u0005\bú\u0001\u0010t\"\u0006\bû\u0001\u0010ü\u0001R6\u0010%\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010!8\u0006@\u0006X\u0087\u000e¢\u0006\u001e\n\u0005\b%\u0010ù\u0001\u0012\u0006\b\u0080\u0002\u0010§\u0001\u001a\u0005\bþ\u0001\u0010t\"\u0006\bÿ\u0001\u0010ü\u0001R.\u0010&\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u001e\n\u0005\b&\u0010Õ\u0001\u0012\u0006\b\u0083\u0002\u0010§\u0001\u001a\u0005\b\u0081\u0002\u0010h\"\u0006\b\u0082\u0002\u0010Ø\u0001R0\u0010'\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u001e\n\u0005\b'\u0010¢\u0001\u0012\u0006\b\u0086\u0002\u0010§\u0001\u001a\u0005\b\u0084\u0002\u0010J\"\u0006\b\u0085\u0002\u0010¥\u0001R-\u0010(\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u001d\n\u0005\b(\u0010Õ\u0001\u0012\u0006\b\u0088\u0002\u0010§\u0001\u001a\u0004\b(\u0010h\"\u0006\b\u0087\u0002\u0010Ø\u0001R6\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010)8\u0006@\u0006X\u0087\u000e¢\u0006\u001e\n\u0005\b*\u0010ù\u0001\u0012\u0006\b\u008b\u0002\u0010§\u0001\u001a\u0005\b\u0089\u0002\u0010t\"\u0006\b\u008a\u0002\u0010ü\u0001R0\u0010+\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u001e\n\u0005\b+\u0010\u008c\u0002\u0012\u0006\b\u0090\u0002\u0010§\u0001\u001a\u0005\b\u008d\u0002\u0010{\"\u0006\b\u008e\u0002\u0010\u008f\u0002R0\u0010-\u001a\u0004\u0018\u00010,8\u0006@\u0006X\u0087\u000e¢\u0006\u001e\n\u0005\b-\u0010\u0091\u0002\u0012\u0006\b\u0095\u0002\u0010§\u0001\u001a\u0005\b\u0092\u0002\u0010}\"\u0006\b\u0093\u0002\u0010\u0094\u0002R0\u0010.\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u001e\n\u0005\b.\u0010¢\u0001\u0012\u0006\b\u0098\u0002\u0010§\u0001\u001a\u0005\b\u0096\u0002\u0010J\"\u0006\b\u0097\u0002\u0010¥\u0001R1\u00100\u001a\u0004\u0018\u00010/8\u0006@\u0006X\u0087\u000e¢\u0006\u001f\n\u0005\b0\u0010\u0099\u0002\u0012\u0006\b\u009d\u0002\u0010§\u0001\u001a\u0006\b\u009a\u0002\u0010\u0080\u0001\"\u0006\b\u009b\u0002\u0010\u009c\u0002R1\u00102\u001a\u0004\u0018\u0001018\u0006@\u0006X\u0087\u000e¢\u0006\u001f\n\u0005\b2\u0010\u009e\u0002\u0012\u0006\b¢\u0002\u0010§\u0001\u001a\u0006\b\u009f\u0002\u0010\u0082\u0001\"\u0006\b \u0002\u0010¡\u0002R&\u00103\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b3\u0010¢\u0001\u0012\u0006\b¤\u0002\u0010§\u0001\u001a\u0005\b£\u0002\u0010JR%\u00105\u001a\u0002048\u0006X\u0087\u0004¢\u0006\u0017\n\u0005\b5\u0010¥\u0002\u0012\u0006\b§\u0002\u0010§\u0001\u001a\u0006\b¦\u0002\u0010\u0085\u0001R&\u00106\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b6\u0010¢\u0001\u0012\u0006\b©\u0002\u0010§\u0001\u001a\u0005\b¨\u0002\u0010JR.\u00107\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u001e\n\u0005\b7\u0010Õ\u0001\u0012\u0006\b¬\u0002\u0010§\u0001\u001a\u0005\bª\u0002\u0010h\"\u0006\b«\u0002\u0010Ø\u0001R'\u00109\u001a\u0004\u0018\u0001088\u0006X\u0087\u0004¢\u0006\u0017\n\u0005\b9\u0010\u00ad\u0002\u0012\u0006\b¯\u0002\u0010§\u0001\u001a\u0006\b®\u0002\u0010\u0089\u0001R&\u0010:\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b:\u0010¢\u0001\u0012\u0006\b±\u0002\u0010§\u0001\u001a\u0005\b°\u0002\u0010JR.\u0010;\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u001e\n\u0005\b;\u0010Õ\u0001\u0012\u0006\b´\u0002\u0010§\u0001\u001a\u0005\b²\u0002\u0010h\"\u0006\b³\u0002\u0010Ø\u0001R.\u0010<\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u001e\n\u0005\b<\u0010Õ\u0001\u0012\u0006\b·\u0002\u0010§\u0001\u001a\u0005\bµ\u0002\u0010h\"\u0006\b¶\u0002\u0010Ø\u0001R.\u0010=\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u001e\n\u0005\b=\u0010Õ\u0001\u0012\u0006\bº\u0002\u0010§\u0001\u001a\u0005\b¸\u0002\u0010h\"\u0006\b¹\u0002\u0010Ø\u0001R'\u0010?\u001a\u0004\u0018\u00010>8\u0006X\u0087\u0004¢\u0006\u0017\n\u0005\b?\u0010»\u0002\u0012\u0006\b½\u0002\u0010§\u0001\u001a\u0006\b¼\u0002\u0010\u008f\u0001R&\u0010@\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b@\u0010¢\u0001\u0012\u0006\b¿\u0002\u0010§\u0001\u001a\u0005\b¾\u0002\u0010JR$\u0010A\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\bA\u0010Õ\u0001\u0012\u0006\bÁ\u0002\u0010§\u0001\u001a\u0005\bÀ\u0002\u0010hR\u0013\u0010Â\u0002\u001a\u00020\u00148F¢\u0006\u0007\u001a\u0005\bÂ\u0002\u0010hR\u0013\u0010Ã\u0002\u001a\u00020\u00148F¢\u0006\u0007\u001a\u0005\bÃ\u0002\u0010h¨\u0006Æ\u0002"}, d2 = {"Lcom/app/tgtg/model/remote/UserSettings;", "Landroid/os/Parcelable;", "", "phoneCountryCodeSuggestion", "termsUrl", "manufacturerTermsUrl", "privacyUrl", "blogUrl", "careersUrl", "instagramUrl", "charityTermsUrl", "cateringTermsUrl", "accessibilityStatementUrl", "dsaDisclosureUrl", "Lcom/app/tgtg/model/remote/item/LatLngInfo;", "boundSW", "boundNE", "bankTransactionFee", "myStoreUrl", "panicMessage", "", "shouldVerifyEmail", "hasAnyVouchers", "hasActiveOrders", "canShowBestBeforeExplainer", "brazeExternalId", "hasExpiredPaymentMethods", "hasActiveEmailChangeRequest", "showManufacturerItems", "", "manufacturerBasketItemsLimit", "useManufacturerBasketFlow", "showDeliveryOptions", "", "Lcom/app/tgtg/model/remote/FeatureExperiment;", "featureExperiments", "Lcom/app/tgtg/model/remote/FeatureActivation;", "featureActivations", "showCardIssueWarning", "userReferralTermsUrl", "isManufacturerSupplyAvailable", "", "newManufacturerItemsForUser", "newManufacturerItemsForUserQty", "Lcom/app/tgtg/model/remote/LoyaltyCardResponse;", "mobileUserLoyaltyCard", "loyaltyCardTermsUrl", "Lcom/app/tgtg/model/remote/user/response/C2CReferralResponse;", "mobileC2CReferral", "Lgh/f;", "userBadgeDetails", "storeReferralUrl", "Lcom/app/tgtg/model/remote/UserType;", "userType", "userBadgesUrl", "hasSpecialRewards", "Lcom/app/tgtg/model/remote/RewardSurveyInfo;", "rewardSurveyInfo", "userStoreRecommendationUrl", "showProfilePageNotification", "hasClickedFavoriteReminderBell", "userHasPurchased", "Lcom/app/tgtg/model/remote/user/response/charity/CharityUserDetails;", "charityUserDetails", "lastSuccessfulOrderDate", "canSwipeOffline", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/item/LatLngInfo;Lcom/app/tgtg/model/remote/item/LatLngInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZLjava/lang/String;ZZZIZZLjava/util/List;Ljava/util/List;ZLjava/lang/String;ZLjava/util/List;Ljava/lang/Integer;Lcom/app/tgtg/model/remote/LoyaltyCardResponse;Ljava/lang/String;Lcom/app/tgtg/model/remote/user/response/C2CReferralResponse;Lgh/f;Ljava/lang/String;Lcom/app/tgtg/model/remote/UserType;Ljava/lang/String;ZLcom/app/tgtg/model/remote/RewardSurveyInfo;Ljava/lang/String;ZZZLcom/app/tgtg/model/remote/user/response/charity/CharityUserDetails;Ljava/lang/String;Z)V", "seen0", "seen1", "Lm90/m1;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/item/LatLngInfo;Lcom/app/tgtg/model/remote/item/LatLngInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZLjava/lang/String;ZZZIZZLjava/util/List;Ljava/util/List;ZLjava/lang/String;ZLjava/util/List;Ljava/lang/Integer;Lcom/app/tgtg/model/remote/LoyaltyCardResponse;Ljava/lang/String;Lcom/app/tgtg/model/remote/user/response/C2CReferralResponse;Lgh/f;Ljava/lang/String;Lcom/app/tgtg/model/remote/UserType;Ljava/lang/String;ZLcom/app/tgtg/model/remote/RewardSurveyInfo;Ljava/lang/String;ZZZLcom/app/tgtg/model/remote/user/response/charity/CharityUserDetails;Ljava/lang/String;ZLm90/m1;)V", "toJson", "()Ljava/lang/String;", "Lxk/b;", "parseUserBounds", "()Lxk/b;", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "()Lcom/app/tgtg/model/remote/item/LatLngInfo;", "component13", "component14", "component15", "component16", "component17", "()Z", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "()Ljava/util/List;", "component29", "component30", "component31", "component32", "component33", "component34", "()Ljava/lang/Integer;", "component35", "()Lcom/app/tgtg/model/remote/LoyaltyCardResponse;", "component36", "component37", "()Lcom/app/tgtg/model/remote/user/response/C2CReferralResponse;", "component38", "()Lgh/f;", "component39", "component40", "()Lcom/app/tgtg/model/remote/UserType;", "component41", "component42", "component43", "()Lcom/app/tgtg/model/remote/RewardSurveyInfo;", "component44", "component45", "component46", "component47", "component48", "()Lcom/app/tgtg/model/remote/user/response/charity/CharityUserDetails;", "component49", "component50", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/item/LatLngInfo;Lcom/app/tgtg/model/remote/item/LatLngInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZLjava/lang/String;ZZZIZZLjava/util/List;Ljava/util/List;ZLjava/lang/String;ZLjava/util/List;Ljava/lang/Integer;Lcom/app/tgtg/model/remote/LoyaltyCardResponse;Ljava/lang/String;Lcom/app/tgtg/model/remote/user/response/C2CReferralResponse;Lgh/f;Ljava/lang/String;Lcom/app/tgtg/model/remote/UserType;Ljava/lang/String;ZLcom/app/tgtg/model/remote/RewardSurveyInfo;Ljava/lang/String;ZZZLcom/app/tgtg/model/remote/user/response/charity/CharityUserDetails;Ljava/lang/String;Z)Lcom/app/tgtg/model/remote/UserSettings;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "write$Self$app", "(Lcom/app/tgtg/model/remote/UserSettings;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getPhoneCountryCodeSuggestion", "setPhoneCountryCodeSuggestion", "(Ljava/lang/String;)V", "getPhoneCountryCodeSuggestion$annotations", "()V", "getTermsUrl", "setTermsUrl", "getTermsUrl$annotations", "getManufacturerTermsUrl", "setManufacturerTermsUrl", "getManufacturerTermsUrl$annotations", "getPrivacyUrl", "setPrivacyUrl", "getPrivacyUrl$annotations", "getBlogUrl", "setBlogUrl", "getBlogUrl$annotations", "getCareersUrl", "setCareersUrl", "getCareersUrl$annotations", "getInstagramUrl", "setInstagramUrl", "getInstagramUrl$annotations", "getCharityTermsUrl", "setCharityTermsUrl", "getCharityTermsUrl$annotations", "getCateringTermsUrl", "setCateringTermsUrl", "getCateringTermsUrl$annotations", "getAccessibilityStatementUrl", "getAccessibilityStatementUrl$annotations", "getDsaDisclosureUrl", "getDsaDisclosureUrl$annotations", "Lcom/app/tgtg/model/remote/item/LatLngInfo;", "getBoundSW", "setBoundSW", "(Lcom/app/tgtg/model/remote/item/LatLngInfo;)V", "getBoundSW$annotations", "getBoundNE", "setBoundNE", "getBoundNE$annotations", "getBankTransactionFee", "setBankTransactionFee", "getBankTransactionFee$annotations", "getMyStoreUrl", "setMyStoreUrl", "getMyStoreUrl$annotations", "getPanicMessage", "setPanicMessage", "getPanicMessage$annotations", "Z", "getShouldVerifyEmail", "setShouldVerifyEmail", "(Z)V", "getShouldVerifyEmail$annotations", "getHasAnyVouchers", "setHasAnyVouchers", "getHasAnyVouchers$annotations", "getHasActiveOrders", "setHasActiveOrders", "getHasActiveOrders$annotations", "getCanShowBestBeforeExplainer", "setCanShowBestBeforeExplainer", "getCanShowBestBeforeExplainer$annotations", "getBrazeExternalId", "setBrazeExternalId", "getBrazeExternalId$annotations", "getHasExpiredPaymentMethods", "setHasExpiredPaymentMethods", "getHasExpiredPaymentMethods$annotations", "getHasActiveEmailChangeRequest", "getHasActiveEmailChangeRequest$annotations", "getShowManufacturerItems", "setShowManufacturerItems", "getShowManufacturerItems$annotations", "I", "getManufacturerBasketItemsLimit", "setManufacturerBasketItemsLimit", "(I)V", "getManufacturerBasketItemsLimit$annotations", "getUseManufacturerBasketFlow", "setUseManufacturerBasketFlow", "getUseManufacturerBasketFlow$annotations", "getShowDeliveryOptions", "setShowDeliveryOptions", "getShowDeliveryOptions$annotations", "Ljava/util/List;", "getFeatureExperiments", "setFeatureExperiments", "(Ljava/util/List;)V", "getFeatureExperiments$annotations", "getFeatureActivations", "setFeatureActivations", "getFeatureActivations$annotations", "getShowCardIssueWarning", "setShowCardIssueWarning", "getShowCardIssueWarning$annotations", "getUserReferralTermsUrl", "setUserReferralTermsUrl", "getUserReferralTermsUrl$annotations", "setManufacturerSupplyAvailable", "isManufacturerSupplyAvailable$annotations", "getNewManufacturerItemsForUser", "setNewManufacturerItemsForUser", "getNewManufacturerItemsForUser$annotations", "Ljava/lang/Integer;", "getNewManufacturerItemsForUserQty", "setNewManufacturerItemsForUserQty", "(Ljava/lang/Integer;)V", "getNewManufacturerItemsForUserQty$annotations", "Lcom/app/tgtg/model/remote/LoyaltyCardResponse;", "getMobileUserLoyaltyCard", "setMobileUserLoyaltyCard", "(Lcom/app/tgtg/model/remote/LoyaltyCardResponse;)V", "getMobileUserLoyaltyCard$annotations", "getLoyaltyCardTermsUrl", "setLoyaltyCardTermsUrl", "getLoyaltyCardTermsUrl$annotations", "Lcom/app/tgtg/model/remote/user/response/C2CReferralResponse;", "getMobileC2CReferral", "setMobileC2CReferral", "(Lcom/app/tgtg/model/remote/user/response/C2CReferralResponse;)V", "getMobileC2CReferral$annotations", "Lgh/f;", "getUserBadgeDetails", "setUserBadgeDetails", "(Lgh/f;)V", "getUserBadgeDetails$annotations", "getStoreReferralUrl", "getStoreReferralUrl$annotations", "Lcom/app/tgtg/model/remote/UserType;", "getUserType", "getUserType$annotations", "getUserBadgesUrl", "getUserBadgesUrl$annotations", "getHasSpecialRewards", "setHasSpecialRewards", "getHasSpecialRewards$annotations", "Lcom/app/tgtg/model/remote/RewardSurveyInfo;", "getRewardSurveyInfo", "getRewardSurveyInfo$annotations", "getUserStoreRecommendationUrl", "getUserStoreRecommendationUrl$annotations", "getShowProfilePageNotification", "setShowProfilePageNotification", "getShowProfilePageNotification$annotations", "getHasClickedFavoriteReminderBell", "setHasClickedFavoriteReminderBell", "getHasClickedFavoriteReminderBell$annotations", "getUserHasPurchased", "setUserHasPurchased", "getUserHasPurchased$annotations", "Lcom/app/tgtg/model/remote/user/response/charity/CharityUserDetails;", "getCharityUserDetails", "getCharityUserDetails$annotations", "getLastSuccessfulOrderDate", "getLastSuccessfulOrderDate$annotations", "getCanSwipeOffline", "getCanSwipeOffline$annotations", "isBusiness", "isCharityUser", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class UserSettings implements Parcelable {

    @NotNull
    private static final j[] $childSerializers;

    @Nullable
    private final String accessibilityStatementUrl;

    @Nullable
    private String bankTransactionFee;

    @Nullable
    private String blogUrl;

    @NotNull
    private LatLngInfo boundNE;

    @NotNull
    private LatLngInfo boundSW;

    @Nullable
    private String brazeExternalId;
    private boolean canShowBestBeforeExplainer;
    private final boolean canSwipeOffline;

    @Nullable
    private String careersUrl;

    @Nullable
    private String cateringTermsUrl;

    @Nullable
    private String charityTermsUrl;

    @Nullable
    private final CharityUserDetails charityUserDetails;

    @Nullable
    private final String dsaDisclosureUrl;

    @Nullable
    private List<FeatureActivation> featureActivations;

    @NotNull
    private List<FeatureExperiment> featureExperiments;
    private final boolean hasActiveEmailChangeRequest;
    private boolean hasActiveOrders;
    private boolean hasAnyVouchers;
    private boolean hasClickedFavoriteReminderBell;
    private boolean hasExpiredPaymentMethods;
    private boolean hasSpecialRewards;

    @Nullable
    private String instagramUrl;
    private boolean isManufacturerSupplyAvailable;

    @Nullable
    private final String lastSuccessfulOrderDate;

    @Nullable
    private String loyaltyCardTermsUrl;
    private int manufacturerBasketItemsLimit;

    @Nullable
    private String manufacturerTermsUrl;

    @Nullable
    private C2CReferralResponse mobileC2CReferral;

    @Nullable
    private LoyaltyCardResponse mobileUserLoyaltyCard;

    @Nullable
    private String myStoreUrl;

    @Nullable
    private List<String> newManufacturerItemsForUser;

    @Nullable
    private Integer newManufacturerItemsForUserQty;

    @Nullable
    private String panicMessage;

    @Nullable
    private String phoneCountryCodeSuggestion;

    @Nullable
    private String privacyUrl;

    @Nullable
    private final RewardSurveyInfo rewardSurveyInfo;
    private boolean shouldVerifyEmail;
    private boolean showCardIssueWarning;
    private boolean showDeliveryOptions;
    private boolean showManufacturerItems;
    private boolean showProfilePageNotification;

    @Nullable
    private final String storeReferralUrl;

    @Nullable
    private String termsUrl;
    private boolean useManufacturerBasketFlow;

    @Nullable
    private f userBadgeDetails;

    @Nullable
    private final String userBadgesUrl;
    private boolean userHasPurchased;

    @Nullable
    private String userReferralTermsUrl;

    @Nullable
    private final String userStoreRecommendationUrl;

    @NotNull
    private final UserType userType;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<UserSettings> CREATOR = new Creator();

    static {
        m mVar = m.PUBLICATION;
        $childSerializers = new j[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, l.a(mVar, new a(8)), l.a(mVar, new a(9)), null, null, null, l.a(mVar, new a(10)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};
    }

    public /* synthetic */ UserSettings(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, LatLngInfo latLngInfo, LatLngInfo latLngInfo2, String str12, String str13, String str14, boolean z11, boolean z12, boolean z13, boolean z14, String str15, boolean z15, boolean z16, boolean z17, int i11, boolean z18, boolean z19, List list, List list2, boolean z21, String str16, boolean z22, List list3, Integer num, LoyaltyCardResponse loyaltyCardResponse, String str17, C2CReferralResponse c2CReferralResponse, f fVar, String str18, UserType userType, String str19, boolean z23, RewardSurveyInfo rewardSurveyInfo, String str20, boolean z24, boolean z25, boolean z26, CharityUserDetails charityUserDetails, String str21, boolean z27, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        String str22;
        String str23;
        String str24;
        LatLngInfo latLngInfo3;
        String str25;
        LatLngInfo latLngInfo4;
        String str26 = (i12 & 1) != 0 ? null : str;
        String str27 = (i12 & 2) != 0 ? null : str2;
        String str28 = (i12 & 4) != 0 ? null : str3;
        String str29 = (i12 & 8) != 0 ? null : str4;
        String str30 = (i12 & 16) != 0 ? null : str5;
        String str31 = (i12 & 32) != 0 ? null : str6;
        String str32 = (i12 & 64) != 0 ? null : str7;
        String str33 = (i12 & 128) != 0 ? null : str8;
        String str34 = (i12 & 256) != 0 ? null : str9;
        String str35 = (i12 & 512) != 0 ? null : str10;
        String str36 = (i12 & 1024) != 0 ? null : str11;
        if ((i12 & NewHope.SENDB_BYTES) != 0) {
            str22 = str27;
            str23 = str28;
            str24 = str29;
            latLngInfo3 = new LatLngInfo(35.603719d, -11.689453d);
        } else {
            str22 = str27;
            str23 = str28;
            str24 = str29;
            latLngInfo3 = latLngInfo;
        }
        if ((i12 & 4096) != 0) {
            str25 = str30;
            latLngInfo4 = new LatLngInfo(71.691293d, 31.289063d);
        } else {
            str25 = str30;
            latLngInfo4 = latLngInfo2;
        }
        this(str26, str22, str23, str24, str25, str31, str32, str33, str34, str35, str36, latLngInfo3, latLngInfo4, (i12 & 8192) != 0 ? null : str12, (i12 & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) != 0 ? null : str13, (i12 & 32768) != 0 ? null : str14, (i12 & 65536) != 0 ? false : z11, (i12 & 131072) != 0 ? false : z12, (i12 & 262144) != 0 ? false : z13, (i12 & 524288) != 0 ? false : z14, (i12 & 1048576) != 0 ? null : str15, (i12 & 2097152) != 0 ? false : z15, (i12 & 4194304) != 0 ? false : z16, (i12 & 8388608) != 0 ? false : z17, (i12 & 16777216) != 0 ? 20 : i11, (i12 & 33554432) != 0 ? false : z18, (i12 & 67108864) != 0 ? false : z19, (i12 & 134217728) != 0 ? new ArrayList() : list, (i12 & 268435456) != 0 ? null : list2, (i12 & 536870912) != 0 ? false : z21, (i12 & 1073741824) != 0 ? null : str16, (i12 & Integer.MIN_VALUE) != 0 ? false : z22, (i13 & 1) != 0 ? null : list3, (i13 & 2) != 0 ? 0 : num, (i13 & 4) != 0 ? null : loyaltyCardResponse, (i13 & 8) != 0 ? null : str17, (i13 & 16) != 0 ? null : c2CReferralResponse, (i13 & 32) != 0 ? null : fVar, (i13 & 64) != 0 ? null : str18, (i13 & 128) != 0 ? UserType.USER : userType, (i13 & 256) != 0 ? null : str19, (i13 & 512) != 0 ? false : z23, (i13 & 1024) != 0 ? null : rewardSurveyInfo, (i13 & NewHope.SENDB_BYTES) != 0 ? null : str20, (i13 & 4096) != 0 ? false : z24, (i13 & 8192) != 0 ? false : z25, (i13 & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) == 0 ? z26 : false, (i13 & 32768) != 0 ? null : charityUserDetails, (i13 & 65536) != 0 ? null : str21, (i13 & 131072) != 0 ? true : z27);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(FeatureExperiment$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new d(FeatureActivation$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new d(r1.f29848a, 0);
    }

    public static final /* synthetic */ void write$Self$app(UserSettings self, b output, SerialDescriptor serialDesc) {
        Integer num;
        j[] jVarArr = $childSerializers;
        if (output.C(serialDesc) || self.phoneCountryCodeSuggestion != null) {
            output.r(serialDesc, 0, r1.f29848a, self.phoneCountryCodeSuggestion);
        }
        if (output.C(serialDesc) || self.termsUrl != null) {
            output.r(serialDesc, 1, r1.f29848a, self.termsUrl);
        }
        if (output.C(serialDesc) || self.manufacturerTermsUrl != null) {
            output.r(serialDesc, 2, r1.f29848a, self.manufacturerTermsUrl);
        }
        if (output.C(serialDesc) || self.privacyUrl != null) {
            output.r(serialDesc, 3, r1.f29848a, self.privacyUrl);
        }
        if (output.C(serialDesc) || self.blogUrl != null) {
            output.r(serialDesc, 4, r1.f29848a, self.blogUrl);
        }
        if (output.C(serialDesc) || self.careersUrl != null) {
            output.r(serialDesc, 5, r1.f29848a, self.careersUrl);
        }
        if (output.C(serialDesc) || self.instagramUrl != null) {
            output.r(serialDesc, 6, r1.f29848a, self.instagramUrl);
        }
        if (output.C(serialDesc) || self.charityTermsUrl != null) {
            output.r(serialDesc, 7, r1.f29848a, self.charityTermsUrl);
        }
        if (output.C(serialDesc) || self.cateringTermsUrl != null) {
            output.r(serialDesc, 8, r1.f29848a, self.cateringTermsUrl);
        }
        if (output.C(serialDesc) || self.accessibilityStatementUrl != null) {
            output.r(serialDesc, 9, r1.f29848a, self.accessibilityStatementUrl);
        }
        if (output.C(serialDesc) || self.dsaDisclosureUrl != null) {
            output.r(serialDesc, 10, r1.f29848a, self.dsaDisclosureUrl);
        }
        if (output.C(serialDesc) || !Intrinsics.areEqual(self.boundSW, new LatLngInfo(35.603719d, -11.689453d))) {
            output.i(serialDesc, 11, LatLngInfo$$serializer.INSTANCE, self.boundSW);
        }
        if (output.C(serialDesc) || !Intrinsics.areEqual(self.boundNE, new LatLngInfo(71.691293d, 31.289063d))) {
            output.i(serialDesc, 12, LatLngInfo$$serializer.INSTANCE, self.boundNE);
        }
        if (output.C(serialDesc) || self.bankTransactionFee != null) {
            output.r(serialDesc, 13, r1.f29848a, self.bankTransactionFee);
        }
        if (output.C(serialDesc) || self.myStoreUrl != null) {
            output.r(serialDesc, 14, r1.f29848a, self.myStoreUrl);
        }
        if (output.C(serialDesc) || self.panicMessage != null) {
            output.r(serialDesc, 15, r1.f29848a, self.panicMessage);
        }
        if (output.C(serialDesc) || self.shouldVerifyEmail) {
            output.p(serialDesc, 16, self.shouldVerifyEmail);
        }
        if (output.C(serialDesc) || self.hasAnyVouchers) {
            output.p(serialDesc, 17, self.hasAnyVouchers);
        }
        if (output.C(serialDesc) || self.hasActiveOrders) {
            output.p(serialDesc, 18, self.hasActiveOrders);
        }
        if (output.C(serialDesc) || self.canShowBestBeforeExplainer) {
            output.p(serialDesc, 19, self.canShowBestBeforeExplainer);
        }
        if (output.C(serialDesc) || self.brazeExternalId != null) {
            output.r(serialDesc, 20, r1.f29848a, self.brazeExternalId);
        }
        if (output.C(serialDesc) || self.hasExpiredPaymentMethods) {
            output.p(serialDesc, 21, self.hasExpiredPaymentMethods);
        }
        if (output.C(serialDesc) || self.hasActiveEmailChangeRequest) {
            output.p(serialDesc, 22, self.hasActiveEmailChangeRequest);
        }
        if (output.C(serialDesc) || self.showManufacturerItems) {
            output.p(serialDesc, 23, self.showManufacturerItems);
        }
        if (output.C(serialDesc) || self.manufacturerBasketItemsLimit != 20) {
            output.m(24, self.manufacturerBasketItemsLimit, serialDesc);
        }
        if (output.C(serialDesc) || self.useManufacturerBasketFlow) {
            output.p(serialDesc, 25, self.useManufacturerBasketFlow);
        }
        if (output.C(serialDesc) || self.showDeliveryOptions) {
            output.p(serialDesc, 26, self.showDeliveryOptions);
        }
        if (output.C(serialDesc) || !Intrinsics.areEqual(self.featureExperiments, new ArrayList())) {
            output.i(serialDesc, 27, (KSerializer) jVarArr[27].getValue(), self.featureExperiments);
        }
        if (output.C(serialDesc) || self.featureActivations != null) {
            output.r(serialDesc, 28, (KSerializer) jVarArr[28].getValue(), self.featureActivations);
        }
        if (output.C(serialDesc) || self.showCardIssueWarning) {
            output.p(serialDesc, 29, self.showCardIssueWarning);
        }
        if (output.C(serialDesc) || self.userReferralTermsUrl != null) {
            output.r(serialDesc, 30, r1.f29848a, self.userReferralTermsUrl);
        }
        if (output.C(serialDesc) || self.isManufacturerSupplyAvailable) {
            output.p(serialDesc, 31, self.isManufacturerSupplyAvailable);
        }
        if (output.C(serialDesc) || self.newManufacturerItemsForUser != null) {
            output.r(serialDesc, 32, (KSerializer) jVarArr[32].getValue(), self.newManufacturerItemsForUser);
        }
        if (output.C(serialDesc) || (num = self.newManufacturerItemsForUserQty) == null || num.intValue() != 0) {
            output.r(serialDesc, 33, l0.f29821a, self.newManufacturerItemsForUserQty);
        }
        if (output.C(serialDesc) || self.mobileUserLoyaltyCard != null) {
            output.r(serialDesc, 34, LoyaltyCardResponse$$serializer.INSTANCE, self.mobileUserLoyaltyCard);
        }
        if (output.C(serialDesc) || self.loyaltyCardTermsUrl != null) {
            output.r(serialDesc, 35, r1.f29848a, self.loyaltyCardTermsUrl);
        }
        if (output.C(serialDesc) || self.mobileC2CReferral != null) {
            output.r(serialDesc, 36, C2CReferralResponse$$serializer.INSTANCE, self.mobileC2CReferral);
        }
        if (output.C(serialDesc) || self.userBadgeDetails != null) {
            output.r(serialDesc, 37, gh.d.f20443a, self.userBadgeDetails);
        }
        if (output.C(serialDesc) || self.storeReferralUrl != null) {
            output.r(serialDesc, 38, r1.f29848a, self.storeReferralUrl);
        }
        if (output.C(serialDesc) || self.userType != UserType.USER) {
            output.i(serialDesc, 39, UserTypeSerializer.INSTANCE, self.userType);
        }
        if (output.C(serialDesc) || self.userBadgesUrl != null) {
            output.r(serialDesc, 40, r1.f29848a, self.userBadgesUrl);
        }
        if (output.C(serialDesc) || self.hasSpecialRewards) {
            output.p(serialDesc, 41, self.hasSpecialRewards);
        }
        if (output.C(serialDesc) || self.rewardSurveyInfo != null) {
            output.r(serialDesc, 42, RewardSurveyInfo$$serializer.INSTANCE, self.rewardSurveyInfo);
        }
        if (output.C(serialDesc) || self.userStoreRecommendationUrl != null) {
            output.r(serialDesc, 43, r1.f29848a, self.userStoreRecommendationUrl);
        }
        if (output.C(serialDesc) || self.showProfilePageNotification) {
            output.p(serialDesc, 44, self.showProfilePageNotification);
        }
        if (output.C(serialDesc) || self.hasClickedFavoriteReminderBell) {
            output.p(serialDesc, 45, self.hasClickedFavoriteReminderBell);
        }
        if (output.C(serialDesc) || self.userHasPurchased) {
            output.p(serialDesc, 46, self.userHasPurchased);
        }
        if (output.C(serialDesc) || self.charityUserDetails != null) {
            output.r(serialDesc, 47, CharityUserDetails$$serializer.INSTANCE, self.charityUserDetails);
        }
        if (output.C(serialDesc) || self.lastSuccessfulOrderDate != null) {
            output.r(serialDesc, 48, r1.f29848a, self.lastSuccessfulOrderDate);
        }
        if (!output.C(serialDesc) && self.canSwipeOffline) {
            return;
        }
        output.p(serialDesc, 49, self.canSwipeOffline);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPhoneCountryCodeSuggestion() {
        return this.phoneCountryCodeSuggestion;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getAccessibilityStatementUrl() {
        return this.accessibilityStatementUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getDsaDisclosureUrl() {
        return this.dsaDisclosureUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final LatLngInfo getBoundSW() {
        return this.boundSW;
    }

    @NotNull
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final LatLngInfo getBoundNE() {
        return this.boundNE;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getBankTransactionFee() {
        return this.bankTransactionFee;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getMyStoreUrl() {
        return this.myStoreUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getPanicMessage() {
        return this.panicMessage;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final boolean getShouldVerifyEmail() {
        return this.shouldVerifyEmail;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final boolean getHasAnyVouchers() {
        return this.hasAnyVouchers;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final boolean getHasActiveOrders() {
        return this.hasActiveOrders;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTermsUrl() {
        return this.termsUrl;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final boolean getCanShowBestBeforeExplainer() {
        return this.canShowBestBeforeExplainer;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getBrazeExternalId() {
        return this.brazeExternalId;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final boolean getHasExpiredPaymentMethods() {
        return this.hasExpiredPaymentMethods;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final boolean getHasActiveEmailChangeRequest() {
        return this.hasActiveEmailChangeRequest;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final boolean getShowManufacturerItems() {
        return this.showManufacturerItems;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final int getManufacturerBasketItemsLimit() {
        return this.manufacturerBasketItemsLimit;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final boolean getUseManufacturerBasketFlow() {
        return this.useManufacturerBasketFlow;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final boolean getShowDeliveryOptions() {
        return this.showDeliveryOptions;
    }

    @NotNull
    public final List<FeatureExperiment> component28() {
        return this.featureExperiments;
    }

    @Nullable
    public final List<FeatureActivation> component29() {
        return this.featureActivations;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getManufacturerTermsUrl() {
        return this.manufacturerTermsUrl;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final boolean getShowCardIssueWarning() {
        return this.showCardIssueWarning;
    }

    @Nullable
    /* JADX INFO: renamed from: component31, reason: from getter */
    public final String getUserReferralTermsUrl() {
        return this.userReferralTermsUrl;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final boolean getIsManufacturerSupplyAvailable() {
        return this.isManufacturerSupplyAvailable;
    }

    @Nullable
    public final List<String> component33() {
        return this.newManufacturerItemsForUser;
    }

    @Nullable
    /* JADX INFO: renamed from: component34, reason: from getter */
    public final Integer getNewManufacturerItemsForUserQty() {
        return this.newManufacturerItemsForUserQty;
    }

    @Nullable
    /* JADX INFO: renamed from: component35, reason: from getter */
    public final LoyaltyCardResponse getMobileUserLoyaltyCard() {
        return this.mobileUserLoyaltyCard;
    }

    @Nullable
    /* JADX INFO: renamed from: component36, reason: from getter */
    public final String getLoyaltyCardTermsUrl() {
        return this.loyaltyCardTermsUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component37, reason: from getter */
    public final C2CReferralResponse getMobileC2CReferral() {
        return this.mobileC2CReferral;
    }

    @Nullable
    /* JADX INFO: renamed from: component38, reason: from getter */
    public final f getUserBadgeDetails() {
        return this.userBadgeDetails;
    }

    @Nullable
    /* JADX INFO: renamed from: component39, reason: from getter */
    public final String getStoreReferralUrl() {
        return this.storeReferralUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPrivacyUrl() {
        return this.privacyUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component40, reason: from getter */
    public final UserType getUserType() {
        return this.userType;
    }

    @Nullable
    /* JADX INFO: renamed from: component41, reason: from getter */
    public final String getUserBadgesUrl() {
        return this.userBadgesUrl;
    }

    /* JADX INFO: renamed from: component42, reason: from getter */
    public final boolean getHasSpecialRewards() {
        return this.hasSpecialRewards;
    }

    @Nullable
    /* JADX INFO: renamed from: component43, reason: from getter */
    public final RewardSurveyInfo getRewardSurveyInfo() {
        return this.rewardSurveyInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component44, reason: from getter */
    public final String getUserStoreRecommendationUrl() {
        return this.userStoreRecommendationUrl;
    }

    /* JADX INFO: renamed from: component45, reason: from getter */
    public final boolean getShowProfilePageNotification() {
        return this.showProfilePageNotification;
    }

    /* JADX INFO: renamed from: component46, reason: from getter */
    public final boolean getHasClickedFavoriteReminderBell() {
        return this.hasClickedFavoriteReminderBell;
    }

    /* JADX INFO: renamed from: component47, reason: from getter */
    public final boolean getUserHasPurchased() {
        return this.userHasPurchased;
    }

    @Nullable
    /* JADX INFO: renamed from: component48, reason: from getter */
    public final CharityUserDetails getCharityUserDetails() {
        return this.charityUserDetails;
    }

    @Nullable
    /* JADX INFO: renamed from: component49, reason: from getter */
    public final String getLastSuccessfulOrderDate() {
        return this.lastSuccessfulOrderDate;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBlogUrl() {
        return this.blogUrl;
    }

    /* JADX INFO: renamed from: component50, reason: from getter */
    public final boolean getCanSwipeOffline() {
        return this.canSwipeOffline;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCareersUrl() {
        return this.careersUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getInstagramUrl() {
        return this.instagramUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getCharityTermsUrl() {
        return this.charityTermsUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getCateringTermsUrl() {
        return this.cateringTermsUrl;
    }

    @NotNull
    public final UserSettings copy(@Nullable String phoneCountryCodeSuggestion, @Nullable String termsUrl, @Nullable String manufacturerTermsUrl, @Nullable String privacyUrl, @Nullable String blogUrl, @Nullable String careersUrl, @Nullable String instagramUrl, @Nullable String charityTermsUrl, @Nullable String cateringTermsUrl, @Nullable String accessibilityStatementUrl, @Nullable String dsaDisclosureUrl, @NotNull LatLngInfo boundSW, @NotNull LatLngInfo boundNE, @Nullable String bankTransactionFee, @Nullable String myStoreUrl, @Nullable String panicMessage, boolean shouldVerifyEmail, boolean hasAnyVouchers, boolean hasActiveOrders, boolean canShowBestBeforeExplainer, @Nullable String brazeExternalId, boolean hasExpiredPaymentMethods, boolean hasActiveEmailChangeRequest, boolean showManufacturerItems, int manufacturerBasketItemsLimit, boolean useManufacturerBasketFlow, boolean showDeliveryOptions, @NotNull List<FeatureExperiment> featureExperiments, @Nullable List<FeatureActivation> featureActivations, boolean showCardIssueWarning, @Nullable String userReferralTermsUrl, boolean isManufacturerSupplyAvailable, @Nullable List<String> newManufacturerItemsForUser, @Nullable Integer newManufacturerItemsForUserQty, @Nullable LoyaltyCardResponse mobileUserLoyaltyCard, @Nullable String loyaltyCardTermsUrl, @Nullable C2CReferralResponse mobileC2CReferral, @Nullable f userBadgeDetails, @Nullable String storeReferralUrl, @NotNull UserType userType, @Nullable String userBadgesUrl, boolean hasSpecialRewards, @Nullable RewardSurveyInfo rewardSurveyInfo, @Nullable String userStoreRecommendationUrl, boolean showProfilePageNotification, boolean hasClickedFavoriteReminderBell, boolean userHasPurchased, @Nullable CharityUserDetails charityUserDetails, @Nullable String lastSuccessfulOrderDate, boolean canSwipeOffline) {
        boundSW.getClass();
        boundNE.getClass();
        featureExperiments.getClass();
        userType.getClass();
        return new UserSettings(phoneCountryCodeSuggestion, termsUrl, manufacturerTermsUrl, privacyUrl, blogUrl, careersUrl, instagramUrl, charityTermsUrl, cateringTermsUrl, accessibilityStatementUrl, dsaDisclosureUrl, boundSW, boundNE, bankTransactionFee, myStoreUrl, panicMessage, shouldVerifyEmail, hasAnyVouchers, hasActiveOrders, canShowBestBeforeExplainer, brazeExternalId, hasExpiredPaymentMethods, hasActiveEmailChangeRequest, showManufacturerItems, manufacturerBasketItemsLimit, useManufacturerBasketFlow, showDeliveryOptions, featureExperiments, featureActivations, showCardIssueWarning, userReferralTermsUrl, isManufacturerSupplyAvailable, newManufacturerItemsForUser, newManufacturerItemsForUserQty, mobileUserLoyaltyCard, loyaltyCardTermsUrl, mobileC2CReferral, userBadgeDetails, storeReferralUrl, userType, userBadgesUrl, hasSpecialRewards, rewardSurveyInfo, userStoreRecommendationUrl, showProfilePageNotification, hasClickedFavoriteReminderBell, userHasPurchased, charityUserDetails, lastSuccessfulOrderDate, canSwipeOffline);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserSettings)) {
            return false;
        }
        UserSettings userSettings = (UserSettings) other;
        return Intrinsics.areEqual(this.phoneCountryCodeSuggestion, userSettings.phoneCountryCodeSuggestion) && Intrinsics.areEqual(this.termsUrl, userSettings.termsUrl) && Intrinsics.areEqual(this.manufacturerTermsUrl, userSettings.manufacturerTermsUrl) && Intrinsics.areEqual(this.privacyUrl, userSettings.privacyUrl) && Intrinsics.areEqual(this.blogUrl, userSettings.blogUrl) && Intrinsics.areEqual(this.careersUrl, userSettings.careersUrl) && Intrinsics.areEqual(this.instagramUrl, userSettings.instagramUrl) && Intrinsics.areEqual(this.charityTermsUrl, userSettings.charityTermsUrl) && Intrinsics.areEqual(this.cateringTermsUrl, userSettings.cateringTermsUrl) && Intrinsics.areEqual(this.accessibilityStatementUrl, userSettings.accessibilityStatementUrl) && Intrinsics.areEqual(this.dsaDisclosureUrl, userSettings.dsaDisclosureUrl) && Intrinsics.areEqual(this.boundSW, userSettings.boundSW) && Intrinsics.areEqual(this.boundNE, userSettings.boundNE) && Intrinsics.areEqual(this.bankTransactionFee, userSettings.bankTransactionFee) && Intrinsics.areEqual(this.myStoreUrl, userSettings.myStoreUrl) && Intrinsics.areEqual(this.panicMessage, userSettings.panicMessage) && this.shouldVerifyEmail == userSettings.shouldVerifyEmail && this.hasAnyVouchers == userSettings.hasAnyVouchers && this.hasActiveOrders == userSettings.hasActiveOrders && this.canShowBestBeforeExplainer == userSettings.canShowBestBeforeExplainer && Intrinsics.areEqual(this.brazeExternalId, userSettings.brazeExternalId) && this.hasExpiredPaymentMethods == userSettings.hasExpiredPaymentMethods && this.hasActiveEmailChangeRequest == userSettings.hasActiveEmailChangeRequest && this.showManufacturerItems == userSettings.showManufacturerItems && this.manufacturerBasketItemsLimit == userSettings.manufacturerBasketItemsLimit && this.useManufacturerBasketFlow == userSettings.useManufacturerBasketFlow && this.showDeliveryOptions == userSettings.showDeliveryOptions && Intrinsics.areEqual(this.featureExperiments, userSettings.featureExperiments) && Intrinsics.areEqual(this.featureActivations, userSettings.featureActivations) && this.showCardIssueWarning == userSettings.showCardIssueWarning && Intrinsics.areEqual(this.userReferralTermsUrl, userSettings.userReferralTermsUrl) && this.isManufacturerSupplyAvailable == userSettings.isManufacturerSupplyAvailable && Intrinsics.areEqual(this.newManufacturerItemsForUser, userSettings.newManufacturerItemsForUser) && Intrinsics.areEqual(this.newManufacturerItemsForUserQty, userSettings.newManufacturerItemsForUserQty) && Intrinsics.areEqual(this.mobileUserLoyaltyCard, userSettings.mobileUserLoyaltyCard) && Intrinsics.areEqual(this.loyaltyCardTermsUrl, userSettings.loyaltyCardTermsUrl) && Intrinsics.areEqual(this.mobileC2CReferral, userSettings.mobileC2CReferral) && Intrinsics.areEqual(this.userBadgeDetails, userSettings.userBadgeDetails) && Intrinsics.areEqual(this.storeReferralUrl, userSettings.storeReferralUrl) && this.userType == userSettings.userType && Intrinsics.areEqual(this.userBadgesUrl, userSettings.userBadgesUrl) && this.hasSpecialRewards == userSettings.hasSpecialRewards && Intrinsics.areEqual(this.rewardSurveyInfo, userSettings.rewardSurveyInfo) && Intrinsics.areEqual(this.userStoreRecommendationUrl, userSettings.userStoreRecommendationUrl) && this.showProfilePageNotification == userSettings.showProfilePageNotification && this.hasClickedFavoriteReminderBell == userSettings.hasClickedFavoriteReminderBell && this.userHasPurchased == userSettings.userHasPurchased && Intrinsics.areEqual(this.charityUserDetails, userSettings.charityUserDetails) && Intrinsics.areEqual(this.lastSuccessfulOrderDate, userSettings.lastSuccessfulOrderDate) && this.canSwipeOffline == userSettings.canSwipeOffline;
    }

    @Nullable
    public final String getAccessibilityStatementUrl() {
        return this.accessibilityStatementUrl;
    }

    @Nullable
    public final String getBankTransactionFee() {
        return this.bankTransactionFee;
    }

    @Nullable
    public final String getBlogUrl() {
        return this.blogUrl;
    }

    @NotNull
    public final LatLngInfo getBoundNE() {
        return this.boundNE;
    }

    @NotNull
    public final LatLngInfo getBoundSW() {
        return this.boundSW;
    }

    @Nullable
    public final String getBrazeExternalId() {
        return this.brazeExternalId;
    }

    public final boolean getCanShowBestBeforeExplainer() {
        return this.canShowBestBeforeExplainer;
    }

    public final boolean getCanSwipeOffline() {
        return this.canSwipeOffline;
    }

    @Nullable
    public final String getCareersUrl() {
        return this.careersUrl;
    }

    @Nullable
    public final String getCateringTermsUrl() {
        return this.cateringTermsUrl;
    }

    @Nullable
    public final String getCharityTermsUrl() {
        return this.charityTermsUrl;
    }

    @Nullable
    public final CharityUserDetails getCharityUserDetails() {
        return this.charityUserDetails;
    }

    @Nullable
    public final String getDsaDisclosureUrl() {
        return this.dsaDisclosureUrl;
    }

    @Nullable
    public final List<FeatureActivation> getFeatureActivations() {
        return this.featureActivations;
    }

    @NotNull
    public final List<FeatureExperiment> getFeatureExperiments() {
        return this.featureExperiments;
    }

    public final boolean getHasActiveEmailChangeRequest() {
        return this.hasActiveEmailChangeRequest;
    }

    public final boolean getHasActiveOrders() {
        return this.hasActiveOrders;
    }

    public final boolean getHasAnyVouchers() {
        return this.hasAnyVouchers;
    }

    public final boolean getHasClickedFavoriteReminderBell() {
        return this.hasClickedFavoriteReminderBell;
    }

    public final boolean getHasExpiredPaymentMethods() {
        return this.hasExpiredPaymentMethods;
    }

    public final boolean getHasSpecialRewards() {
        return this.hasSpecialRewards;
    }

    @Nullable
    public final String getInstagramUrl() {
        return this.instagramUrl;
    }

    @Nullable
    public final String getLastSuccessfulOrderDate() {
        return this.lastSuccessfulOrderDate;
    }

    @Nullable
    public final String getLoyaltyCardTermsUrl() {
        return this.loyaltyCardTermsUrl;
    }

    public final int getManufacturerBasketItemsLimit() {
        return this.manufacturerBasketItemsLimit;
    }

    @Nullable
    public final String getManufacturerTermsUrl() {
        return this.manufacturerTermsUrl;
    }

    @Nullable
    public final C2CReferralResponse getMobileC2CReferral() {
        return this.mobileC2CReferral;
    }

    @Nullable
    public final LoyaltyCardResponse getMobileUserLoyaltyCard() {
        return this.mobileUserLoyaltyCard;
    }

    @Nullable
    public final String getMyStoreUrl() {
        return this.myStoreUrl;
    }

    @Nullable
    public final List<String> getNewManufacturerItemsForUser() {
        return this.newManufacturerItemsForUser;
    }

    @Nullable
    public final Integer getNewManufacturerItemsForUserQty() {
        return this.newManufacturerItemsForUserQty;
    }

    @Nullable
    public final String getPanicMessage() {
        return this.panicMessage;
    }

    @Nullable
    public final String getPhoneCountryCodeSuggestion() {
        return this.phoneCountryCodeSuggestion;
    }

    @Nullable
    public final String getPrivacyUrl() {
        return this.privacyUrl;
    }

    @Nullable
    public final RewardSurveyInfo getRewardSurveyInfo() {
        return this.rewardSurveyInfo;
    }

    public final boolean getShouldVerifyEmail() {
        return this.shouldVerifyEmail;
    }

    public final boolean getShowCardIssueWarning() {
        return this.showCardIssueWarning;
    }

    public final boolean getShowDeliveryOptions() {
        return this.showDeliveryOptions;
    }

    public final boolean getShowManufacturerItems() {
        return this.showManufacturerItems;
    }

    public final boolean getShowProfilePageNotification() {
        return this.showProfilePageNotification;
    }

    @Nullable
    public final String getStoreReferralUrl() {
        return this.storeReferralUrl;
    }

    @Nullable
    public final String getTermsUrl() {
        return this.termsUrl;
    }

    public final boolean getUseManufacturerBasketFlow() {
        return this.useManufacturerBasketFlow;
    }

    @Nullable
    public final f getUserBadgeDetails() {
        return this.userBadgeDetails;
    }

    @Nullable
    public final String getUserBadgesUrl() {
        return this.userBadgesUrl;
    }

    public final boolean getUserHasPurchased() {
        return this.userHasPurchased;
    }

    @Nullable
    public final String getUserReferralTermsUrl() {
        return this.userReferralTermsUrl;
    }

    @Nullable
    public final String getUserStoreRecommendationUrl() {
        return this.userStoreRecommendationUrl;
    }

    @NotNull
    public final UserType getUserType() {
        return this.userType;
    }

    public int hashCode() {
        String str = this.phoneCountryCodeSuggestion;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.termsUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.manufacturerTermsUrl;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.privacyUrl;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.blogUrl;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.careersUrl;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.instagramUrl;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.charityTermsUrl;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.cateringTermsUrl;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.accessibilityStatementUrl;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.dsaDisclosureUrl;
        int iHashCode11 = (this.boundNE.hashCode() + ((this.boundSW.hashCode() + ((iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31)) * 31)) * 31;
        String str12 = this.bankTransactionFee;
        int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.myStoreUrl;
        int iHashCode13 = (iHashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.panicMessage;
        int iE = k.e(k.e(k.e(k.e((iHashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31, 31, this.shouldVerifyEmail), 31, this.hasAnyVouchers), 31, this.hasActiveOrders), 31, this.canShowBestBeforeExplainer);
        String str15 = this.brazeExternalId;
        int iC = e0.f.c(this.featureExperiments, k.e(k.e(k.b(this.manufacturerBasketItemsLimit, k.e(k.e(k.e((iE + (str15 == null ? 0 : str15.hashCode())) * 31, 31, this.hasExpiredPaymentMethods), 31, this.hasActiveEmailChangeRequest), 31, this.showManufacturerItems), 31), 31, this.useManufacturerBasketFlow), 31, this.showDeliveryOptions), 31);
        List<FeatureActivation> list = this.featureActivations;
        int iE2 = k.e((iC + (list == null ? 0 : list.hashCode())) * 31, 31, this.showCardIssueWarning);
        String str16 = this.userReferralTermsUrl;
        int iE3 = k.e((iE2 + (str16 == null ? 0 : str16.hashCode())) * 31, 31, this.isManufacturerSupplyAvailable);
        List<String> list2 = this.newManufacturerItemsForUser;
        int iHashCode14 = (iE3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.newManufacturerItemsForUserQty;
        int iHashCode15 = (iHashCode14 + (num == null ? 0 : num.hashCode())) * 31;
        LoyaltyCardResponse loyaltyCardResponse = this.mobileUserLoyaltyCard;
        int iHashCode16 = (iHashCode15 + (loyaltyCardResponse == null ? 0 : loyaltyCardResponse.hashCode())) * 31;
        String str17 = this.loyaltyCardTermsUrl;
        int iHashCode17 = (iHashCode16 + (str17 == null ? 0 : str17.hashCode())) * 31;
        C2CReferralResponse c2CReferralResponse = this.mobileC2CReferral;
        int iHashCode18 = (iHashCode17 + (c2CReferralResponse == null ? 0 : c2CReferralResponse.hashCode())) * 31;
        f fVar = this.userBadgeDetails;
        int iHashCode19 = (iHashCode18 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        String str18 = this.storeReferralUrl;
        int iHashCode20 = (this.userType.hashCode() + ((iHashCode19 + (str18 == null ? 0 : str18.hashCode())) * 31)) * 31;
        String str19 = this.userBadgesUrl;
        int iE4 = k.e((iHashCode20 + (str19 == null ? 0 : str19.hashCode())) * 31, 31, this.hasSpecialRewards);
        RewardSurveyInfo rewardSurveyInfo = this.rewardSurveyInfo;
        int iHashCode21 = (iE4 + (rewardSurveyInfo == null ? 0 : rewardSurveyInfo.hashCode())) * 31;
        String str20 = this.userStoreRecommendationUrl;
        int iE5 = k.e(k.e(k.e((iHashCode21 + (str20 == null ? 0 : str20.hashCode())) * 31, 31, this.showProfilePageNotification), 31, this.hasClickedFavoriteReminderBell), 31, this.userHasPurchased);
        CharityUserDetails charityUserDetails = this.charityUserDetails;
        int iHashCode22 = (iE5 + (charityUserDetails == null ? 0 : charityUserDetails.hashCode())) * 31;
        String str21 = this.lastSuccessfulOrderDate;
        return Boolean.hashCode(this.canSwipeOffline) + ((iHashCode22 + (str21 != null ? str21.hashCode() : 0)) * 31);
    }

    public final boolean isBusiness() {
        return !r0.v(this.myStoreUrl);
    }

    public final boolean isCharityUser() {
        return this.userType == UserType.CHARITY_USER;
    }

    public final boolean isManufacturerSupplyAvailable() {
        return this.isManufacturerSupplyAvailable;
    }

    @NotNull
    public final xk.b parseUserBounds() {
        return new xk.b(this.boundSW, this.boundNE);
    }

    public final void setBankTransactionFee(@Nullable String str) {
        this.bankTransactionFee = str;
    }

    public final void setBlogUrl(@Nullable String str) {
        this.blogUrl = str;
    }

    public final void setBoundNE(@NotNull LatLngInfo latLngInfo) {
        latLngInfo.getClass();
        this.boundNE = latLngInfo;
    }

    public final void setBoundSW(@NotNull LatLngInfo latLngInfo) {
        latLngInfo.getClass();
        this.boundSW = latLngInfo;
    }

    public final void setBrazeExternalId(@Nullable String str) {
        this.brazeExternalId = str;
    }

    public final void setCanShowBestBeforeExplainer(boolean z11) {
        this.canShowBestBeforeExplainer = z11;
    }

    public final void setCareersUrl(@Nullable String str) {
        this.careersUrl = str;
    }

    public final void setCateringTermsUrl(@Nullable String str) {
        this.cateringTermsUrl = str;
    }

    public final void setCharityTermsUrl(@Nullable String str) {
        this.charityTermsUrl = str;
    }

    public final void setFeatureActivations(@Nullable List<FeatureActivation> list) {
        this.featureActivations = list;
    }

    public final void setFeatureExperiments(@NotNull List<FeatureExperiment> list) {
        list.getClass();
        this.featureExperiments = list;
    }

    public final void setHasActiveOrders(boolean z11) {
        this.hasActiveOrders = z11;
    }

    public final void setHasAnyVouchers(boolean z11) {
        this.hasAnyVouchers = z11;
    }

    public final void setHasClickedFavoriteReminderBell(boolean z11) {
        this.hasClickedFavoriteReminderBell = z11;
    }

    public final void setHasExpiredPaymentMethods(boolean z11) {
        this.hasExpiredPaymentMethods = z11;
    }

    public final void setHasSpecialRewards(boolean z11) {
        this.hasSpecialRewards = z11;
    }

    public final void setInstagramUrl(@Nullable String str) {
        this.instagramUrl = str;
    }

    public final void setLoyaltyCardTermsUrl(@Nullable String str) {
        this.loyaltyCardTermsUrl = str;
    }

    public final void setManufacturerBasketItemsLimit(int i11) {
        this.manufacturerBasketItemsLimit = i11;
    }

    public final void setManufacturerSupplyAvailable(boolean z11) {
        this.isManufacturerSupplyAvailable = z11;
    }

    public final void setManufacturerTermsUrl(@Nullable String str) {
        this.manufacturerTermsUrl = str;
    }

    public final void setMobileC2CReferral(@Nullable C2CReferralResponse c2CReferralResponse) {
        this.mobileC2CReferral = c2CReferralResponse;
    }

    public final void setMobileUserLoyaltyCard(@Nullable LoyaltyCardResponse loyaltyCardResponse) {
        this.mobileUserLoyaltyCard = loyaltyCardResponse;
    }

    public final void setMyStoreUrl(@Nullable String str) {
        this.myStoreUrl = str;
    }

    public final void setNewManufacturerItemsForUser(@Nullable List<String> list) {
        this.newManufacturerItemsForUser = list;
    }

    public final void setNewManufacturerItemsForUserQty(@Nullable Integer num) {
        this.newManufacturerItemsForUserQty = num;
    }

    public final void setPanicMessage(@Nullable String str) {
        this.panicMessage = str;
    }

    public final void setPhoneCountryCodeSuggestion(@Nullable String str) {
        this.phoneCountryCodeSuggestion = str;
    }

    public final void setPrivacyUrl(@Nullable String str) {
        this.privacyUrl = str;
    }

    public final void setShouldVerifyEmail(boolean z11) {
        this.shouldVerifyEmail = z11;
    }

    public final void setShowCardIssueWarning(boolean z11) {
        this.showCardIssueWarning = z11;
    }

    public final void setShowDeliveryOptions(boolean z11) {
        this.showDeliveryOptions = z11;
    }

    public final void setShowManufacturerItems(boolean z11) {
        this.showManufacturerItems = z11;
    }

    public final void setShowProfilePageNotification(boolean z11) {
        this.showProfilePageNotification = z11;
    }

    public final void setTermsUrl(@Nullable String str) {
        this.termsUrl = str;
    }

    public final void setUseManufacturerBasketFlow(boolean z11) {
        this.useManufacturerBasketFlow = z11;
    }

    public final void setUserBadgeDetails(@Nullable f fVar) {
        this.userBadgeDetails = fVar;
    }

    public final void setUserHasPurchased(boolean z11) {
        this.userHasPurchased = z11;
    }

    public final void setUserReferralTermsUrl(@Nullable String str) {
        this.userReferralTermsUrl = str;
    }

    @NotNull
    public final String toJson() {
        return c.f30748d.c(INSTANCE.serializer(), this);
    }

    @NotNull
    public String toString() {
        String str = this.phoneCountryCodeSuggestion;
        String str2 = this.termsUrl;
        String str3 = this.manufacturerTermsUrl;
        String str4 = this.privacyUrl;
        String str5 = this.blogUrl;
        String str6 = this.careersUrl;
        String str7 = this.instagramUrl;
        String str8 = this.charityTermsUrl;
        String str9 = this.cateringTermsUrl;
        String str10 = this.accessibilityStatementUrl;
        String str11 = this.dsaDisclosureUrl;
        LatLngInfo latLngInfo = this.boundSW;
        LatLngInfo latLngInfo2 = this.boundNE;
        String str12 = this.bankTransactionFee;
        String str13 = this.myStoreUrl;
        String str14 = this.panicMessage;
        boolean z11 = this.shouldVerifyEmail;
        boolean z12 = this.hasAnyVouchers;
        boolean z13 = this.hasActiveOrders;
        boolean z14 = this.canShowBestBeforeExplainer;
        String str15 = this.brazeExternalId;
        boolean z15 = this.hasExpiredPaymentMethods;
        boolean z16 = this.hasActiveEmailChangeRequest;
        boolean z17 = this.showManufacturerItems;
        int i11 = this.manufacturerBasketItemsLimit;
        boolean z18 = this.useManufacturerBasketFlow;
        boolean z19 = this.showDeliveryOptions;
        List<FeatureExperiment> list = this.featureExperiments;
        List<FeatureActivation> list2 = this.featureActivations;
        boolean z21 = this.showCardIssueWarning;
        String str16 = this.userReferralTermsUrl;
        boolean z22 = this.isManufacturerSupplyAvailable;
        List<String> list3 = this.newManufacturerItemsForUser;
        Integer num = this.newManufacturerItemsForUserQty;
        LoyaltyCardResponse loyaltyCardResponse = this.mobileUserLoyaltyCard;
        String str17 = this.loyaltyCardTermsUrl;
        C2CReferralResponse c2CReferralResponse = this.mobileC2CReferral;
        f fVar = this.userBadgeDetails;
        String str18 = this.storeReferralUrl;
        UserType userType = this.userType;
        String str19 = this.userBadgesUrl;
        boolean z23 = this.hasSpecialRewards;
        RewardSurveyInfo rewardSurveyInfo = this.rewardSurveyInfo;
        String str20 = this.userStoreRecommendationUrl;
        boolean z24 = this.showProfilePageNotification;
        boolean z25 = this.hasClickedFavoriteReminderBell;
        boolean z26 = this.userHasPurchased;
        CharityUserDetails charityUserDetails = this.charityUserDetails;
        String str21 = this.lastSuccessfulOrderDate;
        boolean z27 = this.canSwipeOffline;
        StringBuilder sbT = e0.f.t("UserSettings(phoneCountryCodeSuggestion=", str, ", termsUrl=", str2, ", manufacturerTermsUrl=");
        s.A(sbT, str3, ", privacyUrl=", str4, ", blogUrl=");
        s.A(sbT, str5, ", careersUrl=", str6, ", instagramUrl=");
        s.A(sbT, str7, ", charityTermsUrl=", str8, ", cateringTermsUrl=");
        s.A(sbT, str9, ", accessibilityStatementUrl=", str10, ", dsaDisclosureUrl=");
        sbT.append(str11);
        sbT.append(", boundSW=");
        sbT.append(latLngInfo);
        sbT.append(", boundNE=");
        sbT.append(latLngInfo2);
        sbT.append(", bankTransactionFee=");
        sbT.append(str12);
        sbT.append(", myStoreUrl=");
        s.A(sbT, str13, ", panicMessage=", str14, ", shouldVerifyEmail=");
        i.C(sbT, z11, ", hasAnyVouchers=", z12, ", hasActiveOrders=");
        i.C(sbT, z13, ", canShowBestBeforeExplainer=", z14, ", brazeExternalId=");
        k.z(sbT, str15, ", hasExpiredPaymentMethods=", z15, ", hasActiveEmailChangeRequest=");
        i.C(sbT, z16, ", showManufacturerItems=", z17, ", manufacturerBasketItemsLimit=");
        sbT.append(i11);
        sbT.append(", useManufacturerBasketFlow=");
        sbT.append(z18);
        sbT.append(", showDeliveryOptions=");
        sbT.append(z19);
        sbT.append(", featureExperiments=");
        sbT.append(list);
        sbT.append(", featureActivations=");
        sbT.append(list2);
        sbT.append(", showCardIssueWarning=");
        sbT.append(z21);
        sbT.append(", userReferralTermsUrl=");
        k.z(sbT, str16, ", isManufacturerSupplyAvailable=", z22, ", newManufacturerItemsForUser=");
        sbT.append(list3);
        sbT.append(", newManufacturerItemsForUserQty=");
        sbT.append(num);
        sbT.append(", mobileUserLoyaltyCard=");
        sbT.append(loyaltyCardResponse);
        sbT.append(", loyaltyCardTermsUrl=");
        sbT.append(str17);
        sbT.append(", mobileC2CReferral=");
        sbT.append(c2CReferralResponse);
        sbT.append(", userBadgeDetails=");
        sbT.append(fVar);
        sbT.append(", storeReferralUrl=");
        sbT.append(str18);
        sbT.append(", userType=");
        sbT.append(userType);
        sbT.append(", userBadgesUrl=");
        k.z(sbT, str19, ", hasSpecialRewards=", z23, ", rewardSurveyInfo=");
        sbT.append(rewardSurveyInfo);
        sbT.append(", userStoreRecommendationUrl=");
        sbT.append(str20);
        sbT.append(", showProfilePageNotification=");
        i.C(sbT, z24, ", hasClickedFavoriteReminderBell=", z25, ", userHasPurchased=");
        sbT.append(z26);
        sbT.append(", charityUserDetails=");
        sbT.append(charityUserDetails);
        sbT.append(", lastSuccessfulOrderDate=");
        sbT.append(str21);
        sbT.append(", canSwipeOffline=");
        sbT.append(z27);
        sbT.append(")");
        return sbT.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.phoneCountryCodeSuggestion);
        dest.writeString(this.termsUrl);
        dest.writeString(this.manufacturerTermsUrl);
        dest.writeString(this.privacyUrl);
        dest.writeString(this.blogUrl);
        dest.writeString(this.careersUrl);
        dest.writeString(this.instagramUrl);
        dest.writeString(this.charityTermsUrl);
        dest.writeString(this.cateringTermsUrl);
        dest.writeString(this.accessibilityStatementUrl);
        dest.writeString(this.dsaDisclosureUrl);
        this.boundSW.writeToParcel(dest, flags);
        this.boundNE.writeToParcel(dest, flags);
        dest.writeString(this.bankTransactionFee);
        dest.writeString(this.myStoreUrl);
        dest.writeString(this.panicMessage);
        dest.writeInt(this.shouldVerifyEmail ? 1 : 0);
        dest.writeInt(this.hasAnyVouchers ? 1 : 0);
        dest.writeInt(this.hasActiveOrders ? 1 : 0);
        dest.writeInt(this.canShowBestBeforeExplainer ? 1 : 0);
        dest.writeString(this.brazeExternalId);
        dest.writeInt(this.hasExpiredPaymentMethods ? 1 : 0);
        dest.writeInt(this.hasActiveEmailChangeRequest ? 1 : 0);
        dest.writeInt(this.showManufacturerItems ? 1 : 0);
        dest.writeInt(this.manufacturerBasketItemsLimit);
        dest.writeInt(this.useManufacturerBasketFlow ? 1 : 0);
        dest.writeInt(this.showDeliveryOptions ? 1 : 0);
        Iterator itR = i.r(this.featureExperiments, dest);
        while (itR.hasNext()) {
            ((FeatureExperiment) itR.next()).writeToParcel(dest, flags);
        }
        List<FeatureActivation> list = this.featureActivations;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = i.q(dest, 1, list);
            while (itQ.hasNext()) {
                ((FeatureActivation) itQ.next()).writeToParcel(dest, flags);
            }
        }
        dest.writeInt(this.showCardIssueWarning ? 1 : 0);
        dest.writeString(this.userReferralTermsUrl);
        dest.writeInt(this.isManufacturerSupplyAvailable ? 1 : 0);
        dest.writeStringList(this.newManufacturerItemsForUser);
        Integer num = this.newManufacturerItemsForUserQty;
        if (num == null) {
            dest.writeInt(0);
        } else {
            i.w(dest, 1, num);
        }
        LoyaltyCardResponse loyaltyCardResponse = this.mobileUserLoyaltyCard;
        if (loyaltyCardResponse == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            loyaltyCardResponse.writeToParcel(dest, flags);
        }
        dest.writeString(this.loyaltyCardTermsUrl);
        C2CReferralResponse c2CReferralResponse = this.mobileC2CReferral;
        if (c2CReferralResponse == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c2CReferralResponse.writeToParcel(dest, flags);
        }
        f fVar = this.userBadgeDetails;
        if (fVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            fVar.writeToParcel(dest, flags);
        }
        dest.writeString(this.storeReferralUrl);
        dest.writeString(this.userType.name());
        dest.writeString(this.userBadgesUrl);
        dest.writeInt(this.hasSpecialRewards ? 1 : 0);
        RewardSurveyInfo rewardSurveyInfo = this.rewardSurveyInfo;
        if (rewardSurveyInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            rewardSurveyInfo.writeToParcel(dest, flags);
        }
        dest.writeString(this.userStoreRecommendationUrl);
        dest.writeInt(this.showProfilePageNotification ? 1 : 0);
        dest.writeInt(this.hasClickedFavoriteReminderBell ? 1 : 0);
        dest.writeInt(this.userHasPurchased ? 1 : 0);
        CharityUserDetails charityUserDetails = this.charityUserDetails;
        if (charityUserDetails == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            charityUserDetails.writeToParcel(dest, flags);
        }
        dest.writeString(this.lastSuccessfulOrderDate);
        dest.writeInt(this.canSwipeOffline ? 1 : 0);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t¨\u0006\n"}, d2 = {"Lcom/app/tgtg/model/remote/UserSettings$Companion;", "", "<init>", "()V", "fromJson", "Lcom/app/tgtg/model/remote/UserSettings;", Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY, "", "serializer", "Lkotlinx/serialization/KSerializer;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit fromJson$lambda$0(n90.h hVar) {
            hVar.getClass();
            hVar.f30766c = true;
            return Unit.f26487a;
        }

        @NotNull
        public final UserSettings fromJson(@NotNull String s7) {
            s7.getClass();
            return (UserSettings) w.h(new g0(5)).b(serializer(), s7);
        }

        @NotNull
        public final KSerializer serializer() {
            return UserSettings$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<UserSettings> {
        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v1 */
        /* JADX WARN: Type inference failed for: r3v11 */
        /* JADX WARN: Type inference failed for: r3v12 */
        /* JADX WARN: Type inference failed for: r3v2, types: [int] */
        /* JADX WARN: Type inference failed for: r3v3 */
        /* JADX WARN: Type inference failed for: r3v4, types: [int] */
        @Override // android.os.Parcelable.Creator
        public final UserSettings createFromParcel(Parcel parcel) {
            boolean z11;
            String str;
            boolean z12;
            boolean z13;
            boolean z14;
            String str2;
            boolean z15;
            boolean z16;
            boolean z17;
            String str3;
            boolean z18;
            ArrayList arrayList;
            boolean z19;
            boolean z21;
            String str4;
            boolean z22;
            LoyaltyCardResponse loyaltyCardResponse;
            C2CReferralResponse c2CReferralResponseCreateFromParcel;
            C2CReferralResponse c2CReferralResponse;
            f fVarCreateFromParcel;
            boolean z23;
            String str5;
            RewardSurveyInfo rewardSurveyInfoCreateFromParcel;
            boolean z24;
            CharityUserDetails charityUserDetails;
            LoyaltyCardResponse loyaltyCardResponse2;
            UserType userType;
            RewardSurveyInfo rewardSurveyInfo;
            String str6;
            boolean z25;
            boolean z26;
            String str7;
            CharityUserDetails charityUserDetailsCreateFromParcel;
            parcel.getClass();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            Parcelable.Creator<LatLngInfo> creator = LatLngInfo.CREATOR;
            LatLngInfo latLngInfoCreateFromParcel = creator.createFromParcel(parcel);
            LatLngInfo latLngInfoCreateFromParcel2 = creator.createFromParcel(parcel);
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            boolean z27 = false;
            boolean z28 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z11 = false;
                z27 = true;
            } else {
                z11 = false;
            }
            if (parcel.readInt() != 0) {
                str = string;
                z12 = true;
            } else {
                str = string;
                z12 = z11;
            }
            if (parcel.readInt() != 0) {
                z13 = z11;
                z11 = true;
            } else {
                z13 = z11;
            }
            String str8 = str;
            String string15 = parcel.readString();
            if (parcel.readInt() != 0) {
                z14 = z13;
                z13 = true;
            } else {
                z14 = z13;
            }
            if (parcel.readInt() != 0) {
                str2 = str8;
                z15 = true;
            } else {
                str2 = str8;
                z15 = z14;
            }
            if (parcel.readInt() != 0) {
                z16 = z14;
                z14 = true;
            } else {
                z16 = z14;
            }
            String str9 = str2;
            int i11 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z17 = z16;
                z16 = true;
            } else {
                z17 = z16;
            }
            if (parcel.readInt() != 0) {
                str3 = str9;
                z18 = true;
            } else {
                str3 = str9;
                z18 = z17;
            }
            int i12 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i12);
            ?? C = z17;
            while (C != i12) {
                i12 = i12;
                string4 = string4;
                C = i.c(FeatureExperiment.CREATOR, parcel, arrayList2, C, 1);
            }
            String str10 = string4;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i13 = parcel.readInt();
                arrayList = new ArrayList(i13);
                ?? C2 = z17;
                while (C2 != i13) {
                    i13 = i13;
                    arrayList2 = arrayList2;
                    C2 = i.c(FeatureActivation.CREATOR, parcel, arrayList, C2, 1);
                }
            }
            ArrayList arrayList3 = arrayList2;
            if (parcel.readInt() != 0) {
                z19 = true;
                z21 = true;
            } else {
                z19 = true;
                z21 = z17;
            }
            String string16 = parcel.readString();
            if (parcel.readInt() != 0) {
                str4 = string3;
                z22 = z19;
            } else {
                str4 = string3;
                z22 = z17;
            }
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            LoyaltyCardResponse loyaltyCardResponseCreateFromParcel = parcel.readInt() == 0 ? null : LoyaltyCardResponse.CREATOR.createFromParcel(parcel);
            boolean z29 = z17;
            String string17 = parcel.readString();
            if (parcel.readInt() == 0) {
                loyaltyCardResponse = loyaltyCardResponseCreateFromParcel;
                c2CReferralResponseCreateFromParcel = null;
            } else {
                loyaltyCardResponse = loyaltyCardResponseCreateFromParcel;
                c2CReferralResponseCreateFromParcel = C2CReferralResponse.CREATOR.createFromParcel(parcel);
            }
            C2CReferralResponse c2CReferralResponse2 = c2CReferralResponseCreateFromParcel;
            if (parcel.readInt() == 0) {
                c2CReferralResponse = c2CReferralResponse2;
                fVarCreateFromParcel = null;
            } else {
                c2CReferralResponse = c2CReferralResponse2;
                fVarCreateFromParcel = f.CREATOR.createFromParcel(parcel);
            }
            f fVar = fVarCreateFromParcel;
            boolean z31 = z29;
            String string18 = parcel.readString();
            UserType userTypeValueOf = UserType.valueOf(parcel.readString());
            String str11 = str3;
            ArrayList arrayList4 = arrayList;
            Integer num = numValueOf;
            C2CReferralResponse c2CReferralResponse3 = c2CReferralResponse;
            String string19 = parcel.readString();
            if (parcel.readInt() != 0) {
                z23 = z31;
                z31 = true;
            } else {
                z23 = z31;
            }
            if (parcel.readInt() == 0) {
                str5 = str11;
                rewardSurveyInfoCreateFromParcel = null;
            } else {
                str5 = str11;
                rewardSurveyInfoCreateFromParcel = RewardSurveyInfo.CREATOR.createFromParcel(parcel);
            }
            RewardSurveyInfo rewardSurveyInfo2 = rewardSurveyInfoCreateFromParcel;
            boolean z32 = true;
            String string20 = parcel.readString();
            if (parcel.readInt() != 0) {
                z24 = z23;
                z23 = true;
            } else {
                z24 = z23;
            }
            if (parcel.readInt() != 0) {
                charityUserDetails = null;
                loyaltyCardResponse2 = loyaltyCardResponse;
                userType = userTypeValueOf;
                rewardSurveyInfo = rewardSurveyInfo2;
                str6 = str5;
                z25 = true;
            } else {
                charityUserDetails = null;
                loyaltyCardResponse2 = loyaltyCardResponse;
                userType = userTypeValueOf;
                rewardSurveyInfo = rewardSurveyInfo2;
                str6 = str5;
                z25 = z24;
            }
            if (parcel.readInt() != 0) {
                z26 = true;
            } else {
                z26 = true;
                z32 = z24;
            }
            if (parcel.readInt() == 0) {
                CharityUserDetails charityUserDetails2 = charityUserDetails;
                str7 = str6;
                charityUserDetailsCreateFromParcel = charityUserDetails2;
            } else {
                str7 = str6;
                charityUserDetailsCreateFromParcel = CharityUserDetails.CREATOR.createFromParcel(parcel);
            }
            CharityUserDetails charityUserDetails3 = charityUserDetailsCreateFromParcel;
            boolean z33 = z24;
            String str12 = str7;
            String string21 = parcel.readString();
            if (parcel.readInt() == 0) {
                z26 = z33;
            }
            return new UserSettings(str12, string2, str4, str10, string5, string6, string7, string8, string9, string10, string11, latLngInfoCreateFromParcel, latLngInfoCreateFromParcel2, string12, string13, string14, z28, z27, z12, z11, string15, z13, z15, z14, i11, z16, z18, arrayList3, arrayList4, z21, string16, z22, arrayListCreateStringArrayList, num, loyaltyCardResponse2, string17, c2CReferralResponse3, fVar, string18, userType, string19, z31, rewardSurveyInfo, string20, z23, z25, z32, charityUserDetails3, string21, z26);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserSettings[] newArray(int i11) {
            return new UserSettings[i11];
        }
    }

    public /* synthetic */ UserSettings(int i11, int i12, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, LatLngInfo latLngInfo, LatLngInfo latLngInfo2, String str12, String str13, String str14, boolean z11, boolean z12, boolean z13, boolean z14, String str15, boolean z15, boolean z16, boolean z17, int i13, boolean z18, boolean z19, List list, List list2, boolean z21, String str16, boolean z22, List list3, Integer num, LoyaltyCardResponse loyaltyCardResponse, String str17, C2CReferralResponse c2CReferralResponse, f fVar, String str18, UserType userType, String str19, boolean z23, RewardSurveyInfo rewardSurveyInfo, String str20, boolean z24, boolean z25, boolean z26, CharityUserDetails charityUserDetails, String str21, boolean z27, m1 m1Var) {
        if ((i11 & 1) == 0) {
            this.phoneCountryCodeSuggestion = null;
        } else {
            this.phoneCountryCodeSuggestion = str;
        }
        if ((i11 & 2) == 0) {
            this.termsUrl = null;
        } else {
            this.termsUrl = str2;
        }
        if ((i11 & 4) == 0) {
            this.manufacturerTermsUrl = null;
        } else {
            this.manufacturerTermsUrl = str3;
        }
        if ((i11 & 8) == 0) {
            this.privacyUrl = null;
        } else {
            this.privacyUrl = str4;
        }
        if ((i11 & 16) == 0) {
            this.blogUrl = null;
        } else {
            this.blogUrl = str5;
        }
        if ((i11 & 32) == 0) {
            this.careersUrl = null;
        } else {
            this.careersUrl = str6;
        }
        if ((i11 & 64) == 0) {
            this.instagramUrl = null;
        } else {
            this.instagramUrl = str7;
        }
        if ((i11 & 128) == 0) {
            this.charityTermsUrl = null;
        } else {
            this.charityTermsUrl = str8;
        }
        if ((i11 & 256) == 0) {
            this.cateringTermsUrl = null;
        } else {
            this.cateringTermsUrl = str9;
        }
        if ((i11 & 512) == 0) {
            this.accessibilityStatementUrl = null;
        } else {
            this.accessibilityStatementUrl = str10;
        }
        if ((i11 & 1024) == 0) {
            this.dsaDisclosureUrl = null;
        } else {
            this.dsaDisclosureUrl = str11;
        }
        this.boundSW = (i11 & NewHope.SENDB_BYTES) == 0 ? new LatLngInfo(35.603719d, -11.689453d) : latLngInfo;
        this.boundNE = (i11 & 4096) == 0 ? new LatLngInfo(71.691293d, 31.289063d) : latLngInfo2;
        if ((i11 & 8192) == 0) {
            this.bankTransactionFee = null;
        } else {
            this.bankTransactionFee = str12;
        }
        if ((i11 & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) == 0) {
            this.myStoreUrl = null;
        } else {
            this.myStoreUrl = str13;
        }
        if ((i11 & 32768) == 0) {
            this.panicMessage = null;
        } else {
            this.panicMessage = str14;
        }
        if ((i11 & 65536) == 0) {
            this.shouldVerifyEmail = false;
        } else {
            this.shouldVerifyEmail = z11;
        }
        if ((i11 & 131072) == 0) {
            this.hasAnyVouchers = false;
        } else {
            this.hasAnyVouchers = z12;
        }
        if ((262144 & i11) == 0) {
            this.hasActiveOrders = false;
        } else {
            this.hasActiveOrders = z13;
        }
        if ((524288 & i11) == 0) {
            this.canShowBestBeforeExplainer = false;
        } else {
            this.canShowBestBeforeExplainer = z14;
        }
        if ((1048576 & i11) == 0) {
            this.brazeExternalId = null;
        } else {
            this.brazeExternalId = str15;
        }
        if ((2097152 & i11) == 0) {
            this.hasExpiredPaymentMethods = false;
        } else {
            this.hasExpiredPaymentMethods = z15;
        }
        if ((4194304 & i11) == 0) {
            this.hasActiveEmailChangeRequest = false;
        } else {
            this.hasActiveEmailChangeRequest = z16;
        }
        if ((8388608 & i11) == 0) {
            this.showManufacturerItems = false;
        } else {
            this.showManufacturerItems = z17;
        }
        this.manufacturerBasketItemsLimit = (16777216 & i11) == 0 ? 20 : i13;
        if ((33554432 & i11) == 0) {
            this.useManufacturerBasketFlow = false;
        } else {
            this.useManufacturerBasketFlow = z18;
        }
        if ((67108864 & i11) == 0) {
            this.showDeliveryOptions = false;
        } else {
            this.showDeliveryOptions = z19;
        }
        this.featureExperiments = (134217728 & i11) == 0 ? new ArrayList() : list;
        if ((268435456 & i11) == 0) {
            this.featureActivations = null;
        } else {
            this.featureActivations = list2;
        }
        if ((536870912 & i11) == 0) {
            this.showCardIssueWarning = false;
        } else {
            this.showCardIssueWarning = z21;
        }
        if ((1073741824 & i11) == 0) {
            this.userReferralTermsUrl = null;
        } else {
            this.userReferralTermsUrl = str16;
        }
        if ((i11 & Integer.MIN_VALUE) == 0) {
            this.isManufacturerSupplyAvailable = false;
        } else {
            this.isManufacturerSupplyAvailable = z22;
        }
        if ((i12 & 1) == 0) {
            this.newManufacturerItemsForUser = null;
        } else {
            this.newManufacturerItemsForUser = list3;
        }
        this.newManufacturerItemsForUserQty = (i12 & 2) == 0 ? 0 : num;
        if ((i12 & 4) == 0) {
            this.mobileUserLoyaltyCard = null;
        } else {
            this.mobileUserLoyaltyCard = loyaltyCardResponse;
        }
        if ((i12 & 8) == 0) {
            this.loyaltyCardTermsUrl = null;
        } else {
            this.loyaltyCardTermsUrl = str17;
        }
        if ((i12 & 16) == 0) {
            this.mobileC2CReferral = null;
        } else {
            this.mobileC2CReferral = c2CReferralResponse;
        }
        if ((i12 & 32) == 0) {
            this.userBadgeDetails = null;
        } else {
            this.userBadgeDetails = fVar;
        }
        if ((i12 & 64) == 0) {
            this.storeReferralUrl = null;
        } else {
            this.storeReferralUrl = str18;
        }
        this.userType = (i12 & 128) == 0 ? UserType.USER : userType;
        if ((i12 & 256) == 0) {
            this.userBadgesUrl = null;
        } else {
            this.userBadgesUrl = str19;
        }
        if ((i12 & 512) == 0) {
            this.hasSpecialRewards = false;
        } else {
            this.hasSpecialRewards = z23;
        }
        if ((i12 & 1024) == 0) {
            this.rewardSurveyInfo = null;
        } else {
            this.rewardSurveyInfo = rewardSurveyInfo;
        }
        if ((i12 & NewHope.SENDB_BYTES) == 0) {
            this.userStoreRecommendationUrl = null;
        } else {
            this.userStoreRecommendationUrl = str20;
        }
        if ((i12 & 4096) == 0) {
            this.showProfilePageNotification = false;
        } else {
            this.showProfilePageNotification = z24;
        }
        if ((i12 & 8192) == 0) {
            this.hasClickedFavoriteReminderBell = false;
        } else {
            this.hasClickedFavoriteReminderBell = z25;
        }
        if ((i12 & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) == 0) {
            this.userHasPurchased = false;
        } else {
            this.userHasPurchased = z26;
        }
        if ((i12 & 32768) == 0) {
            this.charityUserDetails = null;
        } else {
            this.charityUserDetails = charityUserDetails;
        }
        if ((i12 & 65536) == 0) {
            this.lastSuccessfulOrderDate = null;
        } else {
            this.lastSuccessfulOrderDate = str21;
        }
        this.canSwipeOffline = (i12 & 131072) == 0 ? true : z27;
    }

    @g("accessibility_statement_url")
    public static /* synthetic */ void getAccessibilityStatementUrl$annotations() {
    }

    @g("bank_transaction_fee")
    public static /* synthetic */ void getBankTransactionFee$annotations() {
    }

    @g("blog_url")
    public static /* synthetic */ void getBlogUrl$annotations() {
    }

    @g("bound_ne")
    public static /* synthetic */ void getBoundNE$annotations() {
    }

    @g("bound_sw")
    public static /* synthetic */ void getBoundSW$annotations() {
    }

    @g("braze_external_id")
    public static /* synthetic */ void getBrazeExternalId$annotations() {
    }

    @g("can_show_best_before_explainer")
    public static /* synthetic */ void getCanShowBestBeforeExplainer$annotations() {
    }

    @g("can_swipe_offline")
    public static /* synthetic */ void getCanSwipeOffline$annotations() {
    }

    @g("careers_url")
    public static /* synthetic */ void getCareersUrl$annotations() {
    }

    @g("catering_terms_url")
    public static /* synthetic */ void getCateringTermsUrl$annotations() {
    }

    @g("charity_terms_url")
    public static /* synthetic */ void getCharityTermsUrl$annotations() {
    }

    @g("charity_user_charity_details")
    public static /* synthetic */ void getCharityUserDetails$annotations() {
    }

    @g("dsa_disclosure_url")
    public static /* synthetic */ void getDsaDisclosureUrl$annotations() {
    }

    @g("features_enabled")
    public static /* synthetic */ void getFeatureActivations$annotations() {
    }

    @g("feature_experiments")
    public static /* synthetic */ void getFeatureExperiments$annotations() {
    }

    @g("has_active_email_change_request")
    public static /* synthetic */ void getHasActiveEmailChangeRequest$annotations() {
    }

    @g("has_active_orders")
    public static /* synthetic */ void getHasActiveOrders$annotations() {
    }

    @g("has_any_vouchers")
    public static /* synthetic */ void getHasAnyVouchers$annotations() {
    }

    @g("has_clicked_favorite_notification_bell")
    public static /* synthetic */ void getHasClickedFavoriteReminderBell$annotations() {
    }

    @g("has_expired_payment_methods")
    public static /* synthetic */ void getHasExpiredPaymentMethods$annotations() {
    }

    @g("has_special_rewards")
    public static /* synthetic */ void getHasSpecialRewards$annotations() {
    }

    @g("instagram_url")
    public static /* synthetic */ void getInstagramUrl$annotations() {
    }

    @g("last_successful_order_date")
    public static /* synthetic */ void getLastSuccessfulOrderDate$annotations() {
    }

    @g("loyalty_card_terms_url")
    public static /* synthetic */ void getLoyaltyCardTermsUrl$annotations() {
    }

    @g("manufacturer_basket_items_limit")
    public static /* synthetic */ void getManufacturerBasketItemsLimit$annotations() {
    }

    @g("manufacturer_terms_url")
    public static /* synthetic */ void getManufacturerTermsUrl$annotations() {
    }

    @g("mobile_c2c_referral_details_response")
    public static /* synthetic */ void getMobileC2CReferral$annotations() {
    }

    @g("mobile_user_loyalty_card_response")
    public static /* synthetic */ void getMobileUserLoyaltyCard$annotations() {
    }

    @g("my_store_url")
    public static /* synthetic */ void getMyStoreUrl$annotations() {
    }

    @g("new_manufacturer_items_for_user")
    public static /* synthetic */ void getNewManufacturerItemsForUser$annotations() {
    }

    @g("new_manufacturer_items_for_user_qty")
    public static /* synthetic */ void getNewManufacturerItemsForUserQty$annotations() {
    }

    @g("panic_message")
    public static /* synthetic */ void getPanicMessage$annotations() {
    }

    @g("phone_country_code_suggestion")
    public static /* synthetic */ void getPhoneCountryCodeSuggestion$annotations() {
    }

    @g("privacy_url")
    public static /* synthetic */ void getPrivacyUrl$annotations() {
    }

    @g("reward_survey_info")
    public static /* synthetic */ void getRewardSurveyInfo$annotations() {
    }

    @g("should_verify_email")
    public static /* synthetic */ void getShouldVerifyEmail$annotations() {
    }

    @g("show_payment_card_issue_message")
    public static /* synthetic */ void getShowCardIssueWarning$annotations() {
    }

    @g("show_delivery_options")
    public static /* synthetic */ void getShowDeliveryOptions$annotations() {
    }

    @g("show_manufacturer_items")
    public static /* synthetic */ void getShowManufacturerItems$annotations() {
    }

    @g("show_profile_page_notification")
    public static /* synthetic */ void getShowProfilePageNotification$annotations() {
    }

    @g("store_referral_url")
    public static /* synthetic */ void getStoreReferralUrl$annotations() {
    }

    @g("terms_url")
    public static /* synthetic */ void getTermsUrl$annotations() {
    }

    @g("use_manufacturer_basket_flow")
    public static /* synthetic */ void getUseManufacturerBasketFlow$annotations() {
    }

    @g("mobile_user_badge_userdata_response")
    public static /* synthetic */ void getUserBadgeDetails$annotations() {
    }

    @g("user_badges_url")
    public static /* synthetic */ void getUserBadgesUrl$annotations() {
    }

    @g("has_purchased")
    public static /* synthetic */ void getUserHasPurchased$annotations() {
    }

    @g("user_referral_terms_url")
    public static /* synthetic */ void getUserReferralTermsUrl$annotations() {
    }

    @g("user_store_recommendation_url")
    public static /* synthetic */ void getUserStoreRecommendationUrl$annotations() {
    }

    @g("user_display_type")
    public static /* synthetic */ void getUserType$annotations() {
    }

    @g("is_manufacturer_supply_available")
    public static /* synthetic */ void isManufacturerSupplyAvailable$annotations() {
    }

    public UserSettings(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @NotNull LatLngInfo latLngInfo, @NotNull LatLngInfo latLngInfo2, @Nullable String str12, @Nullable String str13, @Nullable String str14, boolean z11, boolean z12, boolean z13, boolean z14, @Nullable String str15, boolean z15, boolean z16, boolean z17, int i11, boolean z18, boolean z19, @NotNull List<FeatureExperiment> list, @Nullable List<FeatureActivation> list2, boolean z21, @Nullable String str16, boolean z22, @Nullable List<String> list3, @Nullable Integer num, @Nullable LoyaltyCardResponse loyaltyCardResponse, @Nullable String str17, @Nullable C2CReferralResponse c2CReferralResponse, @Nullable f fVar, @Nullable String str18, @NotNull UserType userType, @Nullable String str19, boolean z23, @Nullable RewardSurveyInfo rewardSurveyInfo, @Nullable String str20, boolean z24, boolean z25, boolean z26, @Nullable CharityUserDetails charityUserDetails, @Nullable String str21, boolean z27) {
        latLngInfo.getClass();
        latLngInfo2.getClass();
        list.getClass();
        userType.getClass();
        this.phoneCountryCodeSuggestion = str;
        this.termsUrl = str2;
        this.manufacturerTermsUrl = str3;
        this.privacyUrl = str4;
        this.blogUrl = str5;
        this.careersUrl = str6;
        this.instagramUrl = str7;
        this.charityTermsUrl = str8;
        this.cateringTermsUrl = str9;
        this.accessibilityStatementUrl = str10;
        this.dsaDisclosureUrl = str11;
        this.boundSW = latLngInfo;
        this.boundNE = latLngInfo2;
        this.bankTransactionFee = str12;
        this.myStoreUrl = str13;
        this.panicMessage = str14;
        this.shouldVerifyEmail = z11;
        this.hasAnyVouchers = z12;
        this.hasActiveOrders = z13;
        this.canShowBestBeforeExplainer = z14;
        this.brazeExternalId = str15;
        this.hasExpiredPaymentMethods = z15;
        this.hasActiveEmailChangeRequest = z16;
        this.showManufacturerItems = z17;
        this.manufacturerBasketItemsLimit = i11;
        this.useManufacturerBasketFlow = z18;
        this.showDeliveryOptions = z19;
        this.featureExperiments = list;
        this.featureActivations = list2;
        this.showCardIssueWarning = z21;
        this.userReferralTermsUrl = str16;
        this.isManufacturerSupplyAvailable = z22;
        this.newManufacturerItemsForUser = list3;
        this.newManufacturerItemsForUserQty = num;
        this.mobileUserLoyaltyCard = loyaltyCardResponse;
        this.loyaltyCardTermsUrl = str17;
        this.mobileC2CReferral = c2CReferralResponse;
        this.userBadgeDetails = fVar;
        this.storeReferralUrl = str18;
        this.userType = userType;
        this.userBadgesUrl = str19;
        this.hasSpecialRewards = z23;
        this.rewardSurveyInfo = rewardSurveyInfo;
        this.userStoreRecommendationUrl = str20;
        this.showProfilePageNotification = z24;
        this.hasClickedFavoriteReminderBell = z25;
        this.userHasPurchased = z26;
        this.charityUserDetails = charityUserDetails;
        this.lastSuccessfulOrderDate = str21;
        this.canSwipeOffline = z27;
    }

    public UserSettings() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (LatLngInfo) null, (LatLngInfo) null, (String) null, (String) null, (String) null, false, false, false, false, (String) null, false, false, false, 0, false, false, (List) null, (List) null, false, (String) null, false, (List) null, (Integer) null, (LoyaltyCardResponse) null, (String) null, (C2CReferralResponse) null, (f) null, (String) null, (UserType) null, (String) null, false, (RewardSurveyInfo) null, (String) null, false, false, false, (CharityUserDetails) null, (String) null, false, -1, 262143, (DefaultConstructorMarker) null);
    }
}
