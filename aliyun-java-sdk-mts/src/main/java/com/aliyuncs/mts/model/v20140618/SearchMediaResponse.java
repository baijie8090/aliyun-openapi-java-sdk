/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.mts.model.v20140618;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mts.transform.v20140618.SearchMediaResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SearchMediaResponse extends AcsResponse {

	private String requestId;

	private Long totalCount;

	private Long pageNumber;

	private Long pageSize;

	private List<Media> mediaList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public List<Media> getMediaList() {
		return this.mediaList;
	}

	public void setMediaList(List<Media> mediaList) {
		this.mediaList = mediaList;
	}

	public static class Media {

		private String mediaId;

		private String fileURL;

		private String state;

		private String creationTime;

		private MediaInfo mediaInfo;

		public String getMediaId() {
			return this.mediaId;
		}

		public void setMediaId(String mediaId) {
			this.mediaId = mediaId;
		}

		public String getFileURL() {
			return this.fileURL;
		}

		public void setFileURL(String fileURL) {
			this.fileURL = fileURL;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public MediaInfo getMediaInfo() {
			return this.mediaInfo;
		}

		public void setMediaInfo(MediaInfo mediaInfo) {
			this.mediaInfo = mediaInfo;
		}

		public static class MediaInfo {

			private Streams streams;

			private Format format;

			public Streams getStreams() {
				return this.streams;
			}

			public void setStreams(Streams streams) {
				this.streams = streams;
			}

			public Format getFormat() {
				return this.format;
			}

			public void setFormat(Format format) {
				this.format = format;
			}

			public static class Streams {

				private List<VideoStream> videoStreamList;

				private List<AudioStream> audioStreamList;

				private List<SubtitleStream> subtitleStreamList;

				public List<VideoStream> getVideoStreamList() {
					return this.videoStreamList;
				}

				public void setVideoStreamList(List<VideoStream> videoStreamList) {
					this.videoStreamList = videoStreamList;
				}

				public List<AudioStream> getAudioStreamList() {
					return this.audioStreamList;
				}

				public void setAudioStreamList(List<AudioStream> audioStreamList) {
					this.audioStreamList = audioStreamList;
				}

				public List<SubtitleStream> getSubtitleStreamList() {
					return this.subtitleStreamList;
				}

				public void setSubtitleStreamList(List<SubtitleStream> subtitleStreamList) {
					this.subtitleStreamList = subtitleStreamList;
				}

				public static class VideoStream {

					private String index;

					private String codecName;

					private String codecLongName;

					private String profile;

					private String codecTimeBase;

					private String codecTagString;

					private String codecTag;

					private String width;

					private String height;

					private String hasBFrames;

					private String sar;

					private String dar;

					private String pixFmt;

					private String level;

					private String fps;

					private String avgFPS;

					private String timebase;

					private String startTime;

					private String duration;

					private String bitrate;

					private String numFrames;

					private String lang;

					private NetworkCost networkCost;

					public String getIndex() {
						return this.index;
					}

					public void setIndex(String index) {
						this.index = index;
					}

					public String getCodecName() {
						return this.codecName;
					}

					public void setCodecName(String codecName) {
						this.codecName = codecName;
					}

					public String getCodecLongName() {
						return this.codecLongName;
					}

					public void setCodecLongName(String codecLongName) {
						this.codecLongName = codecLongName;
					}

					public String getProfile() {
						return this.profile;
					}

					public void setProfile(String profile) {
						this.profile = profile;
					}

					public String getCodecTimeBase() {
						return this.codecTimeBase;
					}

					public void setCodecTimeBase(String codecTimeBase) {
						this.codecTimeBase = codecTimeBase;
					}

					public String getCodecTagString() {
						return this.codecTagString;
					}

					public void setCodecTagString(String codecTagString) {
						this.codecTagString = codecTagString;
					}

					public String getCodecTag() {
						return this.codecTag;
					}

					public void setCodecTag(String codecTag) {
						this.codecTag = codecTag;
					}

					public String getWidth() {
						return this.width;
					}

					public void setWidth(String width) {
						this.width = width;
					}

					public String getHeight() {
						return this.height;
					}

					public void setHeight(String height) {
						this.height = height;
					}

					public String getHasBFrames() {
						return this.hasBFrames;
					}

					public void setHasBFrames(String hasBFrames) {
						this.hasBFrames = hasBFrames;
					}

					public String getSar() {
						return this.sar;
					}

					public void setSar(String sar) {
						this.sar = sar;
					}

					public String getDar() {
						return this.dar;
					}

					public void setDar(String dar) {
						this.dar = dar;
					}

					public String getPixFmt() {
						return this.pixFmt;
					}

					public void setPixFmt(String pixFmt) {
						this.pixFmt = pixFmt;
					}

					public String getLevel() {
						return this.level;
					}

					public void setLevel(String level) {
						this.level = level;
					}

					public String getFps() {
						return this.fps;
					}

					public void setFps(String fps) {
						this.fps = fps;
					}

					public String getAvgFPS() {
						return this.avgFPS;
					}

					public void setAvgFPS(String avgFPS) {
						this.avgFPS = avgFPS;
					}

					public String getTimebase() {
						return this.timebase;
					}

					public void setTimebase(String timebase) {
						this.timebase = timebase;
					}

					public String getStartTime() {
						return this.startTime;
					}

					public void setStartTime(String startTime) {
						this.startTime = startTime;
					}

					public String getDuration() {
						return this.duration;
					}

					public void setDuration(String duration) {
						this.duration = duration;
					}

					public String getBitrate() {
						return this.bitrate;
					}

					public void setBitrate(String bitrate) {
						this.bitrate = bitrate;
					}

					public String getNumFrames() {
						return this.numFrames;
					}

					public void setNumFrames(String numFrames) {
						this.numFrames = numFrames;
					}

					public String getLang() {
						return this.lang;
					}

					public void setLang(String lang) {
						this.lang = lang;
					}

					public NetworkCost getNetworkCost() {
						return this.networkCost;
					}

					public void setNetworkCost(NetworkCost networkCost) {
						this.networkCost = networkCost;
					}

					public static class NetworkCost {

						private String preloadTime;

						private String costBandwidth;

						private String avgBitrate;

						public String getPreloadTime() {
							return this.preloadTime;
						}

						public void setPreloadTime(String preloadTime) {
							this.preloadTime = preloadTime;
						}

						public String getCostBandwidth() {
							return this.costBandwidth;
						}

						public void setCostBandwidth(String costBandwidth) {
							this.costBandwidth = costBandwidth;
						}

						public String getAvgBitrate() {
							return this.avgBitrate;
						}

						public void setAvgBitrate(String avgBitrate) {
							this.avgBitrate = avgBitrate;
						}
					}
				}

				public static class AudioStream {

					private String index;

					private String codecName;

					private String codecTimeBase;

					private String codecLongName;

					private String codecTagString;

					private String codecTag;

					private String sampleFmt;

					private String samplerate;

					private String channels;

					private String channelLayout;

					private String timebase;

					private String startTime;

					private String duration;

					private String bitrate;

					private String numFrames;

					private String lang;

					public String getIndex() {
						return this.index;
					}

					public void setIndex(String index) {
						this.index = index;
					}

					public String getCodecName() {
						return this.codecName;
					}

					public void setCodecName(String codecName) {
						this.codecName = codecName;
					}

					public String getCodecTimeBase() {
						return this.codecTimeBase;
					}

					public void setCodecTimeBase(String codecTimeBase) {
						this.codecTimeBase = codecTimeBase;
					}

					public String getCodecLongName() {
						return this.codecLongName;
					}

					public void setCodecLongName(String codecLongName) {
						this.codecLongName = codecLongName;
					}

					public String getCodecTagString() {
						return this.codecTagString;
					}

					public void setCodecTagString(String codecTagString) {
						this.codecTagString = codecTagString;
					}

					public String getCodecTag() {
						return this.codecTag;
					}

					public void setCodecTag(String codecTag) {
						this.codecTag = codecTag;
					}

					public String getSampleFmt() {
						return this.sampleFmt;
					}

					public void setSampleFmt(String sampleFmt) {
						this.sampleFmt = sampleFmt;
					}

					public String getSamplerate() {
						return this.samplerate;
					}

					public void setSamplerate(String samplerate) {
						this.samplerate = samplerate;
					}

					public String getChannels() {
						return this.channels;
					}

					public void setChannels(String channels) {
						this.channels = channels;
					}

					public String getChannelLayout() {
						return this.channelLayout;
					}

					public void setChannelLayout(String channelLayout) {
						this.channelLayout = channelLayout;
					}

					public String getTimebase() {
						return this.timebase;
					}

					public void setTimebase(String timebase) {
						this.timebase = timebase;
					}

					public String getStartTime() {
						return this.startTime;
					}

					public void setStartTime(String startTime) {
						this.startTime = startTime;
					}

					public String getDuration() {
						return this.duration;
					}

					public void setDuration(String duration) {
						this.duration = duration;
					}

					public String getBitrate() {
						return this.bitrate;
					}

					public void setBitrate(String bitrate) {
						this.bitrate = bitrate;
					}

					public String getNumFrames() {
						return this.numFrames;
					}

					public void setNumFrames(String numFrames) {
						this.numFrames = numFrames;
					}

					public String getLang() {
						return this.lang;
					}

					public void setLang(String lang) {
						this.lang = lang;
					}
				}

				public static class SubtitleStream {

					private String index;

					private String lang;

					public String getIndex() {
						return this.index;
					}

					public void setIndex(String index) {
						this.index = index;
					}

					public String getLang() {
						return this.lang;
					}

					public void setLang(String lang) {
						this.lang = lang;
					}
				}
			}

			public static class Format {

				private String numStreams;

				private String numPrograms;

				private String formatName;

				private String formatLongName;

				private String startTime;

				private String duration;

				private String size;

				private String bitrate;

				public String getNumStreams() {
					return this.numStreams;
				}

				public void setNumStreams(String numStreams) {
					this.numStreams = numStreams;
				}

				public String getNumPrograms() {
					return this.numPrograms;
				}

				public void setNumPrograms(String numPrograms) {
					this.numPrograms = numPrograms;
				}

				public String getFormatName() {
					return this.formatName;
				}

				public void setFormatName(String formatName) {
					this.formatName = formatName;
				}

				public String getFormatLongName() {
					return this.formatLongName;
				}

				public void setFormatLongName(String formatLongName) {
					this.formatLongName = formatLongName;
				}

				public String getStartTime() {
					return this.startTime;
				}

				public void setStartTime(String startTime) {
					this.startTime = startTime;
				}

				public String getDuration() {
					return this.duration;
				}

				public void setDuration(String duration) {
					this.duration = duration;
				}

				public String getSize() {
					return this.size;
				}

				public void setSize(String size) {
					this.size = size;
				}

				public String getBitrate() {
					return this.bitrate;
				}

				public void setBitrate(String bitrate) {
					this.bitrate = bitrate;
				}
			}
		}
	}

	@Override
	public SearchMediaResponse getInstance(UnmarshallerContext context) {
		return	SearchMediaResponseUnmarshaller.unmarshall(this, context);
	}
}