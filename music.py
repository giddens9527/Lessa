#Import the library
import imp
import os
MidiFile=imp.load_source('MidiFile',os.getcwd()+'/midiutil/MidiFile.py')
from MidiFile import MIDIFile

pitch_dict = {'A0': 21, 'B0': 23, 'C1': 24, 'D1': 26, 'E1': 28, 'F1': 29, 'G1': 31, 'A1': 33, 'B1': 35, 
				'C2': 36, 'D2': 38, 'E2': 40, 'F2': 41, 'G2': 43, 'A2': 45, 'B2': 47,
				'C3': 48, 'D3': 50, 'E3': 52, 'F3': 53, 'G3': 55, 'A3': 57, 'B3': 59,
				'C4': 60, 'D4': 62, 'E4': 64, 'F4': 65, 'G4': 67, 'A4': 69, 'B4': 71,
				'C5': 72, 'D5': 74, 'E5': 76, 'F5': 77, 'G5': 79, 'A5': 81, 'B5': 83,
				'C6': 84, 'D6': 86, 'E6': 88, 'F6': 89, 'G6': 91, 'A6': 93, 'B6': 95,
				'C7': 96, 'D7': 98, 'E7': 100, 'F7': 101, 'G7': 103, 'A7': 105, 'B7': 107,
				'C8': 108}

pitch_list = ['A0', 'B0', 'C1', 'D1', 'E1', 'F1', 'G1', 'A1', 'B1',
				'C2', 'D2', 'E2', 'F2', 'G2', 'A2', 'B2',
				'C3', 'D3', 'E3', 'F3', 'G3', 'A3', 'B3',
				'C4', 'D4', 'E4', 'F4', 'G4', 'A4', 'B4',
				'C5', 'D5', 'E5', 'F5', 'G5', 'A5', 'B5',
				'C6', 'D6', 'E6', 'F6', 'G6', 'A6', 'B6',
				'C7', 'D7', 'E7', 'F7', 'G7', 'A7', 'B7', 'C8']

tone_list = ['C', 'D', 'E', 'F', 'G', 'A', 'B']

instrument_dict = {'Piano': 1, 'Guitar': 25, 'Bass': 33, 'Violin': 41, 'Cello': 43,
					'Music Box': 11, 'Trumpet': 57, 'Sax': 65, 'Tinkle Bell': 113}

duration_dict = {'w': 2, 'h': 1, 'q': 0.5, 'e': 0.25, 's': 0.125}

def list_to_seq(list):
	tmp_seq = sequence()
	for item in list:
		if not isinstance(item, str):
			for i in range(len(list)):
				list[i] = str(list[i]).replace("\'", "")
			break
	tmp_seq.set(list)
	tmp_seq.instrument = 1
	return tmp_seq

class note:

	def __init__(self, str):
		self.pitch = str[:-1]
		if self.pitch not in pitch_dict:
			print self.pitch
			raise ValueError('Please define a valid pitch')
		self.duration = str[-1]
		if self.duration not in duration_dict:
			raise ValueError('Please define a valid duration')
		self.note = str
		self.is_sharp = False
		self.is_flat = False

	def __add__(self, other):
		if not isinstance(other, int):
			raise TypeError('Note can only be added to integers')

		index = pitch_list.index(self.pitch)
		index += other
		if index > len(pitch_list):
			raise IndexError('Pitch out of range, please make sure your pitch is within A0-C8')
		else:
			pitch = pitch_list[index]

		return note(pitch + self.duration)

	def __iadd__(self, other):
		if not isinstance(other, int):
			raise TypeError('Note can only be added to integers')

		index = pitch_list.index(self.pitch)
		index += other
		if index > len(pitch_list):
			raise IndexError('Pitch out of range, please make sure your pitch is within A0-C8')
		else:
			pitch = pitch_list[index]

		return note(pitch + self.duration)

	def __sub__(self, other):
		if not isinstance(other, int):
			raise TypeError('Note can only be added to integers')

		index = pitch_list.index(self.pitch)
		index -= other
		if index < 0 :
			raise IndexError('Pitch out of range, please make sure your pitch is within A0-C8')
		else:
			pitch = pitch_list[index]

		return note(pitch + self.duration)

	def __isub__(self, other):
		if not isinstance(other, int):
			raise TypeError('Note can only be added to integers')

		index = pitch_list.index(self.pitch)
		index -= other
		if index < 0:
			raise IndexError('Pitch out of range, please make sure your pitch is within A0-C8')
		else:
			pitch = pitch_list[index]

		return note(pitch + self.duration)

	def __cmp__(self, other):
		if not isinstance(other, note):
			raise TypeError('Notes can only be compared to notes')

		index1 = pitch_list.index(self.pitch)
		index2 = pitch_list.index(other.pitch)

		if index1 < index2:
			return -1
		elif index1 == index2:
			return 0
		elif index1 > index2:
			return 1

	def __repr__(self):
		if self.is_sharp:
			return str('#\'' + self.note + '\'')
		elif self.is_flat:
			return str('b\'' + self.note + '\'')
		else:
			return str('\'' + self.note + '\'')

	def __str__(self):
		if self.is_sharp:
			return str('#\'' + self.note + '\'')
		elif self.is_flat:
			return str('~\'' + self.note + '\'')
		else:
			return str('\'' + self.note + '\'')

	def get_note(self):
		return str(self.note)

	def get_pitch(self):
		return str(self.pitch)

	def get_tone(self):
		return str(self.pitch[0:1])

	def get_duration(self):
		return str(self.duration)

	def pitch_up(self):
		if self.is_flat:
			self.is_flat = False
		elif self.is_sharp:
			self.is_sharp = False
			index = pitch_list.index(self.pitch)
			index += 1
			if index > len(pitch_list):
				raise IndexError('Pitch out of range, please make sure your pitch is within A0-C8')
			else:
				self.pitch = pitch_list[index]
				self.note = self.pitch + self.duration
		else:
			self.is_sharp = True

	def pitch_down(self):
		if self.is_sharp:
			self.is_sharp = False
		elif self.is_flat:
			self.is_flat = False
			index = pitch_list.index(self.pitch)
			index -= 1
			if index < 0:
				raise IndexError('Pitch out of range, please make sure your pitch is within A0-C8')
			else:
				self.pitch = pitch_list[index]
				self.note = self.pitch + self.duration
		else:
			self.is_flat = True

class sequence:

	def __init__(self, seq):
		self.stream = seq
		self.instrument = 1

	def __add__(self, other):
		if not isinstance(other, sequence):
			raise TypeError('Sequences can only be added to sequences')

		if self.instrument != other.instrument:
			raise ValueError('Two sequence have different instrument, cannot concatenate')

		tmp_seq = sequence([])
		tmp_seq.stream = list(self.stream)
		tmp_seq.instrument = self.instrument

		tmp_seq.stream += other.stream

		return tmp_seq

	def __iadd__(self, other):
		if not isinstance(other, sequence):
			raise TypeError('Sequences can only be added to sequences')

		if self.instrument != other.instrument:
			raise ValueError('Two sequence have different instrument, cannot concatenate')

		tmp_seq = sequence([])
		tmp_seq.stream = list(self.stream)
		tmp_seq.instrument = self.instrument
	
		tmp_seq.stream += other.stream

		return tmp_seq

	def __mul__(self, other):
		if not isinstance(other, int):
			raise TypeError('Sequences can only be multiplied to numbers')
		
		tmp_seq = sequence([])
		tmp_seq.stream = list(self.stream)
		tmp_seq.instrument = self.instrument

		tmp_stream = list(self.stream)

		for i in range(1, other):
			tmp_seq.stream += tmp_stream
		
		return tmp_seq

	def __imul__(self, other):
		if not isinstance(other, int):
			raise TypeError('Sequences can only be multiplied to numbers')
		
		tmp_seq = sequence([])
		tmp_seq.stream = list(self.stream)
		tmp_seq.instrument = self.instrument

		tmp_stream = list(self.stream)

		for i in range(1, other):
			tmp_seq.stream += tmp_stream
		
		return tmp_seq

	def __getitem__(self, key):
		return self.stream[key]

	def __setitem__(self, key, value):
		if isinstance(value, str):
			tmp_note = note(value)
			self.stream[key] = tmp_note
		elif isinstance(value, note):
			self.stream[key] = value

	def __delitem__(self, key):
		try:
			del(self.stream[key])
		except IndexError:
			raise IndexError('sequence assignment index out of range')

	def __len__(self):
		return len(self.stream)

	def __repr__(self):
		return str(self.stream)

	def __str__(self):
		return str(self.stream)

	def get_stream(self):
		return self.stream

	def get_instrument(self):
		for key, value in instrument_dict.iteritems():
			if value == self.instrument:
				return key

	def change_instrument(self, instrument):
		try:
			self.instrument = instrument_dict[instrument]
		except KeyError:
			print "instrument not in dictionary"

	def to_list(self):
		return list(self.stream)

	def append(self, other):
		if not isinstance(other, note):
			raise TypeError('Sequences can only append notes')

		self.stream.append(other)

class song:

	def __init__(self):
		self.sequence_list = []
		self.name_list = []

	def __repr__(self):
		song_str = ''
		for i in range(len(self.sequence_list) - 1):
			song_str += self.name_list[i] + ": " + str(self.sequence_list[i].stream) + '\n'
		song_str += self.name_list[len(self.sequence_list) - 1] + ": " + str(self.sequence_list[len(self.sequence_list) - 1].stream)

		return song_str

	def __str__(self):
		song_str = ''
		for i in range(len(self.sequence_list) - 1):
			song_str += self.name_list[i] + ": " + str(self.sequence_list[i].stream) + '\n'
		song_str += self.name_list[len(self.sequence_list) - 1] + ": " + str(self.sequence_list[len(self.sequence_list) - 1].stream)

		return song_str

	def construct_seq(self, seq, track, volume, MIDI_obj):
		# Tracks are numbered from zero. Times are measured in beats.
		time = 0
		channel = 0
		volume = volume

		# Add track name and tempo.
		MIDI_obj.addTrackName(track, time, "Track" + str(track))
		MIDI_obj.addTempo(track, time, 60)

		for note in seq:
			pitch = pitch_dict[note.get_pitch().upper()]
			duration = duration_dict[note.get_duration().lower()]
			MIDI_obj.addNote(track, channel, pitch, time, duration, volume)
			time += duration

	def change_instrument(self, MIDI_obj, track, channel, time, instrument):
		MIDI_obj.addProgramChange(track, channel, time, instrument)

	def add(self, seq, name):
		if not isinstance(seq, sequence):
			raise TypeError('Only sequence object can be added to song object')

		self.sequence_list.append(seq)
		self.name_list.append(name)

	def subtract(self, name):
		if not isinstance(name, str):
			raise TypeError('Please input a string as sequence name')

		try:
			index = self.name_list.index(name)
			del(self.name_list[index])
			del(self.sequence_list[index])
		except ValueError, IndexError:
			raise ValueError('The sequence you are trying to delete is not in the song')

	def create_MIDI(self):
		# Create the MIDIFile Object with n track
		MyMIDI = MIDIFile(len(self.sequence_list), removeDuplicates = False, deinterleave = False)
		for i in range(len(self.sequence_list)):
			self.construct_seq(self.sequence_list[i].stream, i, 100, MyMIDI)
			self.change_instrument(MyMIDI, i, 0, 0, self.sequence_list[i].instrument)

		# write MIDI file to disk.
		binfile = open('output.mid', 'wb')
		MyMIDI.writeFile(binfile)
		binfile.close()
		
	def play(self):
		pass

# 	def play(self, file_name):
# 		# play MIDI file
# 		freq = 44100    # audio CD quality
# 		bitsize = -16   # unsigned 16 bit
# 		channels = 2    # 1 is mono, 2 is stereo
# 		buffer = 1024    # number of samples
# 		pygame.mixer.init(freq, bitsize, channels, buffer)
# 		# optional volume 0 to 1.0
# 		pygame.mixer.music.set_volume(0.8)
# 
# 		clock = pygame.time.Clock()
# 		try:
# 			pygame.mixer.music.load('output.mid')
# 			print "Music file %s loaded!" % 'output.mid'
# 		except pygame.error:
# 			print "File %s not found! (%s)" % (file_name, pygame.get_error())
# 			return
# 
# 		pygame.mixer.music.play()
# 		while pygame.mixer.music.get_busy():
# 		# check if playback has finished
# 			clock.tick(30)

	def get_sequence_list(self):
		return self.sequence_list

	def get_instrument_list(self):
		return self.instrument_list
